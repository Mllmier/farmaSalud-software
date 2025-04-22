package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    private String tipoSangre;
    private String alergias;
    private List<Cita> citas;
    private List<HistoriaMedica> historialMedico;

    public Paciente(String tipoSangre, String alergias, List<Cita> citas, List<HistoriaMedica> historialMedico, String numeroDocumento, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String eps, String email, String celular) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.citas = citas;
        this.historialMedico = historialMedico;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<HistoriaMedica> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(List<HistoriaMedica> historialMedico) {
        this.historialMedico = historialMedico;
    }

    
}