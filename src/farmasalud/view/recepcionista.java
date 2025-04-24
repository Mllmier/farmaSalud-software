/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmasalud.view;

import Controller.ControllerCitas;
import dao.PacienteDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medico;
import model.Persona;
import Controller.ControllerPaciente;
import java.lang.ModuleLayer.Controller;

/**
 *
 * @author Maria liz
 */
public class recepcionista extends javax.swing.JFrame {
   
    private DefaultTableModel tableModel;
    private ControllerPaciente controller;
    private ControllerCitas controllerCita;
    private DefaultTableModel tableModelCitas;
    
    private PacienteDAO pacienteDAO= new PacienteDAO();
    public recepcionista() {
        initComponents();
    controller = new ControllerPaciente(); 
    controller.setTablaPacientes(tablaPacientes);
    controller.setTxtNombre(txtPriNombreR);
    controller.setTxtApellidos(txtPriApellidoR);
    controller.setTxtDocumentoR(txtDocumentoR);
    controller.setTxtEmail(txtEmailR);
    controller.setTxtFechaNacimiento(txtFechaNacimiento);
    controller.setTxtTelefono(txtCelularR);
    controller.setCbSexo(cbSexo);
    controller.setCbEps(cbEps);
    controller.setCbTipoDocumento(cbTipoDocumento);
    controller.setCboTipoSangre(cboTipoSangre);
    
    controller.initTablePaciente();
    controller.cargarDatosEnTablaPaciente();
    
    tablaPacientes.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            controller.cargarDatosPacienteEnFormulario();
        }
    });
      controllerCita = new ControllerCitas(); 
        controllerCita.setTablaCitas(tablaCitas);
        controllerCita.setTxtIdCita(txtIdCita);
        controllerCita.setTxtFechaCita(txtFechaCita);
        controllerCita.setCboHoraCita(cboHoraCita);
        controllerCita.setCboMotivoCita(cboMotivoCita);
        controllerCita.setCboTipoCita(cboTipoCita);
        controllerCita.setCboEstadoCita(cboEstadoCita);
        controllerCita.setCboConsultorio(cboConsultorio);
        
        controllerCita.initTableCitas();
        controllerCita.cargarDatosEnTablaCita();
        
        // Listener para la tabla de citas
        tablaCitas.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                controllerCita.cargarDatosCitaEnFormulario();
            }
        });
        controllerCita.initTableCitas();
    controllerCita.cargarDatosEnTablaCita();
    
    
       
    }


        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNombreRecepcion1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        panelBtnAgregarPaciente1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        panelBtnInicio1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        panelBtnAgendar1 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        panelBtnModificarCita1 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        panelBtnInformes1 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        panelBtnModificarPaciente1 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCitasHoy = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        panelInformes = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        btnVerHistoria = new javax.swing.JButton();
        btnVerMedicamentos = new javax.swing.JButton();
        panelModificarPaciente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        panelModificarCita = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cbbModificarPacienteCita = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        cbbModificarTipo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        cbbModificarDoctorCita = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        cbbModificarHora = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        btnCancelarActualizar = new javax.swing.JButton();
        btnActualizarCita = new javax.swing.JButton();
        txtFechaCita2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboMotivoCita2 = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        panelAgendar1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtDocumentoAgendar = new javax.swing.JTextField();
        cbbTipo = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtemail1 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        txtCelularAgendar = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        cbbEpsAgendar = new javax.swing.JComboBox<>();
        jSeparator20 = new javax.swing.JSeparator();
        cbbSexo = new javax.swing.JComboBox<>();
        jSeparator19 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cboTipoCita = new javax.swing.JComboBox<>();
        cboHoraCita = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        cboConsultorio = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        cboMedicoCita = new javax.swing.JComboBox<>();
        btnCancelarAgenda = new javax.swing.JButton();
        btnAgendarCita = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        cboEstadoCita = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cboMotivoCita = new javax.swing.JComboBox<>();
        txtIdCita = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        panelGuardarPaciente = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        txtDocumentoR = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtPriNombreR = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        txtPriApellidoR = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JLabel();
        txtCelularR = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        txtEmailR = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cbEps = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        cboTipoSangre = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnguardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FarmaSalud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 170, -1));

        jPanel3.setBackground(new java.awt.Color(28, 43, 110));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRecepcion1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreRecepcion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreRecepcion1.setText("Recepcionista");
        jPanel3.add(lblNombreRecepcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 20));

        panelBtnAgregarPaciente1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnAgregarPaciente1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPaciente1MouseMoved(evt);
            }
        });
        panelBtnAgregarPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPaciente1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPaciente1MouseExited(evt);
            }
        });
        panelBtnAgregarPaciente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar Paciente");
        panelBtnAgregarPaciente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 170, 28));
        panelBtnAgregarPaciente1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel3.add(panelBtnAgregarPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 60));

        panelBtnInicio1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnInicio1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBtnInicio1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnInicio1MouseMoved(evt);
            }
        });
        panelBtnInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnInicio1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnInicio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnInicio1MouseExited(evt);
            }
        });
        panelBtnInicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Inicio");
        panelBtnInicio1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 110, 28));
        panelBtnInicio1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel3.add(panelBtnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 60));

        panelBtnAgendar1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnAgendar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnAgendar1MouseMoved(evt);
            }
        });
        panelBtnAgendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnAgendar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnAgendar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnAgendar1MouseExited(evt);
            }
        });
        panelBtnAgendar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Agender cita");
        panelBtnAgendar1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));
        panelBtnAgendar1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel3.add(panelBtnAgendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 60));

        panelBtnModificarCita1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnModificarCita1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnModificarCita1MouseMoved(evt);
            }
        });
        panelBtnModificarCita1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnModificarCita1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnModificarCita1MouseExited(evt);
            }
        });
        panelBtnModificarCita1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Modificar cita");
        panelBtnModificarCita1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));
        panelBtnModificarCita1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel3.add(panelBtnModificarCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 60));

        panelBtnInformes1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnInformes1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnInformes1MouseMoved(evt);
            }
        });
        panelBtnInformes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnInformes1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnInformes1MouseExited(evt);
            }
        });
        panelBtnInformes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Informes");
        panelBtnInformes1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));
        panelBtnInformes1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel3.add(panelBtnInformes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, 60));

        panelBtnModificarPaciente1.setBackground(new java.awt.Color(28, 43, 110));
        panelBtnModificarPaciente1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnModificarPaciente1MouseMoved(evt);
            }
        });
        panelBtnModificarPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnModificarPaciente1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnModificarPaciente1MouseExited(evt);
            }
        });
        panelBtnModificarPaciente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBtnModificarPaciente1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Modificar Paciente");
        panelBtnModificarPaciente1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 190, 28));

        jPanel3.add(panelBtnModificarPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 300, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 770));

        jPanel9.setBackground(new java.awt.Color(10, 92, 184));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("CITAS ");
        jPanel9.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 530, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 1000, 130));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCitasHoy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaCitasHoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCitasHoy.getTableHeader().setResizingAllowed(false);
        tablaCitasHoy.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCitasHoy);

        panelInicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 720, 270));

        jPanel20.setBackground(new java.awt.Color(232, 230, 229));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setBackground(new java.awt.Color(232, 230, 229));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("CITAS HOY");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelInicio.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 718, -1));

        jTabbedPane1.addTab("Inicio", panelInicio);

        panelInformes.setBackground(new java.awt.Color(255, 255, 255));
        panelInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelInformes.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 60));

        jPanel6.setBackground(new java.awt.Color(232, 230, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setText("INFORMES");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 160, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 200, 30));

        panelInformes.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 610, 50));

        jPanel7.setBackground(new java.awt.Color(232, 230, 229));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("HISTORIAL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, 170));

        jPanel10.setBackground(new java.awt.Color(232, 230, 229));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("MEDICAMENTOS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 120, 170));

        btnVerHistoria.setBackground(new java.awt.Color(10, 92, 184));
        btnVerHistoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerHistoria.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistoria.setText("VER");
        btnVerHistoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInformes.add(btnVerHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 120, 40));

        btnVerMedicamentos.setBackground(new java.awt.Color(10, 92, 184));
        btnVerMedicamentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMedicamentos.setText("VER");
        btnVerMedicamentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVerMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedicamentosActionPerformed(evt);
            }
        });
        panelInformes.add(btnVerMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 40));

        jTabbedPane1.addTab("Modificar", panelInformes);

        panelModificarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(232, 230, 229));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("LISTADO DE PACIENTES");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 200, 30));

        panelModificarPaciente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 50));

        jTabbedPane1.addTab("ListadoPacientes", panelModificarPaciente);

        panelModificarCita.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCitas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre ", "Apellido", "Tipo de cita ", "Medico", "Consultorio", "Fecha", ""
            }
        ));
        tablaCitas.getTableHeader().setResizingAllowed(false);
        tablaCitas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaCitas);
        if (tablaCitas.getColumnModel().getColumnCount() > 0) {
            tablaCitas.getColumnModel().getColumn(0).setHeaderValue("Nombre ");
            tablaCitas.getColumnModel().getColumn(1).setHeaderValue("Apellido");
            tablaCitas.getColumnModel().getColumn(2).setHeaderValue("Tipo de cita ");
            tablaCitas.getColumnModel().getColumn(3).setHeaderValue("Medico");
            tablaCitas.getColumnModel().getColumn(4).setHeaderValue("Consultorio");
            tablaCitas.getColumnModel().getColumn(5).setResizable(false);
            tablaCitas.getColumnModel().getColumn(5).setHeaderValue("Fecha");
            tablaCitas.getColumnModel().getColumn(6).setHeaderValue("");
        }

        panelModificarCita.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 930, 230));

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setText("LISTADO DE CITAS");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(jLabel45)
                .addGap(116, 116, 116)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panelModificarCita.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 930, 40));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Paciente:");

        cbbModificarPacienteCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarPacienteCita.setEnabled(false);
        cbbModificarPacienteCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbModificarPacienteCitaActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator2.setForeground(new java.awt.Color(10, 92, 184));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Tipo de cita:");

        cbbModificarTipo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipo de cita>", "Odontologo", "Medico General", "Radiologia", "Cardiologia", "Psicologo" }));

        jSeparator3.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator3.setForeground(new java.awt.Color(10, 92, 184));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Doctor:");

        cbbModificarDoctorCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarDoctorCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipo de cita>", "Odontologo", "Medico General", "Radiologia", "Cardiologia", "Psicologo" }));

        jSeparator4.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator4.setForeground(new java.awt.Color(10, 92, 184));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Fecha:");

        jSeparator5.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator5.setForeground(new java.awt.Color(10, 92, 184));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Hora:");

        cbbModificarHora.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbModificarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbModificarHoraActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator6.setForeground(new java.awt.Color(10, 92, 184));

        btnCancelarActualizar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarActualizar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancelarActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarActualizar.setText("Eliminar");
        btnCancelarActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarActualizarMouseClicked(evt);
            }
        });

        btnActualizarCita.setBackground(new java.awt.Color(10, 92, 184));
        btnActualizarCita.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnActualizarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCita.setText("Actualizar");
        btnActualizarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarCitaMouseClicked(evt);
            }
        });
        btnActualizarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCitaActionPerformed(evt);
            }
        });

        txtFechaCita2.setText("jTextField5");

        jLabel3.setText("Motivo Cita");

        cboMotivoCita2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator14.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator14.setForeground(new java.awt.Color(10, 92, 184));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbModificarTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel47)
                                .addGap(202, 202, 202)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbModificarPacienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaCita2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbModificarDoctorCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(cboMotivoCita2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbModificarHora, 0, 186, Short.MAX_VALUE)
                            .addComponent(jSeparator14))
                        .addGap(207, 207, 207))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(btnCancelarActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarCita)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel48)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbModificarPacienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbModificarDoctorCita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMotivoCita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel49)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbModificarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbModificarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarActualizar)
                            .addComponent(btnActualizarCita)))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelModificarCita.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 930, 220));

        jTabbedPane1.addTab("Modificar", panelModificarCita);

        panelAgendar1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paciente"));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setText("Documento de Identidad*");

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(10, 92, 184));

        txtDocumentoAgendar.setEditable(false);
        txtDocumentoAgendar.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumentoAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDocumentoAgendar.setBorder(null);

        cbbTipo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(10, 92, 184));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setText("Nombres*");

        txtNombres.setEditable(false);
        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombres.setBorder(null);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(10, 92, 184));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Apellidos*");

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellidos.setBorder(null);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(10, 92, 184));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Email*");

        txtemail1.setEditable(false);
        txtemail1.setBackground(new java.awt.Color(255, 255, 255));
        txtemail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtemail1.setBorder(null);
        txtemail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemail1ActionPerformed(evt);
            }
        });

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(10, 92, 184));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Celular*");

        txtCelularAgendar.setEditable(false);
        txtCelularAgendar.setBackground(new java.awt.Color(255, 255, 255));
        txtCelularAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelularAgendar.setBorder(null);
        txtCelularAgendar.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(10, 92, 184));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Fecha de nacimiento");

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(10, 92, 184));

        cbbEpsAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbEpsAgendar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<EPS>", "Sura.", "Sanitas.", "Nueva EPS.", "Salud Total.", "Famisanar.", "Compensar.", "Servicio Occidental de Salud.", "Aliansalud.", " " }));
        cbbEpsAgendar.setEnabled(false);

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(10, 92, 184));

        cbbSexo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sexo>", "Masculino", "Femenino", " " }));
        cbbSexo.setEnabled(false);
        cbbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSexoActionPerformed(evt);
            }
        });

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(10, 92, 184));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator12)
                            .addComponent(txtDocumentoAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbbEpsAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(276, 276, 276))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator13)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtemail1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCelularAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(jSeparator17)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbTipo)
                    .addComponent(txtDocumentoAgendar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(cbbEpsAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(cbbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Fecha de Cita*");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Tipo de cita*");

        cboTipoCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cboTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Odontologia", "General", "Pediatria", "Cardiologia", "Oftamologia", " " }));

        cboHoraCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cboHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00" }));
        cboHoraCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoraCitaActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("Hora*");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setText("Consultorio*");

        cboConsultorio.setBackground(new java.awt.Color(0, 0, 0, 0));
        cboConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultorioActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel72.setText("Medico*");

        cboMedicoCita.setBackground(new java.awt.Color(0, 0, 0, 0));

        btnCancelarAgenda.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelarAgenda.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnCancelarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAgenda.setText("CANCELAR");

        btnAgendarCita.setBackground(new java.awt.Color(10, 92, 184));
        btnAgendarCita.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendarCita.setText("AGENDAR");
        btnAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendarCitaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Estado de la cita");

        txtFechaCita.setText("jTextField2");

        cboEstadoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Motivo de consulta");

        cboMotivoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Control", "Seguimiento", "Prevencion", "Sintomas Agudos", "Enfermedad Cronica", "Problemas Especificos" }));

        txtIdCita.setText("jTextField5");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel62)
                                        .addGap(0, 64, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel71)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboConsultorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btnCancelarAgenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgendarCita)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel42)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtFechaCita)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(cboEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)))))
                .addGap(31, 31, 31))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMedicoCita, 0, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel62)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMedicoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel38.setText("Datos de la Cita");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAgendar1Layout = new javax.swing.GroupLayout(panelAgendar1);
        panelAgendar1.setLayout(panelAgendar1Layout);
        panelAgendar1Layout.setHorizontalGroup(
            panelAgendar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendar1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelAgendar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelAgendar1Layout.setVerticalGroup(
            panelAgendar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendar1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAgendar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAgendar1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agendar datos personales", panelAgendar1);

        panelGuardarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel13.setAutoscrolls(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Documento*");

        cbTipoDocumento.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbTipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        cbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDocumentoActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(10, 92, 184));

        txtDocumentoR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtDocumentoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDocumentoR.setBorder(null);
        txtDocumentoR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDocumentoRFocusLost(evt);
            }
        });
        txtDocumentoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoRActionPerformed(evt);
            }
        });
        txtDocumentoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoRKeyTyped(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(10, 92, 184));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText(" Nombre*");

        txtPriNombreR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPriNombreR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPriNombreR.setBorder(null);
        txtPriNombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriNombreRActionPerformed(evt);
            }
        });
        txtPriNombreR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriNombreRKeyTyped(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(10, 92, 184));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Apellido*");

        txtPriApellidoR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPriApellidoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPriApellidoR.setBorder(null);
        txtPriApellidoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriApellidoRActionPerformed(evt);
            }
        });
        txtPriApellidoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriApellidoRKeyTyped(evt);
            }
        });

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(10, 92, 184));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefono.setText("Celular*");

        txtCelularR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCelularR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelularR.setBorder(null);
        txtCelularR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularRFocusLost(evt);
            }
        });
        txtCelularR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularRActionPerformed(evt);
            }
        });
        txtCelularR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularRKeyTyped(evt);
            }
        });

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(10, 92, 184));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setText("Email*");

        txtEmailR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtEmailR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmailR.setBorder(null);
        txtEmailR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailRFocusLost(evt);
            }
        });
        txtEmailR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRActionPerformed(evt);
            }
        });
        txtEmailR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailRKeyTyped(evt);
            }
        });

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(10, 92, 184));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setText(" Fecha Nacimiento*");

        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(10, 92, 184));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setText("Sexo*");

        cbSexo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "M", "F" }));
        cbSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbSexoFocusLost(evt);
            }
        });
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Eps*");

        cbEps.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbEps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Coosalud", "Sanistas", "Comfamiliar", "Nueva Eps" }));
        cbEps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEpsActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo De Sangre");

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(10, 92, 184));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(10, 92, 184));

        cboTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "A+", "A-", "0+", "O-", "B+", "B-", "AB+", "AB-" }));
        cboTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoSangreActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(10, 92, 184));

        btnguardar.setBackground(new java.awt.Color(10, 92, 184));
        btnguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnguardarFocusLost(evt);
            }
        });
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnguardarKeyTyped(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(10, 92, 184));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailR, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jSeparator22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDocumentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPriNombreR, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jSeparator8))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator23)
                            .addComponent(txtPriApellidoR)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator28)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(btnModificar)))))
                .addGap(15, 15, 15))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(cbEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDocumentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(txtPriNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPriApellidoR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono)
                            .addComponent(txtCelularR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(txtEmailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(cbEps, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(cboTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelGuardarPaciente.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 940, 200));

        tablaPacientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaPacientes);

        panelGuardarPaciente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 940, 290));

        jTabbedPane1.addTab("Pacientes", panelGuardarPaciente);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 970, 600));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel79.setText("X");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBtnAgregarPaciente1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPaciente1MouseMoved
        panelBtnAgregarPaciente1.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnAgregarPaciente1MouseMoved

    private void panelBtnAgregarPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPaciente1MouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_panelBtnAgregarPaciente1MouseClicked

    private void panelBtnAgregarPaciente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPaciente1MouseExited
        panelBtnAgregarPaciente1.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnAgregarPaciente1MouseExited

    private void panelBtnInicio1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicio1MouseMoved
        panelBtnInicio1.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_panelBtnInicio1MouseMoved

    private void panelBtnInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicio1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_panelBtnInicio1MouseClicked

    private void panelBtnInicio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicio1MouseExited
        panelBtnInicio1.setBackground(new Color(28,43,110));
    }//GEN-LAST:event_panelBtnInicio1MouseExited

    private void panelBtnAgendar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendar1MouseMoved
    }//GEN-LAST:event_panelBtnAgendar1MouseMoved

    private void panelBtnAgendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendar1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_panelBtnAgendar1MouseClicked

    private void panelBtnAgendar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendar1MouseExited
        panelBtnAgendar1.setBackground(new Color(28,43,110));
    }//GEN-LAST:event_panelBtnAgendar1MouseExited

    private void panelBtnModificarCita1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCita1MouseMoved
        panelBtnModificarCita1.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnModificarCita1MouseMoved

    private void panelBtnModificarCita1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCita1MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_panelBtnModificarCita1MouseClicked

    private void panelBtnModificarCita1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCita1MouseExited
        panelBtnModificarCita1.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnModificarCita1MouseExited

    private void panelBtnInformes1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformes1MouseMoved
        panelBtnAgendar1.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnInformes1MouseMoved

    private void panelBtnInformes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformes1MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_panelBtnInformes1MouseClicked

    private void panelBtnInformes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformes1MouseExited
    panelBtnInformes1.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnInformes1MouseExited

    private void panelBtnModificarPaciente1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPaciente1MouseMoved
        panelBtnModificarPaciente1.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnModificarPaciente1MouseMoved

    private void panelBtnModificarPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPaciente1MouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_panelBtnModificarPaciente1MouseClicked

    private void panelBtnModificarPaciente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPaciente1MouseExited
    panelBtnModificarPaciente1.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnModificarPaciente1MouseExited

    private void panelBtnInicio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicio1MouseEntered
 panelBtnInicio1.setBackground(new Color (230,230,230));

    }//GEN-LAST:event_panelBtnInicio1MouseEntered

    private void panelBtnInicio1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicio1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBtnInicio1MouseDragged

    private void panelBtnAgendar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendar1MouseEntered
      panelBtnAgendar1.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_panelBtnAgendar1MouseEntered

    private void cbbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSexoActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnActualizarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCitaActionPerformed
        if( cbbModificarTipo.getSelectedItem() == null||
            cbbModificarTipo.getSelectedItem().toString().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos obligatorios");
            return;
        }
    }//GEN-LAST:event_btnActualizarCitaActionPerformed

    private void cbbModificarPacienteCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbModificarPacienteCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbModificarPacienteCitaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(txtDocumentoR.getText().trim().isEmpty() ||
            txtPriNombreR.getText().trim().isEmpty() ||
            txtPriApellidoR.getText().trim().isEmpty() ||
            txtEmailR.getText().trim().isEmpty() ||
            txtCelularR.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos obligatorios");
            return;
        }  if(!txtPriApellidoR.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(this,"Solo se permiten letras en el apellido", "Error", JOptionPane.ERROR_MESSAGE);
        } if(!txtPriNombreR.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(this,"Solo se permiten letras en el Nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtPriApellidoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriApellidoRActionPerformed

    }//GEN-LAST:event_txtPriApellidoRActionPerformed

    private void txtDocumentoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoRActionPerformed
      
    }//GEN-LAST:event_txtDocumentoRActionPerformed

    private void btnVerMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMedicamentosActionPerformed

    private void cboHoraCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoraCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraCitaActionPerformed

    private void txtemail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemail1ActionPerformed

    private void cbbModificarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbModificarHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbModificarHoraActionPerformed

    private void txtDocumentoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoRKeyTyped
       String documento = txtDocumentoR.getText().trim();
    
    char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
        return;
    }
        if (documento.length() >= 7) { 
        if (!documento.matches("^\\d{6,9}$")) {
            JOptionPane.showMessageDialog(
                null, 
                "Documento inválido. Solo se permiten números de 7 o 10 dígitos.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
            evt.consume(); 
        }
    }
    }//GEN-LAST:event_txtDocumentoRKeyTyped

    private void txtPriNombreRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriNombreRKeyTyped
        char c=evt.getKeyChar();
   
    if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_txtPriNombreRKeyTyped

    private void txtPriApellidoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriApellidoRKeyTyped
