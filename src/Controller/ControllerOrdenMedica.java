/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.OrdenMedicaDAO;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.OrdenMedica;

/**
 *
 * @author HP
 */
public class ControllerOrdenMedica {
    
     private final javax.swing.JFrame view; // Referencia a la vista
    
    public ControllerOrdenMedica(javax.swing.JFrame view) {
        this.view = view;
    }
    private OrdenMedicaDAO ordenmedicaDAO =new OrdenMedicaDAO();
private JLabel jLabel21;
private JLabel jLabel7;
private JLabel jLabel19;
private JLabel jLabel11;
private JLabel jLabel15;
private JLabel jLabel18;
private JTextField jTextField1;
private JTextField jcantidad;
private JTextField jnombre;

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }
   
    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }
    

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setJcantidad(JTextField jcantidad) {
        this.jcantidad = jcantidad;
    }

    public void setJnombre(JTextField jnombre) {
        this.jnombre = jnombre;
    }


public void guardarDiagnostico(){
    
try{
String documentoPaciente = jLabel21.getText().trim();
String nombre = jLabel7.getText().trim();
String apellido = jLabel19.getText().trim();
String tipoSangre = jLabel11.getText().trim();
String sexo= jLabel15.getText().trim();
String eps = jLabel18.getText().trim();
String diagnostico = jTextField1.getText().trim();
String cantidad = jcantidad.getText().trim();
String medicamentos = jnombre.getText().trim();


    if (documentoPaciente.isEmpty() || nombre.isEmpty() || apellido.isEmpty()
        || tipoSangre.isEmpty() || sexo.isEmpty() || eps.isEmpty() || diagnostico.isEmpty() || cantidad.isEmpty() || medicamentos.isEmpty()) {
         
                return ;
    }

   
 
    OrdenMedica nuevaorden = new OrdenMedica(
    documentoPaciente,
    nombre,
    apellido,
            tipoSangre,
            sexo,
            eps,
    diagnostico,
            cantidad,
            medicamentos
    );
    
    ordenmedicaDAO.guardarOrdenMedica(nuevaorden);
    JOptionPane.showMessageDialog(view,
                    "Orden Medica guardada exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            limpiarFormulario();
    
}catch(Exception e){
 JOptionPane.showMessageDialog(view,
                    "Error al guardar orden: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
    
}
}   
public void limpiarFormulario(){
jLabel21.setText("");
jLabel7.setText("");
jLabel19.setText("");
jTextField1.setText("");
jcantidad.setText("");
jnombre.setText("");
jLabel11.setText("");
jLabel15.setText("");
jLabel18.setText("");
}



}
