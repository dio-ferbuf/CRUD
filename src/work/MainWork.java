package work;

import checkServer.connectToServer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;import java.awt.Toolkit;
;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MainWork extends javax.swing.JFrame {         
    connectToServer connec = new connectToServer();      
    Connection conn;
    int iH, iA, iE, iD, iS, i, clickSchool, clickDepart, clickEditSchool, clickEditDepart, clickDelSch, clickDelDepart;
    boolean checkEmail, checkUsername, checkAddresse, checkGender,checkTelp, checkPicture = false, checkEdit = false,
            checkEditWithSave = false;
    boolean checkAddID = false, checkAddName = false, checkAddAddresse = false,
            checkAddGender = false, checkAddSchool = false, checkAddDepartment = false;
    boolean isClickSchool = false, isClickSMK1Tlng = false, isClickSMK2Klt = false, isClickSMA1Krng = false, afterClickSchool = false;
    boolean checkEditID, checkEditName, checkEditAddresse,
            checkEditGender, checkEditSchool, checkEditDepartment;
    boolean isClickCbSchDprt, afterClickEditSchool, isClickEditSMK1Tlng, isClickEditSMK2Klt, isClickEditSMA1Krng;
    boolean checkDelID, checkDelName, checkDelAddresse, 
            checkDelGender, checkDelSch, checkDelDepart;
    boolean isClickRbDelSchDprt, afterClickDelSch, isClickDelSMK1Tlng, isClickDelSMK2Klt, isClickDelSMA1Krng;
    String gender,url ="", pathFileInHere = new File("person.png").getAbsolutePath();    
    StringBuffer addGender, addDepart, editGender, editDepart, editID, editName, editAddresse, editSchool;
    StringBuffer delID, delName, delAddresse, delGender, delSchool, delDepart;
    String []  data = {"ID","Name","Addresse","Gender","School","Department"};
    DefaultTableModel modelTable, modelTable2;
    public MainWork() throws SQLException {
        
        // connect to server
        connec.connect();
        
        // ------
        initComponents();
        setBackground(new Color(0,0,0,0));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/student.png")));
        
        
        // -----
        iH = 1;
        pnlHome.setBackground(new Color(204, 0, 51));
        // menghilangkan text kursor otomatis muncul
        pnlBigHome.setFocusable(true);
        // ubah background mnjd transparant
        txtFUsername.setBackground(new Color(0, 0, 0, 1));
                
        txtFEmail.setText(Login.EMAIL);        
        modelTable = new DefaultTableModel(data, 0);
        modelTable2 = new DefaultTableModel(data, 0);
        tblAdd.setModel(modelTable);
        tblEdit.setModel(modelTable);
        tblDelete.setModel(modelTable);
        showData();
        tblSearch.setModel(modelTable);        
        pnlBigEdit.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupGender = new javax.swing.ButtonGroup();
        rbGroupAddGender = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        pnlSmallTab = new javax.swing.JPanel();
        pnlSearch = new javax.swing.JPanel();
        lblTxtSearch = new javax.swing.JLabel();
        lblIconSearch = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        lblTxtHome = new javax.swing.JLabel();
        lblIconHome = new javax.swing.JLabel();
        pnlAdd = new javax.swing.JPanel();
        lblIconAdd = new javax.swing.JLabel();
        lblTxtAdd = new javax.swing.JLabel();
        pnlEdit = new javax.swing.JPanel();
        lblIconEdit = new javax.swing.JLabel();
        lblTxtEdit = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        lblIconDelete = new javax.swing.JLabel();
        lblTxtDelete = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlBigTab = new javax.swing.JPanel();
        pnlBigHome = new javax.swing.JPanel();
        lblEditPicture = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtFUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAAddresse = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        lblNoticeUsername = new javax.swing.JLabel();
        lblNoticeUsernameIcon = new javax.swing.JLabel();
        lblNoticeTelpIcon = new javax.swing.JLabel();
        lblNoticeTelp = new javax.swing.JLabel();
        pnlEditProfile = new javax.swing.JPanel();
        lblEditProfile = new javax.swing.JLabel();
        lblNoticeAddresseIcon = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txtFEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNoticeGenderIcon = new javax.swing.JLabel();
        lblNoticeAddresse = new javax.swing.JLabel();
        lblNoticeEmailIcon = new javax.swing.JLabel();
        lblNoticeEmail = new javax.swing.JLabel();
        lblNoticeGender = new javax.swing.JLabel();
        pnlSaveProfile = new javax.swing.JPanel();
        lblSaveProfile = new javax.swing.JLabel();
        txtFTelp = new javax.swing.JTextField();
        txtFUsername1 = new javax.swing.JTextField();
        pnlBigEdit = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEdit = new javax.swing.JTable();
        cbEditSchDepart = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        cbAddresse = new javax.swing.JCheckBox();
        cbName = new javax.swing.JCheckBox();
        rbcWthRow = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        txtFEditID = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtFEditName = new javax.swing.JTextField();
        txtAEditAddresse = new javax.swing.JTextArea();
        jSeparator10 = new javax.swing.JSeparator();
        pnlEditDepart = new javax.swing.JPanel();
        lblEditDepart = new javax.swing.JLabel();
        lblEditDepartIcon = new javax.swing.JLabel();
        pnlEditSchool = new javax.swing.JPanel();
        lblEditSchool = new javax.swing.JLabel();
        lblEditSchoolIcon = new javax.swing.JLabel();
        pnlEditBackSchool = new javax.swing.JPanel();
        pnlEditSchoolSMK1Tlng = new javax.swing.JPanel();
        lblEditSchoolSMK1Tlng = new javax.swing.JLabel();
        pnlEditSchoolSMK2Klt = new javax.swing.JPanel();
        lblEditSchoolSMK2Klt = new javax.swing.JLabel();
        pnlEditSchoolSMA1Krng = new javax.swing.JPanel();
        lblEditSchoolSMA1Karng = new javax.swing.JLabel();
        cbGender = new javax.swing.JCheckBox();
        rbEditMale = new javax.swing.JRadioButton();
        rbEditFemale = new javax.swing.JRadioButton();
        pnlEditBackDepart1 = new javax.swing.JPanel();
        pnlEditDepartATR = new javax.swing.JPanel();
        lblEditDepartATR = new javax.swing.JLabel();
        pnlEditDepartTKJ = new javax.swing.JPanel();
        lblEditDepartTKJ = new javax.swing.JLabel();
        pnlEditDepartTKR = new javax.swing.JPanel();
        lblEditDepartTKR = new javax.swing.JLabel();
        pnlEditBackDepart2 = new javax.swing.JPanel();
        pnlEditDepartTMPO = new javax.swing.JPanel();
        lblEditDepartTMPO = new javax.swing.JLabel();
        pnlEditDepartDPIB = new javax.swing.JPanel();
        lblEditDepartDPIB = new javax.swing.JLabel();
        pnlEditEdit = new javax.swing.JPanel();
        lblEditEdit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlBigDelete = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDelete = new javax.swing.JTable();
        rbDelID = new javax.swing.JRadioButton();
        rbDelName = new javax.swing.JRadioButton();
        rbDelAddresse = new javax.swing.JRadioButton();
        rbDelSchDprt = new javax.swing.JRadioButton();
        txtFDelName = new javax.swing.JTextField();
        txtFDelID = new javax.swing.JTextField();
        txtADelAddresse = new javax.swing.JTextArea();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        pnlDelBackDepart1 = new javax.swing.JPanel();
        pnlDelDepartATR = new javax.swing.JPanel();
        lblDelDepartATR = new javax.swing.JLabel();
        pnlDelDepartTKJ = new javax.swing.JPanel();
        lblDelDepartTKJ = new javax.swing.JLabel();
        pnlDelDepartTKR = new javax.swing.JPanel();
        lblDelDepartTKR = new javax.swing.JLabel();
        pnlDelBackSch = new javax.swing.JPanel();
        pnlDelSchSMK1Tlng = new javax.swing.JPanel();
        lblDelSchSMK1Tlng = new javax.swing.JLabel();
        pnlDelSchSMK2Klt = new javax.swing.JPanel();
        lblDelSchSMK2Klt = new javax.swing.JLabel();
        pnlDelSchSMA1Krng = new javax.swing.JPanel();
        lblDelSchSMA1Krng = new javax.swing.JLabel();
        rbDelGender = new javax.swing.JRadioButton();
        cbDelGenderMale = new javax.swing.JCheckBox();
        cbDelGenderFemale = new javax.swing.JCheckBox();
        pnlDelDepart = new javax.swing.JPanel();
        lblDelDepart = new javax.swing.JLabel();
        lblDelDepartIcon = new javax.swing.JLabel();
        pnlDelSch = new javax.swing.JPanel();
        lblDelSch = new javax.swing.JLabel();
        lblDelSchIcon = new javax.swing.JLabel();
        pnlDelBackDepart2 = new javax.swing.JPanel();
        pnlDelDepartTMPO = new javax.swing.JPanel();
        lblDelDepartTMPO = new javax.swing.JLabel();
        pnlDelDepartDPIB = new javax.swing.JPanel();
        lblDelDepartDPIB = new javax.swing.JLabel();
        pnlDelDelete = new javax.swing.JPanel();
        lblDelDelete = new javax.swing.JLabel();
        pnlBigAdd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdd = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        pnlBackgroundAddSchool = new javax.swing.JPanel();
        pnlAddSchoolSM1Tlng = new javax.swing.JPanel();
        lblAddSchoolSMK1Tlng = new javax.swing.JLabel();
        pnlAddSchoolSMK2Klt = new javax.swing.JPanel();
        lblAddSchoolSMK2Klt = new javax.swing.JLabel();
        pnlAddSchoolSMA1Krng = new javax.swing.JPanel();
        lblAddSchoolSMKN1Karng = new javax.swing.JLabel();
        rbAddGenderMale = new javax.swing.JRadioButton();
        rbAddGenderFemale = new javax.swing.JRadioButton();
        txtFAddName = new javax.swing.JTextField();
        txtFAddDepartment = new javax.swing.JTextField();
        txtAAddAddresse = new javax.swing.JTextArea();
        txtFAddID = new javax.swing.JTextField();
        pnlAddAdd = new javax.swing.JPanel();
        lblAdd = new javax.swing.JLabel();
        lblNoticeAddDepartment = new javax.swing.JLabel();
        lblNoticeAddID = new javax.swing.JLabel();
        lblNoticeAddName = new javax.swing.JLabel();
        lblNoticeAddAddresse = new javax.swing.JLabel();
        lblNoticeAddGender = new javax.swing.JLabel();
        lblNoticeAddSchool = new javax.swing.JLabel();
        pnlAddSchool = new javax.swing.JPanel();
        lblAddSchool = new javax.swing.JLabel();
        lblAddSchoolIcon = new javax.swing.JLabel();
        pnlAddDepart = new javax.swing.JPanel();
        lblAddDepart = new javax.swing.JLabel();
        lblAddDepartIcon = new javax.swing.JLabel();
        pnlBackDepartSMK1Tlng = new javax.swing.JPanel();
        pnlDepartTKR = new javax.swing.JPanel();
        lblDepartATR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlDepartTKJ = new javax.swing.JPanel();
        lblDepartTKJ = new javax.swing.JLabel();
        pnlDepartATR = new javax.swing.JPanel();
        lblDepartTKR = new javax.swing.JLabel();
        pnlBackDepartSMK2Klt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDepartTMPO = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDepartDPIB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlBigSearch = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        rbSrchID = new javax.swing.JRadioButton();
        rbSrchName = new javax.swing.JRadioButton();
        rbSrchGender = new javax.swing.JRadioButton();
        txtFSrchName = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtFSrchID = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        cbSrchMale = new javax.swing.JCheckBox();
        cbSrchFemale = new javax.swing.JCheckBox();
        pnlSrch = new javax.swing.JPanel();
        lblSrch = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        pnlClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlBackground.setBackground(new java.awt.Color(101, 46, 14));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSmallTab.setBackground(new java.awt.Color(101, 46, 14));
        pnlSmallTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSearch.setBackground(new java.awt.Color(101, 46, 14));

        lblTxtSearch.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTxtSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtSearch.setText("   Search");
        lblTxtSearch.setToolTipText("");
        lblTxtSearch.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTxtSearch.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTxtSearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTxtSearchMouseDragged(evt);
            }
        });
        lblTxtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTxtSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTxtSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTxtSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTxtSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTxtSearchMouseReleased(evt);
            }
        });

        lblIconSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Search_35px.png"))); // NOI18N
        lblIconSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconSearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIconSearchMouseDragged(evt);
            }
        });
        lblIconSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconSearchMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addComponent(lblIconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSmallTab.add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 250, 50));

        pnlHome.setBackground(new java.awt.Color(101, 46, 14));

        lblTxtHome.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTxtHome.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTxtHome.setText("   Home");
        lblTxtHome.setToolTipText("");
        lblTxtHome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTxtHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTxtHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTxtHomeMouseDragged(evt);
            }
        });
        lblTxtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTxtHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTxtHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTxtHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTxtHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTxtHomeMouseReleased(evt);
            }
        });

        lblIconHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Home_35px.png"))); // NOI18N
        lblIconHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIconHomeMouseDragged(evt);
            }
        });
        lblIconHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconHomeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(lblIconHome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTxtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTxtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSmallTab.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 50));

        pnlAdd.setBackground(new java.awt.Color(101, 46, 14));

        lblIconAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_List_35px.png"))); // NOI18N
        lblIconAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconAdd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIconAddMouseDragged(evt);
            }
        });
        lblIconAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconAddMouseReleased(evt);
            }
        });

        lblTxtAdd.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTxtAdd.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtAdd.setText("   Add");
        lblTxtAdd.setToolTipText("");
        lblTxtAdd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTxtAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTxtAdd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTxtAddMouseDragged(evt);
            }
        });
        lblTxtAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTxtAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTxtAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTxtAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTxtAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTxtAddMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSmallTab.add(pnlAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 50));

        pnlEdit.setBackground(new java.awt.Color(101, 46, 14));

        lblIconEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Edit_Property_35px.png"))); // NOI18N
        lblIconEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconEdit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIconEditMouseDragged(evt);
            }
        });
        lblIconEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconEditMouseReleased(evt);
            }
        });

        lblTxtEdit.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTxtEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtEdit.setText("   Edit");
        lblTxtEdit.setToolTipText("");
        lblTxtEdit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTxtEdit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTxtEdit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTxtEditMouseDragged(evt);
            }
        });
        lblTxtEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTxtEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTxtEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTxtEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTxtEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTxtEditMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addComponent(lblIconEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTxtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTxtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSmallTab.add(pnlEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 50));

        pnlDelete.setBackground(new java.awt.Color(101, 46, 14));

        lblIconDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Erase_35px.png"))); // NOI18N
        lblIconDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconDelete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIconDeleteMouseDragged(evt);
            }
        });
        lblIconDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconDeleteMouseReleased(evt);
            }
        });

        lblTxtDelete.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTxtDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtDelete.setText("   Delete");
        lblTxtDelete.setToolTipText("");
        lblTxtDelete.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTxtDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTxtDelete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMouseDragged(evt);
            }
        });
        lblTxtDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTxtDeleteMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDeleteLayout = new javax.swing.GroupLayout(pnlDelete);
        pnlDelete.setLayout(pnlDeleteLayout);
        pnlDeleteLayout.setHorizontalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteLayout.createSequentialGroup()
                .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTxtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDeleteLayout.setVerticalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTxtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSmallTab.add(pnlDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 250, 50));

        jLabel5.setFont(new java.awt.Font("Xen Galaxy", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tulisan.png"))); // NOI18N
        pnlSmallTab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        pnlBackground.add(pnlSmallTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 680));

        pnlBigTab.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigTab.setLayout(new java.awt.CardLayout());

        pnlBigHome.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBigHomeMouseClicked(evt);
            }
        });
        pnlBigHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEditPicture.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblEditPicture.setForeground(new java.awt.Color(255, 255, 255));
        lblEditPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_2.png"))); // NOI18N
        lblEditPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditPictureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditPictureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditPictureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditPictureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEditPictureMouseReleased(evt);
            }
        });
        pnlBigHome.add(lblEditPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 40, 40));

        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person.png"))); // NOI18N
        pnlBigHome.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 218, 286));

        jSeparator1.setBackground(new java.awt.Color(204, 255, 255));
        pnlBigHome.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 250, 10));

        txtFUsername.setBackground(new java.awt.Color(135, 95, 35));
        txtFUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtFUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFUsername.setBorder(null);
        txtFUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFUsername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtFUsername.setSelectionColor(new java.awt.Color(135, 95, 35));
        txtFUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFUsernameFocusLost(evt);
            }
        });
        txtFUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFUsernameKeyTyped(evt);
            }
        });
        pnlBigHome.add(txtFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 10));

        jLabel1.setFont(new java.awt.Font("Humnst777 Blk BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROFILE");
        pnlBigHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 255, 255));
        pnlBigHome.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 250, 10));

        txtAAddresse.setBackground(new java.awt.Color(135, 95, 35));
        txtAAddresse.setColumns(20);
        txtAAddresse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAAddresse.setForeground(new java.awt.Color(204, 204, 204));
        txtAAddresse.setLineWrap(true);
        txtAAddresse.setRows(5);
        txtAAddresse.setTabSize(10);
        txtAAddresse.setText("Addresse");
        txtAAddresse.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtAAddresse.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtAAddresse.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtAAddresse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAAddresseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAAddresseFocusLost(evt);
            }
        });
        txtAAddresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAAddresseKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAAddresseKeyReleased(evt);
            }
        });
        pnlBigHome.add(txtAAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 250, 90));

        jSeparator3.setBackground(new java.awt.Color(204, 255, 255));
        pnlBigHome.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 140, 250, 20));

        lblNoticeUsername.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeUsername.setForeground(new java.awt.Color(255, 255, 102));
        pnlBigHome.add(lblNoticeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 130, 20));

        lblNoticeUsernameIcon.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeUsernameIcon.setForeground(new java.awt.Color(255, 255, 102));
        lblNoticeUsernameIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigHome.add(lblNoticeUsernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 30, 30));

        lblNoticeTelpIcon.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeTelpIcon.setForeground(new java.awt.Color(255, 255, 102));
        lblNoticeTelpIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigHome.add(lblNoticeTelpIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 30, 30));

        lblNoticeTelp.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeTelp.setForeground(new java.awt.Color(255, 255, 102));
        pnlBigHome.add(lblNoticeTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 130, 20));

        pnlEditProfile.setBackground(new java.awt.Color(204, 0, 51));

        lblEditProfile.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblEditProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditProfile.setText("Edit");
        lblEditProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditProfileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditProfileMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEditProfileMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlEditProfileLayout = new javax.swing.GroupLayout(pnlEditProfile);
        pnlEditProfile.setLayout(pnlEditProfileLayout);
        pnlEditProfileLayout.setHorizontalGroup(
            pnlEditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pnlEditProfileLayout.setVerticalGroup(
            pnlEditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlBigHome.add(pnlEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 70, 30));

        lblNoticeAddresseIcon.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeAddresseIcon.setForeground(new java.awt.Color(255, 255, 102));
        lblNoticeAddresseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigHome.add(lblNoticeAddresseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 30, 30));

        rbGroupGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(204, 204, 204));
        rbMale.setText("Male");
        rbMale.setBorder(null);
        rbMale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbMale.setFocusable(false);
        rbMale.setOpaque(false);
        rbMale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMaleMouseClicked(evt);
            }
        });
        pnlBigHome.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        rbGroupGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(204, 204, 204));
        rbFemale.setText("Female");
        rbFemale.setBorder(null);
        rbFemale.setFocusable(false);
        rbFemale.setOpaque(false);
        rbFemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFemaleMouseClicked(evt);
            }
        });
        pnlBigHome.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        txtFEmail.setEditable(false);
        txtFEmail.setBackground(new java.awt.Color(135, 95, 35));
        txtFEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtFEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEmail.setText("Email");
        txtFEmail.setBorder(null);
        txtFEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtFEmail.setFocusable(false);
        txtFEmail.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFEmailFocusLost(evt);
            }
        });
        txtFEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFEmailKeyTyped(evt);
            }
        });
        pnlBigHome.add(txtFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 250, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 255, 255));
        pnlBigHome.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 250, 20));

        lblNoticeGenderIcon.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeGenderIcon.setForeground(new java.awt.Color(255, 255, 102));
        lblNoticeGenderIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigHome.add(lblNoticeGenderIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 30, 30));

        lblNoticeAddresse.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeAddresse.setForeground(new java.awt.Color(255, 255, 102));
        pnlBigHome.add(lblNoticeAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 130, 20));

        lblNoticeEmailIcon.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeEmailIcon.setForeground(new java.awt.Color(255, 255, 102));
        lblNoticeEmailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigHome.add(lblNoticeEmailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 30, 30));

        lblNoticeEmail.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeEmail.setForeground(new java.awt.Color(255, 255, 102));
        pnlBigHome.add(lblNoticeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 130, 20));

        lblNoticeGender.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblNoticeGender.setForeground(new java.awt.Color(255, 255, 102));
        pnlBigHome.add(lblNoticeGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 130, 20));

        pnlSaveProfile.setBackground(new java.awt.Color(204, 0, 51));

        lblSaveProfile.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSaveProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblSaveProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaveProfile.setText("Save");
        lblSaveProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaveProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSaveProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSaveProfileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSaveProfileMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSaveProfileMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSaveProfileLayout = new javax.swing.GroupLayout(pnlSaveProfile);
        pnlSaveProfile.setLayout(pnlSaveProfileLayout);
        pnlSaveProfileLayout.setHorizontalGroup(
            pnlSaveProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaveProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pnlSaveProfileLayout.setVerticalGroup(
            pnlSaveProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaveProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlBigHome.add(pnlSaveProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 70, 30));

        txtFTelp.setBackground(new java.awt.Color(135, 95, 35));
        txtFTelp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFTelp.setForeground(new java.awt.Color(204, 204, 204));
        txtFTelp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFTelp.setText("Telp.");
        txtFTelp.setBorder(null);
        txtFTelp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFTelp.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtFTelp.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFTelp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFTelpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFTelpFocusLost(evt);
            }
        });
        txtFTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFTelpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFTelpKeyTyped(evt);
            }
        });
        pnlBigHome.add(txtFTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 250, 30));

        txtFUsername1.setBackground(new java.awt.Color(135, 95, 35));
        txtFUsername1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFUsername1.setForeground(new java.awt.Color(204, 204, 204));
        txtFUsername1.setText("Username");
        txtFUsername1.setBorder(null);
        txtFUsername1.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFUsername1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFUsername1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFUsername1FocusLost(evt);
            }
        });
        txtFUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFUsername1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFUsername1KeyTyped(evt);
            }
        });
        pnlBigHome.add(txtFUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 250, 30));

        pnlBigTab.add(pnlBigHome, "card2");

        pnlBigEdit.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEdit.setBackground(new java.awt.Color(135, 95, 35));
        tblEdit.setForeground(new java.awt.Color(255, 255, 255));
        tblEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Addresse", "Gender", "School", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEdit.setFocusable(false);
        tblEdit.setGridColor(new java.awt.Color(115, 50, 13));
        tblEdit.setRowHeight(25);
        tblEdit.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tblEdit.setShowVerticalLines(false);
        tblEdit.getTableHeader().setReorderingAllowed(false);
        tblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEdit);
        if (tblEdit.getColumnModel().getColumnCount() > 0) {
            tblEdit.getColumnModel().getColumn(0).setResizable(false);
            tblEdit.getColumnModel().getColumn(1).setResizable(false);
            tblEdit.getColumnModel().getColumn(2).setResizable(false);
            tblEdit.getColumnModel().getColumn(3).setResizable(false);
            tblEdit.getColumnModel().getColumn(5).setResizable(false);
        }
        tblEdit.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 12));
        tblEdit.getTableHeader().setOpaque(false);
        tblEdit.getTableHeader().setBackground(new Color(101, 46, 14));
        tblEdit.getTableHeader().setForeground(new Color(255, 255, 255));
        tblEdit.setRowHeight(25);

        pnlBigEdit.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 930, 330));

        cbEditSchDepart.setBorder(null);
        cbEditSchDepart.setOpaque(false);
        cbEditSchDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditSchDepartActionPerformed(evt);
            }
        });
        pnlBigEdit.add(cbEditSchDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 102));
        jCheckBox4.setBorder(null);
        jCheckBox4.setOpaque(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        pnlBigEdit.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        cbAddresse.setBorder(null);
        cbAddresse.setOpaque(false);
        cbAddresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddresseActionPerformed(evt);
            }
        });
        pnlBigEdit.add(cbAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cbName.setBorder(null);
        cbName.setOpaque(false);
        cbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNameActionPerformed(evt);
            }
        });
        pnlBigEdit.add(cbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        buttonGroup1.add(rbcWthRow);
        rbcWthRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbcWthRow.setForeground(new java.awt.Color(255, 255, 102));
        rbcWthRow.setBorder(null);
        rbcWthRow.setOpaque(false);
        rbcWthRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcWthRowActionPerformed(evt);
            }
        });
        pnlBigEdit.add(rbcWthRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 40, -1));
        pnlBigEdit.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 210, 10));

        txtFEditID.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFEditID.setForeground(new java.awt.Color(204, 204, 204));
        txtFEditID.setText("ID");
        txtFEditID.setBorder(null);
        txtFEditID.setOpaque(false);
        txtFEditID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFEditIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFEditIDFocusLost(evt);
            }
        });
        txtFEditID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFEditIDKeyReleased(evt);
            }
        });
        pnlBigEdit.add(txtFEditID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));
        pnlBigEdit.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 10));

        txtFEditName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFEditName.setForeground(new java.awt.Color(204, 204, 204));
        txtFEditName.setText("Name");
        txtFEditName.setBorder(null);
        txtFEditName.setOpaque(false);
        txtFEditName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFEditNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFEditNameFocusLost(evt);
            }
        });
        txtFEditName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFEditNameKeyReleased(evt);
            }
        });
        pnlBigEdit.add(txtFEditName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, 30));
        txtFEditName.setEditable(false);
        txtFEditName.setFocusable(false);

        txtAEditAddresse.setColumns(20);
        txtAEditAddresse.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtAEditAddresse.setForeground(new java.awt.Color(204, 204, 204));
        txtAEditAddresse.setRows(5);
        txtAEditAddresse.setText("Addresse");
        txtAEditAddresse.setBorder(null);
        txtAEditAddresse.setOpaque(false);
        txtAEditAddresse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAEditAddresseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAEditAddresseFocusLost(evt);
            }
        });
        txtAEditAddresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAEditAddresseKeyReleased(evt);
            }
        });
        pnlBigEdit.add(txtAEditAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 210, -1));
        txtAEditAddresse.setEditable(false);
        txtAEditAddresse.setFocusable(false);
        pnlBigEdit.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, -1));

        pnlEditDepart.setBackground(new java.awt.Color(101, 46, 14));
        pnlEditDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEditDepartMouseClicked(evt);
            }
        });

        lblEditDepart.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblEditDepart.setForeground(new java.awt.Color(204, 204, 204));
        lblEditDepart.setText("   Selected school first!");

        lblEditDepartIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlEditDepartLayout = new javax.swing.GroupLayout(pnlEditDepart);
        pnlEditDepart.setLayout(pnlEditDepartLayout);
        pnlEditDepartLayout.setHorizontalGroup(
            pnlEditDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditDepartLayout.createSequentialGroup()
                .addComponent(lblEditDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEditDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartLayout.setVerticalGroup(
            pnlEditDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblEditDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBigEdit.add(pnlEditDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 210, -1));

        pnlEditSchool.setBackground(new java.awt.Color(101, 46, 14));
        pnlEditSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEditSchoolMouseClicked(evt);
            }
        });

        lblEditSchool.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblEditSchool.setForeground(new java.awt.Color(204, 204, 204));
        lblEditSchool.setText("   Selected school");

        lblEditSchoolIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditSchoolIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlEditSchoolLayout = new javax.swing.GroupLayout(pnlEditSchool);
        pnlEditSchool.setLayout(pnlEditSchoolLayout);
        pnlEditSchoolLayout.setHorizontalGroup(
            pnlEditSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditSchoolLayout.createSequentialGroup()
                .addComponent(lblEditSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEditSchoolIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditSchoolLayout.setVerticalGroup(
            pnlEditSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblEditSchoolIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBigEdit.add(pnlEditSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 210, -1));

        pnlEditSchoolSMK1Tlng.setBackground(new java.awt.Color(220, 139, 17));

        lblEditSchoolSMK1Tlng.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditSchoolSMK1Tlng.setText("  SMKN 1 Tulung");
        lblEditSchoolSMK1Tlng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditSchoolSMK1TlngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditSchoolSMK1TlngLayout = new javax.swing.GroupLayout(pnlEditSchoolSMK1Tlng);
        pnlEditSchoolSMK1Tlng.setLayout(pnlEditSchoolSMK1TlngLayout);
        pnlEditSchoolSMK1TlngLayout.setHorizontalGroup(
            pnlEditSchoolSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditSchoolSMK1TlngLayout.createSequentialGroup()
                .addComponent(lblEditSchoolSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlEditSchoolSMK1TlngLayout.setVerticalGroup(
            pnlEditSchoolSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditSchoolSMK1TlngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditSchoolSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlEditSchoolSMK2Klt.setBackground(new java.awt.Color(220, 139, 17));

        lblEditSchoolSMK2Klt.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditSchoolSMK2Klt.setText("  SMKN 2 Klaten");
        lblEditSchoolSMK2Klt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditSchoolSMK2KltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditSchoolSMK2KltLayout = new javax.swing.GroupLayout(pnlEditSchoolSMK2Klt);
        pnlEditSchoolSMK2Klt.setLayout(pnlEditSchoolSMK2KltLayout);
        pnlEditSchoolSMK2KltLayout.setHorizontalGroup(
            pnlEditSchoolSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlEditSchoolSMK2KltLayout.setVerticalGroup(
            pnlEditSchoolSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditSchoolSMK2KltLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlEditSchoolSMA1Krng.setBackground(new java.awt.Color(220, 139, 17));

        lblEditSchoolSMA1Karng.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditSchoolSMA1Karng.setText("  SMAN 1 Karanganom");
        lblEditSchoolSMA1Karng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditSchoolSMA1KarngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditSchoolSMA1KrngLayout = new javax.swing.GroupLayout(pnlEditSchoolSMA1Krng);
        pnlEditSchoolSMA1Krng.setLayout(pnlEditSchoolSMA1KrngLayout);
        pnlEditSchoolSMA1KrngLayout.setHorizontalGroup(
            pnlEditSchoolSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditSchoolSMA1KrngLayout.createSequentialGroup()
                .addComponent(lblEditSchoolSMA1Karng, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlEditSchoolSMA1KrngLayout.setVerticalGroup(
            pnlEditSchoolSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditSchoolSMA1KrngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditSchoolSMA1Karng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlEditBackSchoolLayout = new javax.swing.GroupLayout(pnlEditBackSchool);
        pnlEditBackSchool.setLayout(pnlEditBackSchoolLayout);
        pnlEditBackSchoolLayout.setHorizontalGroup(
            pnlEditBackSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditBackSchoolLayout.createSequentialGroup()
                .addGroup(pnlEditBackSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlEditSchoolSMK2Klt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEditSchoolSMK1Tlng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEditSchoolSMA1Krng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlEditBackSchoolLayout.setVerticalGroup(
            pnlEditBackSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditBackSchoolLayout.createSequentialGroup()
                .addComponent(pnlEditSchoolSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEditSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEditSchoolSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigEdit.add(pnlEditBackSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 210, 90));
        pnlEditBackSchool.setVisible(false);

        cbGender.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbGender.setForeground(new java.awt.Color(204, 204, 204));
        cbGender.setText(" Gender");
        cbGender.setBorder(null);
        cbGender.setOpaque(false);
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });
        pnlBigEdit.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        buttonGroup2.add(rbEditMale);
        rbEditMale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbEditMale.setForeground(new java.awt.Color(204, 204, 204));
        rbEditMale.setText("Male");
        rbEditMale.setBorder(null);
        rbEditMale.setOpaque(false);
        rbEditMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEditMaleActionPerformed(evt);
            }
        });
        pnlBigEdit.add(rbEditMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));
        rbEditMale.setEnabled(false);

        buttonGroup2.add(rbEditFemale);
        rbEditFemale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbEditFemale.setForeground(new java.awt.Color(204, 204, 204));
        rbEditFemale.setText("Female");
        rbEditFemale.setBorder(null);
        rbEditFemale.setOpaque(false);
        rbEditFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEditFemaleActionPerformed(evt);
            }
        });
        pnlBigEdit.add(rbEditFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));
        rbEditFemale.setEnabled(false);

        pnlEditDepartATR.setBackground(new java.awt.Color(220, 139, 17));

        lblEditDepartATR.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditDepartATR.setText("  ATR (Agribisnis Ternak Ruminansia)");
        lblEditDepartATR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditDepartATRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditDepartATRLayout = new javax.swing.GroupLayout(pnlEditDepartATR);
        pnlEditDepartATR.setLayout(pnlEditDepartATRLayout);
        pnlEditDepartATRLayout.setHorizontalGroup(
            pnlEditDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartATRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartATRLayout.setVerticalGroup(
            pnlEditDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartATRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlEditDepartTKJ.setBackground(new java.awt.Color(220, 139, 17));

        lblEditDepartTKJ.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditDepartTKJ.setText("  TKJ (Teknik Komputer Jaringan)");
        lblEditDepartTKJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditDepartTKJMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditDepartTKJLayout = new javax.swing.GroupLayout(pnlEditDepartTKJ);
        pnlEditDepartTKJ.setLayout(pnlEditDepartTKJLayout);
        pnlEditDepartTKJLayout.setHorizontalGroup(
            pnlEditDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartTKJLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartTKJLayout.setVerticalGroup(
            pnlEditDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartTKJLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlEditDepartTKR.setBackground(new java.awt.Color(220, 139, 17));

        lblEditDepartTKR.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditDepartTKR.setText("  TKR (Teknik Kendaraan Ringan)");
        lblEditDepartTKR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditDepartTKRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditDepartTKRLayout = new javax.swing.GroupLayout(pnlEditDepartTKR);
        pnlEditDepartTKR.setLayout(pnlEditDepartTKRLayout);
        pnlEditDepartTKRLayout.setHorizontalGroup(
            pnlEditDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartTKRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartTKRLayout.setVerticalGroup(
            pnlEditDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditDepartTKR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEditBackDepart1Layout = new javax.swing.GroupLayout(pnlEditBackDepart1);
        pnlEditBackDepart1.setLayout(pnlEditBackDepart1Layout);
        pnlEditBackDepart1Layout.setHorizontalGroup(
            pnlEditBackDepart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlEditDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlEditDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlEditBackDepart1Layout.setVerticalGroup(
            pnlEditBackDepart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditBackDepart1Layout.createSequentialGroup()
                .addComponent(pnlEditDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEditDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEditDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigEdit.add(pnlEditBackDepart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 210, 90));
        pnlEditBackDepart1.setVisible(false);

        pnlEditDepartTMPO.setBackground(new java.awt.Color(220, 139, 17));

        lblEditDepartTMPO.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditDepartTMPO.setText("  TMPO (Teknik Manajeen Perwatan Otomotif)");
        lblEditDepartTMPO.setToolTipText("");
        lblEditDepartTMPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditDepartTMPOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditDepartTMPOLayout = new javax.swing.GroupLayout(pnlEditDepartTMPO);
        pnlEditDepartTMPO.setLayout(pnlEditDepartTMPOLayout);
        pnlEditDepartTMPOLayout.setHorizontalGroup(
            pnlEditDepartTMPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartTMPOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartTMPOLayout.setVerticalGroup(
            pnlEditDepartTMPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartTMPOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlEditDepartDPIB.setBackground(new java.awt.Color(220, 139, 17));

        lblEditDepartDPIB.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblEditDepartDPIB.setText("  DPIB (Desain Permodelan Informasi Bangunan)");
        lblEditDepartDPIB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditDepartDPIBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditDepartDPIBLayout = new javax.swing.GroupLayout(pnlEditDepartDPIB);
        pnlEditDepartDPIB.setLayout(pnlEditDepartDPIBLayout);
        pnlEditDepartDPIBLayout.setHorizontalGroup(
            pnlEditDepartDPIBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartDPIBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditDepartDPIBLayout.setVerticalGroup(
            pnlEditDepartDPIBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditDepartDPIBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlEditBackDepart2Layout = new javax.swing.GroupLayout(pnlEditBackDepart2);
        pnlEditBackDepart2.setLayout(pnlEditBackDepart2Layout);
        pnlEditBackDepart2Layout.setHorizontalGroup(
            pnlEditBackDepart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlEditDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlEditBackDepart2Layout.setVerticalGroup(
            pnlEditBackDepart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditBackDepart2Layout.createSequentialGroup()
                .addComponent(pnlEditDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEditDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigEdit.add(pnlEditBackDepart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 210, 60));
        pnlEditBackDepart2.setVisible(false);

        pnlEditEdit.setBackground(new java.awt.Color(204, 0, 51));

        lblEditEdit.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblEditEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEditEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditEdit.setText("Edit");
        lblEditEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEditEditMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlEditEditLayout = new javax.swing.GroupLayout(pnlEditEdit);
        pnlEditEdit.setLayout(pnlEditEditLayout);
        pnlEditEditLayout.setHorizontalGroup(
            pnlEditEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditEditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEditEditLayout.setVerticalGroup(
            pnlEditEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditEditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigEdit.add(pnlEditEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 70, 30));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 165));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Help_24px.png"))); // NOI18N
        jLabel4.setToolTipText("Help");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        pnlBigEdit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnlBigTab.add(pnlBigEdit, "card4");

        pnlBigDelete.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDelete.setBackground(new java.awt.Color(135, 95, 35));
        tblDelete.setForeground(new java.awt.Color(255, 255, 255));
        tblDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Addresse", "Gender", "School", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDelete.setFocusable(false);
        tblDelete.setGridColor(new java.awt.Color(115, 50, 13));
        tblDelete.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDelete.setRowHeight(25);
        tblDelete.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tblDelete.setShowVerticalLines(false);
        tblDelete.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblDelete);
        if (tblDelete.getColumnModel().getColumnCount() > 0) {
            tblDelete.getColumnModel().getColumn(0).setResizable(false);
            tblDelete.getColumnModel().getColumn(1).setResizable(false);
            tblDelete.getColumnModel().getColumn(2).setResizable(false);
            tblDelete.getColumnModel().getColumn(3).setResizable(false);
            tblDelete.getColumnModel().getColumn(4).setResizable(false);
            tblDelete.getColumnModel().getColumn(5).setResizable(false);
        }
        tblDelete.getTableHeader().setFont(new Font("Dialog",Font.BOLD, 12));
        tblDelete.getTableHeader().setOpaque(false);
        tblDelete.getTableHeader().setBackground(new Color(101, 46, 14));
        tblDelete.getTableHeader().setForeground(new Color(255,255,255));
        tblDelete.setRowHeight(25);

        pnlBigDelete.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 930, 330));

        buttonGroup3.add(rbDelID);
        rbDelID.setBorder(null);
        rbDelID.setOpaque(false);
        rbDelID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDelIDActionPerformed(evt);
            }
        });
        pnlBigDelete.add(rbDelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        buttonGroup3.add(rbDelName);
        rbDelName.setBorder(null);
        rbDelName.setOpaque(false);
        rbDelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDelNameActionPerformed(evt);
            }
        });
        pnlBigDelete.add(rbDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        buttonGroup3.add(rbDelAddresse);
        rbDelAddresse.setBorder(null);
        rbDelAddresse.setOpaque(false);
        rbDelAddresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDelAddresseActionPerformed(evt);
            }
        });
        pnlBigDelete.add(rbDelAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        buttonGroup3.add(rbDelSchDprt);
        rbDelSchDprt.setBorder(null);
        rbDelSchDprt.setOpaque(false);
        rbDelSchDprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDelSchDprtActionPerformed(evt);
            }
        });
        pnlBigDelete.add(rbDelSchDprt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 10));

        txtFDelName.setEditable(false);
        txtFDelName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFDelName.setForeground(new java.awt.Color(204, 204, 204));
        txtFDelName.setText("Name");
        txtFDelName.setBorder(null);
        txtFDelName.setFocusable(false);
        txtFDelName.setOpaque(false);
        txtFDelName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFDelNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFDelNameFocusLost(evt);
            }
        });
        txtFDelName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFDelNameKeyReleased(evt);
            }
        });
        pnlBigDelete.add(txtFDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 210, 30));

        txtFDelID.setEditable(false);
        txtFDelID.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFDelID.setForeground(new java.awt.Color(204, 204, 204));
        txtFDelID.setText("ID");
        txtFDelID.setBorder(null);
        txtFDelID.setFocusable(false);
        txtFDelID.setOpaque(false);
        txtFDelID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFDelIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFDelIDFocusLost(evt);
            }
        });
        txtFDelID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFDelIDKeyReleased(evt);
            }
        });
        pnlBigDelete.add(txtFDelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 30));

        txtADelAddresse.setEditable(false);
        txtADelAddresse.setColumns(20);
        txtADelAddresse.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtADelAddresse.setForeground(new java.awt.Color(204, 204, 204));
        txtADelAddresse.setRows(5);
        txtADelAddresse.setText("Addresse");
        txtADelAddresse.setFocusable(false);
        txtADelAddresse.setOpaque(false);
        txtADelAddresse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtADelAddresseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtADelAddresseFocusLost(evt);
            }
        });
        txtADelAddresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADelAddresseKeyReleased(evt);
            }
        });
        pnlBigDelete.add(txtADelAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, 80));
        pnlBigDelete.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 10));
        pnlBigDelete.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 10));
        pnlBigDelete.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 10));

        pnlDelBackDepart1.setBackground(new java.awt.Color(255, 153, 255));
        pnlDelBackDepart1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDelDepartATR.setBackground(new java.awt.Color(220, 139, 17));

        lblDelDepartATR.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelDepartATR.setText("  ATR (Agribisnis Ternak Ruminansia)");
        lblDelDepartATR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDepartATRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDepartATRLayout = new javax.swing.GroupLayout(pnlDelDepartATR);
        pnlDelDepartATR.setLayout(pnlDelDepartATRLayout);
        pnlDelDepartATRLayout.setHorizontalGroup(
            pnlDelDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelDepartATRLayout.createSequentialGroup()
                .addComponent(lblDelDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pnlDelDepartATRLayout.setVerticalGroup(
            pnlDelDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartATRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelBackDepart1.add(pnlDelDepartATR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        pnlDelDepartTKJ.setBackground(new java.awt.Color(220, 139, 17));

        lblDelDepartTKJ.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelDepartTKJ.setText("  TKJ (Teknik Komputer Jaringan)");
        lblDelDepartTKJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDepartTKJMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDepartTKJLayout = new javax.swing.GroupLayout(pnlDelDepartTKJ);
        pnlDelDepartTKJ.setLayout(pnlDelDepartTKJLayout);
        pnlDelDepartTKJLayout.setHorizontalGroup(
            pnlDelDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelDepartTKJLayout.createSequentialGroup()
                .addComponent(lblDelDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDelDepartTKJLayout.setVerticalGroup(
            pnlDelDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartTKJLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelBackDepart1.add(pnlDelDepartTKJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, -1));

        pnlDelDepartTKR.setBackground(new java.awt.Color(220, 139, 17));

        lblDelDepartTKR.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelDepartTKR.setText("  TKR (Teknik Kendaraan Ringan)");
        lblDelDepartTKR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDepartTKRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDepartTKRLayout = new javax.swing.GroupLayout(pnlDelDepartTKR);
        pnlDelDepartTKR.setLayout(pnlDelDepartTKRLayout);
        pnlDelDepartTKRLayout.setHorizontalGroup(
            pnlDelDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelDepartTKRLayout.createSequentialGroup()
                .addComponent(lblDelDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        pnlDelDepartTKRLayout.setVerticalGroup(
            pnlDelDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartTKRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelBackDepart1.add(pnlDelDepartTKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, -1));

        pnlBigDelete.add(pnlDelBackDepart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 210, 90));
        pnlDelBackDepart1.setVisible(false);

        pnlDelBackSch.setBackground(new java.awt.Color(220, 139, 17));

        pnlDelSchSMK1Tlng.setBackground(new java.awt.Color(220, 139, 17));

        lblDelSchSMK1Tlng.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelSchSMK1Tlng.setText("  SMKN 1 Tulung");
        lblDelSchSMK1Tlng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelSchSMK1TlngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelSchSMK1TlngLayout = new javax.swing.GroupLayout(pnlDelSchSMK1Tlng);
        pnlDelSchSMK1Tlng.setLayout(pnlDelSchSMK1TlngLayout);
        pnlDelSchSMK1TlngLayout.setHorizontalGroup(
            pnlDelSchSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelSchSMK1TlngLayout.createSequentialGroup()
                .addComponent(lblDelSchSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDelSchSMK1TlngLayout.setVerticalGroup(
            pnlDelSchSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelSchSMK1TlngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelSchSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelSchSMK2Klt.setBackground(new java.awt.Color(220, 139, 17));

        lblDelSchSMK2Klt.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelSchSMK2Klt.setText("  SMKN 2 Klaten");
        lblDelSchSMK2Klt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelSchSMK2KltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelSchSMK2KltLayout = new javax.swing.GroupLayout(pnlDelSchSMK2Klt);
        pnlDelSchSMK2Klt.setLayout(pnlDelSchSMK2KltLayout);
        pnlDelSchSMK2KltLayout.setHorizontalGroup(
            pnlDelSchSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelSchSMK2KltLayout.createSequentialGroup()
                .addComponent(lblDelSchSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDelSchSMK2KltLayout.setVerticalGroup(
            pnlDelSchSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelSchSMK2KltLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelSchSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelSchSMA1Krng.setBackground(new java.awt.Color(220, 139, 17));

        lblDelSchSMA1Krng.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelSchSMA1Krng.setText("  SMAN 1 Karanganom");
        lblDelSchSMA1Krng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelSchSMA1KrngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelSchSMA1KrngLayout = new javax.swing.GroupLayout(pnlDelSchSMA1Krng);
        pnlDelSchSMA1Krng.setLayout(pnlDelSchSMA1KrngLayout);
        pnlDelSchSMA1KrngLayout.setHorizontalGroup(
            pnlDelSchSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelSchSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDelSchSMA1KrngLayout.setVerticalGroup(
            pnlDelSchSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelSchSMA1KrngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelSchSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlDelBackSchLayout = new javax.swing.GroupLayout(pnlDelBackSch);
        pnlDelBackSch.setLayout(pnlDelBackSchLayout);
        pnlDelBackSchLayout.setHorizontalGroup(
            pnlDelBackSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelBackSchLayout.createSequentialGroup()
                .addGroup(pnlDelBackSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDelBackSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlDelSchSMK2Klt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDelSchSMK1Tlng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlDelSchSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlDelBackSchLayout.setVerticalGroup(
            pnlDelBackSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelBackSchLayout.createSequentialGroup()
                .addComponent(pnlDelSchSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDelSchSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDelSchSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigDelete.add(pnlDelBackSch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, 90));
        pnlDelBackSch.setVisible(false);

        buttonGroup3.add(rbDelGender);
        rbDelGender.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbDelGender.setForeground(new java.awt.Color(204, 204, 204));
        rbDelGender.setText("   Gender");
        rbDelGender.setBorder(null);
        rbDelGender.setOpaque(false);
        rbDelGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDelGenderActionPerformed(evt);
            }
        });
        pnlBigDelete.add(rbDelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        buttonGroup4.add(cbDelGenderMale);
        cbDelGenderMale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbDelGenderMale.setForeground(new java.awt.Color(204, 204, 204));
        cbDelGenderMale.setText("Male");
        cbDelGenderMale.setEnabled(false);
        cbDelGenderMale.setOpaque(false);
        cbDelGenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelGenderMaleActionPerformed(evt);
            }
        });
        pnlBigDelete.add(cbDelGenderMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        buttonGroup4.add(cbDelGenderFemale);
        cbDelGenderFemale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbDelGenderFemale.setForeground(new java.awt.Color(204, 204, 204));
        cbDelGenderFemale.setText("Female");
        cbDelGenderFemale.setEnabled(false);
        cbDelGenderFemale.setOpaque(false);
        cbDelGenderFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelGenderFemaleActionPerformed(evt);
            }
        });
        pnlBigDelete.add(cbDelGenderFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        pnlDelDepart.setBackground(new java.awt.Color(101, 46, 14));
        pnlDelDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDelDepartMouseClicked(evt);
            }
        });

        lblDelDepart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDelDepart.setForeground(new java.awt.Color(204, 204, 204));
        lblDelDepart.setText("  Select school first");

        lblDelDepartIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDelDepartLayout = new javax.swing.GroupLayout(pnlDelDepart);
        pnlDelDepart.setLayout(pnlDelDepartLayout);
        pnlDelDepartLayout.setHorizontalGroup(
            pnlDelDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelDepartLayout.createSequentialGroup()
                .addComponent(lblDelDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDelDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDelDepartLayout.setVerticalGroup(
            pnlDelDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblDelDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBigDelete.add(pnlDelDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 210, 30));

        pnlDelSch.setBackground(new java.awt.Color(101, 46, 14));
        pnlDelSch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDelSchMouseClicked(evt);
            }
        });

        lblDelSch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDelSch.setForeground(new java.awt.Color(204, 204, 204));
        lblDelSch.setText("  Select school");

        lblDelSchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelSchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlDelSchLayout = new javax.swing.GroupLayout(pnlDelSch);
        pnlDelSch.setLayout(pnlDelSchLayout);
        pnlDelSchLayout.setHorizontalGroup(
            pnlDelSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelSchLayout.createSequentialGroup()
                .addComponent(lblDelSch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDelSchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDelSchLayout.setVerticalGroup(
            pnlDelSchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelSch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblDelSchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBigDelete.add(pnlDelSch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 210, 30));

        pnlDelBackDepart2.setBackground(new java.awt.Color(220, 139, 17));

        pnlDelDepartTMPO.setBackground(new java.awt.Color(220, 139, 17));

        lblDelDepartTMPO.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelDepartTMPO.setText("  TMPO (Teknik Manajemen Perwatan Otomotif)");
        lblDelDepartTMPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDepartTMPOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDepartTMPOLayout = new javax.swing.GroupLayout(pnlDelDepartTMPO);
        pnlDelDepartTMPO.setLayout(pnlDelDepartTMPOLayout);
        pnlDelDepartTMPOLayout.setHorizontalGroup(
            pnlDelDepartTMPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartTMPOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDelDepartTMPOLayout.setVerticalGroup(
            pnlDelDepartTMPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartTMPOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDelDepartDPIB.setBackground(new java.awt.Color(220, 139, 17));

        lblDelDepartDPIB.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        lblDelDepartDPIB.setText("  DPIB (Desain Permodelan Informasi Bangunan)");
        lblDelDepartDPIB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDepartDPIBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDepartDPIBLayout = new javax.swing.GroupLayout(pnlDelDepartDPIB);
        pnlDelDepartDPIB.setLayout(pnlDelDepartDPIBLayout);
        pnlDelDepartDPIBLayout.setHorizontalGroup(
            pnlDelDepartDPIBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelDepartDPIBLayout.createSequentialGroup()
                .addComponent(lblDelDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDelDepartDPIBLayout.setVerticalGroup(
            pnlDelDepartDPIBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDelDepartDPIBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDelDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlDelBackDepart2Layout = new javax.swing.GroupLayout(pnlDelBackDepart2);
        pnlDelBackDepart2.setLayout(pnlDelBackDepart2Layout);
        pnlDelBackDepart2Layout.setHorizontalGroup(
            pnlDelBackDepart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDelDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlDelDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDelBackDepart2Layout.setVerticalGroup(
            pnlDelBackDepart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDelBackDepart2Layout.createSequentialGroup()
                .addComponent(pnlDelDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDelDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigDelete.add(pnlDelBackDepart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 210, 60));
        pnlDelBackDepart2.setVisible(false);

        pnlDelDelete.setBackground(new java.awt.Color(204, 0, 51));

        lblDelDelete.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblDelDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblDelDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelDelete.setText("Delete");
        lblDelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDelDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDelDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDelDeleteMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDelDeleteLayout = new javax.swing.GroupLayout(pnlDelDelete);
        pnlDelDelete.setLayout(pnlDelDeleteLayout);
        pnlDelDeleteLayout.setHorizontalGroup(
            pnlDelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pnlDelDeleteLayout.setVerticalGroup(
            pnlDelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlBigDelete.add(pnlDelDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 70, 30));

        pnlBigTab.add(pnlBigDelete, "card5");

        pnlBigAdd.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAdd.setBackground(new java.awt.Color(135, 95, 35));
        tblAdd.setForeground(new java.awt.Color(255, 255, 255));
        tblAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Addresse", "Gender", "School", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdd.setFocusable(false);
        tblAdd.setGridColor(new java.awt.Color(115, 50, 13));
        tblAdd.setRowHeight(25);
        tblAdd.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tblAdd.setShowVerticalLines(false);
        tblAdd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAdd);
        if (tblAdd.getColumnModel().getColumnCount() > 0) {
            tblAdd.getColumnModel().getColumn(0).setResizable(false);
            tblAdd.getColumnModel().getColumn(1).setResizable(false);
            tblAdd.getColumnModel().getColumn(2).setResizable(false);
            tblAdd.getColumnModel().getColumn(3).setResizable(false);
            tblAdd.getColumnModel().getColumn(4).setResizable(false);
            tblAdd.getColumnModel().getColumn(5).setResizable(false);
        }
        tblAdd.getTableHeader().setFont(new Font("Dialog",Font.BOLD, 12));
        tblAdd.getTableHeader().setOpaque(false);
        tblAdd.getTableHeader().setBackground(new Color(101, 46, 14));
        tblAdd.getTableHeader().setForeground(new Color(255,255,255));
        tblAdd.setRowHeight(25);

        pnlBigAdd.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 930, 330));
        pnlBigAdd.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 210, 20));
        pnlBigAdd.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 20));
        pnlBigAdd.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 20));

        pnlBackgroundAddSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackgroundAddSchoolMouseClicked(evt);
            }
        });
        pnlBackgroundAddSchool.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlBackgroundAddSchoolKeyPressed(evt);
            }
        });

        pnlAddSchoolSM1Tlng.setBackground(new java.awt.Color(220, 139, 17));

        lblAddSchoolSMK1Tlng.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddSchoolSMK1Tlng.setText("   SMKN 1 Tulung");
        lblAddSchoolSMK1Tlng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddSchoolSMK1TlngMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddSchoolSMK1TlngMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlAddSchoolSM1TlngLayout = new javax.swing.GroupLayout(pnlAddSchoolSM1Tlng);
        pnlAddSchoolSM1Tlng.setLayout(pnlAddSchoolSM1TlngLayout);
        pnlAddSchoolSM1TlngLayout.setHorizontalGroup(
            pnlAddSchoolSM1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSM1TlngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddSchoolSM1TlngLayout.setVerticalGroup(
            pnlAddSchoolSM1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSM1TlngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMK1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlAddSchoolSMK2Klt.setBackground(new java.awt.Color(220, 139, 17));

        lblAddSchoolSMK2Klt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddSchoolSMK2Klt.setText("   SMKN 2 Klaten");
        lblAddSchoolSMK2Klt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddSchoolSMK2KltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAddSchoolSMK2KltLayout = new javax.swing.GroupLayout(pnlAddSchoolSMK2Klt);
        pnlAddSchoolSMK2Klt.setLayout(pnlAddSchoolSMK2KltLayout);
        pnlAddSchoolSMK2KltLayout.setHorizontalGroup(
            pnlAddSchoolSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSMK2KltLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddSchoolSMK2KltLayout.setVerticalGroup(
            pnlAddSchoolSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSMK2KltLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlAddSchoolSMA1Krng.setBackground(new java.awt.Color(220, 139, 17));

        lblAddSchoolSMKN1Karng.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddSchoolSMKN1Karng.setText("   SMAN 1 Karanganom");
        lblAddSchoolSMKN1Karng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddSchoolSMKN1KarngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAddSchoolSMA1KrngLayout = new javax.swing.GroupLayout(pnlAddSchoolSMA1Krng);
        pnlAddSchoolSMA1Krng.setLayout(pnlAddSchoolSMA1KrngLayout);
        pnlAddSchoolSMA1KrngLayout.setHorizontalGroup(
            pnlAddSchoolSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSMA1KrngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMKN1Karng, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddSchoolSMA1KrngLayout.setVerticalGroup(
            pnlAddSchoolSMA1KrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSchoolSMA1KrngLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddSchoolSMKN1Karng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBackgroundAddSchoolLayout = new javax.swing.GroupLayout(pnlBackgroundAddSchool);
        pnlBackgroundAddSchool.setLayout(pnlBackgroundAddSchoolLayout);
        pnlBackgroundAddSchoolLayout.setHorizontalGroup(
            pnlBackgroundAddSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddSchoolSM1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlAddSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlAddSchoolSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBackgroundAddSchoolLayout.setVerticalGroup(
            pnlBackgroundAddSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundAddSchoolLayout.createSequentialGroup()
                .addComponent(pnlAddSchoolSM1Tlng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAddSchoolSMK2Klt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAddSchoolSMA1Krng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigAdd.add(pnlBackgroundAddSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));
        pnlBackgroundAddSchool.setVisible(false);

        rbAddGenderMale.setBackground(new java.awt.Color(135, 95, 35));
        rbGroupAddGender.add(rbAddGenderMale);
        rbAddGenderMale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbAddGenderMale.setForeground(new java.awt.Color(204, 204, 204));
        rbAddGenderMale.setText("Male");
        rbAddGenderMale.setBorder(null);
        rbAddGenderMale.setFocusable(false);
        rbAddGenderMale.setOpaque(false);
        rbAddGenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAddGenderMaleActionPerformed(evt);
            }
        });
        pnlBigAdd.add(rbAddGenderMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        rbAddGenderFemale.setBackground(new java.awt.Color(135, 95, 35));
        rbGroupAddGender.add(rbAddGenderFemale);
        rbAddGenderFemale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbAddGenderFemale.setForeground(new java.awt.Color(204, 204, 204));
        rbAddGenderFemale.setText("Female");
        rbAddGenderFemale.setBorder(null);
        rbAddGenderFemale.setFocusable(false);
        rbAddGenderFemale.setOpaque(false);
        rbAddGenderFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAddGenderFemaleActionPerformed(evt);
            }
        });
        pnlBigAdd.add(rbAddGenderFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        txtFAddName.setBackground(new java.awt.Color(135, 95, 35));
        txtFAddName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFAddName.setForeground(new java.awt.Color(204, 204, 204));
        txtFAddName.setText("Name");
        txtFAddName.setBorder(null);
        txtFAddName.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFAddName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFAddNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFAddNameFocusLost(evt);
            }
        });
        txtFAddName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFAddNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFAddNameKeyTyped(evt);
            }
        });
        pnlBigAdd.add(txtFAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, 30));

        txtFAddDepartment.setBackground(new java.awt.Color(135, 95, 35));
        txtFAddDepartment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFAddDepartment.setForeground(new java.awt.Color(204, 204, 204));
        txtFAddDepartment.setBorder(null);
        txtFAddDepartment.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFAddDepartment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFAddDepartmentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFAddDepartmentFocusLost(evt);
            }
        });
        txtFAddDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFAddDepartmentKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFAddDepartmentKeyTyped(evt);
            }
        });
        pnlBigAdd.add(txtFAddDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 287, 0, 0));

        txtAAddAddresse.setBackground(new java.awt.Color(135, 95, 35));
        txtAAddAddresse.setColumns(20);
        txtAAddAddresse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAAddAddresse.setForeground(new java.awt.Color(204, 204, 204));
        txtAAddAddresse.setRows(5);
        txtAAddAddresse.setText("Addresse");
        txtAAddAddresse.setBorder(null);
        txtAAddAddresse.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtAAddAddresse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAAddAddresseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAAddAddresseFocusLost(evt);
            }
        });
        txtAAddAddresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAAddAddresseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAAddAddresseKeyTyped(evt);
            }
        });
        pnlBigAdd.add(txtAAddAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, 90));

        txtFAddID.setBackground(new java.awt.Color(135, 95, 35));
        txtFAddID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFAddID.setForeground(new java.awt.Color(204, 204, 204));
        txtFAddID.setText("ID");
        txtFAddID.setBorder(null);
        txtFAddID.setSelectedTextColor(new java.awt.Color(255, 255, 102));
        txtFAddID.setSelectionColor(new java.awt.Color(153, 204, 240));
        txtFAddID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFAddIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFAddIDFocusLost(evt);
            }
        });
        txtFAddID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFAddIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFAddIDKeyTyped(evt);
            }
        });
        pnlBigAdd.add(txtFAddID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 210, 30));

        pnlAddAdd.setBackground(new java.awt.Color(204, 0, 51));

        lblAdd.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setText("Add");
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAddMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlAddAddLayout = new javax.swing.GroupLayout(pnlAddAdd);
        pnlAddAdd.setLayout(pnlAddAddLayout);
        pnlAddAddLayout.setHorizontalGroup(
            pnlAddAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddAddLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddAddLayout.setVerticalGroup(
            pnlAddAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddAddLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigAdd.add(pnlAddAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 70, 30));
        pnlBigAdd.add(lblNoticeAddDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 40, 30, 30));
        pnlBigAdd.add(lblNoticeAddID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 30, 30));
        pnlBigAdd.add(lblNoticeAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 30));
        pnlBigAdd.add(lblNoticeAddAddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));
        pnlBigAdd.add(lblNoticeAddGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 30, 30));
        pnlBigAdd.add(lblNoticeAddSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 30, 30));

        pnlAddSchool.setBackground(new java.awt.Color(101, 46, 14));
        pnlAddSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddSchoolMouseClicked(evt);
            }
        });

        lblAddSchool.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddSchool.setForeground(new java.awt.Color(255, 255, 255));
        lblAddSchool.setText("   Select school");

        lblAddSchoolIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddSchoolIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlAddSchoolLayout = new javax.swing.GroupLayout(pnlAddSchool);
        pnlAddSchool.setLayout(pnlAddSchoolLayout);
        pnlAddSchoolLayout.setHorizontalGroup(
            pnlAddSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddSchoolLayout.createSequentialGroup()
                .addComponent(lblAddSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddSchoolIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );
        pnlAddSchoolLayout.setVerticalGroup(
            pnlAddSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddSchoolLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlAddSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddSchool, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddSchoolIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlBigAdd.add(pnlAddSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        pnlAddDepart.setBackground(new java.awt.Color(101, 46, 14));
        pnlAddDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddDepartMouseClicked(evt);
            }
        });

        lblAddDepart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddDepart.setForeground(new java.awt.Color(255, 255, 255));
        lblAddDepart.setText("   Select school first!");

        javax.swing.GroupLayout pnlAddDepartLayout = new javax.swing.GroupLayout(pnlAddDepart);
        pnlAddDepart.setLayout(pnlAddDepartLayout);
        pnlAddDepartLayout.setHorizontalGroup(
            pnlAddDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddDepartLayout.createSequentialGroup()
                .addComponent(lblAddDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblAddDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAddDepartLayout.setVerticalGroup(
            pnlAddDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblAddDepartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBigAdd.add(pnlAddDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        pnlDepartTKR.setBackground(new java.awt.Color(220, 139, 17));

        lblDepartATR.setText("   ATR (Agribisnis Ternak Ruminansia)");
        lblDepartATR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepartATRMouseClicked(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout pnlDepartTKRLayout = new javax.swing.GroupLayout(pnlDepartTKR);
        pnlDepartTKR.setLayout(pnlDepartTKRLayout);
        pnlDepartTKRLayout.setHorizontalGroup(
            pnlDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepartTKRLayout.createSequentialGroup()
                .addComponent(lblDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2))
        );
        pnlDepartTKRLayout.setVerticalGroup(
            pnlDepartTKRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)
        );

        pnlDepartTKJ.setBackground(new java.awt.Color(220, 139, 17));

        lblDepartTKJ.setText("   TKJ (Teknik Komputer Jaringan)");
        lblDepartTKJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepartTKJMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDepartTKJLayout = new javax.swing.GroupLayout(pnlDepartTKJ);
        pnlDepartTKJ.setLayout(pnlDepartTKJLayout);
        pnlDepartTKJLayout.setHorizontalGroup(
            pnlDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDepartTKJLayout.setVerticalGroup(
            pnlDepartTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlDepartATR.setBackground(new java.awt.Color(220, 139, 17));

        lblDepartTKR.setText("   TKR (Teknik Kendaraan Ringan)");
        lblDepartTKR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepartTKRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDepartATRLayout = new javax.swing.GroupLayout(pnlDepartATR);
        pnlDepartATR.setLayout(pnlDepartATRLayout);
        pnlDepartATRLayout.setHorizontalGroup(
            pnlDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDepartATRLayout.setVerticalGroup(
            pnlDepartATRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pnlBackDepartSMK1TlngLayout = new javax.swing.GroupLayout(pnlBackDepartSMK1Tlng);
        pnlBackDepartSMK1Tlng.setLayout(pnlBackDepartSMK1TlngLayout);
        pnlBackDepartSMK1TlngLayout.setHorizontalGroup(
            pnlBackDepartSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBackDepartSMK1TlngLayout.setVerticalGroup(
            pnlBackDepartSMK1TlngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackDepartSMK1TlngLayout.createSequentialGroup()
                .addComponent(pnlDepartTKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDepartTKJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDepartATR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigAdd.add(pnlBackDepartSMK1Tlng, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 230, -1));
        pnlBackDepartSMK1Tlng.setVisible(false);

        jPanel2.setBackground(new java.awt.Color(220, 139, 17));

        lblDepartTMPO.setText("   TMPO (Teknik Manajemen Perawatan Otomotif)");
        lblDepartTMPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepartTMPOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDepartTMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(220, 139, 17));

        lblDepartDPIB.setText("   DPIB (Desain Permodelan Informasi dan Bangunan)");
        lblDepartDPIB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepartDPIBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDepartDPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBackDepartSMK2KltLayout = new javax.swing.GroupLayout(pnlBackDepartSMK2Klt);
        pnlBackDepartSMK2Klt.setLayout(pnlBackDepartSMK2KltLayout);
        pnlBackDepartSMK2KltLayout.setHorizontalGroup(
            pnlBackDepartSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBackDepartSMK2KltLayout.setVerticalGroup(
            pnlBackDepartSMK2KltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackDepartSMK2KltLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBigAdd.add(pnlBackDepartSMK2Klt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 230, 60));
        pnlBackDepartSMK2Klt.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBigAdd.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 90, 17));

        pnlBigTab.add(pnlBigAdd, "card3");

        pnlBigSearch.setBackground(new java.awt.Color(135, 95, 35));
        pnlBigSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSearch.setBackground(new java.awt.Color(135, 95, 35));
        tblSearch.setForeground(new java.awt.Color(255, 255, 255));
        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Addresse", "Gender", "School", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSearch.setFocusable(false);
        tblSearch.setGridColor(new java.awt.Color(115, 50, 13));
        tblSearch.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblSearch.setRowHeight(25);
        tblSearch.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tblSearch.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tblSearch);
        tblSearch.getTableHeader().setFont(new Font("Dialog",Font.BOLD, 12));
        tblSearch.getTableHeader().setOpaque(false);
        tblSearch.getTableHeader().setBackground(new Color(101, 46, 14));
        tblSearch.getTableHeader().setForeground(new Color(255,255,255));
        tblSearch.setRowHeight(25);

        pnlBigSearch.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 930, 330));

        buttonGroup6.add(rbSrchID);
        rbSrchID.setBorder(null);
        rbSrchID.setOpaque(false);
        rbSrchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSrchIDActionPerformed(evt);
            }
        });
        pnlBigSearch.add(rbSrchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        buttonGroup6.add(rbSrchName);
        rbSrchName.setBorder(null);
        rbSrchName.setOpaque(false);
        rbSrchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSrchNameActionPerformed(evt);
            }
        });
        pnlBigSearch.add(rbSrchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        buttonGroup6.add(rbSrchGender);
        rbSrchGender.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbSrchGender.setForeground(new java.awt.Color(204, 204, 204));
        rbSrchGender.setText("  Gender");
        rbSrchGender.setBorder(null);
        rbSrchGender.setOpaque(false);
        rbSrchGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSrchGenderActionPerformed(evt);
            }
        });
        pnlBigSearch.add(rbSrchGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        txtFSrchName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFSrchName.setForeground(new java.awt.Color(204, 204, 204));
        txtFSrchName.setText("Name");
        txtFSrchName.setBorder(null);
        txtFSrchName.setOpaque(false);
        txtFSrchName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFSrchNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFSrchNameFocusLost(evt);
            }
        });
        pnlBigSearch.add(txtFSrchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, 30));
        txtFSrchName.setEditable(false);
        txtFSrchName.setFocusable(false);
        pnlBigSearch.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 210, 10));

        txtFSrchID.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtFSrchID.setForeground(new java.awt.Color(204, 204, 204));
        txtFSrchID.setText("ID");
        txtFSrchID.setBorder(null);
        txtFSrchID.setOpaque(false);
        txtFSrchID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFSrchIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFSrchIDFocusLost(evt);
            }
        });
        pnlBigSearch.add(txtFSrchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, 30));
        txtFSrchID.setEditable(false);
        txtFSrchID.setFocusable(false);
        pnlBigSearch.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 210, 10));

        buttonGroup7.add(cbSrchMale);
        cbSrchMale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbSrchMale.setForeground(new java.awt.Color(204, 204, 204));
        cbSrchMale.setText("  Male");
        cbSrchMale.setEnabled(false);
        cbSrchMale.setOpaque(false);
        cbSrchMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSrchMaleActionPerformed(evt);
            }
        });
        pnlBigSearch.add(cbSrchMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        buttonGroup7.add(cbSrchFemale);
        cbSrchFemale.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbSrchFemale.setForeground(new java.awt.Color(204, 204, 204));
        cbSrchFemale.setText("  Female");
        cbSrchFemale.setEnabled(false);
        cbSrchFemale.setOpaque(false);
        cbSrchFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSrchFemaleActionPerformed(evt);
            }
        });
        pnlBigSearch.add(cbSrchFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        pnlSrch.setBackground(new java.awt.Color(204, 0, 51));

        lblSrch.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSrch.setForeground(new java.awt.Color(255, 255, 255));
        lblSrch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSrch.setText("Search");
        lblSrch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSrchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSrchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSrchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSrchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSrchMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSrchLayout = new javax.swing.GroupLayout(pnlSrch);
        pnlSrch.setLayout(pnlSrchLayout);
        pnlSrchLayout.setHorizontalGroup(
            pnlSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSrch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pnlSrchLayout.setVerticalGroup(
            pnlSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSrch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlBigSearch.add(pnlSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 70, 30));

        pnlBigTab.add(pnlBigSearch, "card6");

        pnlBackground.add(pnlBigTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 930, 640));

        pnlMinimize.setBackground(new java.awt.Color(101, 46, 14));

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Subtract_35px.png"))); // NOI18N
        lblMinimize.setToolTipText("");
        lblMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseDragged(evt);
            }
        });
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlMinimizeLayout = new javax.swing.GroupLayout(pnlMinimize);
        pnlMinimize.setLayout(pnlMinimizeLayout);
        pnlMinimizeLayout.setHorizontalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlMinimizeLayout.setVerticalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBackground.add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 50, 40));

        pnlClose.setBackground(new java.awt.Color(101, 46, 14));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_35px_1.png"))); // NOI18N
        lblClose.setToolTipText("");
        lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblCloseMouseDragged(evt);
            }
        });
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCloseMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlCloseLayout = new javax.swing.GroupLayout(pnlClose);
        pnlClose.setLayout(pnlCloseLayout);
        pnlCloseLayout.setHorizontalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlCloseLayout.setVerticalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlBackground.add(pnlClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 50, 40));

        getContentPane().add(pnlBackground);
        pnlBackground.setBounds(0, 0, 1180, 680);

        setSize(new java.awt.Dimension(1180, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(101, 46, 14));
    }
    private void addPanel(Component com){
        pnlBigTab.removeAll();
        pnlBigTab.repaint();
        pnlBigTab.revalidate();

        pnlBigTab.add(com);
        pnlBigTab.repaint();
        pnlBigTab.revalidate();        
    }
    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        pnlClose.setBackground(new Color(226, 11, 11));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        pnlClose.setBackground(new Color(255, 45, 45));
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        pnlClose.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseReleased
        pnlClose.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblCloseMouseReleased

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        pnlClose.setBackground(new Color(226, 11, 11));         
        
        if (i == 0) {
            int a = JOptionPane.showConfirmDialog(null, "You still haven't saved the data\nAre you sure you want to exit?", "Notice",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("src/icon/icons8_Exit_Sign_80px_1.png"));
            if (a == JOptionPane.YES_OPTION) {
                dispose();
            }
        }else{            
            int a = JOptionPane.showConfirmDialog(null, "Are you sure you're \nleaving?", "Notice",
                    JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE ,
                    new ImageIcon("src/icon/icons8_Exit_Sign_80px_1.png"));                        
            if (a == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        pnlMinimize.setBackground(new Color(138, 63, 20));
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        pnlMinimize.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        pnlMinimize.setBackground(new Color(159, 78, 31));
    }//GEN-LAST:event_lblMinimizeMousePressed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        pnlMinimize.setBackground(new Color(138, 63, 20));
        this.setExtendedState(JFrame.ICONIFIED);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseReleased
        pnlMinimize.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblMinimizeMouseReleased

    private void lblTxtHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMouseClicked
        pnlHome.setBackground(new Color(204, 0, 51));
        addPanel(pnlBigHome);
    }//GEN-LAST:event_lblTxtHomeMouseClicked

    private void lblTxtHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMousePressed
        pnlHome.setBackground(new Color(230, 36, 81));
        iH = 1;
        iD = 0;
        iE = 0;        
        iS = 0;
        iA = 0;
        resetColor(pnlAdd);
        resetColor(pnlDelete);
        resetColor(pnlEdit);
        resetColor(pnlSearch);
    }//GEN-LAST:event_lblTxtHomeMousePressed

    private void lblTxtHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMouseEntered
        if (iH != 1) {
            pnlHome.setBackground(new Color(232, 0, 54));
        }
    }//GEN-LAST:event_lblTxtHomeMouseEntered

    private void lblTxtHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMouseExited
        if (iH != 1) {            
            pnlHome.setBackground(new Color(101, 46, 14));
        }
    }//GEN-LAST:event_lblTxtHomeMouseExited

    private void lblTxtHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMouseReleased
        //pnlHome.setBackground(new Color(101, 46, 14));
        pnlHome.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblTxtHomeMouseReleased

    private void lblTxtHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtHomeMouseDragged
        pnlHome.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblTxtHomeMouseDragged

    private void lblIconHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMouseClicked
        pnlHome.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconHomeMouseClicked

    private void lblIconHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMouseEntered
        pnlHome.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblIconHomeMouseEntered

    private void lblIconHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMouseExited
        pnlHome.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblIconHomeMouseExited

    private void lblIconHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMousePressed
        pnlHome.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconHomeMousePressed

    private void lblIconHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMouseReleased
        pnlHome.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconHomeMouseReleased

    private void lblIconHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHomeMouseDragged
        pnlHome.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconHomeMouseDragged

    private void lblTxtAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMouseClicked
        pnlAdd.setBackground(new Color(204, 0, 51));
        addPanel(pnlBigAdd);
    }//GEN-LAST:event_lblTxtAddMouseClicked

    private void lblIconAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMouseClicked
        pnlAdd.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconAddMouseClicked

    private void lblTxtAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMouseEntered
        if (iA != 1) {
        pnlAdd.setBackground(new Color(232, 0, 54));
        }
    }//GEN-LAST:event_lblTxtAddMouseEntered

    private void lblIconAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMouseEntered
        pnlAdd.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblIconAddMouseEntered

    private void lblTxtAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMouseExited
        if (iA != 1) {
            pnlAdd.setBackground(new Color(101, 46, 14));
        }
    }//GEN-LAST:event_lblTxtAddMouseExited

    private void lblIconAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMouseExited
        pnlAdd.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblIconAddMouseExited

    private void lblTxtAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMousePressed
        pnlAdd.setBackground(new Color(230, 36, 81));
        iH = 0;
        iD = 0;
        iE = 0;        
        iS = 0;
        iA = 1;
        resetColor(pnlHome);
        resetColor(pnlDelete);
        resetColor(pnlEdit);
        resetColor(pnlSearch);
    }//GEN-LAST:event_lblTxtAddMousePressed

    private void lblIconAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMousePressed
        pnlAdd.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconAddMousePressed

    private void lblTxtAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMouseReleased
        pnlAdd.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblTxtAddMouseReleased

    private void lblIconAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMouseReleased
        pnlAdd.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconAddMouseReleased

    private void lblTxtAddMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtAddMouseDragged
        pnlAdd.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblTxtAddMouseDragged

    private void lblIconAddMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAddMouseDragged
        pnlAdd.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconAddMouseDragged

    private void lblTxtEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMouseReleased
        pnlEdit.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblTxtEditMouseReleased

    private void lblIconEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMouseReleased
        pnlEdit.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconEditMouseReleased

    private void lblTxtEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMouseExited
        if (iE != 1) {
            pnlEdit.setBackground(new Color(101, 46, 14));            
        }
    }//GEN-LAST:event_lblTxtEditMouseExited

    private void lblIconEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMouseExited
        pnlEdit.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblIconEditMouseExited

    private void lblTxtEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMousePressed
        pnlEdit.setBackground(new Color(230, 36, 81));
        iH = 0;
        iD = 0;
        iE = 1;        
        iS = 0;
        iA = 0;
        resetColor(pnlAdd);
        resetColor(pnlDelete);
        resetColor(pnlHome);
        resetColor(pnlSearch);
    }//GEN-LAST:event_lblTxtEditMousePressed

    private void lblIconEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMousePressed
        pnlEdit.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconEditMousePressed

    private void lblTxtEditMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMouseDragged
        pnlEdit.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblTxtEditMouseDragged

    private void lblIconEditMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMouseDragged
        pnlEdit.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconEditMouseDragged

    private void lblTxtEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMouseClicked
        pnlEdit.setBackground(new Color(204, 0, 51));
        addPanel(pnlBigEdit);
    }//GEN-LAST:event_lblTxtEditMouseClicked

    private void lblIconEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMouseClicked
        pnlEdit.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconEditMouseClicked

    private void lblTxtEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtEditMouseEntered
        if (iE != 1) {
            pnlEdit.setBackground(new Color(232, 0, 54));
        }
    }//GEN-LAST:event_lblTxtEditMouseEntered

    private void lblIconEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconEditMouseEntered
        pnlEdit.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblIconEditMouseEntered

    private void lblTxtDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMouseClicked
        pnlDelete.setBackground(new Color(204, 0, 51));
        addPanel(pnlBigDelete);
    }//GEN-LAST:event_lblTxtDeleteMouseClicked

    private void lblIconDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMouseClicked
        pnlDelete.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconDeleteMouseClicked

    private void lblTxtDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMouseEntered
        if (iD != 1) {
            pnlDelete.setBackground(new Color(232, 0, 54));
        }
    }//GEN-LAST:event_lblTxtDeleteMouseEntered

    private void lblIconDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMouseEntered
        pnlDelete.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblIconDeleteMouseEntered

    private void lblTxtDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMouseExited
        if (iD != 1) {
            pnlDelete.setBackground(new Color(101, 46, 14));
        }
    }//GEN-LAST:event_lblTxtDeleteMouseExited

    private void lblIconDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMouseExited
        pnlDelete.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblIconDeleteMouseExited

    private void lblTxtDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMouseReleased
        pnlDelete.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblTxtDeleteMouseReleased

    private void lblIconDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMouseReleased
        pnlDelete.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconDeleteMouseReleased

    private void lblTxtDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMousePressed
        pnlDelete.setBackground(new Color(230, 36, 81));
        iH = 0;
        iD = 1;
        iE = 0;        
        iS = 0;
        iA = 0;
        resetColor(pnlAdd);
        resetColor(pnlHome);
        resetColor(pnlEdit);
        resetColor(pnlSearch);
    }//GEN-LAST:event_lblTxtDeleteMousePressed

    private void lblIconDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMousePressed
        pnlDelete.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconDeleteMousePressed

    private void lblTxtDeleteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtDeleteMouseDragged
        pnlDelete.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblTxtDeleteMouseDragged

    private void lblIconDeleteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDeleteMouseDragged
        pnlDelete.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconDeleteMouseDragged

    private void lblTxtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMouseClicked
        pnlSearch.setBackground(new Color(204, 0, 51));
        addPanel(pnlBigSearch);
    }//GEN-LAST:event_lblTxtSearchMouseClicked

    private void lblIconSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMouseClicked
        pnlSearch.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconSearchMouseClicked

    private void lblTxtSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMouseEntered
        if (iS != 1) {
            pnlSearch.setBackground(new Color(232, 0, 54));
        }
    }//GEN-LAST:event_lblTxtSearchMouseEntered

    private void lblIconSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMouseEntered
        pnlSearch.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblIconSearchMouseEntered

    private void lblTxtSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMouseExited
        if (iS != 1) {
            pnlSearch.setBackground(new Color(101, 46, 14));            
        }
    }//GEN-LAST:event_lblTxtSearchMouseExited

    private void lblIconSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMouseExited
        pnlSearch.setBackground(new Color(101, 46, 14));
    }//GEN-LAST:event_lblIconSearchMouseExited

    private void lblTxtSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMouseReleased
        pnlSearch.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblTxtSearchMouseReleased

    private void lblIconSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMouseReleased
        pnlSearch.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblIconSearchMouseReleased

    private void lblTxtSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMousePressed
        pnlSearch.setBackground(new Color(230, 36, 81));
        iH = 0;
        iD = 0;
        iE = 0;        
        iS = 1;
        iA = 0;
        resetColor(pnlAdd);
        resetColor(pnlDelete);
        resetColor(pnlEdit);
        resetColor(pnlHome);
    }//GEN-LAST:event_lblTxtSearchMousePressed

    private void lblIconSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMousePressed
        pnlSearch.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconSearchMousePressed

    private void lblTxtSearchMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTxtSearchMouseDragged
        pnlSearch.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblTxtSearchMouseDragged

    private void lblIconSearchMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSearchMouseDragged
        pnlSearch.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblIconSearchMouseDragged

    private void lblMinimizeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseDragged
        pnlMinimize.setBackground(new Color(159, 78, 31));
    }//GEN-LAST:event_lblMinimizeMouseDragged

    private void lblCloseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseDragged
        pnlClose.setBackground(new Color(255, 45, 45));
    }//GEN-LAST:event_lblCloseMouseDragged

    private void txtFUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsernameFocusGained
        
    }//GEN-LAST:event_txtFUsernameFocusGained

    private void txtFUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsernameFocusLost
          
    }//GEN-LAST:event_txtFUsernameFocusLost

    private void txtFUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsernameKeyTyped
        
    }//GEN-LAST:event_txtFUsernameKeyTyped

    private void txtAAddresseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAAddresseFocusGained
        if (txtAAddresse.getText().equals("Addresse")) {
            txtAAddresse.setText("");
            checkAddresse = true;
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        lblNoticeAddresse.setText("");        
        txtAAddresse.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtAAddresseFocusGained

    private void txtAAddresseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAAddresseFocusLost
        
        if (txtAAddresse.getText().equals("")) {
            txtAAddresse.setText("Addresse");
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddresse.setText("*Input addresse!");
            checkAddresse = false;
        }
        txtAAddresse.setForeground(new Color(204, 204, 204));
        
    }//GEN-LAST:event_txtAAddresseFocusLost

    private void lblEditPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPictureMouseClicked
        
        if (!checkPicture) {            
            lblEditPicture.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_2.png")));
            // get URL gambar yang dipilih di fileChooser
            url = "";
            JFileChooser flChoose = new JFileChooser(System.getProperty("user.home"));
            flChoose.setFileSelectionMode(JFileChooser.FILES_ONLY);
            flChoose.setFileFilter(new FileNameExtensionFilter("JPG/JPEG (Joint Photographic Experts Assemble)", "jpg", "jpeg"));
            flChoose.setFileFilter(new FileNameExtensionFilter("PNG (Portable Network Graphics)", "png"));
            flChoose.setFileFilter(new FileNameExtensionFilter("SVG (Scalable Vector Graphics)", "svg"));
            flChoose.setFileFilter(new FileNameExtensionFilter("BMP (Bitmap Pictures)", "bmp"));
            if (flChoose.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file= flChoose.getSelectedFile();
                url = file.getAbsolutePath();            
            }                   
            // set ke lblUser            
            lblUser.setIcon(settingImage(url,null));            
        }else{
            JOptionPane.showMessageDialog(null, "You have saved the picture\nClick \"Edit\" to change the picture", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_lblEditPictureMouseClicked

    private void txtFEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEmailFocusGained
//        if (txtFEmail.getText().equals("Email")) {
//            txtFEmail.setText("");
//        }
//        if (checkEmail) {            
//            lblNoticeEmail.setText("");
//        }
//        if (txtFEmail.getText().trim().length() == 0) {            
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));                        
//        }
//        txtFEmail.setForeground(new Color(255, 255, 255));
//        
    }//GEN-LAST:event_txtFEmailFocusGained

    private void txtFEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEmailFocusLost
