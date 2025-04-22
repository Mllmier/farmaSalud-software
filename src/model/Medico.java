package model;

import com.google.gson.annotations.SerializedName;
import java.time.LocalDate;

public class Medico extends Persona {
    @SerializedName("especialidad")
    private String especialidad;

    public Medico(String nombres, String apellidos, String email, String numeroDocumento, String celular,String especialidad,  LocalDate fechaNacimiento, String sexo, String eps) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
        this.especialidad = especialidad;
    }

    
    
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}