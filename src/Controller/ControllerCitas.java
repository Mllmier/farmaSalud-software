/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.CitasDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import farmasalud.view.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Cita;
import model.Medico;
import model.Persona;


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

    
    private JTable tablaCitas;
    private JTextField txtIdCita;
    private JTextField txtFechaCita;
    private JComboBox<String> cboHoraCita;
    private JComboBox<String> cboEstadoCita;
    private JComboBox<String> cboTipoCita;
    private JComboBox<String> cboMotivoCita;
    private JComboBox<String> cboConsultorio;
    private JComboBox<Medico> cboMedicoCita;
    private JComboBox<Paciente> cboPaciente;
    
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
    
    public void setCboMedicoCita(JComboBox<Medico> cboMedico) {
        this.cboMedicoCita = cboMedico;
    }
    
    public void setCboPaciente(JComboBox<Paciente> cboPaciente) {
        this.cboPaciente = cboPaciente;
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

    public void guardarCitaDesdeFormulario() {
        try {
            String idCita = txtIdCita.getText().trim();
            String fechaCitaR = txtFechaCita.getText().trim();
            String horaCita = cboHoraCita.getSelectedItem().toString();
            String tipoCita = cboTipoCita.getSelectedItem().toString();
            String motivoCita = cboMotivoCita.getSelectedItem().toString();
            String estadoCita = cboEstadoCita.getSelectedItem().toString();
            String consultorio = cboConsultorio.getSelectedItem().toString();
            Medico medico = (Medico) cboMedicoCita.getSelectedItem();
            Paciente paciente = (Paciente) cboPaciente.getSelectedItem();
            
            if (horaCita.isEmpty() || fechaCitaR.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            LocalDate fechaCita;
            try {
                fechaCita = LocalDate.parse(fechaCitaR);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Cita.EstadoCita estado = Cita.EstadoCita.valueOf(estadoCita);
            
            Cita nuevaCita = new Cita(
                idCita,
                fechaCita,
                horaCita,
                motivoCita,
                tipoCita,
                consultorio,
                paciente,
                estado,
                medico
            );
            
            citasDAO.guardarCita(nuevaCita);
            JOptionPane.showMessageDialog(null, "Cita guardada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar cita: " + e.getMessage(),
                "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }    
    }
    
    public void limpiarFormulario() {
        txtIdCita.setText("");
        txtFechaCita.setText("");
        cboHoraCita.setSelectedIndex(0);
        cboMedicoCita.setSelectedIndex(0);
        cboTipoCita.setSelectedIndex(0);
        cboEstadoCita.setSelectedIndex(0);
        cboMotivoCita.setSelectedIndex(0);
        cboConsultorio.setSelectedIndex(0);
        cboPaciente.setSelectedIndex(0);
    }
    
    public void initTableCitas() {
        tableModelCita = new DefaultTableModel(
            new Object[]{"ID Cita", "Fecha", "Hora", "Motivo", "Tipo", 
                         "Consultorio", "Médico", "Paciente", "Estado"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaCitas.setModel(tableModelCita);
    }
    
    public void cargarDatosEnTablaCita() {
        tableModelCita.setRowCount(0);
        List<Cita> citas = citasDAO.cargarTodos();
        for (Cita cita : citas) {
            Object[] row = {
                cita.getIdCita(), 
                cita.getFechaCita(),         
                cita.getHora(),
                cita.getMotivo(),      
                cita.getTipoCita(),
                cita.getConsultorio(),
                cita.getMedico() ,
                cita.getPaciente() ,
                cita.getEstado().toString()
            };
            tableModelCita.addRow(row);
        }
    }
    
    public void eliminarCitaSeleccionada() {
        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, 
                "Seleccione una cita de la tabla.", 
                "Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idCita = tableModelCita.getValueAt(filaSeleccionada, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Eliminar la cita con ID " + idCita + "?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = citasDAO.eliminarCita(idCita);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, 
                    "Cita eliminada correctamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaCita();
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo eliminar la cita", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
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

            String idCitaOriginal = tableModelCita.getValueAt(filaSeleccionada, 0).toString();

            String idCita = txtIdCita.getText().trim();
            String fechaCitaR = txtFechaCita.getText().trim();
            String horaCita = cboHoraCita.getSelectedItem().toString();
            String tipoCita = cboTipoCita.getSelectedItem().toString();
            String motivoCita = cboMotivoCita.getSelectedItem().toString();
            String estadoCita = cboEstadoCita.getSelectedItem().toString();
            String consultorio = cboConsultorio.getSelectedItem().toString();
            Medico medico = (Medico) cboMedicoCita.getSelectedItem();
            Paciente paciente = (Paciente) cboPaciente.getSelectedItem();
            
            if (horaCita.isEmpty() || fechaCitaR.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            LocalDate fechaCita;
            try {
                fechaCita = LocalDate.parse(fechaCitaR);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null,
                    "Formato de fecha inválido. Usa YYYY-MM-DD",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cita.EstadoCita estado = Cita.EstadoCita.valueOf(estadoCita);

            Cita citaActualizada = new Cita(
                idCita,
                fechaCita,
                horaCita,
                motivoCita,
                tipoCita,
                consultorio,
                paciente,
                estado,
                medico
            );

         boolean actualizado = citasDAO.actualizarCita(idCitaOriginal, citaActualizada);
            
            if (actualizado) {
                JOptionPane.showMessageDialog(null,
                    "Cita actualizada exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDatosEnTablaCita();
                limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(null,
                    "No se pudo actualizar la cita. Verifique los datos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al actualizar la cita: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void cargarDatosCitaEnFormulario() {
        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtIdCita.setText(tableModelCita.getValueAt(filaSeleccionada, 0).toString());
            txtFechaCita.setText(tableModelCita.getValueAt(filaSeleccionada, 1).toString());
            cboHoraCita.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 2).toString());
            cboMotivoCita.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 3).toString());
            cboTipoCita.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 4).toString());
            cboConsultorio.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 5).toString());
             cboMedicoCita.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 6).toString());            
            cboEstadoCita.setSelectedItem(tableModelCita.getValueAt(filaSeleccionada, 8).toString());
        }
    }
    public void cargarDatosPacienteSeleccionado() {
        Paciente pacienteSeleccionado = (Paciente) cboPaciente.getSelectedItem();
        

    }
    
  
   }
