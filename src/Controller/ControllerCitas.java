/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.CitasDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import model.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Cita;
import model.Cita.EstadoCita;
import model.Persona;
import model.Medico;




/**
 *
 * @author Maria liz
 */
public class ControllerCitas {
    private DefaultTableModel tableModelCita;
    private CitasDAO citasDAO = new CitasDAO();
    private String idCitaOriginal;
    private MedicoDAO medicoDAO = new MedicoDAO();
    private PacienteDAO pacienteDAO=new PacienteDAO();
    private Paciente pacienteSeleccionado;
    private JComboBox<String> cboMedicoCita; 
    private JTable tablaCitas;
    private JTextField txtIdCita;
    private JTextField txtFechaCita;
    private JComboBox<String> cboHoraCita;
    private JComboBox<String> cboEstadoCita;
    private JComboBox<String> cboTipoCita;
    private JComboBox<String> cboMotivoCita;
    private JComboBox<String> cboConsultorio;
    private DefaultTableModel tableModelPaciente;
    private JTable tablePaciente;
    private JTextField txtIdCita2;
    private JTextField txtFechaCita2;
     private JComboBox<String> cboHoraCita2;
    private JComboBox<String> cboEstadoCita2;
    private JComboBox<String> cboTipoCita2;
    private JComboBox<String> cboMotivoCita2;
    private JComboBox<String> cboConsultorio2;
    private JComboBox<String> cboMedicoCita2;
  
    

   
  
    public void setCboMedicoCita(JComboBox<String> cboMedicoCita) {
    this.cboMedicoCita = cboMedicoCita;
}
    public void setTablaCitas(JTable tablaCitas) {
        this.tablaCitas = tablaCitas;
        this.tableModelCita = (DefaultTableModel) tablaCitas.getModel();
    }
    
    public void setCboHoraCita(JComboBox<String> cboHoraCita) {
        this.cboHoraCita = cboHoraCita;
    }
    
    public void setCboEstadoCita(JComboBox<String> cboEstadoCita) {
        this.cboEstadoCita = cboEstadoCita;
    }
    
    public void setCboTipoCita(JComboBox<String> cboTipoCita) {
        this.cboTipoCita = cboTipoCita;
    }
    
    public void setCboConsultorio(JComboBox<String> cboConsultorio) {
        this.cboConsultorio = cboConsultorio;
    }
    public void setTxtFechaCita(JTextField txtFechaCita) {
        this.txtFechaCita = txtFechaCita;
    }
    
    public void setTxtIdCita(JTextField txtIdCita) {
        this.txtIdCita = txtIdCita;
    }
    
    public void setCboMotivoCita(JComboBox<String> cboMotivoCita) {
        this.cboMotivoCita = cboMotivoCita;
    } 
     public void setTxtIdCita2(JTextField txtIdCita2) {
        this.txtIdCita2 = txtIdCita2;
    } 
     public void setTxtFechaCita2(JTextField txtFechaCita2) {
        this.txtFechaCita2 = txtFechaCita2;
    }  
     public void setCboHoraCita2(JComboBox<String> cboHoraCita2) {
        this.cboHoraCita2 = cboHoraCita2;
    }
    
    public void setCboEstadoCita2(JComboBox<String> cboEstadoCita2) {
        this.cboEstadoCita2 = cboEstadoCita2;
    }
    
    public void setCboTipoCita2(JComboBox<String> cboTipoCita2) {
        this.cboTipoCita2 = cboTipoCita2;
    }
    
