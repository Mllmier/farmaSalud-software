package model;

import java.time.LocalDate;
import java.util.Date;

public class Recepcionista extends Persona {
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private String turno;

    public Recepcionista(String numeroDocumento, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String eps, String email, String celular,String codigoEmpleado, LocalDate fechaContratacion, String turno ) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.turno = turno;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

   
   
}