package Login;

import java.awt.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Index extends javax.swing.JFrame {

    double fondo;
    int cuot;
    int buscar;
    long codigo;
    DecimalFormat cortar;
    DefaultTableModel modeloAmortizacion;

    public Index() {
        initComponents();
        setLocationRelativeTo(null);
        cuot=0;
        fondo=0.0;
        codigo += 238;
        cortar = new DecimalFormat("###.##");
        modeloAmortizacion = (DefaultTableModel) tablaAmortizacion.getModel();

        JTableHeader h = tablaPersona.getTableHeader();

        h.setFont(new Font("Tahoma", Font.BOLD, 12));
        h.setForeground(new Color(255, 255, 255));
        h.setBackground(new Color(36, 36, 36));

        JTableHeader r = tablaOrg.getTableHeader();
        r.setFont(new Font("Tahoma", Font.BOLD, 12));
        r.setForeground(new Color(255, 255, 255));
        r.setBackground(new Color(36, 36, 36));

        JTableHeader i = tablaEmpleado.getTableHeader();
        i.setFont(new Font("Tahoma", Font.BOLD, 12));
        i.setForeground(new Color(255, 255, 255));
        i.setBackground(new Color(36, 36, 36));

        JTableHeader g = tablaSucursal.getTableHeader();
        g.setFont(new Font("Tahoma", Font.BOLD, 12));
        g.setForeground(new Color(255, 255, 255));
        g.setBackground(new Color(36, 36, 36));

        JTableHeader s = tablaAmortizacion.getTableHeader();
        s.setFont(new Font("Tahoma", Font.BOLD, 12));
        s.setForeground(new Color(255, 255, 255));
        s.setBackground(new Color(36, 36, 36));

        chekFemenino.setSelected(true);
        checkPrivada.setSelected(true);
        butonF.setSelected(true);
        cargarTabla();
        cargarTablaOrg();
        cargarTablaSucursal();
        cargarTablaEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrup = new javax.swing.ButtonGroup();
        cuentaAhorro = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pnalecuenta = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAceptarAhorr = new javax.swing.JButton();
        btnCancelarAhorr = new javax.swing.JButton();
        txtSaldoActual = new javax.swing.JTextField();
        txtCuotas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidCCC = new javax.swing.JTextField();
        cuentaCorriente = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtSaldoCor = new javax.swing.JTextField();
        btnAceptarCorr = new javax.swing.JButton();
        btnCancelarCorr = new javax.swing.JButton();
        txtidCCC1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGrup1 = new javax.swing.ButtonGroup();
        btnGrup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etiMinimizar = new javax.swing.JLabel();
        etiCerrar = new javax.swing.JLabel();
        tabePestañas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelPersona = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        chekFemenino = new javax.swing.JRadioButton();
        chekMasculino = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        btnLimipiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        combxCuenta = new javax.swing.JComboBox<>();
        comboFiltrarPers = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        txtEmpleados = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        btnEliminarOrg = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        comboxOrg = new javax.swing.JComboBox<>();
        checkPrivada = new javax.swing.JRadioButton();
        checkPublica = new javax.swing.JRadioButton();
        btnLimpiarOrg = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOrg = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        comboFiltroOrg = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSucursal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtNombreSuc = new javax.swing.JTextField();
        txtDireccSuc = new javax.swing.JTextField();
        txtCodigoPosSuc = new javax.swing.JTextField();
        btnLimpiarSu = new javax.swing.JButton();
        btnGuardarSu = new javax.swing.JButton();
        comboCiudad = new javax.swing.JComboBox<>();
        btnEliminarSuc = new javax.swing.JButton();
        comboFiltroSuc = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGuardarE = new javax.swing.JButton();
        btnEliminarE = new javax.swing.JButton();
        btnLimpiarE = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        fechaEmp = new com.toedter.calendar.JDateChooser();
        txtDni1 = new javax.swing.JTextField();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        butonF = new javax.swing.JRadioButton();
        butonM = new javax.swing.JRadioButton();
        txtSucursal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        comboFiltroEmple = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAmortizacion = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarAmorti = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        comboAmorti = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        cuentaAhorro.setTitle("Asignar Cuenta ");
        cuentaAhorro.setModal(true);
        cuentaAhorro.setUndecorated(true);
        cuentaAhorro.setResizable(false);

        jPanel15.setBackground(new java.awt.Color(36, 36, 36));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setBackground(java.awt.Color.orange);
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(36, 36, 36));
        jLabel23.setText("CUENTA AHORRO");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profits.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(24, 24, 24)
                .addComponent(jLabel36)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pnalecuenta.setBackground(new java.awt.Color(36, 36, 36));
        pnalecuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cuenta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnalecuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Fondo");
        pnalecuenta.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cuotas Fijas");
        pnalecuenta.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnAceptarAhorr.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptarAhorr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptarAhorr.setForeground(new java.awt.Color(36, 36, 36));
        btnAceptarAhorr.setText("Aceptar");
        btnAceptarAhorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAhorrActionPerformed(evt);
            }
        });
        pnalecuenta.add(btnAceptarAhorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 111, 34));

        btnCancelarAhorr.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarAhorr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarAhorr.setForeground(new java.awt.Color(36, 36, 36));
        btnCancelarAhorr.setText("Cancelar");
        btnCancelarAhorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAhorrActionPerformed(evt);
            }
        });
        pnalecuenta.add(btnCancelarAhorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 108, 34));
        pnalecuenta.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, 30));
        pnalecuenta.add(txtCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Interes");
        pnalecuenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtInteres.setText("5%");
        txtInteres.setEnabled(false);
        pnalecuenta.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID C-C-C");
        pnalecuenta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        pnalecuenta.add(txtidCCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, 30));

        jPanel15.add(pnalecuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 260));

        cuentaAhorro.getContentPane().add(jPanel15, java.awt.BorderLayout.CENTER);

        cuentaCorriente.setTitle("Asignar Cuenta");
        cuentaCorriente.setUndecorated(true);

        jPanel16.setBackground(new java.awt.Color(36, 36, 36));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("CUENTA CORRIENTE");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pay.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        jPanel18.setBackground(new java.awt.Color(36, 36, 36));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fondo");

        txtSaldoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoCorActionPerformed(evt);
            }
        });

        btnAceptarCorr.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptarCorr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptarCorr.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptarCorr.setText("Aceptar");
        btnAceptarCorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCorrActionPerformed(evt);
            }
        });

        btnCancelarCorr.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarCorr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarCorr.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarCorr.setText("Cancelar");
        btnCancelarCorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCorrActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID C-C-C");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelarCorr, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptarCorr, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSaldoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidCCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtidCCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCorr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarCorr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, 200));

        cuentaCorriente.getContentPane().add(jPanel16, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Index");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(241, 196, 15));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("HOME");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 20));

        etiMinimizar.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        etiMinimizar.setForeground(new java.awt.Color(51, 51, 51));
        etiMinimizar.setText("-");
        etiMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiMinimizarMouseClicked(evt);
            }
        });
        jPanel5.add(etiMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, 20));

        etiCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiCerrar.setForeground(new java.awt.Color(51, 51, 51));
        etiCerrar.setText("X");
        etiCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiCerrarMouseClicked(evt);
            }
        });
        jPanel5.add(etiCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 920, 70));

        tabePestañas.setBackground(new java.awt.Color(36, 36, 36));
        tabePestañas.setForeground(new java.awt.Color(255, 255, 255));
        tabePestañas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabePestañas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(36, 36, 36));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bann.png"))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("BIENVENIDO A BANK S.M");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PROYECTO EXCLUSIVO");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PROGRAMADORES: SARAH LOPEZ Y MILER VARGAS");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/java.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel21)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel47))
                    .addComponent(jLabel22))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel21)))
                .addGap(27, 27, 27)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabePestañas.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/img/casa.png")), jPanel3); // NOI18N

        jPanel6.setBackground(new java.awt.Color(36, 36, 36));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        panelPersona.setBackground(new java.awt.Color(36, 36, 36));
        panelPersona.setForeground(new java.awt.Color(255, 255, 255));
        panelPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersona.setBackground(new java.awt.Color(36, 36, 36));
        tablaPersona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaPersona.setForeground(new java.awt.Color(255, 255, 255));
        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Identificacion", "Nombre", "Apellido", "Fecha Nacimiento", "Genero", "Nº Cuenta", "Tipo de Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPersona.setGridColor(new java.awt.Color(204, 204, 255));
        tablaPersona.setSelectionBackground(new java.awt.Color(241, 196, 15));
        tablaPersona.setSelectionForeground(new java.awt.Color(36, 36, 36));
        tablaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersona);

        panelPersona.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 290));

        jPanel7.setBackground(new java.awt.Color(36, 36, 36));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Persona Natural", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Identificacion");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel7.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 199, 30));
        jPanel7.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 199, 30));
        jPanel7.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 199, 30));

        chekFemenino.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup.add(chekFemenino);
        chekFemenino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chekFemenino.setForeground(new java.awt.Color(255, 255, 255));
        chekFemenino.setText("Femenino");
        jPanel7.add(chekFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        chekMasculino.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup.add(chekMasculino);
        chekMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chekMasculino.setForeground(new java.awt.Color(255, 255, 255));
        chekMasculino.setText("Masculino");
        jPanel7.add(chekMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 100, 30));

        btnLimipiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimipiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimipiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimipiar.setText("Limpiar");
        btnLimipiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimipiarActionPerformed(evt);
            }
        });
        jPanel7.add(btnLimipiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Nacimiento");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel7.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tipo de Cuenta");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        combxCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ahorro", "Corriente" }));
        combxCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combxCuentaActionPerformed(evt);
            }
        });
        jPanel7.add(combxCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 200, 30));

        panelPersona.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 360, 390));

        comboFiltrarPers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltrarPers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ahorro", "Corriente", "Femenino", "Masculino", "Mostrar Todo" }));
        comboFiltrarPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltrarPersActionPerformed(evt);
            }
        });
        panelPersona.add(comboFiltrarPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filtrar.png"))); // NOI18N
        jLabel38.setText("Filtrar Por:");
        panelPersona.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

        jPanel6.add(panelPersona, java.awt.BorderLayout.CENTER);

        tabePestañas.addTab("Persona Natural", new javax.swing.ImageIcon(getClass().getResource("/img/persona-soltera.png")), jPanel6); // NOI18N

        jPanel9.setBackground(new java.awt.Color(36, 36, 36));
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel19.setBackground(new java.awt.Color(36, 36, 36));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Organizacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(txtEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, 28));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Tipo de Organizacion");
        jPanel19.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Representante");
        jPanel19.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("No Empleados");
        jPanel19.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel19.add(txtRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, 28));

        btnEliminarOrg.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarOrg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarOrg.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarOrg.setText("Eliminar");
        btnEliminarOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarOrgActionPerformed(evt);
            }
        });
        jPanel19.add(btnEliminarOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 100, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Tipo de Cuenta");
        jPanel19.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        comboxOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ahorro", "Corriente" }));
        comboxOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxOrgActionPerformed(evt);
            }
        });
        jPanel19.add(comboxOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 30));

        checkPrivada.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup1.add(checkPrivada);
        checkPrivada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkPrivada.setForeground(new java.awt.Color(255, 255, 255));
        checkPrivada.setText("Privada");
        jPanel19.add(checkPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        checkPublica.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup1.add(checkPublica);
        checkPublica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkPublica.setForeground(new java.awt.Color(255, 255, 255));
        checkPublica.setText("Publica");
        jPanel19.add(checkPublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        btnLimpiarOrg.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarOrg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarOrg.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarOrg.setText("Limpiar");
        btnLimpiarOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarOrgActionPerformed(evt);
            }
        });
        jPanel19.add(btnLimpiarOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIT");
        jPanel19.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel19.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 190, 30));

        tablaOrg.setBackground(new java.awt.Color(36, 36, 36));
        tablaOrg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaOrg.setForeground(new java.awt.Color(255, 255, 255));
        tablaOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nit", "Tipo de Organizacion", "Representante", "No Empleados", "Nº Cuenta", "Tipo Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOrg.setAutoscrolls(false);
        tablaOrg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaOrg.setGridColor(new java.awt.Color(255, 255, 255));
        tablaOrg.setSelectionBackground(new java.awt.Color(241, 196, 15));
        tablaOrg.setSelectionForeground(new java.awt.Color(36, 36, 36));
        tablaOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrgMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaOrg);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filtrar.png"))); // NOI18N
        jLabel39.setText("Filtrar Por:");

        comboFiltroOrg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltroOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Privada", "Publica", "Ahorro", "Corriente", "Mostrar Todo" }));
        comboFiltroOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroOrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltroOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(comboFiltroOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tabePestañas.addTab("Persona Juridica", new javax.swing.ImageIcon(getClass().getResource("/img/organizacion.png")), jPanel9); // NOI18N

        jPanel8.setBackground(new java.awt.Color(36, 36, 36));
        jPanel8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tablaSucursal.setBackground(new java.awt.Color(36, 36, 36));
        tablaSucursal.setForeground(new java.awt.Color(255, 255, 255));
        tablaSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Codigo Postal", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSucursal.setGridColor(new java.awt.Color(255, 255, 255));
        tablaSucursal.setSelectionBackground(java.awt.Color.orange);
        tablaSucursal.setSelectionForeground(new java.awt.Color(36, 36, 36));
        jScrollPane4.setViewportView(tablaSucursal);

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Sucursales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 92, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nombre");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Direccion");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Codigo Postal");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Ciudad");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        jPanel2.add(txtNombreSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 28));
        jPanel2.add(txtDireccSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, 28));
        jPanel2.add(txtCodigoPosSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 27));

        btnLimpiarSu.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarSu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarSu.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarSu.setText("Limpiar");
        btnLimpiarSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSuActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, 30));

        btnGuardarSu.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarSu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarSu.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarSu.setText("Guardar");
        btnGuardarSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSuActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cartagena", "Barranquilla", "Medellin" }));
        comboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadActionPerformed(evt);
            }
        });
        jPanel2.add(comboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 214, 180, 30));

        btnEliminarSuc.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarSuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarSuc.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarSuc.setText("Eliminar");
        btnEliminarSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSucActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, 30));

        comboFiltroSuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltroSuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cartagena", "Barranquilla", "Medellin" }));
        comboFiltroSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroSucActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filtrar.png"))); // NOI18N
        jLabel40.setText("Filtrar Por:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFiltroSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(comboFiltroSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        tabePestañas.addTab("Sucursales", new javax.swing.ImageIcon(getClass().getResource("/img/bank.png")), jPanel8); // NOI18N

        jPanel10.setBackground(new java.awt.Color(36, 36, 36));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(36, 36, 36));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DNI");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Apellido");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha Nacimiento");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btnGuardarE.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarE.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarE.setText("Guardar");
        btnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEActionPerformed(evt);
            }
        });
        jPanel11.add(btnGuardarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        btnEliminarE.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarE.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarE.setText("Eliminar");
        btnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEActionPerformed(evt);
            }
        });
        jPanel11.add(btnEliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 30));

        btnLimpiarE.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarE.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarE.setText("Limpiar");
        btnLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEActionPerformed(evt);
            }
        });
        jPanel11.add(btnLimpiarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Genero");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        jPanel11.add(fechaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 149, 190, 30));
        jPanel11.add(txtDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 190, 28));
        jPanel11.add(txtApellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, 30));
        jPanel11.add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Codigo Sucursal");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        butonF.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup2.add(butonF);
        butonF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butonF.setForeground(new java.awt.Color(255, 255, 255));
        butonF.setText("Femenino");
        jPanel11.add(butonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        butonM.setBackground(new java.awt.Color(36, 36, 36));
        btnGrup2.add(butonM);
        butonM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butonM.setForeground(new java.awt.Color(255, 255, 255));
        butonM.setText("Masculino");
        jPanel11.add(butonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        jPanel11.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 30));

        tablaEmpleado.setBackground(new java.awt.Color(36, 36, 36));
        tablaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Fecha Nacimiento", "Genero", "Sucursal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleado.setAutoscrolls(false);
        tablaEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaEmpleado.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEmpleado.setSelectionBackground(new java.awt.Color(241, 196, 15));
        tablaEmpleado.setSelectionForeground(new java.awt.Color(36, 36, 36));
        tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaEmpleado);

        comboFiltroEmple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltroEmple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino", "Mostrar Todo" }));
        comboFiltroEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroEmpleActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filtrar.png"))); // NOI18N
        jLabel41.setText("Filtrar Por:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltroEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 548, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(comboFiltroEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabePestañas.addTab("Empleados", new javax.swing.ImageIcon(getClass().getResource("/img/employees.png")), jPanel10); // NOI18N

        jPanel12.setBackground(new java.awt.Color(36, 36, 36));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jPanel12.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 270));

        tablaAmortizacion.setBackground(new java.awt.Color(36, 36, 36));
        tablaAmortizacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaAmortizacion.setForeground(new java.awt.Color(255, 255, 255));
        tablaAmortizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Periodos", "Saldo Inicial", "Cuota Fija", "Interes", "Abono a Capital", "Saldo Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAmortizacion.setGridColor(java.awt.Color.orange);
        tablaAmortizacion.setSelectionBackground(java.awt.Color.orange);
        tablaAmortizacion.setSelectionForeground(new java.awt.Color(36, 36, 36));
        jScrollPane5.setViewportView(tablaAmortizacion);

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 540, 280));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel12.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 220, 30));

        btnBuscarAmorti.setBackground(new java.awt.Color(36, 36, 36));
        btnBuscarAmorti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnBuscarAmorti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36)));
        btnBuscarAmorti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarAmorti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAmortiActionPerformed(evt);
            }
        });
        jPanel12.add(btnBuscarAmorti, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 40, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("TABLA DE AMORTIZACION");
        jPanel12.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        comboAmorti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboAmorti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Persona", "Organizacion" }));
        comboAmorti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAmortiActionPerformed(evt);
            }
        });
        jPanel12.add(comboAmorti, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 170, 30));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filtrar.png"))); // NOI18N
        jPanel12.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        tabePestañas.addTab("Amortizacion", new javax.swing.ImageIcon(getClass().getResource("/img/budget.png")), jPanel12); // NOI18N

        jPanel1.add(tabePestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1070, 450));

        jPanel4.setBackground(new java.awt.Color(156, 39, 175));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo Bank S.M");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etiMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiMinimizarMouseClicked
        this.setState(Index.ICONIFIED);
    }//GEN-LAST:event_etiMinimizarMouseClicked

    private void etiCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCerrarMouseClicked
        System.exit(0); // aqui programamos el boton cerrar usando el metodo exit 
        //pasandole como parametro 0
    }//GEN-LAST:event_etiCerrarMouseClicked

    private void tablaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonaMouseClicked
