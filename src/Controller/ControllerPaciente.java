/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.PacienteDAO;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author Maria liz
 */
public class ControllerPaciente {
  
    private DefaultTableModel tableModelPaciente;
    private PacienteDAO pacienteDAO = new PacienteDAO();
    private String documentoOriginal;
    
    private JTable tablaPacientes;
    private JTextField txtPriNombreR;
    private JTextField txtPriApellidoR;
    private JTextField txtDocumentoR;
    private JTextField txtEmailR;
    private JTextField txtFechaNacimiento;
    private JTextField txtCelularR;
    private JComboBox<String> cbSexo;
    private JComboBox<String> cbEps;
    private JComboBox<String> cbTipoDocumento;
    private JComboBox<String> cboTipoSangre;
    private JTextArea txtAreaAntecedente;
    
     public void setTablaPacientes(JTable tablaPacientes) {
        this.tablaPacientes = tablaPacientes;
        this.tableModelPaciente = (DefaultTableModel) tablaPacientes.getModel();
    }
    
    public void setTxtNombre(JTextField txtPriNombreR) {
        this.txtPriNombreR = txtPriNombreR;
    }
    
    public void setTxtApellidos(JTextField txtPriApellidos) {
        this.txtPriApellidoR = txtPriApellidos;
    }
    
    public void setTxtDocumentoR(JTextField txtDocumentoR) {
        this.txtDocumentoR = txtDocumentoR;
    }
    
    public void setTxtEmail(JTextField txtEmailR) {
        this.txtEmailR = txtEmailR;
    }
    
