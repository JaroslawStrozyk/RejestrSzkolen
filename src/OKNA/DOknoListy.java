/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OKNA;

import BAZA.MYSQL_BAZA;
import REJESTR.CONF;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author edatabit
 */
public class DOknoListy extends javax.swing.JDialog {

    
    /**
     * Creates new form Lista
     */
    public DOknoListy(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        buttonPrintData = new javax.swing.JButton();
        buttonPrintFirma = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista obecności");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lo2.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("AQUANET"));

        jButton1.setText("Pracownicy produkcyjni");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonPrintData.setText("Kierujący pracownikami");
        buttonPrintData.setActionCommand("");
        buttonPrintData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintDataActionPerformed(evt);
            }
        });

        buttonPrintFirma.setText("Administracyjno - biurowi");
        buttonPrintFirma.setActionCommand("");
        buttonPrintFirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintFirmaActionPerformed(evt);
            }
        });

        buttonPrint.setText("Pusta ogólna lista obecności");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        jButton2.setText("Produkcyjni");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPrintFirma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPrintData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPrintFirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPrintData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drukLista(int i, String sql) {
        try {
            String s = "";
            if (i == 0) {
                s = CONF.ProgramPath+"\\RAPORTY\\wzor_lista.jrxml";//"C:\\Program Files\\RS\\wzor_lista.jrxml";
            };
            if (i == 1) {
                s = CONF.ProgramPath+"\\RAPORTY\\wzor_aq_ab.jrxml";
            }
            if (i == 2) {
                s = CONF.ProgramPath+"\\RAPORTY\\wzor_aq_kp.jrxml";
            }
            if (i == 3) {
                s = CONF.ProgramPath+"\\RAPORTY\\wzor_aq_sr.jrxml";
            }
            if (i == 4) {
                s = CONF.ProgramPath+"\\RAPORTY\\AQUANET_SR_LISTA.jrxml";
            }
            JasperDesign jasperDesign = JRXmlLoader.load(s);
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, MYSQL_BAZA.conn);
            //JasperViewer.viewReport(jasperPrint);
            JasperViewer.viewReport(jasperPrint, false, null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemy:\n" + e);
        }
    }


    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        drukLista(0, "SELECT\n"
                + "     pusty_wzor.`id` AS \"LP\",\n"
                + "     pusty_wzor.`nazwisko` AS \"NAZWISKO\",\n"
                + "     pusty_wzor.`imie` AS \"IMIE\",\n"
                + "     pusty_wzor.`urodzony` AS \"DATA URODZENIA\",\n"
                + "     pusty_wzor.`podpis` AS \"PODPIS\"\n"
                + "FROM\n"
                + "      pusty_wzor");
    }//GEN-LAST:event_buttonPrintActionPerformed

    private void buttonPrintFirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintFirmaActionPerformed
        drukLista(1, "SELECT\n"
                + "     pusty_wzor.`id` AS \"LP\",\n"
                + "     pusty_wzor.`nazwisko` AS \"NAZWISKO\",\n"
                + "     pusty_wzor.`imie` AS \"IMIE\",\n"
                + "     pusty_wzor.`urodzony` AS \"DATA URODZENIA\",\n"
                + "     pusty_wzor.`podpis` AS \"PODPIS\"\n"
                + "FROM\n"
                + "      pusty_wzor");
    }//GEN-LAST:event_buttonPrintFirmaActionPerformed

    private void buttonPrintDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintDataActionPerformed
        drukLista(2, "SELECT\n"
                + "     pusty_wzor.`id` AS \"LP\",\n"
                + "     pusty_wzor.`nazwisko` AS \"NAZWISKO\",\n"
                + "     pusty_wzor.`imie` AS \"IMIE\",\n"
                + "     pusty_wzor.`urodzony` AS \"DATA URODZENIA\",\n"
                + "     pusty_wzor.`podpis` AS \"PODPIS\"\n"
                + "FROM\n"
                + "      pusty_wzor");
    }//GEN-LAST:event_buttonPrintDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        drukLista(3, "SELECT\n"
                + "     pusty_wzor.`id` AS \"LP\",\n"
                + "     pusty_wzor.`nazwisko` AS \"NAZWISKO\",\n"
                + "     pusty_wzor.`imie` AS \"IMIE\",\n"
                + "     pusty_wzor.`urodzony` AS \"DATA URODZENIA\",\n"
                + "     pusty_wzor.`podpis` AS \"PODPIS\"\n"
                + "FROM\n"
                + "      pusty_wzor");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        drukLista(4,"SELECT NAZWISKO, IMIE, URODZONY FROM VRAP1 WHERE ZASWIADCZENIE LIKE '%SR_AQ%' ORDER BY NAZWISKO ASC");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DOknoListy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOknoListy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOknoListy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOknoListy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DOknoListy dialog = new DOknoListy(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonPrintData;
    private javax.swing.JButton buttonPrintFirma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
