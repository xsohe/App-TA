/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;
/**
 *
 * @author YANUAREKA
 */
import Config.Koneksi;
import Main.MenuUtama1;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    private int xx, xy;
    
    private Connection conn;
    private PreparedStatement pStm;
    private ResultSet rs;
    
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        showHidePassword();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbEyeIcon = new javax.swing.JLabel();
        lbHideIcon = new javax.swing.JLabel();
        passwordTf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        loginBtn = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 239, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Bookshop-pana.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 353));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBtn.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(55, 71, 79));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("X");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        jPanel3.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 0, 552, 561));

        usernameTf.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        usernameTf.setPreferredSize(new java.awt.Dimension(73, 20));
        jPanel1.add(usernameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 300, 40));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel3.setText("Welcome to Future Library");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 320, 50));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        lbEyeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ophthalmology.png"))); // NOI18N
        lbEyeIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(lbEyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 40, 40));

        lbHideIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHideIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Invisible_2.png"))); // NOI18N
        lbHideIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(lbHideIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 40, 40));

        passwordTf.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(passwordTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 300, 40));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        loginBtn.setBackground(new java.awt.Color(55, 71, 79));
        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 300, 50));
        loginBtn.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 561));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Get koordinat x dan y ketika mouse ditekan
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        String user = usernameTf.getText();
        prosesLogin(user);
    }//GEN-LAST:event_loginBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbEyeIcon;
    private javax.swing.JLabel lbHideIcon;
    private rojerusan.RSMaterialButtonRectangle loginBtn;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables

    private void showHidePassword() {
        lbHideIcon.setVisible(false);
        lbEyeIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbEyeIcon.setVisible(false);
                lbHideIcon.setVisible(true);
                passwordTf.setEchoChar((char)0);
            }
            
        });
        
        lbHideIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbEyeIcon.setVisible(true);
                lbHideIcon.setVisible(false);
                passwordTf.setEchoChar('*');
            }
        });
        
        passwordTf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginBtn.doClick();
                }
            }
            
        });
    }
    
    //Merubah string yang diinputkan menjadi hash MD5
    public String getMd5(String message) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for(byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();
            
        } catch (Exception e) {
            System.out.println("Md5 error" + e.getMessage());
        }
        return digest;
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        if(usernameTf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
        } else if(passwordTf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }
    
    //Menggunakan objek hasMap untuk mengirimkan 2 parameter.
    private Map<String, String> checkLogin(String username, String password) {
        Map<String, String> result = new HashMap<>();
        
        if(conn != null) {
            try {
                String sql = "SELECT * FROM user WHERE username=? AND password=?";
                pStm = conn.prepareStatement(sql);
                pStm.setString(1, username);
                pStm.setString(2, password);
                
                rs = pStm.executeQuery();
                
                if(rs.next()) {
                    result.put("id_user", rs.getString("id_user"));
                    result.put("level", rs.getString("level"));
                    return result;
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Check login gagal" + e.getMessage());
            }
        }
        return null;
    }
    
    private void prosesLogin(String user) {
        if(validasiInput()) {
            String username = usernameTf.getText();
            String password = new String(passwordTf.getPassword());
            String hashPassword = getMd5(password);
            
            Map<String, String> loginResult = checkLogin(username, hashPassword);
            
            if(loginResult != null) {
                String userId = loginResult.get("id_user");
                String levelUser = loginResult.get("level");
                
                MenuUtama1 menu = new MenuUtama1(userId, levelUser, username);
                menu.setVisible(true);
                menu.revalidate();
                
                dispose();
                JOptionPane.showMessageDialog(this, "Login berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
