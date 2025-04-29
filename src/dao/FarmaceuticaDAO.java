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
import model.Farmaceutica;

public class FarmaceuticaDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\usuario\\OneDrive\\Escritorio\\farmaSalud-software\\src\\resources\\data\\farmaceutica.json";
    private Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                                        .create();

    public List<Farmaceutica> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Farmaceutica>>(){}.getType();
            List<Farmaceutica> farmaceuticos = gson.fromJson(reader, tipoLista);
            return farmaceuticos != null ? farmaceuticos : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error al cargar farmacéuticos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarFarmaceutica(Farmaceutica farmaceutica) {
        List<Farmaceutica> farmaceuticos = cargarTodos();
        farmaceuticos.add(farmaceutica);
        guardarTodos(farmaceuticos);
    }
    
    public void guardarTodos(List<Farmaceutica> farmaceuticos) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(farmaceuticos, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar farmacéuticos: " + e.getMessage());
        }
    }
    
    public boolean actualizarFarmaceutica(String documentoOriginal, Farmaceutica farmaceuticaActualizado) {
        try {
            if (documentoOriginal == null || farmaceuticaActualizado == null) {
                return false;
            }
            
            List<Farmaceutica> farmaceuticos = cargarTodos();
            
            for (int i = 0; i < farmaceuticos.size(); i++) {
                Farmaceutica actual = farmaceuticos.get(i);
                String numDoc = actual.getNumeroDocumento();
                
                if (numDoc != null && numDoc.equals(documentoOriginal)) {
                    farmaceuticos.set(i, farmaceuticaActualizado);
                    guardarTodos(farmaceuticos);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean eliminarFarmaceutica(String numeroDocumento) {
        try {
            if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
                throw new IllegalArgumentException("Número de documento no puede ser nulo o vacío");
            }

            List<Farmaceutica> farmaceuticos = cargarTodos();

            boolean removed = farmaceuticos.removeIf(f -> 
                numeroDocumento.equals(f.getNumeroDocumento())
            );
            
            if (removed) {
                guardarTodos(farmaceuticos);
                System.out.println("Farmacéutico con documento " + numeroDocumento + " eliminado.");
            }
            
            return removed;
            
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            return false;
        }
    }
    
    // Adaptador para LocalDate
    public class LocalDateAdapter extends TypeAdapter<LocalDate> {
        private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        
        @Override
        public void write(JsonWriter out, LocalDate value) throws IOException {
            if (value != null) {
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