char c=evt.getKeyChar();
   
    if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
    }       
    }//GEN-LAST:event_txtPriApellidoRKeyTyped

    private void txtEmailRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailRKeyTyped
   
    }//GEN-LAST:event_txtEmailRKeyTyped

    private void txtCelularRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularRKeyTyped
     char c = evt.getKeyChar();
      if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_txtCelularRKeyTyped

    private void txtCelularRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularRFocusLost
      if (txtTelefono.getText().length() == 10) {
            JOptionPane.showMessageDialog(null, "Debe ingresar exactamente 10 números", 
                "Error", JOptionPane.WARNING_MESSAGE);
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtCelularRFocusLost

    private void txtCelularRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularRActionPerformed

    private void txtEmailRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRActionPerformed

    private void txtEmailRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailRFocusLost
     String correo = txtEmailR.getText().trim();
    if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
        JOptionPane.showMessageDialog(null, "Correo inválido. debe ingresar @", "Error", JOptionPane.ERROR_MESSAGE);
        txtEmailR.requestFocus(); 
    }      
    }//GEN-LAST:event_txtEmailRFocusLost

    private void cbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoDocumentoActionPerformed

    private void btnguardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnguardarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarFocusLost

    private void cbSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbSexoFocusLost
    
    }//GEN-LAST:event_cbSexoFocusLost

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
    
        }//GEN-LAST:event_cbSexoActionPerformed

    private void txtDocumentoRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentoRFocusLost
 
    }//GEN-LAST:event_txtDocumentoRFocusLost

    private void btnguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyTyped
       
    }//GEN-LAST:event_btnguardarKeyTyped

    private void cboTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoSangreActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
 controller.actualizarPaciente();        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
 
        controller.guardarPacienteDesdeFormulario(); 
        
      
       
    }//GEN-LAST:event_btnguardarMouseClicked

    private void cboConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboConsultorioActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
