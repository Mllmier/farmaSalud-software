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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import model.Cita;

/**
 *
 * @author Maria liz
 */
public class CitasDAO {
     private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Pictures\\farmaSalud\\src\\resources\\data\\citas.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
      public CitasDAO() {
        this.gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDate.class, new CitasDAO.LocalDateAdapter())
            .create();
    }
     public List<Cita> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            return gson.fromJson(reader, new TypeToken<List<Cita>>() {}.getType());
        } catch (IOException e) {
            return new ArrayList<>(); 
        }
    }
     public void guardarCita(Cita cita) {
        List<Cita> citas = cargarTodos();
        citas.add(cita);
        guardarTodos(citas);
    }
       public void guardarTodos(List<Cita> citas) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(citas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar Cita : " + e.getMessage());
        }
    }
     public boolean eliminarCita(String idCita) {
    try {
        if (idCita == null || idCita.trim().isEmpty()) {
            throw new IllegalArgumentException("id Cita  no puede ser nulo o vacío");
        }
         List<Cita> citas = cargarTodos();

        boolean removed = citas.removeIf(m -> 
            idCita.equals(m.getIdCita())
        );
        
        if (removed) {
            guardarTodos(citas);
            System.out.println("Cita con id cita  " + idCita + " eliminado.");
        }
        
        return removed;
        
    }catch (Exception e) {
        System.err.println("Error inesperado: " + e.getMessage());
        return false;
    }     
}
       public boolean actualizarCita(String citaOriginal, Cita citaActualizada) {
    try {
        List<Cita> citas = cargarTodos();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getIdCita().equals(citaOriginal)) {
                citas.set(i, citaActualizada);
                guardarTodos(citas);
                return true;
            }
        }
        return false;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
   
  public class LocalDateAdapter extends TypeAdapter<LocalDate> {
        private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        
        @Override
        public void write(JsonWriter out, LocalDate value) throws IOException {
            if(value != null) {
                out.value(value.format(formatter));
            } else {
                out.nullValue();
            }
        }
        
        @Override 
        public LocalDate read(JsonReader in) throws IOException {
            String date = in.nextString();
            if (date == null || date.trim().isEmpty()) {
                return null;
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
