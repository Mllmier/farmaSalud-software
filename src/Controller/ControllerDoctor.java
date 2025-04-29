/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.MedicoDAO;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Medico;

public class ControllerDoctor {
  
    private DefaultTableModel tableModelDoctor;
    private MedicoDAO medicoDAO = new MedicoDAO();
    private String documentoOriginal;
    
    private JTable tablaDoctores;
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtCedula;
    private JTextField txtCorreo;
    private JTextField txtFechaNacimiento;
    private JTextField txtTelefono;
    private JComboBox<String> cbSexo;
    private JComboBox<String> cbEps;
    private JComboBox<String> cbEspecialidad;
    
    public void setTablaDoctores(JTable tablaDoctores) {
        this.tablaDoctores = tablaDoctores;
        this.tableModelDoctor = (DefaultTableModel) tablaDoctores.getModel();
    }
    
    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    
    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }
    
    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }
    
    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }
    
    public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }
    
    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }
    
    public void setCbSexo(JComboBox<String> cbSexo) {
        this.cbSexo = cbSexo;
    }
    
    public void setCbEps(JComboBox<String> cbEps) {
        this.cbEps = cbEps;
    }
    
    public void setCbEspecialidad(JComboBox<String> cbEspecialidad) {
        this.cbEspecialidad = cbEspecialidad;
    }
    
    public void initTableDoctor() {
        tableModelDoctor = new DefaultTableModel(
            new Object[]{"Nombre", "Apellidos", "Correo", "Cédula", "Teléfono", "Especialidad", "Fecha Nacimiento", "Sexo", "Eps"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaDoctores.setModel(tableModelDoctor);
    }
    
    public void cargarDatosEnTablaDoctor() {
        tableModelDoctor.setRowCount(0);
        List<Medico> medicos = medicoDAO.cargarTodos();
        for (Medico medico : medicos) {
            Object[] row = {
                medico.getNombres(),
                medico.getApellidos(),
                medico.getEmail(),
                medico.getNumeroDocumento(),
                medico.getCelular(),
                medico.getEspecialidad(),
                medico.getFechaNacimiento(),
                medico.getSexo(),
                medico.getEps()
            };
            tableModelDoctor.addRow(row);
        }
    }
    
    public void guardarDoctorDesdeFormulario() {
        try {
            String nombres = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String cedula = txtCedula.getText().trim();
            String correo = txtCorreo.getText().trim();
            String fechaStr = txtFechaNacimiento.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();
            String eps = cbEps.getSelectedItem().toString();
            String especialidad = cbEspecialidad.getSelectedItem().toString();
            
            if (nombres.isEmpty() || apellidos.isEmpty() || cedula.isEmpty() || 
                correo.isEmpty() || telefono.isEmpty() || fechaStr.isEmpty()) {
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
            
            boolean existe = medicoDAO.cargarTodos().stream()
                .anyMatch(m -> m.getNumeroDocumento().equals(cedula));
            if (existe) {
                JOptionPane.showMessageDialog(null,
                    "Ya existe un doctor con esta cédula",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Medico nuevoMedico = new Medico(
                nombres,
                apellidos,
                correo,
                cedula,
                telefono,
                especialidad,
                fechaNacimiento,
                sexo,
                eps
            );
            
            medicoDAO.guardarMedico(nuevoMedico);
            JOptionPane.showMessageDialog(null, "Doctor guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            cargarDatosEnTablaDoctor();
            limpiarDoctor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Doctor: " + e.getMessage(),
                "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }    
    }
    
    public void limpiarDoctor() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtCedula.setText("");
        txtFechaNacimiento.setText("");
        txtTelefono.setText("");
        cbSexo.setSelectedIndex(0);
        cbEps.setSelectedIndex(0);
        cbEspecialidad.setSelectedIndex(0);
    }
    
    public void eliminarDoctorSeleccionado() {
        int filaSeleccionada = tablaDoctores.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione un doctor de la tabla.", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numeroDocumento = tableModelDoctor.getValueAt(filaSeleccionada, 3).toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Eliminar al doctor con cédula " + numeroDocumento + "?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = medicoDAO.eliminarMedico(numeroDocumento);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, 
                    "Doctor eliminado correctamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaDoctor();
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo eliminar al doctor", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void actualizarDoctor() {
        try {
            int filaSeleccionada = tablaDoctores.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, 
                    "Seleccione un doctor de la tabla para actualizar", 
                    "Error", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            String documentoOriginal = tableModelDoctor.getValueAt(filaSeleccionada, 3).toString();

            String nombres = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String cedula = txtCedula.getText().trim();
            String correo = txtCorreo.getText().trim();
            String fechaStr = txtFechaNacimiento.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();
            String eps = cbEps.getSelectedItem().toString();
            String especialidad = cbEspecialidad.getSelectedItem().toString();

            if (nombres.isEmpty() || apellidos.isEmpty() || cedula.isEmpty() || 
                correo.isEmpty() || telefono.isEmpty() || fechaStr.isEmpty()) {
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

            if (!documentoOriginal.equals(cedula)) {
                boolean existe = medicoDAO.cargarTodos().stream()
                    .anyMatch(m -> m.getNumeroDocumento().equals(cedula));
                if (existe) {
                    JOptionPane.showMessageDialog(null,
                        "Ya existe un doctor con esta cédula",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            Medico medicoActualizado = new Medico(
                nombres,
                apellidos,
                correo,
                cedula,
                telefono,
                especialidad,
                fechaNacimiento,
                sexo,
                eps
            );

            boolean actualizado = medicoDAO.actualizarMedico(documentoOriginal, medicoActualizado);
            if (actualizado) {
                JOptionPane.showMessageDialog(null,
                    "Doctor actualizado exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaDoctor();
                limpiarDoctor();
            } else {
                JOptionPane.showMessageDialog(null,
                    "No se pudo actualizar el doctor. Verifique los datos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al actualizar doctor: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void cargarDatosDoctorEnFormulario() {
        int filaSeleccionada = tablaDoctores.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtNombre.setText(tableModelDoctor.getValueAt(filaSeleccionada, 0).toString());
            txtApellidos.setText(tableModelDoctor.getValueAt(filaSeleccionada, 1).toString());
            txtCorreo.setText(tableModelDoctor.getValueAt(filaSeleccionada, 2).toString());
            txtCedula.setText(tableModelDoctor.getValueAt(filaSeleccionada, 3).toString());
            txtTelefono.setText(tableModelDoctor.getValueAt(filaSeleccionada, 4).toString());
            cbEspecialidad.setSelectedItem(tableModelDoctor.getValueAt(filaSeleccionada, 5).toString());
            txtFechaNacimiento.setText(tableModelDoctor.getValueAt(filaSeleccionada, 6).toString());
            cbSexo.setSelectedItem(tableModelDoctor.getValueAt(filaSeleccionada, 7).toString());
            cbEps.setSelectedItem(tableModelDoctor.getValueAt(filaSeleccionada, 8).toString());
            
            documentoOriginal = txtCedula.getText();
        }
    }
}
