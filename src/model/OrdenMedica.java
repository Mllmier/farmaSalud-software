/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Maria liz
 */
public class OrdenMedica extends Paciente {
  
    public OrdenMedica(String numeroDocumento, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String eps, String email, String celular, String tipoDocumento, String tipoSangre, String Antecendentes) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular, tipoDocumento, tipoSangre, Antecendentes);
    }
  
    
  
}
