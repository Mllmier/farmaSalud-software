package model;

import farmasalud.view.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private  String idCita;
    private LocalDate fechaCita;
    private String hora;
    private String tipoCita;
    private String consultorio;
    private String motivo;
    private EstadoCita estado;
    private Paciente paciente;
    private Medico medico;

    public enum EstadoCita {
        PROGRAMADA,
        COMPLETADA,
        CANCELADA
    }

    public Cita(String idCita,LocalDate fechaCita, String  hora,String motivo,String tipoCita,String consultorio, Paciente paciente,EstadoCita estado,Medico medico ) {
        
        this.idCita=idCita;
        this.motivo=motivo;
        this.fechaCita = fechaCita;
        this.hora = hora;
        this.paciente = paciente;
        this.tipoCita=tipoCita;
        this.medico=medico;
        this.motivo=motivo;
        this.consultorio=consultorio;
        //this.doctor = doctor;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    

    
}