package CZAS;

import OKNA.FOknoGlowne;
import REJESTR.CONF;
import REJESTR.MAIN;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelZegar extends javax.swing.JPanel {

    private String aktualnyCzas;
    private String aktualnaData;
    private String aktualnyRok;
    
    
    public String podajCzas(){
        return aktualnyCzas;
    }
    
    public String podajDate(){
        return aktualnaData;
    }    
   
    public String podajRok(){
        return aktualnyRok;
    } 

    private void ustawCzas(){
        String s = "";
        String s1 = "";
        int m = 0;
        
        Calendar cal = new GregorianCalendar();

        m = cal.get(Calendar.MONTH);
        m = m + 1;
        if (m<10){
            s = "0" + Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }
        m = cal.get(Calendar.DATE);
        if (m<10){
            s1 = "0" + Integer.toString(m);
        }else{
            s1 = Integer.toString(m);
        }
        s = s1+"."+s+"."+Integer.toString(cal.get(Calendar.YEAR));
        aktualnyRok = Integer.toString(cal.get(Calendar.YEAR));
        aktualnaData = s;
        
        // WYŚWIETLANIE GODZINY
        m = cal.get(Calendar.HOUR_OF_DAY);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }
        s1 = s;
        m = cal.get(Calendar.MINUTE);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }        
        s1 = s1+":"+s;
        m = cal.get(Calendar.SECOND);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }  
        s1 = s1+":"+s;
        jLabel1.setText(s1);  
        aktualnyCzas = s1;
    }
    
    public void ZegarUstaw() {
        
        Thread clock = new Thread(){
            public void run(){
                for(;;){
                    // ******************************************************
                    
                        if (CONF.blokadaRok == 0){
                            CONF.aktualnyRok = aktualnyRok;
                        }

                        MAIN.TestLicznik();
                        FOknoGlowne.aktualizujBelke();

                    // ******************************************************
                    ustawCzas();
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PanelZegar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   
        };
        clock.start();
       
    }
    
    
    public PanelZegar() {
        initComponents();
        jLabel1.setText("??:??:??");
        //FOknoGlowne.lData.setText("??.??.????r.");
        //ZegarUstaw();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(120, 34));
        setMinimumSize(new java.awt.Dimension(95, 34));
        setPreferredSize(new java.awt.Dimension(95, 34));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