//        try {
//            int fila = tablaPersona.getSelectedRow();
//           String codig = tablaPersona.getValueAt(fila, 0).toString();
//      
//            ResultSet rs;
//
//            Connection con = Conexion.getConexion();
//           PreparedStatement ps = con.prepareStatement("SELECT idPersona,nombre,apellido,fechaNaci,genero,idCCC,tipoCuenta,fondo,cuotas FROM Persona WHERE  codigo=?");
//            ps.setString(1, codig);
//            rs = ps.executeQuery(); //aqui ejecutamos la consulta
//
//            while (rs.next()) {
////                txtNombre.setText(rs.getString("nombre"));
////                txtApellido.setText(rs.getString("apellido"));
//
//                //fecha.setText(rs.toString(fech));
//                //codigo.setText(String.valueOf(codig));
////                if (rs.getString("genero").equals("Femenino")) {
////                    chekFemenino.setSelected(true);
////                } else if (rs.getString("genero").equals("Masculino")) {
////                    chekMasculino.setSelected(true);
////                }
//                //  combxCuenta.setText(String.valueOf(tipocuenta));
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, ex.toString());
//        }

    }//GEN-LAST:event_tablaPersonaMouseClicked

    private void btnLimipiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimipiarActionPerformed

        txtNombre.setText("");
        txtApellido.setText("");
        txtIdentificacion.setText("");
        fecha.setCalendar(null);
        btnGrup.clearSelection();
        combxCuenta.setSelectedIndex(0);


    }//GEN-LAST:event_btnLimipiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaPersona.getSelectedRow();
        int codig = Integer.parseInt(tablaPersona.getValueAt(fila, 0).toString());
       
      try{  
        try {

            try {

                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("DELETE FROM Persona  WHERE codigo=?");
                ps.setInt(1, codig);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");

                cargarTabla();

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e.toString());
            }
        } catch (NumberFormatException error) {

            JOptionPane.showMessageDialog(null, "Ocurre un Error");
        }
      }catch ( ArrayIndexOutOfBoundsException error) {

            JOptionPane.showMessageDialog(null, "Debe Seleccionar La Celda a Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarAhorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAhorrActionPerformed

        if (this.tabePestañas.getSelectedIndex() == 1) {

            if (!(txtNombre.getText().trim().equals("") && txtApellido.getText().trim().equals("") && txtIdentificacion.getText().trim().equals("") && fecha.getCalendar() == null && combxCuenta.getSelectedIndex() == 0 && fondo == 0 && cuot == 0 && txtidCCC.getText().trim().equals(""))) { //comprueba si la cadena de entrada o campo de texto está vacía 

                try {

                    try {
                        // String codig = txtCodigo.getText().trim();
                        String nombre = txtNombre.getText().trim();
                        String apellido = txtApellido.getText().trim();
                        int identificacion = Integer.parseInt(txtIdentificacion.getText().trim());
                        Calendar fech = this.fecha.getCalendar();
                        String sexo;

                        if (chekFemenino.isSelected() == true) {

                            sexo = "Femenino";
                        } else if (chekMasculino.isSelected() == true) {
                            sexo = "Masculino";
                        } else {
                            sexo = "Femenino";

                        }

                        int idccc = Integer.parseInt(txtidCCC.getText().trim());
                        String var = "Ahorro";
                        fondo = Double.parseDouble(txtSaldoActual.getText());
                        cuot = Integer.parseInt(txtCuotas.getText());

                        System.out.println("Campo Identi: " + identificacion);
                        System.out.println("Campo Nombre: " + nombre);
                        System.out.println("Campo Apellido: " + apellido);
                        System.out.println("Campo fecha: " + fech);
                        System.out.println("Campo genero: " + sexo);
                        System.out.println("Campo numero idCCC: " + idccc);
                        System.out.println("Campo tipo de cuenta: " + var);
                        System.out.println("Campo fondo: " + fondo);
                        System.out.println("Campo cuotas: " + cuot);
                        System.out.println("Campo codigo: " + codigo);

                        try {
                            Connection con = Conexion.getConexion();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO Persona(codigo,idPersona,nombre,apellido,fechaNaci,genero,idCCC,tipoCuenta,fondo,cuotas)VALUES (?,?,?,?,?,?,?,?,?,?)");
                            ps.setLong(1, codigo);
                            ps.setInt(2, identificacion);
                            ps.setString(3, nombre);
                            ps.setString(4, apellido);
                            ps.setDate(5, new java.sql.Date(fech.getTimeInMillis()));
                            ps.setString(6, sexo);
                            ps.setInt(7, idccc);
                            ps.setString(8, var);
                            ps.setDouble(9, fondo);
                            ps.setInt(10, cuot);

                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Registro Exitoso");
                            this.codigo++;
                            //   txtCodigo.setText("");
                            txtNombre.setText("");
                            txtApellido.setText("");
                            txtIdentificacion.setText("");
                            fecha.setCalendar(null);
                            btnGrup.clearSelection();
                            combxCuenta.setSelectedIndex(0);
                            txtidCCC.setText("");
                            txtSaldoActual.setText("");
                            txtCuotas.setText("");

                            cargarTabla();

                        } catch (SQLException e) {
                            JOptionPane.showConfirmDialog(null, e.toString());
                        }

                    } catch (NumberFormatException error) {

                        JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                    }
                } catch (NullPointerException error) {

                    JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
            }

            cuentaAhorro.dispose();
        } else if (this.tabePestañas.getSelectedIndex() == 2) {

            if (!(txtNit.getText().trim().equals("") && txtRepresentante.getText().trim().equals("") && txtEmpleados.getText().trim().equals("") && comboxOrg.getSelectedIndex() == 0 && fondo == 0 && cuot == 0 && txtidCCC.getText().trim().equals(""))) { //comprueba si la cadena de entrada o campo de texto está vacía 

                try {

                    try {

                        int nit = Integer.parseInt(txtNit.getText().trim());
                        String represent = txtRepresentante.getText().trim();
                        int empl = Integer.parseInt(txtEmpleados.getText().trim());

                        String org;
                        if (checkPrivada.isSelected() == true) {

                            org = "Privada";
                        } else if (checkPublica.isSelected() == true) {
                            org = "Publica";
                        } else {
                            org = "Privada";

                        }

                        int idccc = Integer.parseInt(txtidCCC.getText().trim());
                        String var = "Ahorro";
                        fondo = Double.parseDouble(txtSaldoActual.getText());
                        cuot = Integer.parseInt(txtCuotas.getText());
                        System.out.println("Campo codigo: " + codigo);
                        System.out.println("Campo nit: " + nit);
                        System.out.println("Campo Representante: " + represent);
                        System.out.println("Campo Empleados: " + empl);
                        System.out.println("Campo tipo organizacion: " + org);
                        System.out.println("Campo tipo cuenta: " + var);
                        System.out.println("Campo numero idCCC: " + idccc);
                        System.out.println("Campo fondo: " + fondo);
                        System.out.println("Campo cuotas: " + cuot);

                        try {
                            Connection con = Conexion.getConexion();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO Org(codigo,nit, tipoOrg, representante,numEmpleados,idCCC,tipoCuenta,fondo,cuotas)VALUES (?,?,?,?,?,?,?,?,?)");
                            ps.setLong(1, codigo);
                            ps.setInt(2, nit);
                            ps.setString(3, org);
                            ps.setString(4, represent);
                            ps.setInt(5, empl);
                            ps.setInt(6, idccc);
                            ps.setString(7, var);
                            ps.setDouble(8, fondo);
                            ps.setInt(9, cuot);

                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Registro Exitoso");

                            txtNit.setText("");
                            txtRepresentante.setText("");
                            txtEmpleados.setText("");
                            btnGrup1.clearSelection();
                            comboxOrg.setSelectedIndex(0);
                            txtidCCC.setText("");
                            txtSaldoActual.setText("");
                            txtCuotas.setText("");

                            codigo++;
                            cargarTablaOrg();

                        } catch (SQLException e) {
                            JOptionPane.showConfirmDialog(null, e.toString());
                        }

                    } catch (NumberFormatException error) {

                        JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                    }
                } catch (NullPointerException error) {

                    JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
            }

            cuentaAhorro.dispose();

        }
    }//GEN-LAST:event_btnAceptarAhorrActionPerformed

    private void combxCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combxCuentaActionPerformed

        int opcion = combxCuenta.getSelectedIndex();
        if (opcion == 1) {
            this.getContentPane().setBackground(new Color(36, 36, 36));
            cuentaAhorro.setSize(336, 358);
            cuentaAhorro.setLocationRelativeTo(null);
            cuentaAhorro.setVisible(true);

        } else if (opcion == 2) {
            this.getContentPane().setBackground(new Color(36, 36, 36));
            cuentaCorriente.setSize(320, 305);
            cuentaCorriente.setLocationRelativeTo(null);
            cuentaCorriente.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cuenta");
        }
    }//GEN-LAST:event_combxCuentaActionPerformed

    private void btnCancelarAhorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAhorrActionPerformed

        txtidCCC.setText("");
        txtSaldoActual.setText("");
        txtCuotas.setText("");
        cuentaAhorro.dispose();
    }//GEN-LAST:event_btnCancelarAhorrActionPerformed

    private void btnCancelarCorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCorrActionPerformed
        txtidCCC1.setText("");
        txtSaldoCor.setText("");
        cuentaCorriente.dispose();
    }//GEN-LAST:event_btnCancelarCorrActionPerformed

    private void btnAceptarCorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCorrActionPerformed

        if (this.tabePestañas.getSelectedIndex() == 1) {
            if (!(txtNombre.getText().trim().equals("") && txtApellido.getText().trim().equals("") && txtIdentificacion.getText().trim().equals("") && fecha.getCalendar() == null && combxCuenta.getSelectedIndex() == 0 && txtidCCC1.getText().trim().equals("") && txtSaldoCor.getText().trim().equals(""))) { //comprueba si la cadena de entrada o campo de texto está vacía 

                try {

                    try {
                        //String codig = txtCodigo.getText().trim();
                        String nombre = txtNombre.getText().trim();
                        String apellido = txtApellido.getText().trim();
                        int identificacion = Integer.parseInt(txtIdentificacion.getText().trim());
                        Calendar fech = this.fecha.getCalendar();
                        String sexo;
                        if (chekFemenino.isSelected() == true) {

                            sexo = "Femenino";
                        } else if (chekMasculino.isSelected() == true) {
                            sexo = "Masculino";
                        } else {
                            sexo = "Femenino";

                        }

                        int idccc = Integer.parseInt(txtidCCC1.getText().trim());
                        String var = "Corriente";
                        fondo = Double.parseDouble(txtSaldoCor.getText());

                        // System.out.println("Campo codigo: " + codig);
                        System.out.println("Campo Identi: " + identificacion);
                        System.out.println("Campo Nombre: " + nombre);
                        System.out.println("Campo Apellido: " + apellido);
                        System.out.println("Campo fecha: " + fech);
                        System.out.println("Campo genero: " + sexo);
                        System.out.println("Campo numero idCCC: " + idccc);
                        System.out.println("Campo tipo de cuenta: " + var);
                        System.out.println("Campo fondo: " + fondo);

                        try {
                            Connection con = Conexion.getConexion();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO Persona(codigo,idPersona,nombre,apellido,fechaNaci,genero,idCCC,tipoCuenta,fondo)VALUES (?,?,?,?,?,?,?,?,?)");
                            ps.setLong(1, codigo);
                            ps.setInt(2, identificacion);
                            ps.setString(3, nombre);
                            ps.setString(4, apellido);
                            ps.setDate(5, new java.sql.Date(fech.getTimeInMillis()));
                            ps.setString(6, sexo);
                            ps.setInt(7, idccc);
                            ps.setString(8, var);
                            ps.setDouble(9, fondo);

                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Registro Exitoso");
                            this.codigo++;
                            //    txtCodigo.setText("");
                            txtNombre.setText("");
                            txtApellido.setText("");
                            txtIdentificacion.setText("");
                            fecha.setCalendar(null);
                            btnGrup.clearSelection();
                            combxCuenta.setSelectedIndex(0);
                            txtidCCC1.setText("");
                            txtSaldoCor.setText("");

                            cargarTabla();

                        } catch (SQLException e) {
                            JOptionPane.showConfirmDialog(null, e.toString());
                        }

                    } catch (NumberFormatException error) {

                        JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                    }
                } catch (NullPointerException error) {

                    JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
            }

            cuentaCorriente.dispose();
        } else if (this.tabePestañas.getSelectedIndex() == 2) {

            if (!(txtNit.getText().trim().equals("") && txtRepresentante.getText().trim().equals("") && txtEmpleados.getText().trim().equals("") && comboxOrg.getSelectedIndex() == 0 && txtidCCC1.getText().trim().equals("") && txtSaldoCor.getText().trim().equals(""))) { //comprueba si la cadena de entrada o campo de texto está vacía 

                try {

                    try {

                        int nit = Integer.parseInt(txtNit.getText().trim());
                        String represent = txtRepresentante.getText().trim();
                        int empl = Integer.parseInt(txtEmpleados.getText().trim());

                        String org;
                        if (checkPrivada.isSelected() == true) {

                            org = "Privada";
                        } else if (checkPublica.isSelected() == true) {
                            org = "Publica";
                        } else {
                            org = "Privada";

                        }

                        int idccc = Integer.parseInt(txtidCCC1.getText().trim());
                        String var = "Corriente";
                        Double fond = Double.parseDouble(txtSaldoCor.getText());
                        System.out.println("Campo codigo: " + codigo);
                        System.out.println("Campo nit: " + nit);
                        System.out.println("Campo Representante: " + represent);
                        System.out.println("Campo Empleados: " + empl);
                        System.out.println("Campo tipo organizacion: " + org);
                        System.out.println("Campo tipo cuenta: " + var);
                        System.out.println("Campo numero idCCC: " + idccc);
                        System.out.println("Campo fondo: " + fond);

                        try {
                            Connection con = Conexion.getConexion();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO Org(codigo,nit, tipoOrg, representante,numEmpleados,idCCC,tipoCuenta,fondo)VALUES (?,?,?,?,?,?,?,?)");
                            ps.setLong(1, codigo);
                            ps.setInt(2, nit);
                            ps.setString(3, org);
                            ps.setString(4, represent);
                            ps.setInt(5, empl);
                            ps.setInt(6, idccc);
                            ps.setString(7, var);
                            ps.setDouble(8, fond);

                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Registro Exitoso");

                            codigo++;

                            txtNit.setText("");
                            txtRepresentante.setText("");
                            txtEmpleados.setText("");
                            btnGrup1.clearSelection();
                            comboxOrg.setSelectedIndex(0);
                            txtidCCC1.setText("");
                            txtSaldoCor.setText("");

                            cargarTablaOrg();

                        } catch (SQLException e) {
                            JOptionPane.showConfirmDialog(null, e.toString());
                        }

                    } catch (NumberFormatException error) {

                        JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                    }
                } catch (NullPointerException error) {

                    JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
            }

            cuentaCorriente.dispose();
        }
    }//GEN-LAST:event_btnAceptarCorrActionPerformed

    private void txtSaldoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoCorActionPerformed

    }//GEN-LAST:event_txtSaldoCorActionPerformed

    private void btnEliminarOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarOrgActionPerformed

        int fila = tablaOrg.getSelectedRow();
        int nit = Integer.parseInt(tablaOrg.getValueAt(fila, 0).toString());

        try {

            try {
                //     int nit = Integer.parseInt(txtNit.getText());

                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("DELETE FROM Org  WHERE nit=?");
                ps.setInt(1, nit);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
//
//                txtNit.setText("");
//                btnGrup1.clearSelection();
//                txtRepresentante.setText("");
//                txtEmpleados.setText("");
//                comboxOrg.setSelectedIndex(0);

                cargarTablaOrg();

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e.toString());
            }
        } catch (NumberFormatException error) {

            JOptionPane.showMessageDialog(null, "Ocurre un Error");
        }


    }//GEN-LAST:event_btnEliminarOrgActionPerformed

    private void comboxOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxOrgActionPerformed

        int opcion = comboxOrg.getSelectedIndex();
        if (opcion == 1) {
            this.getContentPane().setBackground(new Color(36, 36, 36));
            cuentaAhorro.setSize(336, 358);
            cuentaAhorro.setLocationRelativeTo(null);
            cuentaAhorro.setVisible(true);

        } else if (opcion == 2) {
            this.getContentPane().setBackground(new Color(36, 36, 36));
            cuentaCorriente.setSize(320, 305);
            cuentaCorriente.setLocationRelativeTo(null);
            cuentaCorriente.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cuenta");
        }


    }//GEN-LAST:event_comboxOrgActionPerformed

    private void btnGuardarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSuActionPerformed

        if (!(txtNombreSuc.getText().trim().isEmpty() && txtDireccSuc.getText().trim().isEmpty() && txtCodigoPosSuc.getText().trim().isEmpty() && comboCiudad.getSelectedIndex() == 0)) { //comprueba si la cadena de entrada o campo de texto está vacía 

            try {
                String nombre = txtNombreSuc.getText().trim();
                String direc = txtDireccSuc.getText().trim();
                int codigo = Integer.parseInt(txtCodigoPosSuc.getText().trim());
                String ciudad = "";
                int opcion = comboCiudad.getSelectedIndex();
                if (opcion == 1) {
                    ciudad = "Cartagena";
                } else if (opcion == 2) {
                    ciudad = "Barranquilla";
                } else if (opcion == 3) {
                    ciudad = "Medellin";
                } else {
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar un Dato ");
                }

                System.out.println("Campo Mombre: " + nombre);
                System.out.println("Campo Direccion: " + direc);
                System.out.println("Campo Codigo Postal: " + codigo);
                System.out.println("Campo Ciudad: " + ciudad);

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Sucursales(nombre, direccion,codigoPostal, ciudad)VALUES (?,?,?,?)");
                    ps.setString(1, nombre);
                    ps.setString(2, direc);
                    ps.setInt(3, codigo);
                    ps.setString(4, ciudad);

                    ps.executeUpdate();
                    Icon icono = new ImageIcon(getClass().getResource("exito.png"));
                    JOptionPane.showMessageDialog(rootPane, "Registro Exitoso", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

                    txtNombreSuc.setText("");
                    txtDireccSuc.setText("");
                    txtCodigoPosSuc.setText("");
                    comboCiudad.setSelectedIndex(0);

                    cargarTablaSucursal();

                } catch (SQLException e) {
                    JOptionPane.showConfirmDialog(null, e.toString());
                }

            } catch (NumberFormatException error) {

                JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
        }
    }//GEN-LAST:event_btnGuardarSuActionPerformed

    private void tablaOrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrgMouseClicked

