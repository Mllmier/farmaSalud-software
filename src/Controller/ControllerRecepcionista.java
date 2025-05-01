/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.RecepcionistaDAO;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Recepcionista;

public class ControllerRecepcionista {
  
    private DefaultTableModel tableModelRecepcionista;
    private RecepcionistaDAO recepcionistaDAO = new RecepcionistaDAO();
    private String documentoOriginal;
    
    private JTable tablaRecepcionistas;
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtDocumento;
    private JTextField txtEmail;
    private JTextField txtFechaNacimiento;
    private JTextField txtTelefono;
    private JTextField txtCodigoEmpleado;
    private JTextField txtFechaContratacion;
    private JComboBox<String> cbSexo;
    private JComboBox<String> cbEps;
    private JComboBox<String> cbTurno;
    
    public void setTablaRecepcionistas(JTable tablaRecepcionistas) {
        this.tablaRecepcionistas = tablaRecepcionistas;
        this.tableModelRecepcionista = (DefaultTableModel) tablaRecepcionistas.getModel();
    }
    
    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    
    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }
    
    public void setTxtDocumento(JTextField txtDocumento) {
        this.txtDocumento = txtDocumento;
    }
    
    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }
    
    public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }
    
    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }
    
    public void setTxtCodigoEmpleado(JTextField txtCodigoEmpleado) {
        this.txtCodigoEmpleado = txtCodigoEmpleado;
    }
    
    public void setTxtFechaContratacion(JTextField txtFechaContratacion) {
        this.txtFechaContratacion = txtFechaContratacion;
    }
    
    public void setCbSexo(JComboBox<String> cbSexo) {
        this.cbSexo = cbSexo;
    }
    
    public void setCbEps(JComboBox<String> cbEps) {
        this.cbEps = cbEps;
    }
    
    public void setCbTurno(JComboBox<String> cbTurno) {
        this.cbTurno = cbTurno;
    }
    
    public void initTableRecepcionista() {
        tableModelRecepcionista = new DefaultTableModel(
            new Object[]{"Documento", "Nombres", "Apellidos", "Fecha Nacimiento", "Sexo", 
                         "Eps", "Email", "Telefono", "Código Empleado", "Fecha Contratación", "Turno"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaRecepcionistas.setModel(tableModelRecepcionista);
    }
    
    public void cargarDatosEnTablaRecepcionista() {
        tableModelRecepcionista.setRowCount(0);
        List<Recepcionista> recepcionistas = recepcionistaDAO.cargarTodos();
        for (Recepcionista recepcionista : recepcionistas) {
            Object[] row = {
                recepcionista.getNumeroDocumento(),
                recepcionista.getNombres(),
                recepcionista.getApellidos(),
                recepcionista.getFechaNacimiento(),
                recepcionista.getSexo(),
                recepcionista.getEps(),
                recepcionista.getEmail(),
                recepcionista.getCelular(),
                recepcionista.getCodigoEmpleado(),
                recepcionista.getFechaContratacion(),
                recepcionista.getTurno()
            };
            tableModelRecepcionista.addRow(row);
        }
    }
    
   public void guardarRecepcionistaDesdeFormulario() {
    try {
        
        String nombres = txtNombre.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String documento = txtDocumento.getText().trim();
        String email = txtEmail.getText().trim();
        String fechaNacStr = txtFechaNacimiento.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String codigoEmpleado = txtCodigoEmpleado.getText().trim();
        String fechaContratacionStr = txtFechaContratacion.getText().trim();
        String sexo = cbSexo.getSelectedItem() != null ? cbSexo.getSelectedItem().toString() : "";
        String eps = cbEps.getSelectedItem() != null ? cbEps.getSelectedItem().toString() : "";
        String turno = cbTurno.getSelectedItem() != null ? cbTurno.getSelectedItem().toString() : "";

        
        if (nombres.isEmpty() || apellidos.isEmpty() || documento.isEmpty() || 
            email.isEmpty() || telefono.isEmpty() || fechaNacStr.isEmpty() ||
            codigoEmpleado.isEmpty() || fechaContratacionStr.isEmpty() ||
            sexo.isEmpty() || eps.isEmpty() || turno.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                "Todos los campos son obligatorios", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        LocalDate fechaNacimiento;
        LocalDate fechaContratacion;
        try {
            fechaNacimiento = LocalDate.parse(fechaNacStr);
            fechaContratacion = LocalDate.parse(fechaContratacionStr);
            
            
            if (fechaContratacion.isBefore(fechaNacimiento)) {
                JOptionPane.showMessageDialog(null,
                    "La fecha de contratación no puede ser anterior a la fecha de nacimiento",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null,
                "Formato de fecha inválido. Usa YYYY-MM-DD",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        boolean existe = recepcionistaDAO.cargarTodos().stream()
            .filter(r -> r.getNumeroDocumento() != null) 
            .anyMatch(r -> r.getNumeroDocumento().equals(documento));
            
        if (existe) {
            JOptionPane.showMessageDialog(null,
                "Ya existe un recepcionista con este documento",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(null,
                "El formato del email no es válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        Recepcionista nuevoRecepcionista = new Recepcionista(
            documento,
            nombres,
            apellidos,
            fechaNacimiento,
            sexo,
            eps,
            email,
            telefono,
            codigoEmpleado,
            fechaContratacion,
            turno
        );

        recepcionistaDAO.guardarRecepcionista(nuevoRecepcionista);
        JOptionPane.showMessageDialog(null, 
            "Recepcionista guardado exitosamente", 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);
            
        
        cargarDatosEnTablaRecepcionista();
        limpiarRecepcionista();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, 
            "Error al guardar Recepcionista: " + e.getMessage(),
            "ERROR", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }    
}
    
    public void limpiarRecepcionista() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDocumento.setText("");
        txtEmail.setText("");
        txtFechaNacimiento.setText("");
        txtTelefono.setText("");
        txtCodigoEmpleado.setText("");
        txtFechaContratacion.setText("");
        cbSexo.setSelectedIndex(0);
        cbEps.setSelectedIndex(0);
        cbTurno.setSelectedIndex(0);
    }
    
    public void eliminarRecepcionistaSeleccionado() {
        int filaSeleccionada = tablaRecepcionistas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione un recepcionista de la tabla.", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numeroDocumento = tableModelRecepcionista.getValueAt(filaSeleccionada, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Eliminar al recepcionista con documento " + numeroDocumento + "?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = recepcionistaDAO.eliminarRecepcionista(numeroDocumento);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, 
                    "Recepcionista eliminado correctamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaRecepcionista();
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo eliminar al recepcionista", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void actualizarRecepcionista() {
        try {
            int filaSeleccionada = tablaRecepcionistas.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, 
                    "Seleccione un recepcionista de la tabla para actualizar", 
                    "Error", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            String documentoOriginal = tableModelRecepcionista.getValueAt(filaSeleccionada, 0).toString();

            String nombres = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String documento = txtDocumento.getText().trim();
            String email = txtEmail.getText().trim();
            String fechaNacStr = txtFechaNacimiento.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String codigoEmpleado = txtCodigoEmpleado.getText().trim();
            String fechaContratacionStr = txtFechaContratacion.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();
            String eps = cbEps.getSelectedItem().toString();
            String turno = cbTurno.getSelectedItem().toString();

            if (nombres.isEmpty() || apellidos.isEmpty() || documento.isEmpty() || 
                email.isEmpty() || telefono.isEmpty() || fechaNacStr.isEmpty() ||
                codigoEmpleado.isEmpty() || fechaContratacionStr.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Todos los campos son obligatorios",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate fechaNacimiento;
            LocalDate fechaContratacion;
            try {
                fechaNacimiento = LocalDate.parse(fechaNacStr);
                fechaContratacion = LocalDate.parse(fechaContratacionStr);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!documentoOriginal.equals(documento)) {
                boolean existe = recepcionistaDAO.cargarTodos().stream()
                    .anyMatch(r -> r.getNumeroDocumento().equals(documento));
                if (existe) {
                    JOptionPane.showMessageDialog(null,
                        "Ya existe un recepcionista con este documento",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            Recepcionista recepcionistaActualizado = new Recepcionista(
                documento,
                nombres,
                apellidos,
                fechaNacimiento,
                sexo,
                eps,
                email,
                telefono,
                codigoEmpleado,
                fechaContratacion,
                turno
            );

            boolean actualizado = recepcionistaDAO.actualizarRecepcionista(documentoOriginal, recepcionistaActualizado);
            if (actualizado) {
                JOptionPane.showMessageDialog(null,
                    "Recepcionista actualizado exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaRecepcionista();
                limpiarRecepcionista();
            } else {
                JOptionPane.showMessageDialog(null,
                    "No se pudo actualizar el recepcionista. Verifique los datos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al actualizar recepcionista: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void cargarDatosRecepcionistaEnFormulario() {
        int filaSeleccionada = tablaRecepcionistas.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtDocumento.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 1).toString());
            txtApellidos.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 2).toString());
            txtFechaNacimiento.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 3).toString());
            cbSexo.setSelectedItem(tableModelRecepcionista.getValueAt(filaSeleccionada, 4).toString());
            cbEps.setSelectedItem(tableModelRecepcionista.getValueAt(filaSeleccionada, 5).toString());
            txtEmail.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 6).toString());
            txtTelefono.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 7).toString());
            txtCodigoEmpleado.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 8).toString());
            txtFechaContratacion.setText(tableModelRecepcionista.getValueAt(filaSeleccionada, 9).toString());
            cbTurno.setSelectedItem(tableModelRecepcionista.getValueAt(filaSeleccionada, 10).toString());
            
            documentoOriginal = txtDocumento.getText();
        }
    }
}
