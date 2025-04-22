package model;

import farmasalud.view.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fechaCita;
    private LocalTime hora;
    private String tipoCita;
    private String consultorio;
    private String motivo;
    private EstadoCita estado;
    private Paciente paciente;
    //private Doctor doctor;

    public enum EstadoCita {
        PROGRAMADA,
        COMPLETADA,
        CANCELADA
    }

    public Cita(LocalDate fechaCita, LocalTime hora, Paciente paciente /*Doctor doctor*/) {
        this.fechaCita = fechaCita;
        this.hora = hora;
        this.paciente = paciente;
        //this.doctor = doctor;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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

    
}