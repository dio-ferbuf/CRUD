package checkServer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class connectToServer {
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/crud?useTimezone=true&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASS = "";

    public static Connection conn;
    public static Statement stmt;
    public static ResultSet rs;
    
    DefaultTableModel model = new DefaultTableModel();
    public connectToServer(){        
    }
    
    public void insertToDatabase(String tableDatabase, String username, String telp, String addresse, String gender, String email, String pathImage) throws FileNotFoundException
    {
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO "+tableDatabase+" (username,telp,addresse,gender,email,picture) VALUES "
                    + "(?,?,?,?,?,?)");            
            ps.setString(1, username);
            ps.setString(2, telp);
            ps.setString(3, addresse);
            ps.setString(4, gender);
            ps.setString(5, email);            
                        
            // untuk image yang akan di masukkan ke database            
            InputStream img  = new FileInputStream(new File(pathImage));
            ps.setBlob(6, img);
            // masukkan semuanya ke database
            ps.executeUpdate();            
        } catch (Exception ex) {
            Logger.getLogger(connectToServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void insertToDatabase(String tableDatabase, String username, String telp, String addresse, String gender, String email) throws FileNotFoundException {
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO " + tableDatabase + " (username,telp,addresse,gender,email) VALUES "
                    + "(?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, telp);
            ps.setString(3, addresse);
            ps.setString(4, gender);
            ps.setString(5, email);
            
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(connectToServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
    }
    
    
    public void connect(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error to Server\nPlease check your Internet!", "Server Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }
    public ResultSet selectGeneral(String tableDatabase) throws SQLException{
        getConnection();
        stmt = conn.createStatement();
        String query = "SELECT * FROM "+tableDatabase;
        rs = stmt.executeQuery(query);
        return rs;
    }
    
    
    
    public ResultSet selectForJTable(String tableDatabase) throws SQLException {        
        conn = getConnection();        
        stmt = conn.createStatement();
        final String QUERY = "SELECT *FROM "+tableDatabase;
        rs = stmt.executeQuery(QUERY);
        
        return rs;
    }
    
    public ResultSet selectForJTableKhusus(String colum, String txt) throws SQLException {
        conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT *FROM siswa where " + colum + " = ?");
        ps.setString(1, txt);
                
        rs = ps.executeQuery();

        return rs;
    }
    
//    public static void main(String[] args) {
//        ResultSet set;
//        try {
//            connectToServer connec = new connectToServer();
//            connec.connect();
//            
//            connec.insertToDatabase("profile", "nazla", "0876", "asas", "male", "asas", "C:\\Users\\nazla dio hevin\\Pictures\\1533973655020.jpg");
////            set = connec.selectGeneral("profile");
////            set.next();
////            System.out.println(rs.getString("username"));    
////            System.out.println(rs.getString("telp"));
////            System.out.println(rs.getString("no"));
////            System.out.println(rs.getString("picture"));
//            
//                        
//        } catch (Exception ex) {
//            System.err.println("Erroorr");
//        }       
//        
//    }
}


