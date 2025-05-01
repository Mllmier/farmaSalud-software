/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmasalud.view;

import Controller.ControllerDoctor;
import Controller.ControllerMedicamento;
import Controller.ControllerRecepcionista;
import Controller.ControllerSalas;
import Controller.CotrollerFarmaceutica;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author usuario
 */
public class admin extends javax.swing.JFrame {

    private ControllerDoctor controllerDoctor = new ControllerDoctor();
    private ControllerRecepcionista controllerRecepcionista = new ControllerRecepcionista();
    private ControllerSalas controllerSalas = new ControllerSalas();
    private CotrollerFarmaceutica controllerFarmaceutica = new CotrollerFarmaceutica();
    private ControllerMedicamento controllerMedicamento = new ControllerMedicamento(this);
    

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        
        configurarControllerDoctor();
        configurarControllerRecepcionista();
        configurarControllerSalas();
        configurarControllerFarmaceutica();
        configurarControllerMedicamento();
        
        
        configurarListeners();
        
        txtCodigoSala.setEditable(false);
        
        
        
        //doctores
    }
    private void configurarControllerDoctor() {
        controllerDoctor.setTablaDoctores(TablaDoctores);
        controllerDoctor.setTxtNombre(txtNombre);
        controllerDoctor.setTxtApellidos(txtApellidos);
        controllerDoctor.setTxtCedula(txtCedula);
        controllerDoctor.setTxtCorreo(txtCorreo);
        controllerDoctor.setTxtFechaNacimiento(txtFechaNacimiento);
        controllerDoctor.setTxtTelefono(txtTelefono);
        controllerDoctor.setCbSexo(cbSexo2);
        controllerDoctor.setCbEps(cbEpss);
        controllerDoctor.setCbEspecialidad(cbEspecialidad);
        
        controllerDoctor.initTableDoctor();
        controllerDoctor.cargarDatosEnTablaDoctor();
    }
    
    private void configurarControllerRecepcionista() {
        controllerRecepcionista.setTablaRecepcionistas(TabladeRecepcionistas);
        controllerRecepcionista.setTxtNombre(Jtexfieldnombre_recep);
        controllerRecepcionista.setTxtApellidos(jtextfieldApellido_recep);
        controllerRecepcionista.setTxtDocumento(jtextfielID_recep);
        controllerRecepcionista.setTxtEmail(Jtextfield_correo_recep);
        controllerRecepcionista.setTxtFechaNacimiento(Jtexfieldfechanacimiento_recep);
        controllerRecepcionista.setTxtTelefono(jtextfieldTelefono_recep);
        controllerRecepcionista.setTxtCodigoEmpleado(JtexfieldCodigo_recep);
        controllerRecepcionista.setTxtFechaContratacion(Jtexfieldfechacontratacion_recep_);
        controllerRecepcionista.setCbSexo(JcomboSexo);
        controllerRecepcionista.setCbEps(JcomboSexo1);
        controllerRecepcionista.setCbTurno(JComboTurno);
        
        controllerRecepcionista.initTableRecepcionista();
        controllerRecepcionista.cargarDatosEnTablaRecepcionista();
    }
    
    private void configurarControllerSalas() {
        controllerSalas.setTablaSalas(TablaDeSalas);
        controllerSalas.setTxtNombreSala(txtNombreSala);
        controllerSalas.setTxtCodigoSala(txtCodigoSala);
        controllerSalas.setCbTipoSala(Combo_TipoSala);
        controllerSalas.setSpCapacidad(Jspinner_CapacidadSala);
        
        controllerSalas.initTableSalas();
        controllerSalas.cargarDatosEnTablaSalas();
    }
    private void configurarControllerFarmaceutica() {
    controllerFarmaceutica.setTabladeFarmaceuticas(TabladeFarmaceuticas);
    controllerFarmaceutica.setJtexfieldnombre_farmaceutica(Jtexfieldnombre_farmaceutica);
    controllerFarmaceutica.setJtextfieldApellido_farmaceutica(jtextfieldApellido_farmaceutica);
    controllerFarmaceutica.setJtextfielID_farmaceutica(jtextfielID_farmaceutica);
    controllerFarmaceutica.setJtextfield_correo_farmaceutica(Jtextfield_correo_farmaceutica);
    controllerFarmaceutica.setJtexfieldfechanacimiento_farmeceutica(Jtexfieldfechanacimiento_farmeceutica);
    controllerFarmaceutica.setJtextfieldTelefono_farmaceutica(jtextfieldTelefono_farmaceutica);
    controllerFarmaceutica.setJtexfieldCodigo_farmaceutica(JtexfieldCodigo_farmaceutica);
    controllerFarmaceutica.setJtexfieldfechacontratacion_farmaceutica(Jtexfieldfechacontratacion_farmaceutica);
    controllerFarmaceutica.setJcombobox_sexoFarmaceutica(Jcombobox_sexoFarmaceutica);
    controllerFarmaceutica.setCbTurno(Jcombobox_TurnoFarmaceutica);
    
    controllerFarmaceutica.initTableFarmaceutica();
    controllerFarmaceutica.cargarDatosEnTablaFarmaceutica();
}
    
    private void configurarControllerMedicamento() {
    // Configurar tabla
    controllerMedicamento.setTabladeMedicamentos(jTable_Medicamentos);
    
    // Configurar campos de texto
    controllerMedicamento.setTxtCodMedicamento(Jtexfieldnombre_IDmEDICAMENTO);
    controllerMedicamento.setTxtMedicamento(jtextfieldNombre_Medicamento);
    controllerMedicamento.setTxtDescripcion(Jtextfield_Descripcion_Medicamento);
    controllerMedicamento.setTxtLaboratorio(jtextfiel_Laboratorio_Medicamento);
    controllerMedicamento.setTxtCantidad(jtextfield_cantidad_Medicamento);
    controllerMedicamento.setTxtLote(JtexfieldLote_Medicamento);
    controllerMedicamento.setTxtFechaVencimiento(Jtexfieldfechavencimiento_Medicamento);
    controllerMedicamento.setCbDisponible(jComboBox_Disponibilidad_Medicamento);
    controllerMedicamento.setTxtPrecio(JtexfieldPrecio_Medicamento);
    
    // Inicializar tabla y cargar datos
    controllerMedicamento.setupTableModelMedicamentos();
    try {
        controllerMedicamento.cargarDatosMedicamentos();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar medicamentos: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
   

    
    private void configurarListeners() {
        // Listener para tabla de doctores
        TablaDoctores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    controllerDoctor.cargarDatosDoctorEnFormulario();
                }
            }
        });
        
        // Listener para tabla de recepcionistas
        TabladeRecepcionistas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    controllerRecepcionista.cargarDatosRecepcionistaEnFormulario();
                }
            }
        });
       
        // Listener para tabla de salas
        TablaDeSalas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    controllerSalas.cargarDatosSalaEnFormulario();
                }
            }
        });
        
        //Listener para tabla de farmaceutas
        TabladeFarmaceuticas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                controllerFarmaceutica.cargarDatosFarmaceuticaEnFormulario();
            }
        }
    });
        //Listener para tabla de medicamentos
        jTable_Medicamentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                controllerMedicamento.cargarDatosEnTablaMedicamentos();
            }
        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu2 = new java.awt.PopupMenu();
        menuItem2 = new java.awt.MenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel_inicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_doctor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Panel_recepcionistas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panel_salas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Panel_salas1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Panel_farmaceutica = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Btn_salir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Paneles_jtablepane = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbEpss = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JLabel();
        cbSexo2 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDoctores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Jtexfieldnombre_recep = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jtextfieldApellido_recep = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        Jtextfield_correo_recep = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jtextfielID_recep = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jtextfieldTelefono_recep = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        JtexfieldCodigo_recep = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        Jtexfieldfechacontratacion_recep_ = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        JcomboSexo = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Jtexfieldfechanacimiento_recep = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        JcomboSexo1 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        JComboTurno = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabladeRecepcionistas = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtNombreSala = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtCodigoSala = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Combo_TipoSala = new javax.swing.JComboBox<>();
        Jspinner_CapacidadSala = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaDeSalas = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        Jtexfieldnombre_farmaceutica = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jtextfieldApellido_farmaceutica = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        Jtextfield_correo_farmaceutica = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jtextfielID_farmaceutica = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jtextfieldTelefono_farmaceutica = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        panel_eliminarFarmaceutica = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        panel_agregarFarmaceutica = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        panel_modificarFarmaceutica = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        JtexfieldCodigo_farmaceutica = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        Jtexfieldfechacontratacion_farmaceutica = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        Jcombobox_sexoFarmaceutica = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Jtexfieldfechanacimiento_farmeceutica = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        Jcombobox_TurnoFarmaceutica = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabladeFarmaceuticas = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_Medicamentos = new javax.swing.JTable();
        jButton_BuscarMedicamento = new javax.swing.JButton();
        Jtextfield_BuscadorMedicamento = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        Jtexfieldnombre_IDmEDICAMENTO = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jtextfieldNombre_Medicamento = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        Jtextfield_Descripcion_Medicamento = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        jtextfiel_Laboratorio_Medicamento = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jtextfield_cantidad_Medicamento = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jPanelEliminarMedicamento = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel_AgregarMedicamento = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanelModificarMedicamento = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        JtexfieldLote_Medicamento = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel83 = new javax.swing.JLabel();
        Jtexfieldfechavencimiento_Medicamento = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
        jComboBox_Disponibilidad_Medicamento = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        JtexfieldPrecio_Medicamento = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        jButton_MostrarTodosMedicamentos = new javax.swing.JButton();

        popupMenu2.setLabel("popupMenu2");

        menuItem2.setLabel("Modificar");
        popupMenu2.add(menuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 92, 184));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_inicio.setBackground(new java.awt.Color(10, 92, 184));
        Panel_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseExited(evt);
            }
        });
        Panel_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIO");
        Panel_inicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 41));

        jPanel2.add(Panel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 320, 100));

        Panel_doctor.setBackground(new java.awt.Color(10, 92, 184));
        Panel_doctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_doctorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_doctorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_doctorMouseExited(evt);
            }
        });
        Panel_doctor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DOCTORES");
        Panel_doctor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 187, 41));

        jPanel2.add(Panel_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 320, 100));

        Panel_recepcionistas.setBackground(new java.awt.Color(10, 92, 184));
        Panel_recepcionistas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_recepcionistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_recepcionistasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_recepcionistasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_recepcionistasMouseExited(evt);
            }
        });
        Panel_recepcionistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GESTION RECEPCIONISTAS");
        Panel_recepcionistas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 41));

        jPanel2.add(Panel_recepcionistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 320, 110));

        Panel_salas.setBackground(new java.awt.Color(10, 92, 184));
        Panel_salas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_salas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_salasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_salasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_salasMouseExited(evt);
            }
        });
        Panel_salas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION MEDICAMENTOS");
        Panel_salas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 41));

        jPanel2.add(Panel_salas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 320, 100));

        Panel_salas1.setBackground(new java.awt.Color(10, 92, 184));
        Panel_salas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_salas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_salas1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_salas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_salas1MouseExited(evt);
            }
        });
        Panel_salas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GESTION SALAS");
        Panel_salas1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 156, 41));

        jPanel2.add(Panel_salas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 320, 100));

        Panel_farmaceutica.setBackground(new java.awt.Color(10, 92, 184));
        Panel_farmaceutica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_farmaceutica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_farmaceuticaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_farmaceuticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_farmaceuticaMouseExited(evt);
            }
        });
        Panel_farmaceutica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("GESTION FARMACEUTICA");
        Panel_farmaceutica.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 41));

        jPanel2.add(Panel_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 320, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 770));

        jPanel3.setBackground(new java.awt.Color(10, 92, 184));

        Btn_salir.setBackground(new java.awt.Color(10, 92, 184));
        Btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_salirMouseExited(evt);
            }
        });
        Btn_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALIR");
        Btn_salir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 41));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(884, Short.MAX_VALUE)
                .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1020, 120));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        Paneles_jtablepane.addTab("INICIO", jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DOCTOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("NOMBRE:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 30));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 250, 20));

        jLabel7.setText("APELLIDOS:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(null);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel4.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 20));

        jLabel8.setText("CORREO:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 30));

        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        jPanel4.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 20));

        jLabel9.setText("C.C :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 30, 30));

        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel4.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 20));

        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 20));

        jLabel11.setText("TELEFONO :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 30));

        jLabel12.setText("ESPECIALIDAD :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 10));

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setText("AGREGAR DOCTOR");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 350, 60));

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 350, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setText("MODIFICAR DOCTOR");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 40));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 350, 60));

        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setText("ELIMINAR DOCTOR");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 350, 60));

        jButton1.setText("ACTUALIZAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        cbEpss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbEpss, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel41.setText("Eps");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, -1));

        cbSexo.setText("Sexo");
        jPanel4.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, -1));

        cbSexo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel4.add(cbSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel42.setText("Fecha Nacimiento");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));

        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel4.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, -1));

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione  la especialidad del doctor>", "Medico general", "Cardilogo", "terapeusta", " ", " " }));
        jPanel4.add(cbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 260, -1));

        jPanel10.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 393, 630));

        TablaDoctores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "CORREO", "CEDULA", "TELEFONO", "ESPECIALIDAD", "FECHA NACIMIENTO", "SEXO", "EPS"
            }
        ));
        jScrollPane1.setViewportView(TablaDoctores);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 620, 630));

        jTable2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DOCTORES DISPONIBLES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 570, 590));

        jLabel10.setText("C.C :");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 30, 30));

        jTextField5.setText("jTextField1");
        jPanel10.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, -1));

        Paneles_jtablepane.addTab("Gestion_doc", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS RECEPCIONISTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("NOMBRE:");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 30));

        Jtexfieldnombre_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldnombre_recep.setBorder(null);
        Jtexfieldnombre_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldnombre_recepKeyTyped(evt);
            }
        });
        jPanel13.add(Jtexfieldnombre_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 250, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 10));

        jLabel18.setText("APELLIDOS:");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        jtextfieldApellido_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfieldApellido_recep.setBorder(null);
        jtextfieldApellido_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfieldApellido_recepKeyTyped(evt);
            }
        });
        jPanel13.add(jtextfieldApellido_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 10));

        jLabel19.setText("CORREO:");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 30));

        Jtextfield_correo_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtextfield_correo_recep.setBorder(null);
        Jtextfield_correo_recep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtextfield_correo_recepFocusLost(evt);
            }
        });
        jPanel13.add(Jtextfield_correo_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 20));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 10));

        jLabel20.setText("C.C :");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 30, 30));

        jtextfielID_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfielID_recep.setBorder(null);
        jtextfielID_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfielID_recepKeyTyped(evt);
            }
        });
        jPanel13.add(jtextfielID_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 10));

        jLabel21.setText("TELEFONO:");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 30));

        jtextfieldTelefono_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfieldTelefono_recep.setBorder(null);
        jtextfieldTelefono_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfieldTelefono_recepKeyTyped(evt);
            }
        });
        jPanel13.add(jtextfieldTelefono_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 20));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 10));

        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("ELIMINAR RECEPCIONISTA");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 40));

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel23.setText("AGREGAR DOCTOR");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("AGREGAR DOCTOR");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel27.setText("AGREGAR DOCTOR");
        jPanel19.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 390, 60));

        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("AGREGAR RECEPCIONISTA");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 40));

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel25.setText("AGREGAR DOCTOR");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel13.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 60));

        jPanel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("MODIFICAR RECEPCIONISTA");
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 40));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel29.setText("AGREGAR DOCTOR");
        jPanel21.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel30.setText("AGREGAR DOCTOR");
        jPanel22.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel31.setText("AGREGAR DOCTOR");
        jPanel23.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel13.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 390, 60));

        jLabel43.setText("CODIGO:");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 30));

        JtexfieldCodigo_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtexfieldCodigo_recep.setBorder(null);
        JtexfieldCodigo_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtexfieldCodigo_recepKeyTyped(evt);
            }
        });
        jPanel13.add(JtexfieldCodigo_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 250, 20));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 10));

        jLabel44.setText("FECHA CONTRATACION:");
        jPanel13.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        Jtexfieldfechacontratacion_recep_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldfechacontratacion_recep_.setBorder(null);
        Jtexfieldfechacontratacion_recep_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldfechacontratacion_recep_KeyTyped(evt);
            }
        });
        jPanel13.add(Jtexfieldfechacontratacion_recep_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, 20));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 10));

        JcomboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECCIONE SU SEXO >", "MASCULINO", "FEMENINO", "GENERO NO BINARIO", " ", " " }));
        jPanel13.add(JcomboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 70, -1));

        jLabel45.setText("SEXO :");
        jPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 40, 20));

        jLabel46.setText("FECHA NACIMIENTO:");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 30));

        Jtexfieldfechanacimiento_recep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldfechanacimiento_recep.setBorder(null);
        Jtexfieldfechanacimiento_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldfechanacimiento_recepKeyTyped(evt);
            }
        });
        jPanel13.add(Jtexfieldfechanacimiento_recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 20));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 10));

        JcomboSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel13.add(JcomboSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 70, -1));

        jLabel47.setText("EPS  :");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 40, 20));

        jLabel48.setText("TURNO :");
        jPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 50, 20));

        JComboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECCIONE EL TURNO >", "MAÑANA", "TARDE", "NOCHE", " ", " ", " " }));
        jPanel13.add(JComboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 80, -1));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 590));

        TabladeRecepcionistas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "RECEPCIONISTAS DISPONIBLES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TabladeRecepcionistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "FECHA NAC", "SEXO", "EPS", "CORREO", "TELEFONO", "COD. EMPLEADO", "F.CONTRATO", "TURNO"
            }
        ));
        TabladeRecepcionistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabladeRecepcionistasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabladeRecepcionistas);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 630, 590));

        Paneles_jtablepane.addTab("Gestion_Recep", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE SALAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("NOMBRE DE LA SALA:");
        jPanel24.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        txtNombreSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreSala.setBorder(null);
        jPanel24.add(txtNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 250, 20));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel24.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 250, 10));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("CODIGO DE LA SALA:");
        jPanel24.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 30));

        txtCodigoSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoSala.setBorder(null);
        jPanel24.add(txtCodigoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 250, 20));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel24.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 10));

        Combo_TipoSala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Combo_TipoSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECCIONE UN TIPO DE SALA >", "Sala de Medicina General", "Consultorios Externos", "Sala de Urgencias", "Sala de Pediatría", "Sala de Rayos X", "Sala de Fisioterapia" }));
        Combo_TipoSala.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Combo_TipoSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(Combo_TipoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 470, -1));
        jPanel24.add(Jspinner_CapacidadSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 260, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("CAPACIDAD DE CAMAS:");
        jPanel24.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 200, 30));

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel36.setText("AGREGAR");
        jPanel25.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 40));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 60));

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel38.setText("MODIFICAR");
        jPanel26.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 40));

        jPanel24.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 220, 60));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel40.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel24.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, 60));

        jPanel12.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1000, 220));

        TablaDeSalas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        TablaDeSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CODIGO", "TIPO", "CAPACIDAD"
            }
        ));
        jScrollPane4.setViewportView(TablaDeSalas);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1010, 380));

        Paneles_jtablepane.addTab("Gestion_salas", jPanel12);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS FARMACEUTICA\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setText("NOMBRE:");
        jPanel30.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 30));

        Jtexfieldnombre_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldnombre_farmaceutica.setBorder(null);
        Jtexfieldnombre_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldnombre_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(Jtexfieldnombre_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 250, 20));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 10));

        jLabel37.setText("APELLIDOS:");
        jPanel30.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        jtextfieldApellido_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfieldApellido_farmaceutica.setBorder(null);
        jtextfieldApellido_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfieldApellido_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(jtextfieldApellido_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 20));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 10));

        jLabel39.setText("CORREO:");
        jPanel30.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 30));

        Jtextfield_correo_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtextfield_correo_farmaceutica.setBorder(null);
        Jtextfield_correo_farmaceutica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtextfield_correo_farmaceuticaFocusLost(evt);
            }
        });
        jPanel30.add(Jtextfield_correo_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 20));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 10));

        jLabel49.setText("C.C :");
        jPanel30.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 30, 30));

        jtextfielID_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfielID_farmaceutica.setBorder(null);
        jtextfielID_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfielID_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(jtextfielID_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 20));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 10));

        jLabel50.setText("TELEFONO:");
        jPanel30.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 30));

        jtextfieldTelefono_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfieldTelefono_farmaceutica.setBorder(null);
        jtextfieldTelefono_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfieldTelefono_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(jtextfieldTelefono_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 20));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 10));

        panel_eliminarFarmaceutica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_eliminarFarmaceutica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_eliminarFarmaceuticaMouseClicked(evt);
            }
        });
        panel_eliminarFarmaceutica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText("ELIMINAR FARMACEUTICA");
        panel_eliminarFarmaceutica.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 40));

        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel52.setText("AGREGAR DOCTOR");
        jPanel32.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        panel_eliminarFarmaceutica.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel53.setText("AGREGAR DOCTOR");
        jPanel33.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel54.setText("AGREGAR DOCTOR");
        jPanel34.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        panel_eliminarFarmaceutica.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel30.add(panel_eliminarFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 390, 60));

        panel_agregarFarmaceutica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_agregarFarmaceutica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_agregarFarmaceuticaMouseClicked(evt);
            }
        });
        panel_agregarFarmaceutica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setText("AGREGAR FARMACEUTICA");
        panel_agregarFarmaceutica.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 40));

        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel56.setText("AGREGAR DOCTOR");
        jPanel36.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        panel_agregarFarmaceutica.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel30.add(panel_agregarFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 60));

        panel_modificarFarmaceutica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_modificarFarmaceutica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_modificarFarmaceuticaMouseClicked(evt);
            }
        });
        panel_modificarFarmaceutica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setText("MODIFICAR FARMACEUTICA");
        panel_modificarFarmaceutica.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 40));

        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel58.setText("AGREGAR DOCTOR");
        jPanel38.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        panel_modificarFarmaceutica.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel59.setText("AGREGAR DOCTOR");
        jPanel39.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel60.setText("AGREGAR DOCTOR");
        jPanel40.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        panel_modificarFarmaceutica.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel30.add(panel_modificarFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 390, 60));

        jLabel61.setText("CODIGO:");
        jPanel30.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 30));

        JtexfieldCodigo_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtexfieldCodigo_farmaceutica.setBorder(null);
        JtexfieldCodigo_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtexfieldCodigo_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(JtexfieldCodigo_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 250, 20));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 10));

        jLabel62.setText("FECHA CONTRATACION:");
        jPanel30.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        Jtexfieldfechacontratacion_farmaceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldfechacontratacion_farmaceutica.setBorder(null);
        Jtexfieldfechacontratacion_farmaceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldfechacontratacion_farmaceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(Jtexfieldfechacontratacion_farmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, 20));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 10));

        Jcombobox_sexoFarmaceutica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECCIONE SU SEXO >", "MASCULINO", "FEMENINO", "GENERO NO BINARIO", " ", " " }));
        jPanel30.add(Jcombobox_sexoFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, -1));

        jLabel63.setText("SEXO :");
        jPanel30.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 40, 20));

        jLabel64.setText("FECHA NACIMIENTO:");
        jPanel30.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 30));

        Jtexfieldfechanacimiento_farmeceutica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldfechanacimiento_farmeceutica.setBorder(null);
        Jtexfieldfechanacimiento_farmeceutica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldfechanacimiento_farmeceuticaKeyTyped(evt);
            }
        });
        jPanel30.add(Jtexfieldfechanacimiento_farmeceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 20));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 10));

        jLabel66.setText("TURNO :");
        jPanel30.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 50, 20));

        Jcombobox_TurnoFarmaceutica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECCIONE EL TURNO >", "MAÑANA", "TARDE", "NOCHE", " ", " ", " " }));
        jPanel30.add(Jcombobox_TurnoFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, -1));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 590));

        TabladeFarmaceuticas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "FARMACEUTICAS DISPONIBLES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TabladeFarmaceuticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "FECHA NAC", "SEXO", "EPS", "CORREO", "TELEFONO", "COD. EMPLEADO", "F.CONTRATO", "TURNO"
            }
        ));
        TabladeFarmaceuticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabladeFarmaceuticasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TabladeFarmaceuticas);

        jPanel29.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 630, 590));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Paneles_jtablepane.addTab("Gestion_farmaceutica", jPanel28);

        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Medicamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jTable_Medicamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable_Medicamentos);

        jPanel31.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 67, 610, 500));

        jButton_BuscarMedicamento.setText("Buscar");
        jButton_BuscarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarMedicamentoActionPerformed(evt);
            }
        });
        jButton_BuscarMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_BuscarMedicamentoKeyPressed(evt);
            }
        });
        jPanel31.add(jButton_BuscarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 130, 30));

        Jtextfield_BuscadorMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        Jtextfield_BuscadorMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtextfield_BuscadorMedicamentoActionPerformed(evt);
            }
        });
        Jtextfield_BuscadorMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jtextfield_BuscadorMedicamentoKeyPressed(evt);
            }
        });
        jPanel31.add(Jtextfield_BuscadorMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 430, 30));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DEL MEDICAMENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setText("ID Medicamento:");
        jPanel35.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        Jtexfieldnombre_IDmEDICAMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldnombre_IDmEDICAMENTO.setBorder(null);
        Jtexfieldnombre_IDmEDICAMENTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldnombre_IDmEDICAMENTOKeyTyped(evt);
            }
        });
        jPanel35.add(Jtexfieldnombre_IDmEDICAMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 250, 20));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 10));

        jLabel68.setText("Nombre:");
        jPanel35.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        jtextfieldNombre_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfieldNombre_Medicamento.setBorder(null);
        jtextfieldNombre_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfieldNombre_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(jtextfieldNombre_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 20));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 10));

        jLabel69.setText("Descripcion:");
        jPanel35.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 30));

        Jtextfield_Descripcion_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtextfield_Descripcion_Medicamento.setBorder(null);
        Jtextfield_Descripcion_Medicamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtextfield_Descripcion_MedicamentoFocusLost(evt);
            }
        });
        jPanel35.add(Jtextfield_Descripcion_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 20));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 10));

        jLabel70.setText("Laboratorio:");
        jPanel35.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        jtextfiel_Laboratorio_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfiel_Laboratorio_Medicamento.setBorder(null);
        jtextfiel_Laboratorio_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfiel_Laboratorio_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(jtextfiel_Laboratorio_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 20));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 10));

        jLabel71.setText("Cantidad:");
        jPanel35.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 30));

        jtextfield_cantidad_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextfield_cantidad_Medicamento.setBorder(null);
        jtextfield_cantidad_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfield_cantidad_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(jtextfield_cantidad_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 20));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 10));

        jPanelEliminarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelEliminarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEliminarMedicamentoMouseClicked(evt);
            }
        });
        jPanelEliminarMedicamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel72.setText("ELIMINAR MEDICAMENTO");
        jPanelEliminarMedicamento.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 40));

        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel73.setText("AGREGAR DOCTOR");
        jPanel41.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanelEliminarMedicamento.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel74.setText("AGREGAR DOCTOR");
        jPanel42.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel75.setText("AGREGAR DOCTOR");
        jPanel43.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanelEliminarMedicamento.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel35.add(jPanelEliminarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 390, 60));

        jPanel_AgregarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_AgregarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_AgregarMedicamentoMouseClicked(evt);
            }
        });
        jPanel_AgregarMedicamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel76.setText("AGREGAR MEDICAMENTO");
        jPanel_AgregarMedicamento.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 40));

        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel77.setText("AGREGAR DOCTOR");
        jPanel45.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel_AgregarMedicamento.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel35.add(jPanel_AgregarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 60));

        jPanelModificarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelModificarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelModificarMedicamentoMouseClicked(evt);
            }
        });
        jPanelModificarMedicamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel78.setText("MODIFICAR MEDICAMENTO");
        jPanelModificarMedicamento.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 40));

        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel79.setText("AGREGAR DOCTOR");
        jPanel47.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanelModificarMedicamento.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel80.setText("AGREGAR DOCTOR");
        jPanel48.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel81.setText("AGREGAR DOCTOR");
        jPanel49.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 40));

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 60));

        jPanelModificarMedicamento.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 60));

        jPanel35.add(jPanelModificarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 390, 60));

        jLabel82.setText("Lote:");
        jPanel35.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 30));

        JtexfieldLote_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtexfieldLote_Medicamento.setBorder(null);
        JtexfieldLote_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtexfieldLote_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(JtexfieldLote_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 250, 20));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 10));

        jLabel83.setText("Fecha Vencimiento:");
        jPanel35.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        Jtexfieldfechavencimiento_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtexfieldfechavencimiento_Medicamento.setBorder(null);
        Jtexfieldfechavencimiento_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtexfieldfechavencimiento_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(Jtexfieldfechavencimiento_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, 20));

        jSeparator31.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator31.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 230, 10));

        jLabel85.setText("Disponible:");
        jPanel35.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 30));

        jComboBox_Disponibilidad_Medicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<DISPONIBILIDAD>", "DISPONIBLE", "NO DISPONIBLE" }));
        jComboBox_Disponibilidad_Medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Disponibilidad_MedicamentoActionPerformed(evt);
            }
        });
        jPanel35.add(jComboBox_Disponibilidad_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 230, -1));

        jLabel84.setText("Precio:");
        jPanel35.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 50, 30));

        JtexfieldPrecio_Medicamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtexfieldPrecio_Medicamento.setBorder(null);
        JtexfieldPrecio_Medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtexfieldPrecio_MedicamentoKeyTyped(evt);
            }
        });
        jPanel35.add(JtexfieldPrecio_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 230, 20));

        jSeparator32.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator32.setForeground(new java.awt.Color(0, 0, 0));
        jPanel35.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 230, 10));

        jPanel31.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 590));

        jButton_MostrarTodosMedicamentos.setText("Mostrar todos");
        jButton_MostrarTodosMedicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_MostrarTodosMedicamentosKeyPressed(evt);
            }
        });
        jPanel31.add(jButton_MostrarTodosMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 170, -1));

        Paneles_jtablepane.addTab("Gestion_medicamento", jPanel31);

        jPanel1.add(Paneles_jtablepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 1020, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseClicked
        Paneles_jtablepane.setSelectedIndex(0);
    }//GEN-LAST:event_Panel_inicioMouseClicked

    private void Panel_doctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_doctorMouseClicked
        Paneles_jtablepane.setSelectedIndex(1);
    }//GEN-LAST:event_Panel_doctorMouseClicked

    private void Panel_recepcionistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_recepcionistasMouseClicked
        Paneles_jtablepane.setSelectedIndex(2);
    }//GEN-LAST:event_Panel_recepcionistasMouseClicked

    private void Panel_salasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salasMouseClicked
        Paneles_jtablepane.setSelectedIndex(5);
    }//GEN-LAST:event_Panel_salasMouseClicked

    private void Panel_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseEntered
        Panel_inicio.setBackground(new Color(10, 132, 215));
    }//GEN-LAST:event_Panel_inicioMouseEntered

    private void Panel_doctorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_doctorMouseEntered
        Panel_doctor.setBackground(new Color(10, 132, 215));
    }//GEN-LAST:event_Panel_doctorMouseEntered

    private void Panel_recepcionistasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_recepcionistasMouseEntered
        Panel_recepcionistas.setBackground(new Color(10, 132, 215));
    }//GEN-LAST:event_Panel_recepcionistasMouseEntered

    private void Panel_salasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salasMouseEntered
        Panel_salas.setBackground(new Color(10, 132, 215));
    }//GEN-LAST:event_Panel_salasMouseEntered

    private void Btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseEntered
        Btn_salir.setBackground(new Color(10, 132, 215));
    }//GEN-LAST:event_Btn_salirMouseEntered

    private void Panel_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseExited
        Panel_inicio.setBackground(new Color(10, 92, 184));
    }//GEN-LAST:event_Panel_inicioMouseExited

    private void Panel_doctorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_doctorMouseExited
        Panel_doctor.setBackground(new Color(10, 92, 184));
    }//GEN-LAST:event_Panel_doctorMouseExited

    private void Panel_recepcionistasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_recepcionistasMouseExited
        Panel_recepcionistas.setBackground(new Color(10, 92, 184));
    }//GEN-LAST:event_Panel_recepcionistasMouseExited

    private void Panel_salasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salasMouseExited
        Panel_salas.setBackground(new Color(10, 92, 184));
    }//GEN-LAST:event_Panel_salasMouseExited

    private void Btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseExited
        Btn_salir.setBackground(new Color(10, 92, 184));
    }//GEN-LAST:event_Btn_salirMouseExited

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE /*&& c != '.'*/) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE /*&& c != '.'*/) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        String correo = txtCorreo.getText().trim();
        // Regex para validar formato básico de correo (ej: usuario@dominio.com)
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Correo inválido. Ejemplo válido: usuario@dominio.com", "Error", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus(); // Regresa el foco al campo
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void Jtexfieldnombre_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldnombre_recepKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Jtexfieldnombre_recepKeyTyped

    private void jtextfieldApellido_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfieldApellido_recepKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtextfieldApellido_recepKeyTyped

    private void Jtextfield_correo_recepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtextfield_correo_recepFocusLost
        String correo = Jtextfield_correo_recep.getText().trim();
        // Regex para validar formato básico de correo (ej: usuario@dominio.com)
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Correo inválido. Ejemplo válido: usuario@dominio.com", "Error", JOptionPane.ERROR_MESSAGE);
            Jtextfield_correo_recep.requestFocus(); // Regresa el foco al campo
        }
    }//GEN-LAST:event_Jtextfield_correo_recepFocusLost

    private void jtextfielID_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfielID_recepKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE /*&& c != '.'*/) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtextfielID_recepKeyTyped

    private void jtextfieldTelefono_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfieldTelefono_recepKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE /*&& c != '.'*/) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtextfieldTelefono_recepKeyTyped


    private void Btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(
        this, 
        "¿Está seguro que desea cerrar la aplicación?",
        "Confirmar cierre",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
    
    if (respuesta == JOptionPane.YES_OPTION) {
        System.exit(0);
        
    }
    }//GEN-LAST:event_Btn_salirMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        controllerDoctor.guardarDoctorDesdeFormulario();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controllerDoctor.cargarDatosEnTablaDoctor();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
         controllerDoctor.eliminarDoctorSeleccionado();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        if (TablaDoctores.getSelectedRow() == -1) {
            controllerDoctor.cargarDatosDoctorEnFormulario();
        } else {
            controllerDoctor.actualizarDoctor();
            controllerDoctor.limpiarDoctor();
        }
    
    }//GEN-LAST:event_jPanel6MouseClicked

    private void JtexfieldCodigo_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtexfieldCodigo_recepKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexfieldCodigo_recepKeyTyped

    private void Jtexfieldfechacontratacion_recep_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldfechacontratacion_recep_KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldfechacontratacion_recep_KeyTyped

    private void Jtexfieldfechanacimiento_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldfechanacimiento_recepKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldfechanacimiento_recepKeyTyped

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        controllerRecepcionista.guardarRecepcionistaDesdeFormulario();
    }//GEN-LAST:event_jPanel16MouseClicked

    private void TabladeRecepcionistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladeRecepcionistasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabladeRecepcionistasMouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        if (TabladeRecepcionistas.getSelectedRow() == -1) {
            controllerRecepcionista.cargarDatosRecepcionistaEnFormulario();
        } else {
            controllerRecepcionista.actualizarRecepcionista();
            controllerRecepcionista.limpiarRecepcionista();
        }
                                     
    
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        controllerRecepcionista.eliminarRecepcionistaSeleccionado();
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        controllerSalas.guardarSalaDesdeFormulario();
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked

         if (TablaDeSalas.getSelectedRow() == -1) {
            controllerSalas.cargarDatosSalaEnFormulario();
        } else {
            controllerSalas.actualizarSala();
            controllerSalas.limpiarSala();
        }
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
        controllerSalas.eliminarSalaSeleccionada();
    }//GEN-LAST:event_jPanel27MouseClicked

    private void Jtexfieldnombre_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldnombre_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldnombre_farmaceuticaKeyTyped

    private void jtextfieldApellido_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfieldApellido_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldApellido_farmaceuticaKeyTyped

    private void Jtextfield_correo_farmaceuticaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtextfield_correo_farmaceuticaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtextfield_correo_farmaceuticaFocusLost

    private void jtextfielID_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfielID_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfielID_farmaceuticaKeyTyped

    private void jtextfieldTelefono_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfieldTelefono_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldTelefono_farmaceuticaKeyTyped

    private void panel_eliminarFarmaceuticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_eliminarFarmaceuticaMouseClicked
        controllerFarmaceutica.eliminarFarmaceuticaSeleccionado();

    }//GEN-LAST:event_panel_eliminarFarmaceuticaMouseClicked

    private void panel_agregarFarmaceuticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_agregarFarmaceuticaMouseClicked
         controllerFarmaceutica.guardarFarmaceuticaDesdeFormulario();
    }//GEN-LAST:event_panel_agregarFarmaceuticaMouseClicked

    private void panel_modificarFarmaceuticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_modificarFarmaceuticaMouseClicked
         if (TabladeFarmaceuticas.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un farmacéutico para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        controllerFarmaceutica.actualizarFarmaceutica();
    }
    }//GEN-LAST:event_panel_modificarFarmaceuticaMouseClicked

    private void JtexfieldCodigo_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtexfieldCodigo_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexfieldCodigo_farmaceuticaKeyTyped

    private void Jtexfieldfechacontratacion_farmaceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldfechacontratacion_farmaceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldfechacontratacion_farmaceuticaKeyTyped

    private void Jtexfieldfechanacimiento_farmeceuticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldfechanacimiento_farmeceuticaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldfechanacimiento_farmeceuticaKeyTyped

    private void TabladeFarmaceuticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladeFarmaceuticasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabladeFarmaceuticasMouseClicked

    private void Panel_salas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salas1MouseClicked
        Paneles_jtablepane.setSelectedIndex(3);
    }//GEN-LAST:event_Panel_salas1MouseClicked

    private void Panel_salas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salas1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_salas1MouseEntered

    private void Panel_salas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_salas1MouseExited

    private void Panel_farmaceuticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_farmaceuticaMouseClicked
        Paneles_jtablepane.setSelectedIndex(4);
    }//GEN-LAST:event_Panel_farmaceuticaMouseClicked

    private void Panel_farmaceuticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_farmaceuticaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_farmaceuticaMouseEntered

    private void Panel_farmaceuticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_farmaceuticaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_farmaceuticaMouseExited

    private void Jtexfieldnombre_IDmEDICAMENTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldnombre_IDmEDICAMENTOKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldnombre_IDmEDICAMENTOKeyTyped

    private void jtextfieldNombre_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfieldNombre_MedicamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldNombre_MedicamentoKeyTyped

    private void Jtextfield_Descripcion_MedicamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtextfield_Descripcion_MedicamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtextfield_Descripcion_MedicamentoFocusLost

    private void jtextfiel_Laboratorio_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfiel_Laboratorio_MedicamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfiel_Laboratorio_MedicamentoKeyTyped

    private void jtextfield_cantidad_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfield_cantidad_MedicamentoKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jtextfield_cantidad_MedicamentoKeyTyped

    private void jPanelEliminarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEliminarMedicamentoMouseClicked
        controllerMedicamento.eliminaraMedicamentoSeleccionado();
        try {
            controllerMedicamento.cargarDatosMedicamentos(); // Forzar recarga
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, 
                "Error al actualizar la tabla: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanelEliminarMedicamentoMouseClicked

    private void jPanel_AgregarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgregarMedicamentoMouseClicked
        controllerMedicamento.guardarMedicamentoDesdeFormulario();
        try {
            controllerMedicamento.cargarDatosMedicamentos(); // Forzar recarga
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, 
                "Error al actualizar la tabla: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel_AgregarMedicamentoMouseClicked

    private void jPanelModificarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelModificarMedicamentoMouseClicked
        if (jTable_Medicamentos.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, 
            "Seleccione un medicamento de la tabla para modificar", 
            "Advertencia", 
            JOptionPane.WARNING_MESSAGE);
    } else {
        controllerMedicamento.actualizarMedicamento();
        try {
            controllerMedicamento.cargarDatosMedicamentos(); // Forzar recarga
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, 
                "Error al actualizar la tabla: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jPanelModificarMedicamentoMouseClicked

    private void JtexfieldLote_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtexfieldLote_MedicamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexfieldLote_MedicamentoKeyTyped

    private void Jtexfieldfechavencimiento_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtexfieldfechavencimiento_MedicamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtexfieldfechavencimiento_MedicamentoKeyTyped

    private void jComboBox_Disponibilidad_MedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Disponibilidad_MedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Disponibilidad_MedicamentoActionPerformed

    private void JtexfieldPrecio_MedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtexfieldPrecio_MedicamentoKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten números y punto decimal", 
            "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_JtexfieldPrecio_MedicamentoKeyTyped

    private void jButton_BuscarMedicamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_BuscarMedicamentoKeyPressed
         String criterio = Jtextfield_BuscadorMedicamento.getText().trim();
    controllerMedicamento.buscarMedicamentos(criterio);
    }//GEN-LAST:event_jButton_BuscarMedicamentoKeyPressed

    private void Jtextfield_BuscadorMedicamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtextfield_BuscadorMedicamentoKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String criterio = Jtextfield_BuscadorMedicamento.getText().trim();
        controllerMedicamento.buscarMedicamentos(criterio);
    }
    }//GEN-LAST:event_Jtextfield_BuscadorMedicamentoKeyPressed

    private void jButton_MostrarTodosMedicamentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_MostrarTodosMedicamentosKeyPressed
        controllerMedicamento.mostrarTodosMedicamentos();
    Jtextfield_BuscadorMedicamento.setText("");
    }//GEN-LAST:event_jButton_MostrarTodosMedicamentosKeyPressed

    private void Jtextfield_BuscadorMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtextfield_BuscadorMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtextfield_BuscadorMedicamentoActionPerformed

    private void jButton_BuscarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BuscarMedicamentoActionPerformed


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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_salir;
    private javax.swing.JComboBox<String> Combo_TipoSala;
    private javax.swing.JComboBox<String> JComboTurno;
    private javax.swing.JComboBox<String> JcomboSexo;
    private javax.swing.JComboBox<String> JcomboSexo1;
    private javax.swing.JComboBox<String> Jcombobox_TurnoFarmaceutica;
    private javax.swing.JComboBox<String> Jcombobox_sexoFarmaceutica;
    private javax.swing.JSpinner Jspinner_CapacidadSala;
    private javax.swing.JTextField JtexfieldCodigo_farmaceutica;
    private javax.swing.JTextField JtexfieldCodigo_recep;
    private javax.swing.JTextField JtexfieldLote_Medicamento;
    private javax.swing.JTextField JtexfieldPrecio_Medicamento;
    private javax.swing.JTextField Jtexfieldfechacontratacion_farmaceutica;
    private javax.swing.JTextField Jtexfieldfechacontratacion_recep_;
    private javax.swing.JTextField Jtexfieldfechanacimiento_farmeceutica;
    private javax.swing.JTextField Jtexfieldfechanacimiento_recep;
    private javax.swing.JTextField Jtexfieldfechavencimiento_Medicamento;
    private javax.swing.JTextField Jtexfieldnombre_IDmEDICAMENTO;
    private javax.swing.JTextField Jtexfieldnombre_farmaceutica;
    private javax.swing.JTextField Jtexfieldnombre_recep;
    private javax.swing.JTextField Jtextfield_BuscadorMedicamento;
    private javax.swing.JTextField Jtextfield_Descripcion_Medicamento;
    private javax.swing.JTextField Jtextfield_correo_farmaceutica;
    private javax.swing.JTextField Jtextfield_correo_recep;
    private javax.swing.JPanel Panel_doctor;
    private javax.swing.JPanel Panel_farmaceutica;
    private javax.swing.JPanel Panel_inicio;
    private javax.swing.JPanel Panel_recepcionistas;
    private javax.swing.JPanel Panel_salas;
    private javax.swing.JPanel Panel_salas1;
    private javax.swing.JTabbedPane Paneles_jtablepane;
    private javax.swing.JTable TablaDeSalas;
    private javax.swing.JTable TablaDoctores;
    private javax.swing.JTable TabladeFarmaceuticas;
    private javax.swing.JTable TabladeRecepcionistas;
    private javax.swing.JComboBox<String> cbEpss;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JLabel cbSexo;
    private javax.swing.JComboBox<String> cbSexo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_BuscarMedicamento;
    private javax.swing.JButton jButton_MostrarTodosMedicamentos;
    private javax.swing.JComboBox<String> jComboBox_Disponibilidad_Medicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
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
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEliminarMedicamento;
    private javax.swing.JPanel jPanelModificarMedicamento;
    private javax.swing.JPanel jPanel_AgregarMedicamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_Medicamentos;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jtextfielID_farmaceutica;
    private javax.swing.JTextField jtextfielID_recep;
    private javax.swing.JTextField jtextfiel_Laboratorio_Medicamento;
    private javax.swing.JTextField jtextfieldApellido_farmaceutica;
    private javax.swing.JTextField jtextfieldApellido_recep;
    private javax.swing.JTextField jtextfieldNombre_Medicamento;
    private javax.swing.JTextField jtextfieldTelefono_farmaceutica;
    private javax.swing.JTextField jtextfieldTelefono_recep;
    private javax.swing.JTextField jtextfield_cantidad_Medicamento;
    private java.awt.MenuItem menuItem2;
    private javax.swing.JPanel panel_agregarFarmaceutica;
    private javax.swing.JPanel panel_eliminarFarmaceutica;
    private javax.swing.JPanel panel_modificarFarmaceutica;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoSala;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreSala;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