//        try {
//            int fila = tablaOrg.getSelectedRow();
//            int nit = Integer.parseInt(tablaOrg.getValueAt(fila, 0).toString());
//            PreparedStatement ps;
//            ResultSet rs;
//
//            Connection con = Conexion.getConexion();
//            ps = con.prepareStatement("SELECT  tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org WHERE  nit=?");
//            ps.setInt(1, nit);
//            rs = ps.executeQuery(); //aqui ejecutamos la consulta
//
//            while (rs.next()) {
////                txtNombre.setText(rs.getString("nombre"));
////                txtApellido.setText(rs.getString("apellido"));
//                txtNit.setText(String.valueOf(nit));
//                //fecha.setText(rs.toString(fech));
//
////                if (rs.getString("genero").equals("Femenino")) {
////                    chekFemenino.setSelected(true);
////                } else if (rs.getString("genero").equals("Masculino")) {
////                    chekMasculino.setSelected(true);
////                }
//                //  combxCuenta.setText(String.valueOf(tipocuenta));
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, ex.toString());
//        }

    }//GEN-LAST:event_tablaOrgMouseClicked

    private void btnLimpiarOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarOrgActionPerformed

        txtNit.setText("");
        btnGrup1.clearSelection();
        txtRepresentante.setText("");
        txtEmpleados.setText("");
        comboxOrg.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarOrgActionPerformed

    private void btnLimpiarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSuActionPerformed
        txtNombreSuc.setText("");
        txtDireccSuc.setText("");
        txtCodigoPosSuc.setText("");
        comboCiudad.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarSuActionPerformed

    private void btnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEActionPerformed

        if (!(txtDni1.getText().trim().equals("") && txtNombreE.getText().trim().equals("") && txtApellidoE.getText().trim().equals("") && fechaEmp.getCalendar() == null && txtSucursal.getText().trim().equals(""))) { //comprueba si la cadena de entrada o campo de texto está vacía 

            try {

                try {
                    int dni = Integer.parseInt(txtDni1.getText().trim());
                    String nombre = txtNombreE.getText().trim();
                    String apellido = txtApellidoE.getText().trim();
                    Calendar fech = this.fechaEmp.getCalendar();
                    String sexo;
                    if (butonF.isSelected() == true) {

                        sexo = "Femenino";
                    } else if (butonM.isSelected() == true) {
                        sexo = "Masculino";
                    } else {
                        sexo = "Femenino";

                    }
                    int sucur = Integer.parseInt(txtSucursal.getText());

                    System.out.println("Campo DNI: " + dni);
                    System.out.println("Campo Nombre: " + nombre);
                    System.out.println("Campo Apellido: " + apellido);
                    System.out.println("Campo fecha: " + fech);
                    System.out.println("Campo genero: " + sexo);
                    System.out.println("Campo numero Sucursal: " + sucur);

                    try {
                        Connection con = Conexion.getConexion();
                        PreparedStatement ps = con.prepareStatement("INSERT INTO Empleado(dni,nombre,apellido,fecha,genero,sucursal)VALUES (?,?,?,?,?,?)");
                        ps.setInt(1, dni);
                        ps.setString(2, nombre);
                        ps.setString(3, apellido);
                        ps.setDate(4, new java.sql.Date(fech.getTimeInMillis()));
                        ps.setString(5, sexo);
                        ps.setInt(6, sucur);

                        ps.executeUpdate();
                        Icon icono = new ImageIcon(getClass().getResource("exito.png"));
                        JOptionPane.showMessageDialog(rootPane, "Registro Exitoso", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

                        txtDni1.setText("");
                        txtNombreE.setText("");
                        txtApellidoE.setText("");
                        fechaEmp.setCalendar(null);
                        btnGrup2.clearSelection();
                        txtSucursal.setText("");

                        cargarTablaEmpleado();

                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e.toString());
                    }

                } catch (NumberFormatException error) {

                    JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
                }
            } catch (NullPointerException error) {

                JOptionPane.showMessageDialog(null, "Verifique Bien los Campos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos Los Campos Son Obligatorios");
        }


    }//GEN-LAST:event_btnGuardarEActionPerformed

    private void btnLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEActionPerformed
        txtDni1.setText("");
        txtNombreE.setText("");
        txtApellidoE.setText("");
        fechaEmp.setCalendar(null);
        btnGrup2.clearSelection();
        txtSucursal.setText("");


    }//GEN-LAST:event_btnLimpiarEActionPerformed

    private void tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoMouseClicked

