package dao;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.*;

public class usuarioDAO {
    private static final String MEDICOS_JSON = "C:\\Users\\usuario\\OneDrive\\Escritorio\\farmaSalud-software\\src\\resources\\data\\empleados.json";
    private static final String RECEPCIONISTAS_JSON = "C:\\Users\\usuario\\OneDrive\\Escritorio\\farmaSalud-software\\src\\resources\\data\\recepcionista.json";
    private static final String ADMINISTRADORES_JSON = "C:\\Users\\usuario\\OneDrive\\Escritorio\\farmaSalud-software\\src\\resources\\data\\usuarios.json";
    private static final String FARMACEUTICOS_JSON = "C:\\Users\\usuario\\OneDrive\\Escritorio\\farmaSalud-software\\src\\resources\\data\\farmaceutica.json";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Métodos públicos para buscar usuarios
    public Administrador buscarAdministrador(String email, String documento) {
        try (FileReader reader = new FileReader(ADMINISTRADORES_JSON)) {
            JsonArray array = JsonParser.parseReader(reader).getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                JsonObject json = array.get(i).getAsJsonObject();
                if (json.get("email").getAsString().equalsIgnoreCase(email) &&
                    json.get("numeroDocumento").getAsString().equals(documento)) {
                    return new Administrador(
                        documento,
                        json.get("nombres").getAsString(),
                        json.get("apellidos").getAsString(),
                        json.get("codigoEmpleado").getAsString(),
                        LocalDate.parse(json.get("fechaNacimiento").getAsString(), DATE_FORMATTER),
                        json.get("sexo").getAsString(),
                        json.get("eps").getAsString(),
                        email,
                        json.get("celular").getAsString()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Medico buscarMedico(String email, String documento) {
        try (FileReader reader = new FileReader(MEDICOS_JSON)) {
            JsonArray array = JsonParser.parseReader(reader).getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                JsonObject json = array.get(i).getAsJsonObject();
                if (json.get("email").getAsString().equalsIgnoreCase(email) &&
                    json.get("numeroDocumento").getAsString().equals(documento)) {
                    return new Medico(
                        json.get("nombres").getAsString(),
                        json.get("apellidos").getAsString(),
                        email,
                        documento,
                        json.get("celular").getAsString(),
                        json.get("especialidad").getAsString(),
                        LocalDate.parse(json.get("fechaNacimiento").getAsString(), DATE_FORMATTER),
                        json.get("sexo").getAsString(),
                        json.get("eps").getAsString()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Recepcionista buscarRecepcionista(String email, String documento) {
        try (FileReader reader = new FileReader(RECEPCIONISTAS_JSON)) {
            JsonArray array = JsonParser.parseReader(reader).getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                JsonObject json = array.get(i).getAsJsonObject();
                if (json.get("email").getAsString().equalsIgnoreCase(email) &&
                    json.get("numeroDocumento").getAsString().equals(documento)) {
                    return new Recepcionista(
                        documento,
                        json.get("nombres").getAsString(),
                        json.get("apellidos").getAsString(),
                        LocalDate.parse(json.get("fechaNacimiento").getAsString(), DATE_FORMATTER),
                        json.get("sexo").getAsString(),
                        json.get("eps").getAsString(),
                        email,
                        json.get("celular").getAsString(),
                        json.get("codigoEmpleado").getAsString(),
                        LocalDate.parse(json.get("fechaContratacion").getAsString(), DATE_FORMATTER),
                        json.get("turno").getAsString()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Farmaceutica buscarFarmaceutico(String email, String documento) {
        try (FileReader reader = new FileReader(FARMACEUTICOS_JSON)) {
            JsonArray array = JsonParser.parseReader(reader).getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                JsonObject json = array.get(i).getAsJsonObject();
                if (json.get("email").getAsString().equalsIgnoreCase(email) &&
                    json.get("numeroDocumento").getAsString().equals(documento)) {
                    return new Farmaceutica(
                        documento,
                        json.get("nombres").getAsString(),
                        json.get("apellidos").getAsString(),
                        LocalDate.parse(json.get("fechaNacimiento").getAsString(), DATE_FORMATTER),
                        json.get("sexo").getAsString(),
                        json.get("eps").getAsString(),
                        email,
                        json.get("celular").getAsString(),
                        json.get("codigoEmpleado").getAsString(),
                        LocalDate.parse(json.get("fechaContratacion").getAsString(), DATE_FORMATTER),
                        json.get("turno").getAsString()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Métodos para verificar roles
    public boolean esAdministrador(Object usuario) {
        return usuario instanceof Administrador;
    }
    
    public boolean esMedico(Object usuario) {
        return usuario instanceof Medico;
    }
    
    public boolean esRecepcionista(Object usuario) {
        return usuario instanceof Recepcionista;
    }
    
    public boolean esFarmaceutico(Object usuario) {
        return usuario instanceof Farmaceutica;
    }
}