//        if (txtFEmail.getText().equals("")) {
//            txtFEmail.setText("Email");            
//            lblNoticeEmail.setText("*Input Email!");
//        }else{
//            if (checkEmail) {                
//                lblNoticeEmail.setText("");
//            }
//        }
//        txtFEmail.setForeground(new Color(204, 204, 204));       
//        //check ketika txtFEmail ini tak diisi
//        if (txtFEmail.getText().equals("Email")) {
//            lblNoticeAddresse.setText("*Input email!");
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
//        }        
//        txtFEmail.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtFEmailFocusLost

    private void txtFEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEmailKeyTyped
//        // ubah ke null saat anda mulai mengetik
//        lblNoticeAddresse.setText("");
//        // check regex 
//        
//        String txt = txtFEmail.getText();
//        String regex = "[A-Za-z0-9._-]+\\@[a-z0-9._-]+\\.[A-Za-z0-9]{2,4}";
//                
//        checkEmail = Pattern.matches(regex, txt);
//        if (checkEmail) {
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
//        }else{
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png"))); 
//        }
        
                
    }//GEN-LAST:event_txtFEmailKeyTyped

    private void txtFEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEmailKeyReleased
//        // check regex jika kita baru saja menghapus salah satu huruf misal @
//        String txt = txtFEmail.getText();
//        String regex = "[A-Za-z0-9._-]+\\@[a-z0-9._-]+\\.[A-Za-z0-9]{2,4}";
//
//        checkEmail = Pattern.matches(regex, txt);
//        if (checkEmail) {
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
//        } else {
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
//        }
//        // supaya email bersifat unique
//        try {
//            ResultSet rs = connec.selectGeneral("profile");
//            // jika email sama
//            while (rs.next()) {
//                
//                if (rs.getString("email").equals(txt)) {
//                    lblNoticeEmail.setText("*Email already exists");
//                    lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
//                    checkEmail = false;
//                    break;
//                } else {
//                    lblNoticeEmail.setText("");
//                }
//            }
//        } catch (SQLException sqlEx) {
//            checkEmail = false;
//
//        }
        
    }//GEN-LAST:event_txtFEmailKeyReleased

    private void txtAAddresseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAAddresseKeyPressed
        if (txtAAddresse.getText().length() > 0  ) {
            checkAddresse = true;
            lblNoticeAddresse.setText("");
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_txtAAddresseKeyPressed

    private void lblSaveProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveProfileMouseClicked
        
        pnlSaveProfile.setBackground(new Color(204, 0, 51));
        
        // txtFUsername        
        if (txtFUsername1.getText().equals("Username")) {
            checkUsername = false;            
            lblNoticeUsername.setText("*Input Username!");
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));            
        } else if(txtFUsername1.getText().trim().equals("")){
            checkUsername = false;
            lblNoticeUsername.setText("*Input Username!");
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else{
            checkUsername = true;
            lblNoticeUsername.setText("");
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
            
        }        
        // txtFTelp
        if (txtFTelp.getText().length() < 10) {
            checkTelp = false;            
            lblNoticeTelp.setText("*Input telp!");
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else {
            checkTelp = true;
            lblNoticeTelp.setText("");
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
        // txtAAddresse
        if (txtAAddresse.getText().equals("Addresse")) {
            checkAddresse = false;
            lblNoticeAddresse.setText("*Input addresse!");
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else if(txtAAddresse.getText().trim().equals("")){
            checkAddresse = false;
            lblNoticeAddresse.setText("*Input addresse!");
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else{
            checkAddresse = true;
            lblNoticeAddresse.setText("");
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
            
        }
        // rbGender
        if (rbMale.isSelected()) {
            gender = rbMale.getText().toLowerCase();
            checkGender = true;
            lblNoticeGender.setText("");
            lblNoticeGenderIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));                        
        } else if (rbFemale.isSelected()) {
            gender = rbFemale.getText().toLowerCase();
            checkGender = true;
            lblNoticeGender.setText("");
            lblNoticeGenderIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));            
        } else {
            checkGender = false;
            lblNoticeGender.setText("*Choose gender!");
            lblNoticeGenderIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }        
//        // txtFEmail
//        if (txtFEmail.getText().equals("Email")) {                        
//            lblNoticeEmail.setText("*Input Email!");
//            lblNoticeEmailIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
//        }else if(txtFEmail.getText().trim().equals("")){
//            checkEmail = false;
//            if (checkEmail) {                
//                lblNoticeEmail.setText("");
//            }
//        }else{            
//            if (checkEmail) {
//                lblNoticeEmail.setText("");
//            }
//        }
        
        // masukkan ke database
        // menentukan kondisi apakah memakai insert atau update
        if (!checkEditWithSave) {            
            if (i == 0) {            
                if (checkUsername && checkTelp && checkAddresse && checkGender ) {
                    // set enabled pada rbMale dan rbFemale
                    if (rbMale.isSelected()) {                     
                       rbMale.setEnabled(true);
                       rbFemale.setEnabled(false);
                    } else if (rbFemale.isSelected()) {                     
                       rbMale.setEnabled(false);
                       rbFemale.setEnabled(true);
                    }
                    try {                
                       checkPicture = true;
                       checkEdit = true;                        
                        if (url.equals("")) {
                                connec.insertToDatabase("profile", txtFUsername1.getText().trim(), txtFTelp.getText().trim(),
                                    txtAAddresse.getText().trim(), gender, txtFEmail.getText().trim());
                        } else {                            
                            connec.insertToDatabase("profile", txtFUsername1.getText().trim(), txtFTelp.getText().trim(),
                                     txtAAddresse.getText().trim(), gender, txtFEmail.getText().trim(), url);                        
                        }
                                                                             

                       txtFUsername1.setEditable(false);
                       txtFEmail.setEditable(false);
                       txtFTelp.setEditable(false);
                       txtAAddresse.setEditable(false);                        
                       pnlBigHome.setFocusable(true);

                        txtFEmail.setForeground(new Color(204, 204, 204));
                       i++;
                    }catch (FileNotFoundException ex) {
                        // untuk email yang kemabr di database
                        JOptionPane.showMessageDialog(null, "Same email");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Input error\nPlease check again!", "Error input", JOptionPane.PLAIN_MESSAGE,
                            new ImageIcon(getClass().getResource("/icon/icons8_Restart_80px.png")));
                }
            }else{
                new NoticeForSave().setVisible(true);
            }
        }else{
            if (i == 0) {
                
                if (checkUsername && checkTelp && checkAddresse && checkGender ) { // email seharusnya ada, tapi tak ada
                    try {
                        if (url.equals("")) {
                            updateData(false);
                        } else {
                            updateData(true);
                        }                        
                        
                        txtFUsername1.setEditable(false);
                        txtFEmail.setEditable(false);
                        txtFTelp.setEditable(false);
                        txtAAddresse.setEditable(false);
                        pnlBigHome.setFocusable(true);

                        txtFEmail.setForeground(new Color(204, 204, 204));
                        i++;
                        
                        pnlBigHome.add(pnlSaveProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 70, 30));
                        lblSaveProfile.setText("Save");
                    } catch (SQLException ex) {
                        Logger.getLogger(MainWork.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MainWork.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Input error\nPlease check again!", "Error inputt", JOptionPane.PLAIN_MESSAGE,
                            new ImageIcon(getClass().getResource("/icon/icons8_Restart_80px.png")));
                    rbFemale.setEnabled(true);
                    rbMale.setEnabled(true);
                }
            }else{
                new NoticeForSave().setVisible(true);
            }
        }
        
    }//GEN-LAST:event_lblSaveProfileMouseClicked

    private void lblEditPictureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPictureMousePressed
        lblEditPicture.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_3.png")));
    }//GEN-LAST:event_lblEditPictureMousePressed

    private void lblEditPictureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPictureMouseEntered
        lblEditPicture.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_3.png")));
    }//GEN-LAST:event_lblEditPictureMouseEntered

    private void lblEditPictureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPictureMouseExited
        lblEditPicture.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_2.png")));
    }//GEN-LAST:event_lblEditPictureMouseExited

    private void lblEditPictureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPictureMouseReleased
        lblEditPicture.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Plus_40px_2.png")));
    }//GEN-LAST:event_lblEditPictureMouseReleased

    private void rbMaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMaleMouseClicked
        if (rbMale.isSelected()) {
            gender = rbMale.getText().toLowerCase();
            checkGender = true;
            lblNoticeGender.setText("");
            lblNoticeGenderIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_rbMaleMouseClicked

    private void rbFemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFemaleMouseClicked
        if (rbFemale.isSelected()) {
            gender = rbMale.getText().toLowerCase();
            checkGender = true;
            lblNoticeGender.setText("");
            lblNoticeGenderIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_rbFemaleMouseClicked

    private void pnlBigHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBigHomeMouseClicked
        pnlBigHome.setFocusable(true);
        txtFEmail.setForeground(new Color(204, 204, 204));
        txtFUsername1.setForeground(new Color(204, 204, 204));
        txtFTelp.setForeground(new Color(204, 204, 204));
        txtAAddresse.setForeground(new Color(204, 204, 204));
        
    }//GEN-LAST:event_pnlBigHomeMouseClicked

    private void lblEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditProfileMouseClicked
        i = 0;
        if (checkEdit) {            
            // menambah panjang pnlSaveProfile
            pnlBigHome.add(pnlSaveProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 101, 30));
            lblSaveProfile.setText("Save Edit");
            
            pnlEditProfile.setBackground(new Color(204, 0, 51));            
            checkEditWithSave = true;
            txtFUsername1.setEditable(true);
            txtFTelp.setEditable(true);
            txtAAddresse.setEditable(true);            
            rbMale.setEnabled(true);
            rbFemale.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Click Save first!");
        }
    }//GEN-LAST:event_lblEditProfileMouseClicked

    private void lblSaveProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveProfileMouseEntered
        pnlSaveProfile.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblSaveProfileMouseEntered

    private void lblEditProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditProfileMouseEntered
        pnlEditProfile.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblEditProfileMouseEntered

    private void lblSaveProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveProfileMouseExited
        pnlSaveProfile.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblSaveProfileMouseExited

    private void lblEditProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditProfileMouseExited
        pnlEditProfile.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblEditProfileMouseExited

    private void lblSaveProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveProfileMousePressed
        pnlSaveProfile.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblSaveProfileMousePressed

    private void lblEditProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditProfileMousePressed
        pnlEditProfile.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblEditProfileMousePressed

    private void lblSaveProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveProfileMouseReleased
        pnlSaveProfile.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblSaveProfileMouseReleased

    private void lblEditProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditProfileMouseReleased
        pnlEditProfile.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblEditProfileMouseReleased

    private void txtFUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsernameKeyReleased
        
    }//GEN-LAST:event_txtFUsernameKeyReleased

    private void txtAAddresseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAAddresseKeyReleased
        if (txtAAddresse.getText().trim().length() == 0) {
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else {
            lblNoticeAddresseIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_txtAAddresseKeyReleased

    private void txtFTelpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFTelpFocusGained
        if (txtFTelp.getText().trim().equals("Telp.")) {
            txtFTelp.setText("");
            checkTelp = true;
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        lblNoticeTelp.setText("");
        txtFTelp.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtFTelpFocusGained

    private void txtFTelpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFTelpFocusLost
        if (txtFTelp.getText().trim().equals("")) {
            txtFTelp.setText("Telp.");
            checkTelp = false;
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }else{
            lblNoticeTelp.setText("");
        }        
        txtFTelp.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtFTelpFocusLost

    private void txtFTelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFTelpKeyReleased
        if (txtFTelp.getText().length() < 10) {
            lblNoticeTelp.setText("*Must be more than 10 numbers");
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            checkTelp = false;
        } else if (txtFTelp.getText().length() >= 10 && txtFTelp.getText().length() < 14) {
            checkTelp = true;
            lblNoticeTelp.setText("");
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
            
        }
    }//GEN-LAST:event_txtFTelpKeyReleased

    private void txtFTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFTelpKeyTyped
        Character c = evt.getKeyChar();
        if (!c.isDigit(c)) {
            evt.consume();
        }
        
        if (txtFTelp.getText().length() == 14) {
            lblNoticeTelp.setText("Max 14 digit");
            checkTelp = true;
            evt.consume();            
        }
        if (txtFTelp.getText().length() < 10) {
            lblNoticeTelp.setText("*Must be more than 10 numbers");
            lblNoticeTelpIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            checkTelp = false;
        }
    }//GEN-LAST:event_txtFTelpKeyTyped

    private void txtFUsername2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsername2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUsername2FocusGained

    private void txtFUsername2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsername2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUsername2FocusLost

    private void txtFUsername2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsername2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUsername2KeyReleased

    private void txtFUsername2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsername2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUsername2KeyTyped

    private void txtFUsername1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsername1FocusGained
        if (txtFUsername1.getText().equals("Username")) {
            txtFUsername1.setText("");
            checkUsername = true;
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        lblNoticeUsername.setText("");
        txtFUsername1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtFUsername1FocusGained

    private void txtFUsername1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFUsername1FocusLost
        if (txtFUsername1.getText().equals("")) {
            txtFUsername1.setText("Username");
            lblNoticeUsernameIcon.setIcon(null);
            lblNoticeUsername.setText("*Input Username!");
            checkUsername = false;
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else {
            lblNoticeUsername.setText("");
        }
        txtFUsername1.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtFUsername1FocusLost

    private void txtFUsername1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsername1KeyReleased
        if (txtFUsername1.getText().trim().length() == 0) {
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        } else {
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_txtFUsername1KeyReleased

    private void txtFUsername1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFUsername1KeyTyped
        if (txtFUsername1.getText().length() == 30) {
            lblNoticeUsername.setText("*30 letters maximum");
            evt.consume();
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        } else if (txtFUsername1.getText().length() == 0) {
            lblNoticeUsernameIcon.setIcon(null);
        } else {
            lblNoticeUsername.setText("");
            lblNoticeUsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
        checkUsername = true;
    }//GEN-LAST:event_txtFUsername1KeyTyped

    private void txtFAddIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddIDFocusGained
        if (txtFAddID.getText().trim().equals("ID")) {
            checkAddID = true;
            txtFAddID.setText("");
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));            
        }
        txtFAddID.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtFAddIDFocusGained

    private void txtFAddIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddIDFocusLost
        if (txtFAddID.getText().trim().equals("")) {
            checkAddID = false;
            txtFAddID.setText("ID");
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));            
        }
        txtFAddID.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtFAddIDFocusLost

    private void txtFAddIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddIDKeyTyped
        Character c = evt.getKeyChar();
        
        if (!c.isDigit(c)) {
            evt.consume();
        }
        if (txtFAddID.getText().trim().length() == 4) {
            evt.consume();
        }else if (txtFAddID.getText().trim().length() == 0){
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        
        
    }//GEN-LAST:event_txtFAddIDKeyTyped

    private void txtFAddIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddIDKeyReleased
        
        if (txtFAddID.getText().trim().length() == 4) {
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
        if (txtFAddID.getText().trim().length() > 0) {
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
            checkAddID = true;
        }
    }//GEN-LAST:event_txtFAddIDKeyReleased

    private void txtFAddNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddNameFocusGained
        if (txtFAddName.getText().trim().equals("Name")) {
            checkAddName = true;
            txtFAddName.setText("");
            lblNoticeAddName.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        txtFAddName.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtFAddNameFocusGained

    private void txtFAddNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddNameFocusLost
        if (txtFAddName.getText().trim().equals("")) {
            checkAddName = false;
            txtFAddName.setText("Name");
            lblNoticeAddName.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        txtFAddName.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtFAddNameFocusLost

    private void txtFAddNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddNameKeyReleased
        if (txtFAddName.getText().trim().length() > 0) {
            checkAddName = true;
            lblNoticeAddName.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_txtFAddNameKeyReleased

    private void txtFAddNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddNameKeyTyped
        if (txtFAddName.getText().trim().length() == 0) {
            checkAddName = false;
            lblNoticeAddName.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
    }//GEN-LAST:event_txtFAddNameKeyTyped

    private void txtAAddAddresseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAAddAddresseFocusGained
        if (txtAAddAddresse.getText().trim().equals("Addresse")) {
            checkAddAddresse = true;
            txtAAddAddresse.setText("");
            lblNoticeAddAddresse.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        txtAAddAddresse.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_txtAAddAddresseFocusGained

    private void txtAAddAddresseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAAddAddresseFocusLost
        if (txtAAddAddresse.getText().trim().equals("")) {
            checkAddAddresse = false;
            txtAAddAddresse.setText("Addresse");
            lblNoticeAddAddresse.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
        txtAAddAddresse.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtAAddAddresseFocusLost

    private void txtAAddAddresseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAAddAddresseKeyReleased
        if (txtAAddAddresse.getText().trim().length() > 0) {
            checkAddAddresse = true;
            lblNoticeAddAddresse.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }
    }//GEN-LAST:event_txtAAddAddresseKeyReleased

    private void txtAAddAddresseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAAddAddresseKeyTyped
        if (txtAAddAddresse.getText().trim().length() == 0) {
            checkAddAddresse = false;
            lblNoticeAddAddresse.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
    }//GEN-LAST:event_txtAAddAddresseKeyTyped

    private void rbAddGenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAddGenderMaleActionPerformed
        if (rbAddGenderMale.isSelected()) {
            checkAddGender = true;
            addGender = new StringBuffer(rbAddGenderMale.getText().toLowerCase());
            rbAddGenderMale.setForeground(new Color(255, 255, 255));
            rbAddGenderFemale.setForeground(new Color(204, 204, 204));
            lblNoticeAddGender.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }        
    }//GEN-LAST:event_rbAddGenderMaleActionPerformed

    private void rbAddGenderFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAddGenderFemaleActionPerformed
        if (rbAddGenderFemale.isSelected()) {
            checkAddGender = true;
            addGender = new StringBuffer(rbAddGenderFemale.getText().toLowerCase());
            rbAddGenderFemale.setForeground(new Color(255, 255, 255));
            rbAddGenderMale.setForeground(new Color(204, 204, 204));
            lblNoticeAddGender.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        }                
    }//GEN-LAST:event_rbAddGenderFemaleActionPerformed

    private void txtFAddDepartmentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddDepartmentFocusGained
        
    }//GEN-LAST:event_txtFAddDepartmentFocusGained

    private void txtFAddDepartmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFAddDepartmentFocusLost

    }//GEN-LAST:event_txtFAddDepartmentFocusLost

    private void txtFAddDepartmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddDepartmentKeyTyped
        
    }//GEN-LAST:event_txtFAddDepartmentKeyTyped

    private void txtFAddDepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFAddDepartmentKeyReleased
        
    }//GEN-LAST:event_txtFAddDepartmentKeyReleased

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        pnlAddAdd.setBackground(new Color(232, 0, 54));
        
        // --------
        if (checkAddID && checkAddName && checkAddAddresse && checkAddGender
                && checkAddSchool && checkAddDepartment ) {
            
            addDataSiswa(txtFAddID.getText(), txtFAddName.getText().trim(),
                    txtAAddAddresse.getText().trim(), addGender.toString().toLowerCase(),
                    lblAddSchool.getText().trim().toLowerCase(), addDepart.toString());
            showData();
            
            // fokuskan ke pnlBigAdd
            pnlBigAdd.setFocusable(true);
            // off kan inputan
            txtFAddID.setText("ID");
            txtFAddName.setText("Name");
            txtAAddAddresse.setText("Addresse");
            rbAddGenderFemale.setSelected(false);
            rbAddGenderMale.setSelected(false);
            lblAddSchool.setText("   Select school");
            lblAddDepart.setText("   Select school first!");
            pnlBackDepartSMK1Tlng.setVisible(false);
            pnlBackDepartSMK2Klt.setVisible(false);
            pnlBackgroundAddSchool.setVisible(false);
            // agar bisa diklik kembali
            clickSchool = 0;
            clickDepart = 0;
            // kosongkan icon
            lblNoticeAddAddresse.setIcon(null);
            lblNoticeAddDepartment.setIcon(null);
            lblNoticeAddGender.setIcon(null);
            lblNoticeAddID.setIcon(null);
            lblNoticeAddName.setIcon(null);
            lblNoticeAddSchool.setIcon(null);
            // ubah ke false
            checkAddAddresse = false;
            checkAddDepartment = false;
            checkAddGender = false;
            checkAddID = false;
            checkAddName = false;
            checkAddSchool = false;
            
            jLabel3.setText("Sukses");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {}
            jLabel3.setText("");
        }else{
            pnlBigAdd.setFocusable(true);
            JOptionPane.showMessageDialog(null, "Input error\nPlease check again!", "Error input", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource("/icon/icons8_Restart_80px.png")));
            lblNoticeAddID.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddName.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddAddresse.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddSchool.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
            lblNoticeAddGender.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Delete_25px.png")));
        }
    }//GEN-LAST:event_lblAddMouseClicked

    private void lblAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseExited
        pnlAddAdd.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblAddMouseExited

    private void lblAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseEntered
        pnlAddAdd.setBackground(new Color(232, 0, 54));        
    }//GEN-LAST:event_lblAddMouseEntered

    private void lblAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMousePressed
        pnlAddAdd.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblAddMousePressed

    private void lblAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseReleased
        pnlAddAdd.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblAddMouseReleased

    private void pnlAddSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddSchoolMouseClicked
        
        if (clickSchool == 0) {
            lblAddSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
            pnlBackgroundAddSchool.setVisible(true);            
            clickSchool++;            
        } else {
            lblAddSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
            pnlBackgroundAddSchool.setVisible(false);
            clickSchool--;
        }
        
    }//GEN-LAST:event_pnlAddSchoolMouseClicked

    private void pnlBackgroundAddSchoolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlBackgroundAddSchoolKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBackgroundAddSchoolKeyPressed

    private void pnlBackgroundAddSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundAddSchoolMouseClicked
        
    }//GEN-LAST:event_pnlBackgroundAddSchoolMouseClicked

    private void lblAddSchoolSMK1TlngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSchoolSMK1TlngMouseClicked
        checkAddSchool = true;
        afterClickSchool = true;
        //----
        lblNoticeAddSchool.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        StringBuffer s = new StringBuffer(lblAddSchoolSMK1Tlng.getText());
        lblAddSchool.setText(s.toString());
        // ketika sudah klik maka, cbDepartment akan terbuka
        isClickSchool = true;
        // cbDepart bagian SMKN1 Tlng akan tertampil
        isClickSMK1Tlng = true;
        isClickSMK2Klt = false;
        isClickSMA1Krng = false;
        lblAddDepart.setText("   Depart SMKN 1 Tulung");
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        
        // menonaktifkan panel Departement yang bukan SMK 1 Tulung
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
        
        
        clickSchool--;
        lblAddSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackgroundAddSchool.setVisible(false);
    }//GEN-LAST:event_lblAddSchoolSMK1TlngMouseClicked

    private void lblAddSchoolSMK2KltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSchoolSMK2KltMouseClicked
        checkAddSchool = true;
        afterClickSchool = true;
        // ------
        lblNoticeAddSchool.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        StringBuffer s = new StringBuffer(lblAddSchoolSMK2Klt.getText());
        lblAddSchool.setText(s.toString());
        // ketika sudah klik maka, cbDepartment akan terbuka
        isClickSchool = true;
        // cbDepart bagian SMKN 2 kLT akan tertampil
        isClickSMK1Tlng = false;
        isClickSMK2Klt = true;
        isClickSMA1Krng = false;
        lblAddDepart.setText("   Depart SMKN 2 Klaten");
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        
        // menonaktifkan panel Departement yang bukan SMK 2 Klaten
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
        
        
        clickSchool--;
        lblAddSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackgroundAddSchool.setVisible(false);
    }//GEN-LAST:event_lblAddSchoolSMK2KltMouseClicked

    private void lblAddSchoolSMKN1KarngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSchoolSMKN1KarngMouseClicked
        checkAddSchool = true;
        afterClickSchool = true;
        //------
        lblNoticeAddSchool.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        StringBuffer s = new StringBuffer(lblAddSchoolSMKN1Karng.getText());
        lblAddSchool.setText(s.toString());
        // ketika sudah klik maka, cbDepartment akan terbuka
        isClickSchool = true;
        // cbDepart bagian SMA 1 Krng akan tertampil
        isClickSMK1Tlng = false;
        isClickSMK2Klt = false;
        isClickSMA1Krng = true;
        lblAddDepart.setText("   Depart SMAN 1 Karanganom");
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
        clickSchool--;
        lblAddSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackgroundAddSchool.setVisible(false);
    }//GEN-LAST:event_lblAddSchoolSMKN1KarngMouseClicked

    private void lblAddSchoolSMK1TlngMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSchoolSMK1TlngMouseEntered
        
    }//GEN-LAST:event_lblAddSchoolSMK1TlngMouseEntered

    private void pnlAddDepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddDepartMouseClicked
        if (afterClickSchool) {            
            if (clickDepart == 0) {            
                if (isClickSMK1Tlng) {
                    lblDepartATR.setText("   ATR (Agribisnis Ternak Ruminansia)");
                    lblDepartTKJ.setText("   TKJ (Teknik Komputer dan Jaringan)");
                    lblDepartTKR.setText("   TKR (Teknik Kendaraan Ringan)");
                    pnlBackDepartSMK1Tlng.setVisible(true);                    
                } else if (isClickSMK2Klt) { 
                    lblDepartATR.setText("   SIJA (Sistem Informasi Jaringan dan Aplikasi)");
                    lblDepartTKJ.setText("   TEDK (Teknik Elketronika Daya dan Komunikasi)");
                    lblDepartTKR.setText("   TFLM (Teknik Fabrikasi Logam dan Manufacture)");
                    pnlBackDepartSMK1Tlng.setVisible(true);
                    pnlBackDepartSMK2Klt.setVisible(true);
                    
                } else if (isClickSMA1Krng) {
                    lblDepartATR.setText("   IPA (Ilmu Pengetahuan Alam)");
                    lblDepartTKJ.setText("   Matematika)");
                    lblDepartTKR.setText("   Ilmu Bahasa");
                    lblDepartDPIB.setText("   IPS (Ilmu Pengetahuan Sosial)");
                    lblDepartTMPO.setText("   Geografi");
                    pnlBackDepartSMK1Tlng.setVisible(true);
                    pnlBackDepartSMK2Klt.setVisible(true);
                }
                clickDepart++;
                lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
            }else{
                lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
                pnlBackDepartSMK1Tlng.setVisible(false);
                pnlBackDepartSMK2Klt.setVisible(false);      
                clickDepart--;
            }
        }
        
    }//GEN-LAST:event_pnlAddDepartMouseClicked

    private void lblDepartATRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepartATRMouseClicked
        checkAddDepartment = true;
        //----
        lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        if (lblDepartATR.getText().contains("ATR")) {
            addDepart = new StringBuffer("agribisnis ternak ruminansia");
            lblAddDepart.setText("   ATR");
        } else if (lblDepartATR.getText().contains("SIJA")) {
            addDepart = new StringBuffer("sistem informasi jaringan dan aplikasi");
            lblAddDepart.setText("   SIJA");
        } else {
            addDepart = new StringBuffer("ilmu pengetahuan alam");
            lblAddDepart.setText("   IPA");
        }
        clickDepart--;
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        // hidden kan
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
    }//GEN-LAST:event_lblDepartATRMouseClicked

    private void lblDepartTKJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepartTKJMouseClicked
        checkAddDepartment = true;
        //----
        lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        if (lblDepartTKJ.getText().contains("TKJ")) {
            addDepart = new StringBuffer("teknik komputer jaringan");
            lblAddDepart.setText("   TKJ");
        } else if (lblDepartTKJ.getText().contains("TEDK")) {
            addDepart = new StringBuffer("teknik elektronika daya dan komunikasi");
            lblAddDepart.setText("   TEDK");
        } else {
            addDepart = new StringBuffer("matematika");
            lblAddDepart.setText("   Matematika");
        }
        clickDepart--;
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
    }//GEN-LAST:event_lblDepartTKJMouseClicked

    private void lblDepartTKRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepartTKRMouseClicked
        checkAddDepartment = true;
        //----
        lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        if (lblDepartTKR.getText().contains("TKR")) {
            addDepart = new StringBuffer("teknik kendaraan ringan");
            lblAddDepart.setText("   TKR");
        } else if (lblDepartTKR.getText().contains("TFLM")) {
            addDepart = new StringBuffer("teknik fabrikasi logam dan manufacture");
            lblAddDepart.setText("   TFLM");
        } else {
            addDepart = new StringBuffer("ilmu bahasa");
            lblAddDepart.setText("   Ilmu Bahasa");
        }
        clickDepart--;
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
    }//GEN-LAST:event_lblDepartTKRMouseClicked

    private void lblDepartTMPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepartTMPOMouseClicked
        checkAddDepartment = true;
        //----
        lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        if (lblDepartTMPO.getText().contains("TMPO")) {
            addDepart = new StringBuffer("teknik manaejemen perawatan otomotif");
            lblAddDepart.setText("   TMPO");
        } else {
            addDepart = new StringBuffer("geografi");
            lblAddDepart.setText("   Geografi");
        } 
        clickDepart--;
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
    }//GEN-LAST:event_lblDepartTMPOMouseClicked

    private void lblDepartDPIBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepartDPIBMouseClicked
        checkAddDepartment = true;
        //----
        lblNoticeAddDepartment.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Checkmark_25px.png")));
        if (lblDepartDPIB.getText().contains("DPIB")) {
            addDepart = new StringBuffer("desain permodelan informasi dan bangunan");
            lblAddDepart.setText("   DPIB");
        } else {
            addDepart = new StringBuffer("ilmu pengetahuan sosial");
            lblAddDepart.setText("   IPS");
        }
        clickDepart--;
        lblAddDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        pnlBackDepartSMK1Tlng.setVisible(false);
        pnlBackDepartSMK2Klt.setVisible(false);
    }//GEN-LAST:event_lblDepartDPIBMouseClicked

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void txtFEditIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEditIDFocusGained
        if (txtFEditID.getText().trim().equals("ID")) {
            checkEditID = true;
            txtFEditID.setText("");            
        }        
    }//GEN-LAST:event_txtFEditIDFocusGained

    private void txtFEditIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEditIDFocusLost
        if (txtFEditID.getText().trim().equals("")) {            
            txtFEditID.setText("ID");            
        }        
    }//GEN-LAST:event_txtFEditIDFocusLost

    private void txtFEditNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEditNameFocusGained
        if (txtFEditName.getText().trim().equals("Name")) {
            checkEditName = true;
            txtFEditName.setText("");
        }
    }//GEN-LAST:event_txtFEditNameFocusGained

    private void txtFEditNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFEditNameFocusLost
        if (txtFEditName.getText().trim().equals("")) {            
            txtFEditName.setText("Name");
        }
    }//GEN-LAST:event_txtFEditNameFocusLost

    private void txtAEditAddresseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAEditAddresseFocusGained
        if (txtAEditAddresse.getText().trim().equals("Addresse")) {
            checkEditAddresse = true;
            txtAEditAddresse.setText("");
        }
    }//GEN-LAST:event_txtAEditAddresseFocusGained

    private void txtAEditAddresseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAEditAddresseFocusLost
        if (txtAEditAddresse.getText().trim().equals("")) {            
            txtAEditAddresse.setText("Addresse");
        }
    }//GEN-LAST:event_txtAEditAddresseFocusLost

    private void cbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNameActionPerformed
        if (cbName.isSelected()) {
            checkEditName = true;
            txtFEditName.setEditable(true);
            txtFEditName.setFocusable(true);
            txtFEditName.setForeground(new Color(255, 255, 255));
        }else{
            editName = new StringBuffer("");
            checkEditName = false;
            txtFEditName.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cbNameActionPerformed

    private void cbAddresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddresseActionPerformed
        if (cbAddresse.isSelected()) {
            checkEditAddresse = true;
            txtAEditAddresse.setEditable(true);
            txtAEditAddresse.setFocusable(true);
            txtAEditAddresse.setForeground(new Color(255, 255, 255));
        }else{
            editAddresse = new StringBuffer("");
            checkEditAddresse = false;
            txtAEditAddresse.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cbAddresseActionPerformed

    private void rbEditMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEditMaleActionPerformed
        if (rbEditMale.isSelected()) {
            checkEditGender = true;
            editGender = new StringBuffer("male");
            rbEditMale.setForeground(new Color(255, 255, 255));
            rbEditFemale.setForeground(new Color(204, 204, 204));
        }else{
            checkEditGender = false;
        }
    }//GEN-LAST:event_rbEditMaleActionPerformed

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        if (cbGender.isSelected()) {
            cbGender.setForeground(new Color(255, 255, 255));
            checkEditGender = true;
            rbEditMale.setEnabled(true);
            rbEditFemale.setEnabled(true);
        }else{            
            cbGender.setForeground(new Color(204, 204, 204));
            editGender = new StringBuffer("");
            checkEditGender = false;
            rbEditMale.setEnabled(false);
            rbMale.setSelected(false);
            rbEditFemale.setEnabled(false);
            rbFemale.setSelected(false);
        }
    }//GEN-LAST:event_cbGenderActionPerformed

    private void rbEditFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEditFemaleActionPerformed
        if (rbEditFemale.isSelected()) {
            checkEditGender = true;
            editGender = new StringBuffer("female");
            rbEditFemale.setForeground(new Color(255, 255, 255));
            rbEditMale.setForeground(new Color(204, 204, 204));
        }else{
            checkEditGender = false;
        }
    }//GEN-LAST:event_rbEditFemaleActionPerformed

    private void rbcWthRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcWthRowActionPerformed

    }//GEN-LAST:event_rbcWthRowActionPerformed

    private void cbEditSchDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditSchDepartActionPerformed
        if (cbEditSchDepart.isSelected()) {
            checkEditSchool = true;
            checkEditDepartment = true;
            
            isClickCbSchDprt = true;
            lblEditSchool.setForeground(new Color(255, 255, 255));
            lblEditDepart.setForeground(new Color(255, 255, 255));
        }else{            
            editSchool = new StringBuffer("");
            editDepart = new StringBuffer("");
            
            checkEditSchool = false;
            checkEditDepartment = false;
            
            pnlEditBackSchool.setVisible(false);
            pnlEditBackDepart1.setVisible(false);
            pnlEditBackDepart2.setVisible(false);
            isClickCbSchDprt = false;           
            lblEditSchool.setForeground(new Color(204, 204, 204));
            lblEditDepart.setForeground(new Color(204, 204, 204));            
        }
    }//GEN-LAST:event_cbEditSchDepartActionPerformed

    private void pnlEditSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditSchoolMouseClicked
        if (isClickCbSchDprt) {
            if (clickEditSchool == 0) {
                lblEditSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
                pnlEditBackSchool.setVisible(true);                
                clickEditSchool++;
            } else {
                lblEditSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
                pnlEditBackSchool.setVisible(false);
                clickEditSchool--;
            }
        }
    }//GEN-LAST:event_pnlEditSchoolMouseClicked

    private void lblEditSchoolSMK1TlngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditSchoolSMK1TlngMouseClicked

        checkEditSchool = true;        

        // yg terjadi pada Edit School
        lblEditSchool.setText(" "+lblEditSchoolSMK1Tlng.getText());
        pnlEditBackSchool.setVisible(false);
        lblEditSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickEditSchool--;
        
        // yg terjadi pada Edit Depart        
        afterClickEditSchool = true;
        isClickEditSMK1Tlng = true;
        isClickEditSMK2Klt = false;
        isClickEditSMA1Krng = false;
        if (clickEditDepart == 1) {
            clickEditDepart--;
        }
        
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        
        lblEditDepart.setText("   Depart SMKN 1 Tulung");
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        
        editSchool = new StringBuffer(lblEditSchool.getText().trim().toLowerCase());
    }//GEN-LAST:event_lblEditSchoolSMK1TlngMouseClicked

    private void lblEditSchoolSMK2KltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditSchoolSMK2KltMouseClicked
        checkEditSchool = true;        
        
        lblEditSchool.setText(" " + lblEditSchoolSMK2Klt.getText());
        pnlEditBackSchool.setVisible(false);
        lblEditSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickEditSchool--;
        
        afterClickEditSchool = true;
        isClickEditSMK1Tlng = false;
        isClickEditSMK2Klt = true;
        isClickEditSMA1Krng = false;
        if (clickEditDepart == 1) {            
            clickEditDepart--;
        }
        
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        
        lblEditDepart.setText("   Depart SMKN 2 Klaten");
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        editSchool = new StringBuffer(lblEditSchool.getText().trim().toLowerCase());
    }//GEN-LAST:event_lblEditSchoolSMK2KltMouseClicked

    private void lblEditSchoolSMA1KarngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditSchoolSMA1KarngMouseClicked
        checkEditSchool = true;        
        
        lblEditSchool.setText(" " + lblEditSchoolSMA1Karng.getText());
        pnlEditBackSchool.setVisible(false);
        lblEditSchoolIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickEditSchool--;
        
        afterClickEditSchool = true;
        isClickEditSMK1Tlng = false;
        isClickEditSMK2Klt = false;
        isClickEditSMA1Krng = true;
        if (clickEditDepart == 1) {
            clickEditDepart--;
        }
        
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        
        lblEditDepart.setText("   Depart SMAN 1 Karanganom");
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        
        editSchool = new StringBuffer(lblEditSchool.getText().trim().toLowerCase());
    }//GEN-LAST:event_lblEditSchoolSMA1KarngMouseClicked

    private void pnlEditDepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditDepartMouseClicked
        if (afterClickEditSchool) {
            if (clickEditDepart == 0) {
                if (isClickEditSMK1Tlng) {                    
                    lblEditDepartATR.setText("  ATR (Agribisnis Ternak Ruminansia)");
                    lblEditDepartTKJ.setText("  TKJ (Teknik Komputer dan Jaringan)");
                    lblEditDepartTKR.setText("  TKR (Teknik Kendaraan Ringan)");
                    pnlEditBackDepart1.setVisible(true);
                } else if (isClickEditSMK2Klt) {
                    lblEditDepartATR.setText("  SIJA (Sistem Informasi Jaringan dan Aplikasi)");
                    lblEditDepartTKJ.setText("  TEDK (Teknik Elketronika Daya dan Komunikasi)");
                    lblEditDepartTKR.setText("  TFLM (Teknik Fabrikasi Logam dan Manufacture)");
                    pnlEditBackDepart1.setVisible(true);
                    pnlEditBackDepart2.setVisible(true);
                } else if (isClickEditSMA1Krng) {
                    lblEditDepartATR.setText("  IPA (Ilmu Pengetahuan Alam)");
                    lblEditDepartTKJ.setText("  Matematika)");
                    lblEditDepartTKR.setText("  Ilmu Bahasa");
                    lblEditDepartDPIB.setText("  IPS (Ilmu Pengetahuan Sosial)");
                    lblEditDepartTMPO.setText("  Geografi");
                    pnlEditBackDepart1.setVisible(true);
                    pnlEditBackDepart2.setVisible(true);
                }
                clickEditDepart++;
                lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
            } else {
                lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
                pnlEditBackDepart1.setVisible(false);
                pnlEditBackDepart2.setVisible(false);
                clickEditDepart--;
            }                             
   
        }
    }//GEN-LAST:event_pnlEditDepartMouseClicked

    private void lblEditDepartATRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditDepartATRMouseClicked
        checkEditDepartment = true;
        
        if (lblEditDepartATR.getText().contains("ATR")) {
            editDepart = new StringBuffer("agribisnis ternak ruminansia");
            lblEditDepart.setText("   ATR");
        } else if (lblEditDepartATR.getText().contains("SIJA")) {
            editDepart = new StringBuffer("sistem informasi jaringan dan aplikasi");
            lblEditDepart.setText("   SIJA");
        } else {
            editDepart = new StringBuffer("ilmu pengetahuan alam");
            lblEditDepart.setText("   IPA");
        }
        clickEditDepart--;
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));                
    }//GEN-LAST:event_lblEditDepartATRMouseClicked

    private void lblEditDepartTKJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditDepartTKJMouseClicked
        checkEditDepartment = true;
        
        if (lblEditDepartTKJ.getText().contains("TKJ")) {
            editDepart = new StringBuffer("teknik komputer jaringan");
            lblEditDepart.setText("   TKJ");
        } else if (lblEditDepartTKJ.getText().contains("TEDK")) {
            editDepart = new StringBuffer("teknik elektronika daya dan komunikasi");
            lblEditDepart.setText("   TEDK");
        } else {
            editDepart = new StringBuffer("matematika");
            lblEditDepart.setText("   Matematika");
        }
        clickEditDepart--;
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));                
    }//GEN-LAST:event_lblEditDepartTKJMouseClicked

    private void lblEditDepartTKRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditDepartTKRMouseClicked
        checkEditDepartment = true;
        
        if (lblEditDepartTKR.getText().contains("TKR")) {
            editDepart = new StringBuffer("teknik kendaraan ringan");
            lblEditDepart.setText("   TKR");
        } else if (lblEditDepartTKR.getText().contains("TFLM")) {
            editDepart = new StringBuffer("teknik fabrikasi logam dan manufacture");
            lblEditDepart.setText("   TFLM");
        } else {
            editDepart = new StringBuffer("ilmu bahasa");
            lblEditDepart.setText("   Ilmu Bahasa");
        }
        clickEditDepart--;
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));                
    }//GEN-LAST:event_lblEditDepartTKRMouseClicked

    private void lblEditDepartTMPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditDepartTMPOMouseClicked
        checkEditDepartment = true;
        
        if (lblEditDepartTMPO.getText().contains("TMPO")) {
            editDepart = new StringBuffer("teknik manaejemen perawatan otomotif");
            lblEditDepart.setText("   TMPO");
        } else {
            editDepart = new StringBuffer("geografi");
            lblEditDepart.setText("   Geografi");
        }
        clickEditDepart--;
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));                
    }//GEN-LAST:event_lblEditDepartTMPOMouseClicked

    private void lblEditDepartDPIBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditDepartDPIBMouseClicked
        checkEditDepartment = true;
        
        if (lblEditDepartDPIB.getText().contains("DPIB")) {
            editDepart = new StringBuffer("desain permodelan informasi dan bangunan");
            lblEditDepart.setText("   DPIB");
        } else {
            editDepart = new StringBuffer("ilmu pengetahuan sosial");
            lblEditDepart.setText("   IPS");
        }
        clickEditDepart--;
        pnlEditBackDepart1.setVisible(false);
        pnlEditBackDepart2.setVisible(false);
        lblEditDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
    }//GEN-LAST:event_lblEditDepartDPIBMouseClicked

    private void lblEditEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEditMouseClicked
        pnlEditEdit.setBackground(new Color(232, 0, 54));
        System.out.println(txtFEditID.getText());        
        System.out.println(txtFEditName.getText());        
        System.out.println(txtAEditAddresse.getText());        
        
        try{
            conn = connec.getConnection();            
            if (checkEditName) {
                String s = "UPDATE siswa SET name = ? where id = ?";
                PreparedStatement ps = conn.prepareStatement(s);
                ps.setString(1, txtFEditName.getText().trim());
                ps.setString(2, txtFEditID.getText());
                ps.execute();
                showData();
            }
            if (checkEditAddresse) {
                String s = "UPDATE siswa SET addresse = ? where id = ?";
                PreparedStatement ps = conn.prepareStatement(s);
                ps.setString(1, txtAEditAddresse.getText().trim());
                ps.setString(2, txtFEditID.getText());
                ps.execute();
                showData();
            }
            if (checkEditGender) {
                String s = "UPDATE siswa SET gender = ? where id = ?";
                PreparedStatement ps = conn.prepareStatement(s);
                ps.setString(1, editGender.toString());
                ps.setString(2, txtFEditID.getText());
                ps.execute();
                showData();
            }
            //System.out.println(editSchool.toString()+"\n"+editDepart.toString()+"\n"+checkEditSchool+"\n"+checkEditDepartment);
            
            if (checkEditSchool && checkEditDepartment) {
                String s = "UPDATE siswa SET school = ?, department = ? where id = ?";
                PreparedStatement ps = conn.prepareStatement(s);
                
                ps.setString(1, editSchool.toString());
                ps.setString(2, editDepart.toString());
                ps.setString(3, txtFEditID.getText());
                ps.executeUpdate();
                showData();
            }
        }catch(SQLException sql){
            Logger.getLogger(MainWork.class.getName()).log(Level.SEVERE, null, sql);
        }    
        
    }//GEN-LAST:event_lblEditEditMouseClicked

    private void txtFEditIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEditIDKeyReleased
        editID = new StringBuffer(txtFEditID.getText().trim());
    }//GEN-LAST:event_txtFEditIDKeyReleased

    private void txtFEditNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEditNameKeyReleased
        editName = new StringBuffer(txtFEditName.getText().trim());
    }//GEN-LAST:event_txtFEditNameKeyReleased

    private void txtAEditAddresseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAEditAddresseKeyReleased
        editAddresse = new StringBuffer(txtAEditAddresse.getText().trim());
    }//GEN-LAST:event_txtAEditAddresseKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Help_24px.png")));
        new Help().setVisible(true);        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Help_24px_1.png")));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Help_24px.png")));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Help_24px_1.png")));
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Help_24px.png")));
    }//GEN-LAST:event_jLabel4MouseReleased

    private void tblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditMouseClicked
        int i = tblEdit.getSelectedRow();        
        if (i > -1) {
            txtFEditID.setText(tblEdit.getValueAt(i, 0).toString());
            txtFEditName.setText(tblEdit.getValueAt(i, 1).toString());
            txtAEditAddresse.setText(tblEdit.getValueAt(i, 2).toString());
            if (tblEdit.getValueAt(i, 3).toString().equals("male")) {
                rbEditMale.setSelected(true);
            } else {
                rbEditFemale.setSelected(true);
            }
            lblEditSchool.setText("   "+tblEdit.getValueAt(i, 4).toString());
            lblEditDepart.setText("   "+tblEdit.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_tblEditMouseClicked

    private void rbDelIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDelIDActionPerformed
        if (rbDelID.isSelected()) {            
            txtFDelID.setForeground(new Color(255, 255, 255));            
            txtFDelName.setForeground(new Color(204, 204, 204));
            txtADelAddresse.setForeground(new Color(204, 204, 204));
            rbDelGender.setForeground(new Color(204, 204, 204));
            lblDelSch.setForeground(new Color(204, 204, 204));
            lblDelDepart.setForeground(new Color(204, 204, 204));
            
            txtFDelID.setEditable(true);
            txtFDelID.setFocusable(true);
            txtADelAddresse.setEditable(false);
            txtADelAddresse.setFocusable(false);   
            txtFDelName.setEditable(false);
            txtFDelName.setFocusable(false);
            cbDelGenderMale.setEnabled(false);
            cbDelGenderFemale.setEnabled(false);
            isClickRbDelSchDprt = false;
        }
    }//GEN-LAST:event_rbDelIDActionPerformed

    private void rbDelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDelNameActionPerformed
        if (rbDelName.isSelected()) {            
            txtFDelName.setForeground(new Color(255, 255, 255));            
            txtFDelID.setForeground(new Color(204, 204, 204));            
            txtADelAddresse.setForeground(new Color(204, 204, 204));
            rbDelGender.setForeground(new Color(204, 204, 204));
            lblDelSch.setForeground(new Color(204, 204, 204));
            lblDelDepart.setForeground(new Color(204, 204, 204));
            
            txtFDelName.setEditable(true);
            txtFDelName.setFocusable(true);
            txtADelAddresse.setEditable(false);
            txtADelAddresse.setFocusable(false);            
            cbDelGenderMale.setEnabled(false);
            cbDelGenderFemale.setEnabled(false);
            txtFDelID.setEditable(false);
            txtFDelID.setFocusable(false);
            isClickRbDelSchDprt = false;
        }
    }//GEN-LAST:event_rbDelNameActionPerformed

    private void rbDelAddresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDelAddresseActionPerformed
        if (rbDelAddresse.isSelected()) {
            txtADelAddresse.setForeground(new Color(255, 255, 255));
            txtFDelName.setForeground(new Color(204, 204, 204));
            txtFDelID.setForeground(new Color(204, 204, 204));            
            rbDelGender.setForeground(new Color(204, 204, 204));
            lblDelSch.setForeground(new Color(204, 204, 204));
            lblDelDepart.setForeground(new Color(204, 204, 204));
            
            txtADelAddresse.setEditable(true);
            txtADelAddresse.setFocusable(true);            
            cbDelGenderMale.setEnabled(false);
            cbDelGenderFemale.setEnabled(false);
            txtFDelID.setEditable(false);
            txtFDelID.setFocusable(false);
            txtFDelName.setEditable(false);
            txtFDelName.setFocusable(false);
            isClickRbDelSchDprt = false;
        }
    }//GEN-LAST:event_rbDelAddresseActionPerformed

    private void rbDelGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDelGenderActionPerformed
        if (rbDelGender.isSelected()) {
            rbDelGender.setForeground(new Color(255, 255, 255));
            txtFDelName.setForeground(new Color(204, 204, 204));
            txtFDelID.setForeground(new Color(204, 204, 204));
            txtADelAddresse.setForeground(new Color(204, 204, 204));            
            lblDelSch.setForeground(new Color(204, 204, 204));
            lblDelDepart.setForeground(new Color(204, 204, 204));
            
            cbDelGenderMale.setEnabled(true);
            cbDelGenderFemale.setEnabled(true);
            txtADelAddresse.setEditable(true);
            txtADelAddresse.setFocusable(true);            
            txtFDelID.setEditable(false);
            txtFDelID.setFocusable(false);
            txtFDelName.setEditable(false);
            txtFDelName.setFocusable(false);
            isClickRbDelSchDprt = false;
        }
    }//GEN-LAST:event_rbDelGenderActionPerformed

    private void rbDelSchDprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDelSchDprtActionPerformed
        if (rbDelSchDprt.isSelected()) {
            lblDelSch.setForeground(new Color(255, 255, 255));
            lblDelDepart.setForeground(new Color(255, 255, 255));            
            txtFDelName.setForeground(new Color(204, 204, 204));
            txtFDelID.setForeground(new Color(204, 204, 204));
            txtADelAddresse.setForeground(new Color(204, 204, 204));
            txtADelAddresse.setEditable(false);
            txtADelAddresse.setFocusable(false);
            cbDelGenderMale.setEnabled(false);
            cbDelGenderFemale.setEnabled(false);
            txtFDelID.setEditable(false);
            txtFDelID.setFocusable(false);
            txtFDelName.setEditable(false);
            txtFDelName.setFocusable(false);
            isClickRbDelSchDprt = true;
        }
    }//GEN-LAST:event_rbDelSchDprtActionPerformed

    private void lblDelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDeleteMouseClicked
        pnlDelDelete.setBackground(new Color(232, 0, 54));
        if (rbDelID.isSelected()) {
            delID = new StringBuffer(txtFDelID.getText().trim());
            try{
                conn = connec.getConnection();                
                PreparedStatement ps = conn.prepareStatement("DELETE FROM siswa where id = ?");
                ps.setString(1, delID.toString());
                ps.executeUpdate();
            }catch(SQLException ex){
                
            }
            
        } else if (rbDelName.isSelected()) {
            delName = new StringBuffer(txtFDelName.getText().trim());
            try {
                conn = connec.getConnection();
                PreparedStatement ps = conn.prepareStatement("DELETE FROM siswa where name = ?");
                ps.setString(1, delName.toString());
                ps.executeUpdate();
            } catch (SQLException ex) {

            }
        } else if (rbDelAddresse.isSelected()) {
            delAddresse = new StringBuffer(txtADelAddresse.getText().trim());
            try {
                conn = connec.getConnection();
                PreparedStatement ps = conn.prepareStatement("DELETE FROM siswa where  addresse = ?");
                ps.setString(1, delAddresse.toString());
                ps.executeUpdate();
            } catch (SQLException ex) {

            }
        } else if (rbDelGender.isSelected()) {
            try {
                conn = connec.getConnection();
                PreparedStatement ps = conn.prepareStatement("DELETE FROM siswa where gender = ?");
                ps.setString(1, delGender.toString());
                ps.executeUpdate();
            } catch (SQLException ex) {

            }
        } else {
            delSchool = new StringBuffer(lblDelSch.getText().trim().toLowerCase());
            try {
                conn = connec.getConnection();
                PreparedStatement ps = conn.prepareStatement("DELETE FROM siswa where school = ? && department = ?");
                ps.setString(1, delSchool.toString());
                ps.setString(2, delDepart.toString());
                ps.executeUpdate();
            } catch (SQLException ex) {

            }
        }
        showData();
    }//GEN-LAST:event_lblDelDeleteMouseClicked

    private void txtFDelIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDelIDFocusGained
        if (txtFDelID.getText().equals("ID")) {
            txtFDelID.setText("");
        }
    }//GEN-LAST:event_txtFDelIDFocusGained

    private void txtFDelIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDelIDFocusLost
        if (txtFDelID.getText().equals("")) {
            txtFDelID.setText("ID");
        }
    }//GEN-LAST:event_txtFDelIDFocusLost

    private void txtFDelIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFDelIDKeyReleased
        if (txtFDelID.getText().length() > 0) {
            checkDelID = true;
        } else {
            checkDelID = false;
        }
    }//GEN-LAST:event_txtFDelIDKeyReleased

    private void txtFDelNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDelNameFocusGained
        if (txtFDelName.getText().equals("Name")) {
            txtFDelName.setText("");
        }
    }//GEN-LAST:event_txtFDelNameFocusGained

    private void txtFDelNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDelNameFocusLost
        if (txtFDelName.getText().equals("")) {
            txtFDelName.setText("Name");
        }
    }//GEN-LAST:event_txtFDelNameFocusLost

    private void txtFDelNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFDelNameKeyReleased
        if (txtFDelName.getText().length() > 0) {
            checkDelName = true;
        } else {
            checkDelName = false;
        }
    }//GEN-LAST:event_txtFDelNameKeyReleased

    private void txtADelAddresseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtADelAddresseFocusGained
        if (txtADelAddresse.getText().equals("Addresse")) {
            txtADelAddresse.setText("");
        }
    }//GEN-LAST:event_txtADelAddresseFocusGained

    private void txtADelAddresseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtADelAddresseFocusLost
        if (txtADelAddresse.getText().equals("")) {
            txtADelAddresse.setText("Addresse");
        }
    }//GEN-LAST:event_txtADelAddresseFocusLost

    private void txtADelAddresseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADelAddresseKeyReleased
        if (txtADelAddresse.getText().length() > 0) {
            checkDelAddresse = true;
        } else {
            checkDelAddresse = false;
        }
    }//GEN-LAST:event_txtADelAddresseKeyReleased

    private void cbDelGenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelGenderMaleActionPerformed
        if (cbDelGenderMale.isSelected()) {
            checkDelGender = true;
            cbDelGenderMale.setForeground(new Color(255, 255, 255));
            cbDelGenderFemale.setForeground(new Color(204, 204, 204));
            delGender = new StringBuffer("male");
        }
    }//GEN-LAST:event_cbDelGenderMaleActionPerformed

    private void cbDelGenderFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelGenderFemaleActionPerformed
        if (cbDelGenderFemale.isSelected()) {
            checkDelGender = true;
            cbDelGenderFemale.setForeground(new Color(255, 255, 255));
            cbDelGenderMale.setForeground(new Color(204, 204, 204));
            delGender = new StringBuffer("female");
        }
    }//GEN-LAST:event_cbDelGenderFemaleActionPerformed

    private void pnlDelSchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDelSchMouseClicked
        if (isClickRbDelSchDprt) {
            if (clickDelSch == 0) {
                lblDelSchIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
                pnlDelBackSch.setVisible(true);
                clickDelSch++;
            } else {
                lblDelSchIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
                pnlDelBackSch.setVisible(false);
                clickDelSch--;
            }
        }
    }//GEN-LAST:event_pnlDelSchMouseClicked

    private void pnlDelDepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDelDepartMouseClicked
        if (afterClickDelSch) {
            if (clickDelDepart == 0) {
                if (isClickDelSMK1Tlng) {
                    lblDelDepartATR.setText("  ATR (Agribisnis Ternak Ruminansia)");
                    lblDelDepartTKJ.setText("  TKJ (Teknik Komputer dan Jaringan)");
                    lblDelDepartTKR.setText("  TKR (Teknik Kendaraan Ringan)");
                    pnlDelBackDepart1.setVisible(true);
                } else if (isClickDelSMK2Klt) {
                    lblDelDepartATR.setText("  SIJA (Sistem Informasi Jaringan dan Aplikasi)");
                    lblDelDepartTKJ.setText("  TEDK (Teknik Elketronika Daya dan Komunikasi)");
                    lblDelDepartTKR.setText("  TFLM (Teknik Fabrikasi Logam dan Manufacture)");
                    pnlDelBackDepart1.setVisible(true);
                    pnlDelBackDepart2.setVisible(true);
                } else if (isClickDelSMA1Krng) {
                    lblDelDepartATR.setText("  IPA (Ilmu Pengetahuan Alam)");
                    lblDelDepartTKJ.setText("  Matematika)");
                    lblDelDepartTKR.setText("  Ilmu Bahasa");
                    lblDelDepartDPIB.setText("  IPS (Ilmu Pengetahuan Sosial)");
                    lblDelDepartTMPO.setText("  Geografi");
                    pnlDelBackDepart1.setVisible(true);
                    pnlDelBackDepart2.setVisible(true);
                }
                clickDelDepart++;
                lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Down_20px_1.png")));
            } else {
                lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
                pnlDelBackDepart1.setVisible(false);
                pnlDelBackDepart2.setVisible(false);
                clickDelDepart--;
            }

        }
    }//GEN-LAST:event_pnlDelDepartMouseClicked

    private void lblDelSchSMK1TlngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelSchSMK1TlngMouseClicked
                                
        // yg terjadi pada Edit School
        lblDelSch.setText(" " + lblDelSchSMK1Tlng.getText());
        pnlDelBackSch.setVisible(false);
        lblDelSchIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickDelSch--;

        // yg terjadi pada Edit Depart        
        afterClickDelSch = true;
        isClickDelSMK1Tlng = true;
        isClickDelSMK2Klt = false;
        isClickDelSMA1Krng = false;
        if (clickDelDepart == 1) {
            clickDelDepart--;
        }

        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        pnlDelBackSch.setVisible(false);
        
        lblDelDepart.setText("   Depart SMKN 1 Tulung");
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));       
    }//GEN-LAST:event_lblDelSchSMK1TlngMouseClicked

    private void lblDelSchSMK2KltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelSchSMK2KltMouseClicked
        lblDelSch.setText(" " + lblDelSchSMK2Klt.getText());        
        lblDelSchIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickDelSch--;

        // yg terjadi pada Edit Depart        
        afterClickDelSch = true;
        isClickDelSMK1Tlng = false;
        isClickDelSMK2Klt = true;
        isClickDelSMA1Krng = false;
        if (clickDelDepart == 1) {
            clickDelDepart--;
        }

        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        pnlDelBackSch.setVisible(false);

        lblDelDepart.setText("   Depart SMKN 2 Klaten");
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));       
    }//GEN-LAST:event_lblDelSchSMK2KltMouseClicked

    private void lblDelSchSMA1KrngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelSchSMA1KrngMouseClicked
        lblDelSch.setText(" " + lblDelSchSMA1Krng.getText());        
        lblDelSchIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
        clickDelSch--;

        // yg terjadi pada Edit Depart        
        afterClickDelSch = true;
        isClickDelSMK1Tlng = false;
        isClickDelSMK2Klt = false;
        isClickDelSMA1Krng = true;
        if (clickDelDepart == 1) {
            clickDelDepart--;
        }

        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        pnlDelBackSch.setVisible(false);

        lblDelDepart.setText("   Depart SMA 1 Karanganom");
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));       
    }//GEN-LAST:event_lblDelSchSMA1KrngMouseClicked

    private void lblDelDepartATRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDepartATRMouseClicked
        if (lblDelDepartATR.getText().contains("ATR")) {
            delDepart = new StringBuffer("agribisnis ternak ruminansia");
            lblDelDepart.setText("   ATR");
        } else if (lblDelDepartATR.getText().contains("SIJA")) {
            delDepart = new StringBuffer("sistem informasi jaringan dan aplikasi");
            lblDelDepart.setText("   SIJA");
        } else {
            delDepart = new StringBuffer("ilmu pengetahuan alam");
            lblDelDepart.setText("   IPA");
        }
        clickDelDepart--;
        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));

    }//GEN-LAST:event_lblDelDepartATRMouseClicked

    private void lblDelDepartTKJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDepartTKJMouseClicked
        if (lblDelDepartTKJ.getText().contains("TKJ")) {
            delDepart = new StringBuffer("teknik komputer jaringan");
            lblDelDepart.setText("   TKJ");
        } else if (lblDelDepartTKJ.getText().contains("TEDK")) {
            delDepart = new StringBuffer("teknik elektronika daya dan komunikasi");
            lblDelDepart.setText("   TEDK");
        } else {
            delDepart = new StringBuffer("matematika");
            lblDelDepart.setText("   Matematika");
        }
        clickDelDepart--;
        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));

    }//GEN-LAST:event_lblDelDepartTKJMouseClicked

    private void lblDelDepartTKRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDepartTKRMouseClicked
        if (lblDelDepartTKR.getText().contains("TKR")) {
            delDepart = new StringBuffer("teknik kendaraan ringan");
            lblDelDepart.setText("   TKR");
        } else if (lblDelDepartTKR.getText().contains("TFLM")) {
            delDepart = new StringBuffer("teknik fabrikasi logam dan manufacture");
            lblDelDepart.setText("   TFLM");
        } else {
            delDepart = new StringBuffer("ilmu bahasa");
            lblDelDepart.setText("   Ilmu Bahasa");
        }
        clickDelDepart--;
        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));

    }//GEN-LAST:event_lblDelDepartTKRMouseClicked

    private void lblDelDepartTMPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDepartTMPOMouseClicked
        if (lblDelDepartTMPO.getText().contains("TMPO")) {
            delDepart = new StringBuffer("teknik manaejemen perawatan otomotif");
                lblDelDepart.setText("   TMPO");
        } else {
            delDepart = new StringBuffer("geografi");
            lblDelDepart.setText("   Geografi");
        }
        clickDelDepart--;
        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));

    }//GEN-LAST:event_lblDelDepartTMPOMouseClicked

    private void lblDelDepartDPIBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDepartDPIBMouseClicked
        if (lblDelDepartDPIB.getText().contains("DPIB")) {
            delDepart = new StringBuffer("desain permodelan informasi dan bangunan");
            lblDelDepart.setText("   DPIB");
        } else {
            delDepart = new StringBuffer("ilmu pengetahuan sosial");
            lblDelDepart.setText("   IPS");
        }
        clickDelDepart--;
        pnlDelBackDepart1.setVisible(false);
        pnlDelBackDepart2.setVisible(false);
        lblDelDepartIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_Sort_Up_20px_1.png")));
    }//GEN-LAST:event_lblDelDepartDPIBMouseClicked

    private void lblSrchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSrchMouseClicked
        pnlSrch.setBackground(new Color(232, 0, 54));
        ResultSet rs = null;
        tblSearch.setModel(modelTable2);
        if (rbSrchID.isSelected()) {
            try{
                rs =connec.selectForJTableKhusus("id", txtFSrchID.getText().trim())                ;
            } catch (SQLException sql) {}
        } else if (rbSrchName.isSelected()) {
            try {
                rs = connec.selectForJTableKhusus("name", txtFSrchName.getText().trim());                
            } catch (SQLException sql) {}
        } else if (rbSrchGender.isSelected()) {
            try {                
                if (cbSrchMale.isSelected()) {                    
                    rs = connec.selectForJTableKhusus("gender", cbSrchMale.getText().trim().toLowerCase());
                } else {
                    rs = connec.selectForJTableKhusus("gender", cbSrchFemale.getText().trim().toLowerCase());                    
                }               
            } catch (SQLException sql) {}
        }
        try{            
            showDataInSearch(rs);
        } catch (SQLException sql) {            
        }
        
    }//GEN-LAST:event_lblSrchMouseClicked

    private void rbSrchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSrchIDActionPerformed
        txtFSrchID.setForeground(new Color (255, 255, 255));
        txtFSrchName.setForeground(new Color(204, 204, 204));
        rbSrchGender.setForeground(new Color(204, 204, 204));
        cbSrchFemale.setEnabled(false);
        cbSrchMale.setEnabled(false);
        
        txtFSrchID.setEditable(true);
        txtFSrchID.setFocusable(true);
        txtFSrchName.setEditable(false);
        txtFSrchName.setFocusable(false);
    }//GEN-LAST:event_rbSrchIDActionPerformed

    private void rbSrchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSrchNameActionPerformed
        txtFSrchName.setForeground(new Color(255, 255, 255));
        txtFSrchID.setForeground(new Color(204, 204, 204));
        rbSrchGender.setForeground(new Color(204, 204, 204));
        cbSrchFemale.setEnabled(false);
        cbSrchMale.setEnabled(false);

        txtFSrchName.setEditable(true);
        txtFSrchName.setFocusable(true);
        txtFSrchID.setEditable(false);
        txtFSrchID.setFocusable(false);
    }//GEN-LAST:event_rbSrchNameActionPerformed

    private void rbSrchGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSrchGenderActionPerformed
        rbSrchGender.setForeground(new Color(255, 255, 255));
        txtFSrchName.setForeground(new Color(204, 204, 204));
        rbSrchID.setForeground(new Color(204, 204, 204));
        cbSrchFemale.setEnabled(true);
        cbSrchMale.setEnabled(true);        
                
        txtFSrchID.setEditable(false);
        txtFSrchID.setFocusable(false);
        txtFSrchName.setEditable(false);
        txtFSrchName.setFocusable(false);
    }//GEN-LAST:event_rbSrchGenderActionPerformed

    private void cbSrchMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSrchMaleActionPerformed
        if (cbSrchMale.isSelected()) {            
            cbSrchMale.setForeground(new Color (255, 255, 255));
            cbSrchFemale.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cbSrchMaleActionPerformed

    private void cbSrchFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSrchFemaleActionPerformed
        if (cbSrchFemale.isSelected()) {            
            cbSrchFemale.setForeground(new Color(255, 255, 255));
            cbSrchMale.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cbSrchFemaleActionPerformed

    private void txtFSrchIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFSrchIDFocusGained
        if (txtFSrchID.getText().equals("ID")) {
            txtFSrchID.setText("");
        }
    }//GEN-LAST:event_txtFSrchIDFocusGained

    private void txtFSrchIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFSrchIDFocusLost
        if (txtFSrchID.getText().trim().equals("")) {
            txtFSrchID.setText("ID");
        }
    }//GEN-LAST:event_txtFSrchIDFocusLost

    private void txtFSrchNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFSrchNameFocusGained
        if (txtFSrchName.getText().equals("Name")) {
            txtFSrchName.setText("");
        }
    }//GEN-LAST:event_txtFSrchNameFocusGained

    private void txtFSrchNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFSrchNameFocusLost
        if (txtFSrchName.getText().trim().equals("")) {
            txtFSrchName.setText("Name");
        }
    }//GEN-LAST:event_txtFSrchNameFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i < 1; i = i + 0.1) {
            String val = i +"";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            
            try{
                Thread.sleep(50);                
            } catch (Exception e){}
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void lblDelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDeleteMouseEntered
        pnlDelDelete.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblDelDeleteMouseEntered

    private void lblDelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDeleteMouseExited
        pnlDelDelete.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblDelDeleteMouseExited

    private void lblDelDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDeleteMousePressed
        pnlDelDelete.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblDelDeleteMousePressed

    private void lblDelDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelDeleteMouseReleased
        pnlDelDelete.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblDelDeleteMouseReleased

    private void lblEditEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEditMouseEntered
        pnlEditEdit.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblEditEditMouseEntered

    private void lblEditEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEditMouseExited
        pnlEditEdit.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblEditEditMouseExited

    private void lblEditEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEditMousePressed
        pnlEditEdit.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblEditEditMousePressed

    private void lblEditEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditEditMouseReleased
        pnlEditEdit.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblEditEditMouseReleased

    private void lblSrchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSrchMouseEntered
        pnlSrch.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblSrchMouseEntered

    private void lblSrchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSrchMouseExited
        pnlSrch.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_lblSrchMouseExited

    private void lblSrchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSrchMousePressed
        pnlSrch.setBackground(new Color(230, 36, 81));
    }//GEN-LAST:event_lblSrchMousePressed

    private void lblSrchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSrchMouseReleased
        pnlSrch.setBackground(new Color(232, 0, 54));
    }//GEN-LAST:event_lblSrchMouseReleased
