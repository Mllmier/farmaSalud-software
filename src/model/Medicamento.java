package model;

import java.util.Date;

public class Medicamento {
    private int idMedicamento;
    private String nombre;
    private String descripcion;
    private String laboratorio;
    private int cantidad;
    private String lote;
    private Date fechaVencimiento;
    private boolean disponible;
    private double precio;
    public enum estadoMedicamento{
      PENDIENTE,
      ENTREGADO
     }

    public Medicamento(int idMedicamento, String nombre, String descripcion, String laboratorio, int cantidad, String lote, Date fechaVencimiento, boolean disponible, double precio) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.disponible = disponible;
        this.precio = precio;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}