    public void setCboConsultorio2(JComboBox<String> cboConsultorio2) {
        this.cboConsultorio2 = cboConsultorio2;
    }
     public void setCboMotivoCita2(JComboBox<String> cboMotivoCita2) {
        this.cboMotivoCita2 = cboMotivoCita2;
    } 
     public void setCboMedicoCita2(JComboBox<String> cboMedicoCita2) {
    this.cboMedicoCita2 = cboMedicoCita2;
}
    

    
    public void guardarCitaDesdeFormulario() {
        try {
              if (pacienteSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente primero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            String IdCita = txtIdCita.getText().trim();
            String fechaStr = txtFechaCita.getText().trim();
            String horaCita = cboHoraCita.getSelectedItem().toString();
            String motivo = cboMotivoCita.getSelectedItem().toString();
            String tipo = cboTipoCita.getSelectedItem().toString();
            String consultorio = cboConsultorio.getSelectedItem().toString();
            EstadoCita estado = EstadoCita.valueOf(cboEstadoCita.getSelectedItem().toString());   
            String especialidad = cboMedicoCita.getSelectedItem().toString();
           
            
            if (fechaStr.isEmpty() || horaCita.isEmpty() || motivo.isEmpty() || 
                tipo.isEmpty() || consultorio.isEmpty() || especialidad.equals("<Seleccione>")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            LocalDate fechaCita;
            try {
                fechaCita = LocalDate.parse(fechaStr);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        boolean existe = citasDAO.cargarTodos().stream()
    .anyMatch(p -> p.getIdCita() != null && p.getIdCita().equals(IdCita));
            if (existe) {
                JOptionPane.showMessageDialog(null,
                    "Ya existe una cita  con este codigo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Cita nuevaCita = new Cita(
                IdCita, 
                fechaCita, 
                horaCita, 
                motivo, 
                tipo, 
                consultorio,
                estado, 
                especialidad
            );
              nuevaCita.setDocumentoPaciente(pacienteSeleccionado.getNumeroDocumento());
            citasDAO.guardarCita(nuevaCita);
            JOptionPane.showMessageDialog(null, "Cita guardada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
          cargarCitasEnTabla();
          limpiarCita();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar cita: " + e.getMessage(),
                "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }    
    }
     public void setTablePaciente(JTable tablePaciente) {
       if (tablePaciente == null) {
        throw new IllegalArgumentException("La tabla de pacientes no puede ser nula");
       }
       this.tablePaciente = tablePaciente;
       this.tableModelPaciente = (DefaultTableModel) tablePaciente.getModel();
}

public void cargarPacienteEnTabla() {
    if (tablePaciente == null || tableModelPaciente == null) {
        throw new IllegalStateException("La tabla de pacientes no ha sido inicializada.");
    }
    
    tableModelPaciente.setRowCount(0); 

    List<Paciente> pacientes = pacienteDAO.cargarTodos();

    for (Paciente paciente : pacientes) {
        Object[] row = {
            paciente.getNumeroDocumento(),
            paciente.getNombres(),
            paciente.getApellidos(),
            paciente.getEps(),
            paciente.getCelular()
          
        };
        tableModelPaciente.addRow(row);
    }
}public void seleccionarPaciente() {
    int filaSeleccionada = tablePaciente.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        return; // No hay fila seleccionada
    }
    
    // Obtener el documento del paciente seleccionado
    String documento = tablePaciente.getValueAt(filaSeleccionada, 0).toString();
    
    // Buscar el paciente en la base de datos
    pacienteSeleccionado = pacienteDAO.buscarPorDocumento(documento);
    
    if (pacienteSeleccionado != null) {
        JOptionPane.showMessageDialog(null,
            "Paciente seleccionado: " + pacienteSeleccionado.getNombres(),
            "Paciente Asignado",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
     public  void initTableModelCita() {
    if (tablaCitas == null) {
        throw new IllegalStateException("La tabla de citas no ha sido inicializada");
    }
    
    tableModelCita = new DefaultTableModel(
        new Object[]{ "Documento", "Nombre", "Apellido", "Eps", "Email","Id Cita", "Hora Cita", 
                     "Motivo", "Fecha Cita", "Tipo Cita", "Consultorio", "Estado", "Especialidad"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    tablaCitas.setModel(tableModelCita); 
    }
    public void cargarCitasEnTabla() {
    if (tablaCitas == null || tableModelCita == null) {
        throw new IllegalStateException("La tabla de citas no ha sido inicializada.");
    }
    
    tableModelCita.setRowCount(0);
    
    
    List<Cita> citas = citasDAO.cargarTodos();
    for (Cita cita : citas) {
        // Buscar paciente por su documento (usando el campo documentoPaciente de Cita)
        Paciente paciente = pacienteDAO.buscarPorDocumento(cita.getDocumentoPaciente());
        
        if (paciente != null) {
            Object[] row = {
                paciente.getNumeroDocumento(),
                paciente.getNombres(),
                paciente.getApellidos(),
                paciente.getEps(),
                paciente.getCelular(),
                cita.getIdCita(),
                cita.getHora(),
                cita.getMotivo(),
                cita.getFechaCita(),
                cita.getTipoCita(),
                cita.getConsultorio(),
                cita.getEstado().toString(),
                cita.getMedico()
            };
            tableModelCita.addRow(row);
        }
    }
}
    public void actualizarCita() {
    try {
        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione una cita de la tabla para actualizar", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener el ID original de la cita seleccionada
        String idCitaOriginal = tablaCitas.getValueAt(filaSeleccionada, 5).toString();

        String idCita = txtIdCita2.getText().trim();
        String fechaStr = txtFechaCita2.getText().trim();
        String horaCita = cboHoraCita2.getSelectedItem().toString();
        String motivo = cboMotivoCita2.getSelectedItem().toString();
        String tipo = cboTipoCita2.getSelectedItem().toString();
        String consultorio = cboConsultorio2.getSelectedItem().toString();
        EstadoCita estado = EstadoCita.valueOf(cboEstadoCita2.getSelectedItem().toString());   
        String especialidad = cboMedicoCita2.getSelectedItem().toString();

        if (fechaStr.isEmpty() || horaCita.isEmpty() || motivo.isEmpty() || 
            tipo.isEmpty() || consultorio.isEmpty() || especialidad.equals("<Seleccione>")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate fechaCita;
        try {
            fechaCita = LocalDate.parse(fechaStr);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null,
                "Formato de fecha inválido. Usa YYYY-MM-DD",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cita citaActualizada = new Cita(
            idCita, 
            fechaCita, 
            horaCita, 
            motivo, 
            tipo, 
            consultorio,
            estado, 
            especialidad
        );
        
        // Mantener el mismo paciente asociado
        String documentoPaciente = tablaCitas.getValueAt(filaSeleccionada, 0).toString();
        citaActualizada.setDocumentoPaciente(documentoPaciente);

        boolean actualizado = citasDAO.actualizarCita(idCitaOriginal, citaActualizada);
       limpiarCita2() ;
        if (actualizado) {
            JOptionPane.showMessageDialog(null,
                "Cita actualizada exitosamente",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
            cargarCitasEnTabla();
        } else {
            JOptionPane.showMessageDialog(null,
                "No se pudo actualizar la cita. Verifique los datos.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,
            "Error al actualizar cita: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
   }
    public void limpiarCita() {
        txtIdCita.setText("");
        txtFechaCita.setText("");
        cboHoraCita.setSelectedIndex(0);
        cboMedicoCita.setSelectedIndex(0);
        cboMotivoCita.setSelectedIndex(0);
        cboConsultorio.setSelectedIndex(0);
        cboTipoCita.setSelectedIndex(0);
    }
    public void limpiarCita2() {
        txtIdCita2.setText("");
        txtFechaCita2.setText("");
        cboHoraCita2.setSelectedIndex(0);
        cboMedicoCita2.setSelectedIndex(0);
        cboMotivoCita2.setSelectedIndex(0);
        cboConsultorio2.setSelectedIndex(0);
        cboTipoCita2.setSelectedIndex(0);
    }
}
     

