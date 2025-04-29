package Controller;

import dao.FarmaceuticaDAO;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Farmaceutica;

public class CotrollerFarmaceutica {
  
    private DefaultTableModel tableModelFarmaceutica;
    private FarmaceuticaDAO farmaceuticaDAO = new FarmaceuticaDAO();
    private String documentoOriginal;
    
    // Componentes de la interfaz (sin cbEpss y cbEspecialidad)
    private JTable TabladeFarmaceuticas;
    private JTextField Jtexfieldnombre_farmaceutica;
    private JTextField jtextfieldApellido_farmaceutica;
    private JTextField jtextfielID_farmaceutica;
    private JTextField Jtextfield_correo_farmaceutica;
    private JTextField Jtexfieldfechanacimiento_farmeceutica;
    private JTextField jtextfieldTelefono_farmaceutica;
    private JTextField JtexfieldCodigo_farmaceutica;
    private JTextField Jtexfieldfechacontratacion_farmaceutica;
    private JComboBox<String> Jcombobox_sexoFarmaceutica;
    private JComboBox<String> cbTurno;
    
    // Métodos setters para los componentes (sin setCbEpss y setCbEspecialidad)
    public void setTabladeFarmaceuticas(JTable TabladeFarmaceuticas) {
        this.TabladeFarmaceuticas = TabladeFarmaceuticas;
        this.tableModelFarmaceutica = (DefaultTableModel) TabladeFarmaceuticas.getModel();
    }
    
    public void setJtexfieldnombre_farmaceutica(JTextField Jtexfieldnombre_farmaceutica) {
        this.Jtexfieldnombre_farmaceutica = Jtexfieldnombre_farmaceutica;
    }
    
    public void setJtextfieldApellido_farmaceutica(JTextField jtextfieldApellido_farmaceutica) {
        this.jtextfieldApellido_farmaceutica = jtextfieldApellido_farmaceutica;
    }
    
    public void setJtextfielID_farmaceutica(JTextField jtextfielID_farmaceutica) {
        this.jtextfielID_farmaceutica = jtextfielID_farmaceutica;
    }
    
    public void setJtextfield_correo_farmaceutica(JTextField Jtextfield_correo_farmaceutica) {
        this.Jtextfield_correo_farmaceutica = Jtextfield_correo_farmaceutica;
    }
    
    public void setJtexfieldfechanacimiento_farmeceutica(JTextField Jtexfieldfechanacimiento_farmeceutica) {
        this.Jtexfieldfechanacimiento_farmeceutica = Jtexfieldfechanacimiento_farmeceutica;
    }
    
    public void setJtextfieldTelefono_farmaceutica(JTextField jtextfieldTelefono_farmaceutica) {
        this.jtextfieldTelefono_farmaceutica = jtextfieldTelefono_farmaceutica;
    }
    
    public void setJtexfieldCodigo_farmaceutica(JTextField JtexfieldCodigo_farmaceutica) {
        this.JtexfieldCodigo_farmaceutica = JtexfieldCodigo_farmaceutica;
    }
    
    public void setJtexfieldfechacontratacion_farmaceutica(JTextField Jtexfieldfechacontratacion_farmaceutica) {
        this.Jtexfieldfechacontratacion_farmaceutica = Jtexfieldfechacontratacion_farmaceutica;
    }
    
    public void setJcombobox_sexoFarmaceutica(JComboBox<String> Jcombobox_sexoFarmaceutica) {
        this.Jcombobox_sexoFarmaceutica = Jcombobox_sexoFarmaceutica;
    }
    
    public void setCbTurno(JComboBox<String> cbTurno) {
        this.cbTurno = cbTurno;
    }
    
