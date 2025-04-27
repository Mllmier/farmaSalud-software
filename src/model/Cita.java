package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private  String IdCita;
    private LocalDate fechaCita;
    private String hora;
    private String tipoCita;
    private String consultorio;
    private String motivo;
    private EstadoCita estado;
    private String documentoPaciente;
    
    private String  especialidad;

    public enum EstadoCita {
        PROGRAMADA,
        COMPLETADA,
        CANCELADA;
        
        public static EstadoCita getPROGRAMADA() {
            return PROGRAMADA;
        }

        public static EstadoCita getCOMPLETADA() {
            return COMPLETADA;
        }

        public static EstadoCita getCANCELADA() {
            return CANCELADA;
        }
    }

    public Cita(String IdCita,LocalDate fechaCita, String  hora,String motivo,String tipoCita,String consultorio,EstadoCita estado,String  especialidad ) {
        
        this.IdCita=IdCita;
        this.motivo=motivo;
        this.fechaCita = fechaCita;
        this.hora = hora;
        this.tipoCita=tipoCita;
        this.especialidad=especialidad;
        this.motivo=motivo;
        this.consultorio=consultorio;
        this.estado = EstadoCita.PROGRAMADA;
    }
    

    public String getIdCita() {
        return IdCita;
    }

    public void setIdCita(String idCita) {
        this.IdCita = idCita;
    }
    

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    public String getMedico() {
        return especialidad;
    }

    public void setMedico(String  especialidad) {
        this.especialidad = especialidad;
    } 

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(String documentoPaciente) {
        this.documentoPaciente = documentoPaciente;
    }
}