controller.eliminarPacienteSeleccionado();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void txtPriNombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriNombreRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriNombreRActionPerformed

    private void cbEpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEpsActionPerformed

    private void btnAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarCitaMouseClicked
        controllerCita.guardarCitaDesdeFormulario(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarCitaMouseClicked

    private void btnActualizarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCitaMouseClicked
controllerCita.actualizarCita();           // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCitaMouseClicked

    private void btnCancelarActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarActualizarMouseClicked
controllerCita.eliminarCitaSeleccionada();           // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActualizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recepcionista().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCita;
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnCancelarActualizar;
    private javax.swing.JButton btnCancelarAgenda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVerHistoria;
    private javax.swing.JButton btnVerMedicamentos;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEps;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JComboBox<String> cbbEpsAgendar;
    private javax.swing.JComboBox<String> cbbModificarDoctorCita;
    private javax.swing.JComboBox<String> cbbModificarHora;
    private javax.swing.JTextField cbbModificarPacienteCita;
    private javax.swing.JComboBox<String> cbbModificarTipo;
    private javax.swing.JComboBox<String> cbbSexo;
    private javax.swing.JComboBox<String> cbbTipo;
    private javax.swing.JComboBox<String> cboConsultorio;
    private javax.swing.JComboBox<String> cboEstadoCita;
    private javax.swing.JComboBox<String> cboHoraCita;
    private javax.swing.JComboBox<String> cboMedicoCita;
    private javax.swing.JComboBox<String> cboMotivoCita;
    private javax.swing.JComboBox<String> cboMotivoCita2;
    private javax.swing.JComboBox<String> cboTipoCita;
    private javax.swing.JComboBox<String> cboTipoSangre;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblNombreRecepcion1;
    private javax.swing.JPanel panelAgendar1;
    private javax.swing.JPanel panelBtnAgendar1;
    private javax.swing.JPanel panelBtnAgregarPaciente1;
    private javax.swing.JPanel panelBtnInformes1;
    private javax.swing.JPanel panelBtnInicio1;
    private javax.swing.JPanel panelBtnModificarCita1;
    private javax.swing.JPanel panelBtnModificarPaciente1;
    private javax.swing.JPanel panelGuardarPaciente;
    private javax.swing.JPanel panelInformes;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelModificarCita;
    private javax.swing.JPanel panelModificarPaciente;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTable tablaCitasHoy;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelularAgendar;
    private javax.swing.JTextField txtCelularR;
    private javax.swing.JTextField txtDocumentoAgendar;
    private javax.swing.JTextField txtDocumentoR;
    private javax.swing.JTextField txtEmailR;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtFechaCita2;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPriApellidoR;
    private javax.swing.JTextField txtPriNombreR;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JTextField txtemail1;
    // End of variables declaration//GEN-END:variables
}