//        try {
//            int fila = tablaEmpleado.getSelectedRow();
//            int dni = Integer.parseInt(tablaEmpleado.getValueAt(fila, 0).toString());
//            PreparedStatement ps;
//            ResultSet rs;
//
//            Connection con = Conexion.getConexion();
//            ps = con.prepareStatement("SELECT  codigo,nombre,apellido,fecha,genero,sucursal FROM Empleado WHERE dni=?");
//            ps.setInt(1, dni);
//            rs = ps.executeQuery(); //aqui ejecutamos la consulta
//
//            while (rs.next()) {
////                txtNombre.setText(rs.getString("nombre"));
////                txtApellido.setText(rs.getString("apellido"));
//                txtDni1.setText(String.valueOf(dni));
//                //fecha.setText(rs.toString(fech));
//
////                if (rs.getString("genero").equals("Femenino")) {
////                    chekFemenino.setSelected(true);
////                } else if (rs.getString("genero").equals("Masculino")) {
////                    chekMasculino.setSelected(true);
////                }
//                //  combxCuenta.setText(String.valueOf(tipocuenta));
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, ex.toString());
//        }
//

    }//GEN-LAST:event_tablaEmpleadoMouseClicked

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed

        int fila = tablaEmpleado.getSelectedRow();
        int dni = Integer.parseInt(tablaEmpleado.getValueAt(fila, 0).toString());

        try {

            try {

                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("DELETE FROM Empleado  WHERE dni=?");
                ps.setInt(1, dni);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");

//                txtDni1.setText("");
//                txtNombreE.setText("");
//                txtApellidoE.setText("");
//                fechaEmp.setCalendar(null);
//                btnGrup2.clearSelection();
//                txtSucursal.setText("");
                cargarTablaEmpleado();

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e.toString());
            }
        } catch (NumberFormatException error) {

            JOptionPane.showMessageDialog(null, "Ocurre un Error");
        }


    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void btnBuscarAmortiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAmortiActionPerformed

        modeloAmortizacion.setRowCount(0);
        try {
            buscar = Integer.parseInt(txtBuscar.getText());
            if (txtBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El Campo No Puede Estar Vacio");
            } else {

                int opcion = comboAmorti.getSelectedIndex();
                if (opcion == 1) {
                    tablaAmortizacion.removeAll();
                    tablaAmortizacion.repaint();
                    amortizacion("Persona");

                } else if (opcion == 2) {
                    tablaAmortizacion.removeAll();
                    tablaAmortizacion.repaint();
                    amortizacion("Org");

                } else {
                    tablaAmortizacion.removeAll();
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cuenta");
                }

                System.out.println("Fondo: " + fondo + " - Cuotas: " + cuot);
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Los Campos No Pueden Estar Vacios");
        }
    }//GEN-LAST:event_btnBuscarAmortiActionPerformed

    private void comboFiltrarPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltrarPersActionPerformed

        int opcion = comboFiltrarPers.getSelectedIndex();
        if (opcion == 1) {

            cargarTablaFiltroPersonaAhorr();
        } else if (opcion == 2) {
            cargarTablaFiltroPersonaCorr();
        } else if (opcion == 3) {
            cargarTablaFiltroPersonaFemeni();
        } else if (opcion == 4) {
            cargarTablaFiltroPersonaMascul();
        } else if (opcion == 5) {
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Dato ");
        }

    }//GEN-LAST:event_comboFiltrarPersActionPerformed

    private void comboFiltroOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroOrgActionPerformed
        int opcion = comboFiltroOrg.getSelectedIndex();
        if (opcion == 1) {
            cargarTablaOrgFiltroPriv();
        } else if (opcion == 2) {
            cargarTablaOrgFiltroPubli();
        } else if (opcion == 3) {
            cargarTablaOrgFiltroAhorr();
        } else if (opcion == 4) {
            cargarTablaOrgFiltroCorri();
        } else if (opcion == 5) {
            cargarTablaOrg();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Dato ");
        }
    }//GEN-LAST:event_comboFiltroOrgActionPerformed

    private void comboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCiudadActionPerformed

    private void comboFiltroSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroSucActionPerformed
        int opcion = comboFiltroOrg.getSelectedIndex();
        if (opcion == 1) {
            cargarTablaSucursalFiltroCart();
        } else if (opcion == 2) {
            cargarTablaSucursalFiltroBarr();
        } else if (opcion == 3) {
            cargarTablaSucursalFiltroMedell();
        } else if (opcion == 4) {
            cargarTablaSucursal();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Dato ");

        }
    }//GEN-LAST:event_comboFiltroSucActionPerformed

    private void comboFiltroEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroEmpleActionPerformed
        int opcion = comboFiltroEmple.getSelectedIndex();
        if (opcion == 1) {
            cargarTablaEmpleadoFiltroFemen();
        } else if (opcion == 2) {
            cargarTablaEmpleadoFiltroMascu();
        } else if (opcion == 3) {
            cargarTablaEmpleado();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Dato ");

        }
    }//GEN-LAST:event_comboFiltroEmpleActionPerformed

    private void comboAmortiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAmortiActionPerformed

    }//GEN-LAST:event_comboAmortiActionPerformed

    private void btnEliminarSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSucActionPerformed
        int fila = tablaSucursal.getSelectedRow();
        int codi = Integer.parseInt(tablaSucursal.getValueAt(fila, 0).toString());

        try {

            try {

                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("DELETE FROM Sucursales WHERE codigo=?");
                ps.setInt(1, codi);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");

//                txtDni1.setText("");
//                txtNombreE.setText("");
//                txtApellidoE.setText("");
//                fechaEmp.setCalendar(null);
//                btnGrup2.clearSelection();
//                txtSucursal.setText("");
                cargarTablaEmpleado();

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e.toString());
            }
        } catch (NumberFormatException error) {

            JOptionPane.showMessageDialog(null, "Ocurre un Error");
        }


    }//GEN-LAST:event_btnEliminarSucActionPerformed
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPersona.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT codigo, idPersona, nombre, apellido,fechaNaci,genero,cuentaNum,tipoCuenta FROM Persona");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaOrg() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaOrg.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nit, tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaEmpleado() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEmpleado.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT dni,nombre,apellido,fecha,genero,sucursal FROM Empleado");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaSucursal() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaSucursal.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT * FROM Sucursales");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

        //tablaSucursal
    }

    private void amortizacion(String pers) {

        System.out.println("Amortización");
        PreparedStatement ps;
        ResultSet rs;
        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select fondo, cuotas From " + pers);

            rs = ps.executeQuery();

            while (rs.next()) {

                fondo = rs.getDouble("fondo");
                cuot = rs.getInt("cuotas");
            }

            if (cuot > 0) {

                int e = 0;
                double anual = 0.05 / 12;
                double pagos1 = fondo * anual / (1 - (Math.pow((1 + anual), -cuot)));
                // double cuotas = pagos1 - ( fondo / cuot);

                while (this.cuot != e) {

                    Object[] filas = new Object[this.cuot];

                    double interes = 0;
                    double capital = 0;

                    if (e != 0) {
                        interes = fondo * anual;
                        capital = pagos1 - interes;
                        fondo -= pagos1;
                    }
                    filas[0] = e;
                    filas[1] = cortar.format((fondo <= 0) ? 0 : fondo);
                    filas[2] = (e == 0) ? 0 : cortar.format(pagos1);
                    filas[3] = cortar.format(interes);
                    filas[4] = cortar.format(capital);
                    filas[5] = cortar.format((fondo <= 0) ? 0 : fondo);

                    e++;
                    modeloAmortizacion.addRow(filas);
                }

                for (int i = 0; i < 10; i++) {

                    Object[] filas = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,};
                    modeloAmortizacion.addRow(filas);
                }

                txtBuscar.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "La busqueda no tubo exito", "ERROR!", JOptionPane.ERROR_MESSAGE);

                txtBuscar.setText("");

            }

            System.out.println("Fondo: " + (int) fondo + " - Cuotas: " + (int) cuot);
            var contador = 1;
            while (rs.next()) {

                if (contador == 1) {
                    fondo = rs.getDouble("fondo");
                    cuot = rs.getInt("cuotas");

                }

                contador++;

            }

        } catch (SQLException exception) {

        }
    }

    //filtrar persona
    private void cargarTablaFiltroPersonaAhorr() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPersona.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT codigo, idPersona, nombre, apellido,fechaNaci,genero,cuentaNum,tipoCuenta FROM Persona WHERE  tipoCuenta='Ahorro' ");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaFiltroPersonaCorr() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPersona.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT codigo, idPersona, nombre, apellido,fechaNaci,genero,cuentaNum,tipoCuenta FROM Persona WHERE  tipoCuenta='Corriente' ");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaFiltroPersonaFemeni() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPersona.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT codigo, idPersona, nombre, apellido,fechaNaci,genero,cuentaNum,tipoCuenta FROM Persona WHERE  genero='Femenino' ");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaFiltroPersonaMascul() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPersona.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT codigo, idPersona, nombre, apellido,fechaNaci,genero,cuentaNum,tipoCuenta FROM Persona WHERE  genero='Masculino' ");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaOrgFiltroPriv() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaOrg.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nit, tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org  WHERE tipoOrg='Privada'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaOrgFiltroPubli() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaOrg.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nit, tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org  WHERE tipoOrg='Publica'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaOrgFiltroAhorr() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaOrg.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nit, tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org  WHERE tipoCuenta='Ahorro'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaOrgFiltroCorri() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaOrg.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nit, tipoOrg, representante,numEmpleados,cuentaNum,tipoCuenta FROM Org  WHERE tipoCuenta='Corriente'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaSucursalFiltroCart() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaSucursal.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT * FROM Sucursales where ciudad='Cartagena'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
    }

    private void cargarTablaSucursalFiltroBarr() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaSucursal.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT * FROM Sucursales where ciudad='Barranquilla'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
    }

    private void cargarTablaSucursalFiltroMedell() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaSucursal.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT * FROM Sucursales where ciudad='Medellin'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
    }

    private void cargarTablaEmpleadoFiltroFemen() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEmpleado.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT dni,nombre,apellido,fecha,genero,sucursal FROM Empleado where genero='Femenino'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

    private void cargarTablaEmpleadoFiltroMascu() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEmpleado.getModel(); // esta linea es para que obtenga el diseño que ya tiene la tabla
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT dni,nombre,apellido,fecha,genero,sucursal FROM Empleado where genero='Masculino'");
            rs = ps.executeQuery(); //aqui ejecutamos la consulta
            rsmd = rs.getMetaData(); // esto es para que nos traiga los meta datos de la consulta
            columnas = rsmd.getColumnCount(); // aqui verificamos cuantas columnas trae la consulta

            while (rs.next()) { // aqui extraemos los datos de la consulta
                Object[] fila = new Object[columnas];//creamos un objeto que sirva como contenedor para que pueda agregar a las filas de la tabla
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1); //aqui llenamos el objeto,para obtener cada uno de los datos de la consulta
                    //(i+1) es porque i se inicializo en cero y la consulta no se inicia en cero, a diferencia del arreglo 

                }

                modeloTabla.addRow(fila); // asignamos o agregamos todas las filas que tengamos en el for

            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarAhorr;
    private javax.swing.JButton btnAceptarCorr;
    private javax.swing.JButton btnBuscarAmorti;
    private javax.swing.JButton btnCancelarAhorr;
    private javax.swing.JButton btnCancelarCorr;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JButton btnEliminarOrg;
    private javax.swing.JButton btnEliminarSuc;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.ButtonGroup btnGrup1;
    private javax.swing.ButtonGroup btnGrup2;
    private javax.swing.JButton btnGuardarE;
    private javax.swing.JButton btnGuardarSu;
    private javax.swing.JButton btnLimipiar;
    private javax.swing.JButton btnLimpiarE;
    private javax.swing.JButton btnLimpiarOrg;
    private javax.swing.JButton btnLimpiarSu;
    private javax.swing.JRadioButton butonF;
    private javax.swing.JRadioButton butonM;
    private javax.swing.JRadioButton checkPrivada;
    private javax.swing.JRadioButton checkPublica;
    private javax.swing.JRadioButton chekFemenino;
    private javax.swing.JRadioButton chekMasculino;
    private javax.swing.JComboBox<String> comboAmorti;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboFiltrarPers;
    private javax.swing.JComboBox<String> comboFiltroEmple;
    private javax.swing.JComboBox<String> comboFiltroOrg;
    private javax.swing.JComboBox<String> comboFiltroSuc;
    private javax.swing.JComboBox<String> comboxOrg;
    private javax.swing.JComboBox<String> combxCuenta;
    private javax.swing.JDialog cuentaAhorro;
    private javax.swing.JDialog cuentaCorriente;
    private javax.swing.JLabel etiCerrar;
    private javax.swing.JLabel etiMinimizar;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fechaEmp;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelPersona;
    private javax.swing.JPanel pnalecuenta;
    private javax.swing.JTabbedPane tabePestañas;
    private javax.swing.JTable tablaAmortizacion;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTable tablaOrg;
    private javax.swing.JTable tablaPersona;
    private javax.swing.JTable tablaSucursal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoPosSuc;
    private javax.swing.JTextField txtCuotas;
    private javax.swing.JTextField txtDireccSuc;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtEmpleados;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreSuc;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtSaldoActual;
    private javax.swing.JTextField txtSaldoCor;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtidCCC;
    private javax.swing.JTextField txtidCCC1;
    // End of variables declaration//GEN-END:variables
}
