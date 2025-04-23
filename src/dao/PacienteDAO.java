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
import model.Paciente;



public class PacienteDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Pictures\\farmaSalud\\src\\resources\\data\\pacientes.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
      public PacienteDAO() {
        // Configurar Gson con el adaptador para LocalDate
        this.gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .create();
    }
     public List<Paciente> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            return gson.fromJson(reader, new TypeToken<List<Paciente>>() {}.getType());
        } catch (IOException e) {
            return new ArrayList<>(); // Si el archivo no existe, retorna lista vacía
        }
    }
    
    public void guardarPaciente(Paciente paciente) {
        List<Paciente> pacientes = cargarTodos();
        pacientes.add(paciente);
        guardarTodos(pacientes);
    }
    
    public void guardarTodos(List<Paciente> pacientes) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(pacientes, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar Paciente : " + e.getMessage());
        }
    }
     public boolean eliminarPaciente(String numeroDocumento) {
    try {
        if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de documento no puede ser nulo o vacío");
        }

        List<Paciente> pacientes = cargarTodos();

        boolean removed = pacientes.removeIf(m -> 
            numeroDocumento.equals(m.getNumeroDocumento())
        );
        
        if (removed) {
            guardarTodos(pacientes);
            System.out.println("Paciente con documento " + numeroDocumento + " eliminado.");
        }
        
        return removed;
        
    }catch (Exception e) {
        System.err.println("Error inesperado: " + e.getMessage());
        return false;
    }     
}
       public boolean actualizarPaciente(String documentoOriginal, Paciente pacienteActualizado) {
    try {
        List<Paciente> pacientes = cargarTodos();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNumeroDocumento().equals(documentoOriginal)) {
                pacientes.set(i, pacienteActualizado);
                guardarTodos(pacientes);
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