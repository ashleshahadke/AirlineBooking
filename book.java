/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline_reservation;
import java.util.*;
//import airline_reservation.Search;
import java.sql.*;
import airline_reservation.newCustomer;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class book extends javax.swing.JFrame {

    /**
     * Creates new form book
     */
    public book() {
        initComponents();
    }
private String trip1;
private String nation;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        one_way = new javax.swing.JRadioButton();
        roundtrip = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        Details = new javax.swing.JButton();
        from1 = new javax.swing.JTextField();
        to1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        departing = new javax.swing.JTextField();
        returning = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Mongolian Baiti", 3, 48)); // NOI18N
        jLabel18.setText("                   FLIGHT BOOKING ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1363, 72));

        jLabel33.setFont(new java.awt.Font("DejaVu Serif", 2, 24)); // NOI18N
        jLabel33.setText("Find Your Prefect Trip");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 479, 65));

        buttonGroup1.add(one_way);
        one_way.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        one_way.setText("One_Way");
        one_way.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_wayActionPerformed(evt);
            }
        });
        jPanel1.add(one_way, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));

        buttonGroup1.add(roundtrip);
        roundtrip.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        roundtrip.setText("Round_Trip");
        roundtrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundtripActionPerformed(evt);
            }
        });
        jPanel1.add(roundtrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline_reservation/airplane (1).png"))); // NOI18N
        jLabel4.setText("________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 30));

        jLabel3.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel3.setText("From");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 20));

        jLabel19.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline_reservation/airplane (2) (2).png"))); // NOI18N
        jLabel19.setText("_____");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, 40));

        jLabel36.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel36.setText("Passengers Details");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 230, 30));

        jLabel34.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel34.setText("Departing ");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 90, 40));

        jLabel20.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel20.setText("Returning");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 100, 20));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jRadioButton6.setText("Indian (Local)");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 140, -1));

        jLabel35.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel35.setText("Nationality");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 120, 20));

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jRadioButton5.setText("Foreigner");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 130, -1));

        Details.setText("Details");
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });
        jPanel1.add(Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 140, 30));

        from1.setText("mumbai");
        jPanel1.add(from1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 260, 40));
        jPanel1.add(to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 270, 40));

        jLabel17.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel17.setText("To");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 20, 30));

        departing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departingActionPerformed(evt);
            }
        });
        jPanel1.add(departing, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 250, 40));
        jPanel1.add(returning, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 260, 40));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "flightNumber", "airline", "From", "To", "dayOfWeek", "DepartureTime", "ArrivalTime", "validDateFrom", "validDateTo", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1060, 400));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 140, 40));

        jLabel2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel2.setText("pass ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 80, 30));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline_reservation/22 (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 1060, 810));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        try{
            /* String email1 =email.getText();
            String username =uname.getText();
            String password =spass.getText();
            String query ="insert into signup values('"+email1+",'"+username+"','"+password+"')";*/

            Class.forName("com.mysql.cj.jdbc.Driver");
            //String url;
            java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign","root","Ash@9766");
            //  String sql ="Select * from signup where email =? and username =? and password= ?";
            String sql1 ="insert into fb values(?,?,?,?,?,?,?)";
            PreparedStatement  pst = c.prepareStatement(sql1);
           //  pst.setString(1,pass.getText());
            pst.setString(1,trip1);
            pst.setString(2,from1.getText());
            pst.setString(3,to1.getText());
            pst.setString(4,departing.getText());

            pst.setString(5,returning.getText());
            pst.setString(6,nation);
            pst.setString(7,pass.getText());
           

            //  pst.setBytes(10,userimages);

            int query =pst.executeUpdate();
            if(query>0){
                JOptionPane.showMessageDialog(this,"flight details Added");
                c.close();
            }
            else{
                JOptionPane.showMessageDialog(this,"flight details Failed");
            }

            /* signupcon co =new signupcon();
            co.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"SignUp Successfully");*/
        }
        catch(HeadlessException | SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign", "root", "Ash@9766");
            String sql1 = "SELECT * FROM flight WHERE `From` = ? AND `To` = ?";

            PreparedStatement pst = c.prepareStatement(sql1);
            pst.setString(1, from1.getText());
            pst.setString(2, to1.getText());
            //SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            //     java.util.Date departureDate = dateFormat.parse(departing.getText());
            //   java.sql.Date sqlDepartureDate = new java.sql.Date(departureDate.getTime());

            // Set parameters in the PreparedStatement
            //pst.setDate(3, sqlDepartureDate);
            ResultSet query = pst.executeQuery();
            //System.out.println("From: " + from1.getText());
            //System.out.println("To: " + to1.getText());
            //System.out.println("date: " + departing.getText());
            // Create a DefaultTableModel with column names
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("flightNumber");
            model.addColumn("airline");
            model.addColumn("From");
            model.addColumn("To");
            model.addColumn("dayOfWeek");
            model.addColumn("DepartureTime");
            model.addColumn("ArrivalTime");
            model.addColumn("validDateFrom");
            model.addColumn("validDateTo");
            model.addColumn("Price");

            while (query.next()) {
                // Add each row to the DefaultTableModel
                model.addRow(new Object[]{
                    query.getString("flightNumber"),
                    query.getString("airline"),
                    query.getString("From"),
                    query.getString("To"),
                    query.getString("dayOfWeek"),
                    query.getString("DepartureTime"),
                    query.getString("ArrivalTime"),
                    query.getString("validDateFrom"),
                    query.getString("validDateTo"),
                    query.getString("Price")
                });
            }

            // Set the DefaultTableModel to the JTable
            jTable1.setModel(model);

        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void departingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departingActionPerformed

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
        this.setVisible(false);  //login page false;
        newCustomer nc=new newCustomer();
        nc.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_DetailsActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        nation ="Foreigner";
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        nation ="Indian";
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void roundtripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundtripActionPerformed
        // TODO add your handling code here:
        trip1 ="roundtrip";
    }//GEN-LAST:event_roundtripActionPerformed

    private void one_wayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_wayActionPerformed
        // TODO add your handling code here:
        trip1 = "one_way";
    }//GEN-LAST:event_one_wayActionPerformed

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Details;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField departing;
    private javax.swing.JTextField from1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton one_way;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField returning;
    private javax.swing.JRadioButton roundtrip;
    private javax.swing.JButton search;
    private javax.swing.JTextField to1;
    // End of variables declaration//GEN-END:variables
}
