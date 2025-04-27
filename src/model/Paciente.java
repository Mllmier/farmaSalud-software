package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    private String tipoSangre;
    private String tipoDocumento;

    public Paciente( String numeroDocumento, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String eps, String email, String celular,String tipoDocumento,String tipoSangre) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
         if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
        throw new IllegalArgumentException("El número de documento no puede ser nulo o vacío");
    }
        this.tipoDocumento=tipoDocumento;
        this.tipoSangre = tipoSangre;
       
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}