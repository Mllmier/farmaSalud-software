/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmasalud.view;

import Controller.ControllerFarmaceutica;
import dao.MedicamentosDAO;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Medicamento;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.awt.event.KeyEvent;

/**
 *
 * @author HP
 */
public class Farmaceutica extends javax.swing.JFrame {
    
 
private ControllerFarmaceutica controller;
    
    public Farmaceutica() throws IOException  {
        initComponents();
        controller = new ControllerFarmaceutica(this);
        configurarControllerFarmaceutica();
        configurarListeners();
       
        
    }
    
    private void configurarControllerFarmaceutica() throws IOException{
    
        controller.setTabladeMedicamentos(TabladeMedicamentos);
        controller.setTxtCodMedicamento(txtCodMedicamento);
        controller.setTxtMedicamento(txtMedicamento);
        controller.setTxtDescripcion(txtDescripcion);
        controller.setTxtLaboratorio(txtLaboratorio);
        controller.setTxtCantidad(txtCantidad);
        controller.setTxtLote(txtLote);
        controller.setTxtFechaVencimiento(txtFechaVencimiento);
        controller.setCbDisponible(cbDisponible);
        controller.setTxtPrecio(txtPrecio);
        
        controller.setupTableModelMedicamentos();
        controller.cargarDatosMedicamentos();
        txtCodMedicamento.setEditable(false);
    }
    
    private void configurarListeners(){
      TabladeMedicamentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            controller.cargarDatosEnTablaMedicamentos(); // Nombre correcto
        }
    }
       });
    } 
    
    
    
    
    
   
    
   
    
   
  
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCodMedicamento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtLaboratorio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtFechaVencimiento = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        cbDisponible = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabladeMedicamentos = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 43, 110));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(28, 43, 110));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inicio");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(104, 104, 104))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, -1));

        jPanel8.setBackground(new java.awt.Color(28, 43, 110));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entrega");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, -1));

        jPanel9.setBackground(new java.awt.Color(28, 43, 110));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventario");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(17, 17, 17))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, -1));

        jPanel10.setBackground(new java.awt.Color(28, 43, 110));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Historial Entrega");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 250, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 74, 208, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Farmaceutica");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 30, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 660));

        jPanel3.setBackground(new java.awt.Color(10, 92, 184));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1080, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inicio", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Datos  Entrega", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Nombre:");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jTextField1.setBorder(null);
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, 10));

        jLabel8.setText("Apellido:");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 10));

        jLabel9.setText("Telefono:");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 10));

        jLabel10.setText("Cod. Medicamento:");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 156, -1, 30));

        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 10));

        jLabel11.setText("Medicamento:");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jTextField5.setBorder(null);
        jPanel11.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, 10));

        jLabel12.setText("Cantidad:");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 150, 10));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Modificar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(112, 112, 112))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 310, 50));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Eliminar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(119, 119, 119))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 50));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 500));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Telefono", "Cod. Medicamento", "Medicamento", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 640, 500));

        jTabbedPane1.addTab("Entrega", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Inventario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Id. Medicamento:");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtCodMedicamento.setBorder(null);
        txtCodMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodMedicamentoActionPerformed(evt);
            }
        });
        jPanel14.add(txtCodMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, -1));

        jLabel16.setText("Nombre:");
        jPanel14.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        txtMedicamento.setBorder(null);
        txtMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedicamentoKeyTyped(evt);
            }
        });
        jPanel14.add(txtMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, -1));

        jLabel17.setText("Descripcion:");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jPanel14.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, -1));

        jLabel18.setText("Laboratorio:");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel19.setText("Cantidad:");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtLaboratorio.setBorder(null);
        txtLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaboratorioActionPerformed(evt);
            }
        });
        txtLaboratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLaboratorioKeyTyped(evt);
            }
        });
        jPanel14.add(txtLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, -1));

        txtCantidad.setBorder(null);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel14.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, 10));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, 10));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Agregar Medicamento");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 50));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setPreferredSize(new java.awt.Dimension(290, 50));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Eliminar Medicamento");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 290, 50));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setPreferredSize(new java.awt.Dimension(290, 50));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Modificar Medicamento");
        jPanel16.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel23.setText("Lote:");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel24.setText("Fecha Vencimiento:");
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel25.setText("Disponible:");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 20));

        jLabel26.setText("Precio:");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        txtLote.setBorder(null);
        jPanel14.add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, -1));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, -1));

        txtFechaVencimiento.setBorder(null);
        jPanel14.add(txtFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, -1));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 120, 10));

        txtPrecio.setBorder(null);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel14.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 130, 10));

        cbDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Disponibilidad>", "Si", "No" }));
        jPanel14.add(cbDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 510));

        TabladeMedicamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12)))); // NOI18N
        TabladeMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdMedicamento", "Nombre", "Descripcion", "Laboratorio", "Cantidad", "Lote", "FechaVencimiento", "Disponible", "Precio"
            }
        ));
        jScrollPane2.setViewportView(TabladeMedicamentos);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 630, 470));

        jTabbedPane1.addTab("Inventario", jPanel6);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cod. Medicamento", "Medicamento", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel18.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 830, 460));

        jTabbedPane1.addTab("Historial Entrega", jPanel18);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 1060, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
      jTabbedPane1.setSelectedIndex(0); 

    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
      jTabbedPane1.setSelectedIndex(1); 

    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2); 

    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3); 

    }//GEN-LAST:event_jPanel10MouseClicked

    private void txtLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaboratorioActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCodMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodMedicamentoActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
       controller.guardarMedicamentoDesdeFormulario();
       
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        // TODO add your handling code here:
        controller.actualizarMedicamento();
    try {
        controller.cargarDatosMedicamentos();
    } catch (IOException ex) {
        Logger.getLogger(Farmaceutica.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        // TODO add your handling code here:
       controller.eliminaraMedicamentoSeleccionado();
       
    }//GEN-LAST:event_jPanel17MouseClicked

    private void txtMedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicamentoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
   
    if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
    }
    
    }//GEN-LAST:event_txtMedicamentoKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
   
    if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtLaboratorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLaboratorioKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
   
    if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_txtLaboratorioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_txtPrecioKeyTyped

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
            java.util.logging.Logger.getLogger(Farmaceutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmaceutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmaceutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmaceutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                try {
                    new Farmaceutica().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Farmaceutica.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabladeMedicamentos;
    private javax.swing.JComboBox<String> cbDisponible;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodMedicamento;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
