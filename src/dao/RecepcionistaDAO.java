/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import model.Recepcionista;

/**
 *
 * @author Maria liz
 */
public class RecepcionistaDAO {
      private static final String ARCHIVO_JSON = "C:\\Users\\usuario\\Downloads\\farmaSalud\\src\\resources\\data\\recepcionista.json";
    private Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
    .create();

    
    public List<Recepcionista> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Recepcionista>>(){}.getType();
            List<Recepcionista> recepcionista = gson.fromJson(reader, tipoLista);
            return recepcionista != null ? recepcionista : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error al cargar citas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarRecepcionista(Recepcionista recepcionista) {
        List<Recepcionista> recepcionistas = cargarTodos();
        recepcionistas.add(recepcionista);
        guardarTodos(recepcionistas);
    }
    
    public void guardarTodos(List<Recepcionista> recepcionistas) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(recepcionistas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar recepcionista : " + e.getMessage());
        }
    }public class LocalDateAdapter extends TypeAdapter<LocalDate>{
        private final DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_DATE;
        @Override
        public void write(JsonWriter out,LocalDate value)throws IOException{
            if(value!=null){
                out.value(value.format(formatter));
            }else{
                out.nullValue();
            }
        }
        @Override 
    public LocalDate read(JsonReader in )throws IOException{
    String date = in.nextString();
    if (date == null || date.trim().isEmpty()) {
        return null; // <- evita parsear texto vacío
    }
    try {
        return LocalDate.parse(date, formatter);
    } catch (DateTimeParseException e) {
        System.err.println("Fecha inválida encontrada en JSON: " + date);
        return null;
    }
}
    }
    
    //metodo modificar
       public boolean actualizarRecepcionista(String cedulaOriginal, Recepcionista recepcionistaActualizado) {
    try {
        // Validación inicial de parámetros
        if (cedulaOriginal == null || recepcionistaActualizado == null) {
            return false;
        }
        
        List<Recepcionista> recepcionistas = cargarTodos();
        
        // Buscar el recepcionista a actualizar
        for (int i = 0; i < recepcionistas.size(); i++) {
            Recepcionista actual = recepcionistas.get(i);
            String numDoc = actual.getNumeroDocumento();
            
            // Comparación segura que evita NullPointerException
            if (numDoc != null && numDoc.equals(cedulaOriginal)) {
                // Reemplazar con los nuevos datos
                recepcionistas.set(i, recepcionistaActualizado);
                guardarTodos(recepcionistas);
                return true;
            }
        }
        return false;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }

}
    
    public boolean eliminarRecepcionista(String numeroDocumento) {
    try {
        if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de documento no puede ser nulo o vacío");
        }

        List<Recepcionista> recepcionistas = cargarTodos();

        boolean removed = recepcionistas.removeIf(m -> 
            numeroDocumento.equals(m.getNumeroDocumento())
        );
        
        if (removed) {
            guardarTodos(recepcionistas);
            System.out.println("Recepcionista con documento " + numeroDocumento + " eliminado.");
        }
        
        return removed;
        
    }catch (Exception e) {
        // Cualquier otro error inesperado
        System.err.println("Error inesperado: " + e.getMessage());
        return false;
    }
        
        
}
   
}
