package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import model.Medico;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.stream.JsonWriter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class MedicoDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\usuario\\Downloads\\farmaSalud\\src\\resources\\data\\empleados.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
        .create();



    
    public List<Medico> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Medico>>(){}.getType();
            List<Medico> medicos = gson.fromJson(reader, tipoLista);
            return medicos != null ? medicos : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("tienes eso malo y no se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarMedico(Medico medico) {
        List<Medico> medicos = cargarTodos();
        medicos.add(medico);
        guardarTodos(medicos);
    }
    
    public void guardarTodos(List<Medico> medicos) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(medicos, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar médicos: " + e.getMessage());
        }
    }
    public List<Medico> obtenerTodosMedicos() {
    return cargarTodos(); 
}
    
   public boolean eliminarMedico(String numeroDocumento) {
    try {
        if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de documento no puede ser nulo o vacío");
        }

        List<Medico> medicos = cargarTodos();

        boolean removed = medicos.removeIf(m -> 
            numeroDocumento.equals(m.getNumeroDocumento())
        );
        
        if (removed) {
            guardarTodos(medicos);
            System.out.println("Médico con documento " + numeroDocumento + " eliminado.");
        }
        
        return removed;
        
    }catch (Exception e) {
        // Cualquier otro error inesperado
        System.err.println("Error inesperado: " + e.getMessage());
        return false;
    }
        
        
}
   
   public boolean actualizarMedico(String cedulaOriginal, Medico medicoActualizado) {
    try {
        List<Medico> medicos = cargarTodos();
        
        // Buscar el médico a actualizar
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getNumeroDocumento().equals(cedulaOriginal)) {
                // Reemplazar con los nuevos datos
                medicos.set(i, medicoActualizado);
                guardarTodos(medicos);
                return true;
            }
        }
        return false;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

public class LocalDateAdapter extends TypeAdapter<LocalDate>{
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
}