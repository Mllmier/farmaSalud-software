/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Maria liz
 */
public class OrdenMedica  {
    
    private String idOrden;
    private String documentoPaciente; // Relación con Paciente
    private String nombre;
    private String apellido;
    private String tipoSangre;
    private String sexo;
    private String eps;
    private String diagnostico;
    private String cantidad;
    private String medicamentos; // Lista de nombres de medicamentos
    private Date fecha;

    // Constructor, getters y setters
    public OrdenMedica(String documentoPaciente,String nombre,String apellido,String tipoSangre,String sexo,String eps, String diagnostico, String cantidad, String medicamentos) {
        this.documentoPaciente = documentoPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoSangre= tipoSangre;
        this.sexo= sexo;
        this.eps = eps;
        this.diagnostico = diagnostico;
        this.cantidad=cantidad;
        this.medicamentos = medicamentos;
        this.fecha = new Date(); // Fecha actual
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(String documentoPaciente) {
        this.documentoPaciente = documentoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
    
    

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
  
    
  