    public void initTableFarmaceutica() {
        tableModelFarmaceutica = new DefaultTableModel(
            new Object[]{"Documento", "Nombres", "Apellidos", "Fecha Nacimiento", "Sexo", 
                         "Email", "Telefono", "Código Empleado", "Fecha Contratación", "Turno"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TabladeFarmaceuticas.setModel(tableModelFarmaceutica);
    }
    
    public void cargarDatosEnTablaFarmaceutica() {
        tableModelFarmaceutica.setRowCount(0);
        List<Farmaceutica> farmaceuticas = farmaceuticaDAO.cargarTodos();
        for (Farmaceutica farmaceutica : farmaceuticas) {
            Object[] row = {
                farmaceutica.getNumeroDocumento(),
                farmaceutica.getNombres(),
                farmaceutica.getApellidos(),
                farmaceutica.getFechaNacimiento(),
                farmaceutica.getSexo(),
                farmaceutica.getEmail(),
                farmaceutica.getCelular(),
                farmaceutica.getCodigoEmpleado(),
                farmaceutica.getFechaContratacion(),
                farmaceutica.getTurno()
            };
            tableModelFarmaceutica.addRow(row);
        }
    }
    
    public void guardarFarmaceuticaDesdeFormulario() {
    try {
        String nombres = Jtexfieldnombre_farmaceutica.getText().trim();
        String apellidos = jtextfieldApellido_farmaceutica.getText().trim();
        String documento = jtextfielID_farmaceutica.getText().trim();
        String email = Jtextfield_correo_farmaceutica.getText().trim();
        String fechaNacStr = Jtexfieldfechanacimiento_farmeceutica.getText().trim();
        String telefono = jtextfieldTelefono_farmaceutica.getText().trim();
        String codigoEmpleado = JtexfieldCodigo_farmaceutica.getText().trim();
        String fechaContratacionStr = Jtexfieldfechacontratacion_farmaceutica.getText().trim();
        String sexo = Jcombobox_sexoFarmaceutica.getSelectedItem().toString();
        String turno = cbTurno.getSelectedItem().toString();
        
        // Validaciones adicionales
        if (documento == null || documento.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El número de documento es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (nombres.isEmpty() || apellidos.isEmpty() || email.isEmpty() || 
            telefono.isEmpty() || fechaNacStr.isEmpty() || codigoEmpleado.isEmpty() || 
            fechaContratacionStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
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
        
        // Verificación de existencia con manejo de nulos
        boolean existe = farmaceuticaDAO.cargarTodos().stream()
            .filter(f -> f.getNumeroDocumento() != null)
            .anyMatch(f -> f.getNumeroDocumento().equals(documento));
            
        if (existe) {
            JOptionPane.showMessageDialog(null,
                "Ya existe un farmacéutico con este documento",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Farmaceutica nuevoFarmaceutica = new Farmaceutica(
            documento,
            nombres,
            apellidos,
            fechaNacimiento,
            sexo,
            "", // EPS vacío
            email,
            telefono,
            codigoEmpleado,
            fechaContratacion,
            turno
        );
        
        farmaceuticaDAO.guardarFarmaceutica(nuevoFarmaceutica);
        JOptionPane.showMessageDialog(null, "Farmacéutico guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        cargarDatosEnTablaFarmaceutica();
        limpiarFarmaceutica();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al guardar Farmacéutico: " + e.getMessage(),
            "ERROR", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }    
}
    
    public void limpiarFarmaceutica() {
        Jtexfieldnombre_farmaceutica.setText("");
        jtextfieldApellido_farmaceutica.setText("");
        jtextfielID_farmaceutica.setText("");
        Jtextfield_correo_farmaceutica.setText("");
        Jtexfieldfechanacimiento_farmeceutica.setText("");
        jtextfieldTelefono_farmaceutica.setText("");
        JtexfieldCodigo_farmaceutica.setText("");
        Jtexfieldfechacontratacion_farmaceutica.setText("");
        Jcombobox_sexoFarmaceutica.setSelectedIndex(0);
        cbTurno.setSelectedIndex(0);
    }
    
    public void eliminarFarmaceuticaSeleccionado() {
        int filaSeleccionada = TabladeFarmaceuticas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione un farmacéutico de la tabla.", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numeroDocumento = tableModelFarmaceutica.getValueAt(filaSeleccionada, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Eliminar al farmacéutico con documento " + numeroDocumento + "?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = farmaceuticaDAO.eliminarFarmaceutica(numeroDocumento);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, 
                    "Farmacéutico eliminado correctamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaFarmaceutica();
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo eliminar al farmacéutico", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void actualizarFarmaceutica() {
        try {
            int filaSeleccionada = TabladeFarmaceuticas.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, 
                    "Seleccione un farmacéutico de la tabla para actualizar", 
                    "Error", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            String documentoOriginal = tableModelFarmaceutica.getValueAt(filaSeleccionada, 0).toString();

            String nombres = Jtexfieldnombre_farmaceutica.getText().trim();
            String apellidos = jtextfieldApellido_farmaceutica.getText().trim();
            String documento = jtextfielID_farmaceutica.getText().trim();
            String email = Jtextfield_correo_farmaceutica.getText().trim();
            String fechaNacStr = Jtexfieldfechanacimiento_farmeceutica.getText().trim();
            String telefono = jtextfieldTelefono_farmaceutica.getText().trim();
            String codigoEmpleado = JtexfieldCodigo_farmaceutica.getText().trim();
            String fechaContratacionStr = Jtexfieldfechacontratacion_farmaceutica.getText().trim();
            String sexo = Jcombobox_sexoFarmaceutica.getSelectedItem().toString();
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
                boolean existe = farmaceuticaDAO.cargarTodos().stream()
                    .anyMatch(f -> f.getNumeroDocumento().equals(documento));
                if (existe) {
                    JOptionPane.showMessageDialog(null,
                        "Ya existe un farmacéutico con este documento",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            Farmaceutica farmaceuticaActualizado = new Farmaceutica(
                documento,
                nombres,
                apellidos,
                fechaNacimiento,
                sexo,
                "", // EPS vacío
                email,
                telefono,
                codigoEmpleado,
                fechaContratacion,
                turno
            );

            boolean actualizado = farmaceuticaDAO.actualizarFarmaceutica(documentoOriginal, farmaceuticaActualizado);
            if (actualizado) {
                JOptionPane.showMessageDialog(null,
                    "Farmacéutico actualizado exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaFarmaceutica();
                limpiarFarmaceutica();
            } else {
                JOptionPane.showMessageDialog(null,
                    "No se pudo actualizar el farmacéutico. Verifique los datos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al actualizar farmacéutico: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void cargarDatosFarmaceuticaEnFormulario() {
        int filaSeleccionada = TabladeFarmaceuticas.getSelectedRow();
        if (filaSeleccionada != -1) {
            jtextfielID_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 0).toString());
            Jtexfieldnombre_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 1).toString());
            jtextfieldApellido_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 2).toString());
            Jtexfieldfechanacimiento_farmeceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 3).toString());
            Jcombobox_sexoFarmaceutica.setSelectedItem(tableModelFarmaceutica.getValueAt(filaSeleccionada, 4).toString());
            Jtextfield_correo_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 5).toString());
            jtextfieldTelefono_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 6).toString());
            JtexfieldCodigo_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 7).toString());
            Jtexfieldfechacontratacion_farmaceutica.setText(tableModelFarmaceutica.getValueAt(filaSeleccionada, 8).toString());
            cbTurno.setSelectedItem(tableModelFarmaceutica.getValueAt(filaSeleccionada, 9).toString());
            
            documentoOriginal = jtextfielID_farmaceutica.getText();
        }
    }
    
    
    
    
}