    public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }
    
    public void setTxtTelefono(JTextField txtCelularR) {
        this.txtCelularR = txtCelularR;
    }
    
    public void setCbSexo(JComboBox<String> cbSexo) {
        this.cbSexo = cbSexo;
    }
    
    public void setCbEps(JComboBox<String> cbEps) {
        this.cbEps = cbEps;
    }
    
    public void setCbTipoDocumento(JComboBox<String> cbTipoDocumento) {
        this.cbTipoDocumento = cbTipoDocumento;
    }
    
    public void setCboTipoSangre(JComboBox<String> cboTipoSangre) {
        this.cboTipoSangre = cboTipoSangre;
    }
    
    // Resto de los métodos del controlador (guardar, actualizar, eliminar, etc.)

    private void setUpTablePaciente() {
        tableModelPaciente = (DefaultTableModel) tablaPacientes.getModel();
    }

    public void setTxtAreaAntecedente(JTextArea txtAreaAntecedente) {
        this.txtAreaAntecedente = txtAreaAntecedente;
    }
    
    
    public void guardarPacienteDesdeFormulario() {
        try {
            String nombres = txtPriNombreR.getText().trim();
            String apellidos = txtPriApellidoR.getText().trim();
            String documento = txtDocumentoR.getText().trim();
            String email = txtEmailR.getText().trim();
            String fechaStr = txtFechaNacimiento.getText().trim();
            String telefono = txtCelularR.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();
            String eps = cbEps.getSelectedItem().toString();
            String tipoDocumento = cbTipoDocumento.getSelectedItem().toString();
            String tipoSangre = cboTipoSangre.getSelectedItem().toString();
            String antecedente=txtAreaAntecedente.getText().trim();
            
            if (nombres.isEmpty() || apellidos.isEmpty() || documento.isEmpty() || 
                email.isEmpty() || telefono.isEmpty() || fechaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            LocalDate fechaNacimiento;
            try {
                fechaNacimiento = LocalDate.parse(fechaStr);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        boolean existe = pacienteDAO.cargarTodos().stream()
    .anyMatch(p -> p.getNumeroDocumento() != null && p.getNumeroDocumento().equals(documento));
            if (existe) {
                JOptionPane.showMessageDialog(null,
                    "Ya existe un paciente con este documento",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Paciente nuevoPaciente = new Paciente(
                documento, 
                nombres, 
                apellidos, 
                fechaNacimiento, 
                sexo, 
                eps,
                email, 
                telefono,
                tipoDocumento,
                tipoSangre,
                antecedente
            );
            
            pacienteDAO.guardarPaciente(nuevoPaciente);
            JOptionPane.showMessageDialog(null, "Paciente guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            cargarDatosEnTablaPaciente();
            limpiarPaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Paciente: " + e.getMessage(),
                "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }    
    }
    
    public void limpiarPaciente() {
        txtPriNombreR.setText("");
        txtPriApellidoR.setText("");
        txtEmailR.setText("");
        txtDocumentoR.setText("");
        txtFechaNacimiento.setText("");
        txtCelularR.setText("");
        cbTipoDocumento.setSelectedIndex(0);
        cboTipoSangre.setSelectedIndex(0);
        cbSexo.setSelectedIndex(0);
        cbEps.setSelectedIndex(0);
        txtAreaAntecedente.setText("");
    }
    
    public void initTablePaciente() {
        tableModelPaciente = new DefaultTableModel(
            new Object[]{"Documento", "Nombres", "Apellidos", "Fecha Nacimiento", "Sexo", 
                         "Eps", "Email", "Telefono", "Tipo Documento", "Tipo Sangre","Antecedentes"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaPacientes.setModel(tableModelPaciente);
    }
    
    public void cargarDatosEnTablaPaciente() {
        tableModelPaciente.setRowCount(0);
        List<Paciente> pacientes = pacienteDAO.cargarTodos();
        for (Paciente paciente : pacientes) {
            Object[] row = {
                paciente.getNumeroDocumento(), 
                paciente.getNombres(),         
                paciente.getApellidos(),      
                paciente.getFechaNacimiento(),
                paciente.getSexo(),           
                paciente.getEps(),            
                paciente.getEmail(),           
                paciente.getCelular(),  
                paciente.getTipoDocumento(),
                paciente.getTipoSangre(),
                paciente.getAntecendentes()
            };
            tableModelPaciente.addRow(row);
        }
    }
    
    public void eliminarPacienteSeleccionado() {
        int filaSeleccionada = tablaPacientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione un paciente de la tabla.", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numeroDocumento = tableModelPaciente.getValueAt(filaSeleccionada, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Eliminar al paciente con documento " + numeroDocumento + "?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = pacienteDAO.eliminarPaciente(numeroDocumento);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, 
                    "Paciente eliminado correctamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaPaciente();
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo eliminar al paciente", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void actualizarPaciente() {
        try {
            int filaSeleccionada = tablaPacientes.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, 
                    "Seleccione un paciente de la tabla para actualizar", 
                    "Error", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            String documentoOriginal = tableModelPaciente.getValueAt(filaSeleccionada, 0).toString();

            String nombres = txtPriNombreR.getText().trim();
            String apellidos = txtPriApellidoR.getText().trim();
            String documento = txtDocumentoR.getText().trim();
            String email = txtEmailR.getText().trim();
            String fechaStr = txtFechaNacimiento.getText().trim();
            String telefono = txtCelularR.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();
            String eps = cbEps.getSelectedItem().toString();
            String tipoDocumento = cbTipoDocumento.getSelectedItem().toString();
            String tipoSangre = cboTipoSangre.getSelectedItem().toString();
            String antecedentes=txtAreaAntecedente.getText().trim();

            if (nombres.isEmpty() || apellidos.isEmpty() || documento.isEmpty() || 
                email.isEmpty() || telefono.isEmpty() || fechaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Todos los campos son obligatorios",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate fechaNacimiento;
            try {
                fechaNacimiento = LocalDate.parse(fechaStr);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

 

            Paciente pacienteActualizado = new Paciente(
                    documento, 
                    nombres,
                    apellidos,
                    fechaNacimiento, 
                    sexo,
                    eps,
                    email,
                    telefono,
                    tipoDocumento, 
                    tipoSangre,
                    antecedentes
            );

               boolean actualizado = pacienteDAO.actualizarPaciente(documentoOriginal, pacienteActualizado);

            if (actualizado) {
                JOptionPane.showMessageDialog(null,
                    "Paciente actualizado exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaPaciente();
                limpiarPaciente();
            } else {
                JOptionPane.showMessageDialog(null,
                    "No se pudo actualizar el paciente. Verifique los datos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al actualizar paciente: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    // Método para cargar datos del paciente seleccionado en el formulario
    public void cargarDatosPacienteEnFormulario() {
        int filaSeleccionada = tablaPacientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtDocumentoR.setText(tableModelPaciente.getValueAt(filaSeleccionada, 0).toString());
            txtPriNombreR.setText(tableModelPaciente.getValueAt(filaSeleccionada, 1).toString());
            txtPriApellidoR.setText(tableModelPaciente.getValueAt(filaSeleccionada, 2).toString());
            txtFechaNacimiento.setText(tableModelPaciente.getValueAt(filaSeleccionada, 3).toString());
            cbSexo.setSelectedItem(tableModelPaciente.getValueAt(filaSeleccionada, 4).toString());
            cbEps.setSelectedItem(tableModelPaciente.getValueAt(filaSeleccionada, 5).toString());
            txtEmailR.setText(tableModelPaciente.getValueAt(filaSeleccionada, 6).toString());
            txtCelularR.setText(tableModelPaciente.getValueAt(filaSeleccionada, 7).toString());
            cbTipoDocumento.setSelectedItem(tableModelPaciente.getValueAt(filaSeleccionada, 8).toString());
            cboTipoSangre.setSelectedItem(tableModelPaciente.getValueAt(filaSeleccionada, 9).toString());
            txtAreaAntecedente.setText(tableModelPaciente.getValueAt(filaSeleccionada,10).toString());
            documentoOriginal = txtDocumentoR.getText();
        }
    }
}

