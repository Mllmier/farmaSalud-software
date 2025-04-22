package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Paciente;



public class PacienteDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Desktop\\farmaSalud\\src\\resources\\data\\pacientes.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<Paciente> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Paciente>>(){}.getType();
            List<Paciente> pacientes = gson.fromJson(reader, tipoLista);
            return pacientes != null ? pacientes : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error al cargar Paciente: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarPaciente(Paciente paciente) {
        List<Paciente> pacientes = cargarTodos();
        pacientes.add(paciente);
        guardarTodos(pacientes);
    }
    
    public void guardarTodos(List<Paciente> medicos) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(medicos, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar Paciente : " + e.getMessage());
        }
    }
}
