/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline_reservation;
import java.sql.*;
import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class login extends javax.swing.JFrame {
//Connection con=null;
ResultSet rs =null;
//PreparedStatement pst = null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        hinden();
        
    }

    private void hinden(){
        username.setVisible(true);
        Password.setVisible(true);
        name1.setVisible(false);
        password1.setVisible(false);
    }
    
    private boolean valid(){
    String names = txtname.getText();
        String pass =txtpassword.getText();
        
        if(names.equals("")){
            username.setVisible(true);
            return false;
        }
        if(pass.equals("")){
            Password.setVisible(true);
            return false;
        }
        if(pass.length()>9){
            Password.setText("Password should be maximum 6 numericals and 2 special character");
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signupbutton = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setText("        AIRLINE RESERVATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 60));

        jLabel2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 100, -1));

        username.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        username.setText("Username");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        Password.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 210, 30));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 210, 30));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 80, 30));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 80, 30));

        jLabel5.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel5.setText("SignUp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, 20));

        signupbutton.setText("SignUp");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(signupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, 30));

        name1.setText("enter your name");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, -1));

        password1.setText("enter password");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline_reservation/5 (5).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 628, 409);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            txtpassword.setEchoChar((char)0);
        }
        else{
        txtpassword.setEchoChar('*');
    }
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null,"Are you Sure Exit Applictaion","Warning Message",JOptionPane.YES_NO_OPTION);
        
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        
        String names = txtname.getText();
        String pass =txtpassword.getText();
     /*   
        if(valid()==true){
        
        
        if(names.equals("admin")&&pass.equals("cumm@@in")){
            JOptionPane.showMessageDialog(this,"Login Successfully");
      
            
            this.setVisible(false);  //login page false;
            main m=new main();
            m.setVisible(true);
        
        }
        else{
            JOptionPane.showMessageDialog(this,"Username or Password don't Match"); 
        }
         */
    //on  Connection con;
try{
   Class.forName("com.mysql.cj.jdbc.Driver");
        //String url;
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sign","root","Ash@9766");
            String sql ="SELECT * FROM signup WHERE  username=? AND password=?";
            
  PreparedStatement pst =  con.prepareCall(sql);
   pst.setString(1,names); //username
   pst.setString(2,pass);  // password
        rs =pst.executeQuery();
  if(rs.next()){ // if true
         JOptionPane.showMessageDialog(rootPane,"login Successfully"); 
         this.setVisible(false);  //login page false;
            main m=new main();
            m.setVisible(true);
            this.dispose();
         
         
     }
     else{
        JOptionPane.showMessageDialog(null,"Username or Password don't Match");
        txtname.requestFocus();
        txtname.setText("");
        txtpassword.requestFocus();
         txtpassword.setText("");
     }
     
}catch(Exception e){
    System.out.println(e);
}
       
        
    }//GEN-LAST:event_loginActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        // TODO add your handling code here:
        
      this.setVisible(false);
      signup su =new signup();
      su.setVisible(true);
    }//GEN-LAST:event_signupbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JButton exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel password1;
    private javax.swing.JButton signupbutton;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