// [204,0,51]
//    public static void main(String args[]) {
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new MainWork().setVisible(true);                    
//                } catch (SQLException ex) {
//                    Logger.getLogger(MainWork.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JCheckBox cbAddresse;
    private javax.swing.JCheckBox cbDelGenderFemale;
    private javax.swing.JCheckBox cbDelGenderMale;
    private javax.swing.JCheckBox cbEditSchDepart;
    private javax.swing.JCheckBox cbGender;
    private javax.swing.JCheckBox cbName;
    private javax.swing.JCheckBox cbSrchFemale;
    private javax.swing.JCheckBox cbSrchMale;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblAddDepart;
    private javax.swing.JLabel lblAddDepartIcon;
    private javax.swing.JLabel lblAddSchool;
    private javax.swing.JLabel lblAddSchoolIcon;
    private javax.swing.JLabel lblAddSchoolSMK1Tlng;
    private javax.swing.JLabel lblAddSchoolSMK2Klt;
    private javax.swing.JLabel lblAddSchoolSMKN1Karng;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDelDelete;
    private javax.swing.JLabel lblDelDepart;
    private javax.swing.JLabel lblDelDepartATR;
    private javax.swing.JLabel lblDelDepartDPIB;
    private javax.swing.JLabel lblDelDepartIcon;
    private javax.swing.JLabel lblDelDepartTKJ;
    private javax.swing.JLabel lblDelDepartTKR;
    private javax.swing.JLabel lblDelDepartTMPO;
    private javax.swing.JLabel lblDelSch;
    private javax.swing.JLabel lblDelSchIcon;
    private javax.swing.JLabel lblDelSchSMA1Krng;
    private javax.swing.JLabel lblDelSchSMK1Tlng;
    private javax.swing.JLabel lblDelSchSMK2Klt;
    private javax.swing.JLabel lblDepartATR;
    private javax.swing.JLabel lblDepartDPIB;
    private javax.swing.JLabel lblDepartTKJ;
    private javax.swing.JLabel lblDepartTKR;
    private javax.swing.JLabel lblDepartTMPO;
    private javax.swing.JLabel lblEditDepart;
    private javax.swing.JLabel lblEditDepartATR;
    private javax.swing.JLabel lblEditDepartDPIB;
    private javax.swing.JLabel lblEditDepartIcon;
    private javax.swing.JLabel lblEditDepartTKJ;
    private javax.swing.JLabel lblEditDepartTKR;
    private javax.swing.JLabel lblEditDepartTMPO;
    private javax.swing.JLabel lblEditEdit;
    private javax.swing.JLabel lblEditPicture;
    private javax.swing.JLabel lblEditProfile;
    private javax.swing.JLabel lblEditSchool;
    private javax.swing.JLabel lblEditSchoolIcon;
    private javax.swing.JLabel lblEditSchoolSMA1Karng;
    private javax.swing.JLabel lblEditSchoolSMK1Tlng;
    private javax.swing.JLabel lblEditSchoolSMK2Klt;
    private javax.swing.JLabel lblIconAdd;
    private javax.swing.JLabel lblIconDelete;
    private javax.swing.JLabel lblIconEdit;
    private javax.swing.JLabel lblIconHome;
    private javax.swing.JLabel lblIconSearch;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNoticeAddAddresse;
    private javax.swing.JLabel lblNoticeAddDepartment;
    private javax.swing.JLabel lblNoticeAddGender;
    private javax.swing.JLabel lblNoticeAddID;
    private javax.swing.JLabel lblNoticeAddName;
    private javax.swing.JLabel lblNoticeAddSchool;
    private javax.swing.JLabel lblNoticeAddresse;
    private javax.swing.JLabel lblNoticeAddresseIcon;
    private javax.swing.JLabel lblNoticeEmail;
    private javax.swing.JLabel lblNoticeEmailIcon;
    private javax.swing.JLabel lblNoticeGender;
    private javax.swing.JLabel lblNoticeGenderIcon;
    private javax.swing.JLabel lblNoticeTelp;
    private javax.swing.JLabel lblNoticeTelpIcon;
    private javax.swing.JLabel lblNoticeUsername;
    private javax.swing.JLabel lblNoticeUsernameIcon;
    private javax.swing.JLabel lblSaveProfile;
    private javax.swing.JLabel lblSrch;
    private javax.swing.JLabel lblTxtAdd;
    private javax.swing.JLabel lblTxtDelete;
    private javax.swing.JLabel lblTxtEdit;
    private javax.swing.JLabel lblTxtHome;
    private javax.swing.JLabel lblTxtSearch;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlAddAdd;
    private javax.swing.JPanel pnlAddDepart;
    private javax.swing.JPanel pnlAddSchool;
    private javax.swing.JPanel pnlAddSchoolSM1Tlng;
    private javax.swing.JPanel pnlAddSchoolSMA1Krng;
    private javax.swing.JPanel pnlAddSchoolSMK2Klt;
    private javax.swing.JPanel pnlBackDepartSMK1Tlng;
    private javax.swing.JPanel pnlBackDepartSMK2Klt;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlBackgroundAddSchool;
    private javax.swing.JPanel pnlBigAdd;
    private javax.swing.JPanel pnlBigDelete;
    private javax.swing.JPanel pnlBigEdit;
    private javax.swing.JPanel pnlBigHome;
    private javax.swing.JPanel pnlBigSearch;
    private javax.swing.JPanel pnlBigTab;
    private javax.swing.JPanel pnlClose;
    private javax.swing.JPanel pnlDelBackDepart1;
    private javax.swing.JPanel pnlDelBackDepart2;
    private javax.swing.JPanel pnlDelBackSch;
    private javax.swing.JPanel pnlDelDelete;
    private javax.swing.JPanel pnlDelDepart;
    private javax.swing.JPanel pnlDelDepartATR;
    private javax.swing.JPanel pnlDelDepartDPIB;
    private javax.swing.JPanel pnlDelDepartTKJ;
    private javax.swing.JPanel pnlDelDepartTKR;
    private javax.swing.JPanel pnlDelDepartTMPO;
    private javax.swing.JPanel pnlDelSch;
    private javax.swing.JPanel pnlDelSchSMA1Krng;
    private javax.swing.JPanel pnlDelSchSMK1Tlng;
    private javax.swing.JPanel pnlDelSchSMK2Klt;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlDepartATR;
    private javax.swing.JPanel pnlDepartTKJ;
    private javax.swing.JPanel pnlDepartTKR;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlEditBackDepart1;
    private javax.swing.JPanel pnlEditBackDepart2;
    private javax.swing.JPanel pnlEditBackSchool;
    private javax.swing.JPanel pnlEditDepart;
    private javax.swing.JPanel pnlEditDepartATR;
    private javax.swing.JPanel pnlEditDepartDPIB;
    private javax.swing.JPanel pnlEditDepartTKJ;
    private javax.swing.JPanel pnlEditDepartTKR;
    private javax.swing.JPanel pnlEditDepartTMPO;
    private javax.swing.JPanel pnlEditEdit;
    private javax.swing.JPanel pnlEditProfile;
    private javax.swing.JPanel pnlEditSchool;
    private javax.swing.JPanel pnlEditSchoolSMA1Krng;
    private javax.swing.JPanel pnlEditSchoolSMK1Tlng;
    private javax.swing.JPanel pnlEditSchoolSMK2Klt;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JPanel pnlSaveProfile;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSmallTab;
    private javax.swing.JPanel pnlSrch;
    private javax.swing.JRadioButton rbAddGenderFemale;
    private javax.swing.JRadioButton rbAddGenderMale;
    private javax.swing.JRadioButton rbDelAddresse;
    private javax.swing.JRadioButton rbDelGender;
    private javax.swing.JRadioButton rbDelID;
    private javax.swing.JRadioButton rbDelName;
    private javax.swing.JRadioButton rbDelSchDprt;
    private javax.swing.JRadioButton rbEditFemale;
    private javax.swing.JRadioButton rbEditMale;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGroupAddGender;
    private javax.swing.ButtonGroup rbGroupGender;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbSrchGender;
    private javax.swing.JRadioButton rbSrchID;
    private javax.swing.JRadioButton rbSrchName;
    private javax.swing.JRadioButton rbcWthRow;
    private javax.swing.JTable tblAdd;
    private javax.swing.JTable tblDelete;
    private javax.swing.JTable tblEdit;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextArea txtAAddAddresse;
    private javax.swing.JTextArea txtAAddresse;
    private javax.swing.JTextArea txtADelAddresse;
    private javax.swing.JTextArea txtAEditAddresse;
    private javax.swing.JTextField txtFAddDepartment;
    private javax.swing.JTextField txtFAddID;
    private javax.swing.JTextField txtFAddName;
    private javax.swing.JTextField txtFDelID;
    private javax.swing.JTextField txtFDelName;
    private javax.swing.JTextField txtFEditID;
    private javax.swing.JTextField txtFEditName;
    private javax.swing.JTextField txtFEmail;
    private javax.swing.JTextField txtFSrchID;
    private javax.swing.JTextField txtFSrchName;
    private javax.swing.JTextField txtFTelp;
    private javax.swing.JTextField txtFUsername;
    private javax.swing.JTextField txtFUsername1;
    // End of variables declaration//GEN-END:variables
        
    public ImageIcon settingImage(String sPath,byte [] bPath) {
        ImageIcon icoProcess;
        if (sPath == null) {
            icoProcess = new ImageIcon(bPath);
        }else{
            icoProcess = new ImageIcon(sPath);
        }
        
        Image img1 = icoProcess.getImage();
        Image img2 = img1.getScaledInstance(lblUser.getWidth(), lblUser.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img2);
        return icon;
    }
    public void updateData(boolean pictureThereIs) throws SQLException, FileNotFoundException{
        conn = connec.getConnection();
        String query = "";
        PreparedStatement ps;
        if (pictureThereIs) {            
            query = "UPDATE profile SET username = ?, telp = ?, addresse = ?,"
                    + " gender = ?, picture = ? where email = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, txtFUsername1.getText().trim());
            ps.setString(2, txtFTelp.getText().trim());
            ps.setString(3, txtAAddresse.getText().trim());
            ps.setString(4, gender);
            InputStream inputStream = new FileInputStream(new File(url));
            ps.setBlob(5, inputStream);
            ps.setString(6, txtFEmail.getText().trim());
        } else{
            query = "UPDATE profile SET username = ?, telp = ?, addresse = ?,"
                    + " gender = ? where email = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, txtFUsername1.getText().trim());
            ps.setString(2, txtFTelp.getText().trim());
            ps.setString(3, txtAAddresse.getText().trim());
            ps.setString(4, gender);            
            ps.setString(5, txtFEmail.getText().trim());
        }
        ps.executeUpdate();
    }
    private void addDataSiswa(String ID , String name, String addresse, String gender,
            String school, String depart){
        try{            
            conn = connec.getConnection();
            String s = "INSERT INTO siswa (id, name, addresse, gender, school, department) "
                    + "VALUES ( ?, ?, ?, ?, ?, ? )";
            PreparedStatement ps = conn.prepareStatement(s);            
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.setString(3, addresse);
            ps.setString(4, gender);
            ps.setString(5, school);
            ps.setString(6, depart);
            ps.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Date same!");
        }
    }
    private void showData(){
        int row = tblAdd.getRowCount();
        for(int i = 0; i < row; i++){
            modelTable.removeRow(0);
        }
        try {
            ResultSet rs = connec.selectForJTable("siswa");
            while (rs.next()) {                
                String [] data = {String.format("%04d", rs.getInt(1)), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6)};
                modelTable.addRow(data);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    private void showDataInSearch(ResultSet rs) throws SQLException{
        int row = tblSearch.getRowCount();
        for (int i = 0; i < row; i++) {
            modelTable2.removeRow(0);
        }
        
        while (rs.next()) {
            String[] data = {String.format("%04d", rs.getInt(1)), rs.getString(2),
                rs.getString(3), rs.getString(4),
                rs.getString(5), rs.getString(6)};
            modelTable2.addRow(data);
            }       
    }
   
}

