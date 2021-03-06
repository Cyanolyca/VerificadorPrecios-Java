import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Nomar Calvo
 */
public class NewJFrame extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    private String codigo = "";
    private int width;
    int segundos = 0;
    int tiempo = 5;

    public NewJFrame() throws InterruptedException {
        initComponents();
        pantallaPrincipal();
    }

    public void start() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                //Do stuff
                try {
                    pantallaPrincipal();
                    t.cancel();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } 
                t.cancel();
            }
        }, 4300, 4300);
    }

    public void pantallaPrincipal() throws InterruptedException {
        this.getContentPane().setBackground(new Color(67, 160, 71));
        width = Toolkit.getDefaultToolkit().getScreenSize().width;
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        this.setLayout(null);
        Logo.setVisible(true);
        Logo.setSize(57, 52);
        Logo.setIcon(new ImageIcon(new ImageIcon("img\\logo.png").getImage().getScaledInstance(57, 52, Image.SCALE_DEFAULT)));
        Logo.setLocation(this.getWidth() / 13 - Logo.getWidth() / 2, this.getHeight() / 12 - Logo.getHeight() + 30);
        Imagen.setSize(218, 121);
        Imagen.setIcon(new ImageIcon(new ImageIcon("img/barcode-scan.gif").getImage().getScaledInstance(218, 121, Image.SCALE_DEFAULT)));
        Imagen.setLocation(this.getWidth() / 2 - Imagen.getWidth() / 2, this.getHeight() / 2 + Logo.getHeight() - 150);
        productPrice.setFont(new java.awt.Font("Arial", 1, 22));
        productPrice.setSize(465, 29);
        productPrice.setText("Coloque el c??digo de barras por el sensor");
        productPrice.setLocation(this.getWidth() / 2 - productPrice.getWidth() / 2 + 30, this.getHeight() / 2 + productPrice.getHeight() + 80);
        productName.setVisible(false);       
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 232, 212));
        setUndecorated(true);
        setSize(Toolkit. getDefaultToolkit(). getScreenSize().width, Toolkit. getDefaultToolkit(). getScreenSize().height);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(305, 165));

        Imagen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Imagen.setMaximumSize(new java.awt.Dimension(1000, 1000));
        Imagen.setPreferredSize(new java.awt.Dimension(120, 120));

        productPrice.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N

        productName.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(productPrice)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(productName)
                        .addGap(218, 218, 218))))
        );

        productPrice.getAccessibleContext().setAccessibleDescription("");
        productName.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() != 10) {
            codigo += evt.getKeyChar();
        } else {
            try {
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verificador_pr", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT producto_nombre, producto_precio, producto_imagen FROM vp_productos WHERE producto_codigo = " + codigo);
                if (rs.next()) {
                    Logo.setVisible(false);
                    try {
                        String path = rs.getString(3);
                        URL url = new URL(path);
                        BufferedImage image = ImageIO.read(url);
                        Imagen.setSize(250, 250);
                        Imagen.setIcon(new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        Imagen.setLocation((this.getWidth() / 4) - (Imagen.getWidth() / 2) + 30, (this.getHeight() / 2) - Imagen.getHeight() / 2 - 30);
                    } catch (Exception exp) {
                        Imagen.setSize(250, 250);
                        Imagen.setIcon(new ImageIcon(new ImageIcon("img\\placeholder.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        Imagen.setLocation((this.getWidth() / 4) - (Imagen.getWidth() / 2) + 30, (this.getHeight() / 2) - Imagen.getHeight() / 2 - 30);
                    }
                    productName.setVisible(true);
                    productName.setSize(200, 150);
                    productName.setLocation(this.getWidth() / 2 - Imagen.getWidth() + 10, this.getHeight() / 3 + Imagen.getHeight() - 130);
                    productName.setText("<html>Nombre: " + rs.getString(1));
                    productPrice.setFont(new java.awt.Font("Arial", 1, 27));
                    productPrice.setSize(200, 150);
                    productPrice.setLocation(this.getWidth() / 2 - productPrice.getWidth()/2 + 130, this.getHeight() / 2 - productPrice.getHeight()/2 - 30);
                    productPrice.setText( "<html>Precio: $" + rs.getString(2));
                    start();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al leer el c??digo.\n     Intente otra vez");
                }

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e.toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            codigo = "";
        }

    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    // End of variables declaration//GEN-END:variables
}
