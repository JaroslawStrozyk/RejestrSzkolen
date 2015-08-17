package OKNA;

import BAZA.MYSQL_BAZA;
import REJESTR.CONF;
import REJESTR.MAIN;
import REJESTR.PLIK;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
 * rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
 * JTAB_TABLE.getColumnModel().getColumn(4).setCellRenderer( rightRenderer );
 *
 *
 *
 * @author edatabit
 */
public class FOknoGlowne extends javax.swing.JFrame {

    public FOknoGlowne() {
        initComponents();
        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        jComboBox1.setRenderer(dlcr);
        jComboBox1.setModel(new DefaultComboBoxModel(CONF.firmy.toArray()));
        jComboBox1.setSelectedItem(CONF.firma_domyslna);
        zegar1.ZegarUstaw();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSeparator3 = new javax.swing.JToolBar.Separator();
        zegar1 = new CZAS.PanelZegar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton9 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Rejestr szkoleń");
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRACOWNIK", 2, 0, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/businessman_add.png"))); // NOI18N
        jButton5.setToolTipText("Nowy pracownik");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/businessman_preferences.png"))); // NOI18N
        jButton1.setToolTipText("Edycja pracownika");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/businessman_delete-1.png"))); // NOI18N
        jButton4.setToolTipText("Kasowanie pracownika");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jSeparator1.setMaximumSize(new java.awt.Dimension(20, 40));
        jSeparator1.setMinimumSize(new java.awt.Dimension(20, 40));
        jSeparator1.setPreferredSize(new java.awt.Dimension(20, 40));
        jToolBar1.add(jSeparator1);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setMaximumSize(new java.awt.Dimension(150, 30));
        jTextField1.setMinimumSize(new java.awt.Dimension(150, 30));
        jTextField1.setName(""); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(150, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jTextField1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/businessman_view-1.png"))); // NOI18N
        jButton3.setToolTipText("Wyszukiwanie w danych pracownika");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(filler2);

        jLabel1.setText("FIRMA: ");
        jToolBar1.add(jLabel1);

        jComboBox1.setModel(new DefaultComboBoxModel(REJESTR.CONF.firmy.toArray()));
        jComboBox1.setToolTipText("Selekcja według firmy");
        jComboBox1.setMaximumSize(new java.awt.Dimension(200, 30));
        jComboBox1.setMinimumSize(new java.awt.Dimension(200, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox1);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ROK: ");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 30));
        jToolBar1.add(jLabel12);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2014", "2013" }));
        jComboBox2.setToolTipText("Selekcja według firmy");
        jComboBox2.setMaximumSize(new java.awt.Dimension(200, 30));
        jComboBox2.setMinimumSize(new java.awt.Dimension(200, 30));
        jComboBox2.setPreferredSize(new java.awt.Dimension(60, 30));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox2);
        jToolBar1.add(filler1);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(zegar1);

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SZKOLENIE", 2, 2, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.add(filler3);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        jButton9.setToolTipText("Nowe szkolenie");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton9);

        jSeparator6.setPreferredSize(new java.awt.Dimension(20, 0));
        jToolBar3.add(jSeparator6);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document-new.png"))); // NOI18N
        jButton6.setToolTipText("Nowe szkolenie");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document-edit.png"))); // NOI18N
        jButton7.setToolTipText("Edycja szkolenia");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document-close.png"))); // NOI18N
        jButton8.setToolTipText("Kasowanie szkolenia");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton8);

        jTable2.setBackground(new java.awt.Color(255, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(0));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(126, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Baza:");

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Osoby:");

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Katalog.:");

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("jLabel8");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Rok:");

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Ilość zaświad.:");

        jLabel11.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("jLabel8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(56, 30));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ikona.png"))); // NOI18N
        jMenu1.setText("Program");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logi.png"))); // NOI18N
        jMenuItem5.setText("Statystyka");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logi.png"))); // NOI18N
        jMenuItem4.setText("Przegląd logów");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wyiscie.png"))); // NOI18N
        jMenuItem1.setText("Wyjście");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder-txt1.png"))); // NOI18N
        jMenu3.setText("Dokumenty");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basket1.png"))); // NOI18N
        jMenuItem6.setText("Lista obecności");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basket1.png"))); // NOI18N
        jMenuItem9.setText("Zbiorcza lista zaświadczeń");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);
        jMenu3.add(jSeparator5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer1.png"))); // NOI18N
        jMenuItem3.setText("Drukowanie");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pomoc.png"))); // NOI18N
        jMenu2.setText("Pomoc");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logi.png"))); // NOI18N
        jMenuItem7.setText("Spis zaświadczeń");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logi.png"))); // NOI18N
        jMenuItem8.setText("Materiały eksploatacyjne");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator4);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pomoc.png"))); // NOI18N
        jMenuItem2.setText("O programie...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (MYSQL_BAZA.conn != null) {
            try {
                PrzeladujPracownikSzkolenia();
            } catch (FileNotFoundException ex) {
                PLIK.doLogu("ALARM", MAIN.Bledy(4) + " [" + ex + "]");
            }
        };
        
        //CONF.aktualnyRok = "2016";
        
        URL url = getClass().getResource("/img/ikona.png");
        ImageIcon imaicon = new javax.swing.ImageIcon(url);
        Image image = imaicon.getImage();
        setIconImage(image);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = jTable1.getSelectedRow();
        DOknoPracownik pd = new DOknoPracownik(this, true);
        pd.ustawDane(false,
                jTable1.getModel().getValueAt(row, 0).toString(),
                jTable1.getModel().getValueAt(row, 1).toString(),
                jTable1.getModel().getValueAt(row, 2).toString(),
                jTable1.getModel().getValueAt(row, 3).toString(),
                jTable1.getModel().getValueAt(row, 4).toString(),
                jTable1.getModel().getValueAt(row, 5).toString(),
                jTable1.getModel().getValueAt(row, 6).toString(),
                jTable1.getModel().getValueAt(row, 7).toString()
        );
        pd.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Object[] options = {"TAK", "NIE"};
        int n = JOptionPane.showOptionDialog(this,
                "Czy chcesz bezpowrotnie\nusunąć zaznaczony rekord\noraz wszystkie skojarzone\nz nim dane?\n", "Uwaga!!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (n == 0) {

            //kasuj
            int row = jTable1.getSelectedRow();
            try {
                MYSQL_BAZA.deletePracownik(jTable1.getModel().getValueAt(row, 0).toString());
            } catch (FileNotFoundException ex) {
                PLIK.doLogu("ALARM", MAIN.Bledy(5) + " [" + ex + "]");
            }
            try {
                PrzeladujPracownikSzkolenia();
            } catch (FileNotFoundException ex) {
                PLIK.doLogu("ALARM", MAIN.Bledy(6) + " [" + ex + "]");
            }

        };
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        DOknoPracownik pd = new DOknoPracownik(this, true);
        pd.ustawDane(true, null, null, null, null, null, null, null, null);
        pd.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        zamykanieAplikacji();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        String s = jTable1.getModel().getValueAt(row, 0).toString();
        try {
            jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie(s)));
        } catch (FileNotFoundException ex) {
            PLIK.doLogu("ALARM", MAIN.Bledy(7) + " [" + ex + "]");
        }

        UstawWidokSzkolenie();

        jButton1.setEnabled(true);
        jButton4.setEnabled(true);

        jButton6.setEnabled(true);


    }//GEN-LAST:event_jTable1MouseClicked

    private void ComboAkcja() throws FileNotFoundException {
        String str = (String) jComboBox1.getSelectedItem();
        jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.selectFirma(str)));
        jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie("0")));
        //MAIN.firma_domyslna = str;
        CONF.firma_domyslna = str;
        UstawWidok();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Wybrana opcja
        try {
            ComboAkcja();
        } catch (FileNotFoundException ex) {
            PLIK.doLogu("ALARM", MAIN.Bledy(8) + " [" + ex + "]");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Szukaj
        String str = jTextField1.getText();
        try {
            jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.findData(str)));
        } catch (FileNotFoundException ex) {
            PLIK.doLogu("ALARM", MAIN.Bledy(9) + " [" + ex + "]");
        }
        try {
            jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie("0")));
        } catch (FileNotFoundException ex) {
            PLIK.doLogu("ALARM", MAIN.Bledy(10) + " [" + ex + "]");
        }
        UstawWidok();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int row = jTable1.getSelectedRow();
        DOknoSzkolenie sd = new DOknoSzkolenie(this, true);
        sd.ustawDane(true, jTable1.getModel().getValueAt(row, 0).toString(), jTable1.getModel().getValueAt(row, 3).toString(), jTable1.getModel().getValueAt(row, 4).toString(), null, null, null, null, null);
        sd.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int row = jTable1.getSelectedRow();
        int rowz = jTable2.getSelectedRow();
        DOknoSzkolenie sd = new DOknoSzkolenie(this, true);
        sd.ustawDane(false, jTable1.getModel().getValueAt(row, 0).toString(), jTable1.getModel().getValueAt(row, 3).toString(), jTable1.getModel().getValueAt(row, 4).toString(), jTable2.getModel().getValueAt(rowz, 0).toString(), jTable2.getModel().getValueAt(rowz, 2).toString(), jTable2.getModel().getValueAt(rowz, 3).toString(), jTable2.getModel().getValueAt(rowz, 4).toString(), jTable2.getModel().getValueAt(rowz, 5).toString());
        sd.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object[] options = {"TAK", "NIE"};
        int n = JOptionPane.showOptionDialog(this,
                "Czy chcesz bezpowrotnie\n usunąć zaznaczone dane?", "Uwaga!!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        // DO TEGO MIEJSCA LOGI
        if (n == 0) {
            //kasuj
            int row = jTable2.getSelectedRow();
            try {
                MYSQL_BAZA.deleteSzkolenie(jTable2.getModel().getValueAt(row, 0).toString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PrzeladujPracownikSzkolenia();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
    }//GEN-LAST:event_jButton8ActionPerformed

    private void oknoDrukowania(){
        String wdata = "";
        String wkod = "";

        try {
            int row = jTable2.getSelectedRow();
            wdata = jTable2.getModel().getValueAt(row, 2).toString();
            wkod = jTable2.getModel().getValueAt(row, 5).toString();
        } catch (Exception e) {
            wdata = FOknoGlowne.podajDate();
            wkod = "";
        };

        DOknoDruk druk = new DOknoDruk(this, false);
        druk.startParametry(wdata, wkod);
        //druk.ustawCzas();
        druk.setVisible(true);        
    }

    private void oknoDrukLista(){
        String wdata = "";
        String wkod = "";

        try {
            int row = jTable2.getSelectedRow();
            wdata = jTable2.getModel().getValueAt(row, 2).toString();
            wkod = jTable2.getModel().getValueAt(row, 5).toString();
        } catch (Exception e) {
            wdata = FOknoGlowne.podajDate();
            wkod = "";
        };

        DOknoDrukLista druk = new DOknoDrukLista(this, false);
        druk.startParametry(wdata, wkod);
        //druk.ustawCzas();
        druk.setVisible(true);        
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        oknoDrukowania();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DOknoProgram op = new DOknoProgram(this, true);
        op.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DOknoListy lo = new DOknoListy(this, false);
        lo.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        // Szukaj po ENTER
        String str = jTextField1.getText();
        try {
            jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.findData(str)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie("0")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        UstawWidok();
        jTextField1.setText("");

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        DOknoStatystyka st = new DOknoStatystyka(this, true);
        st.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        /*try {
         PLIK.OtworzLOG();
         } catch (IOException ex) {
         Logger.getLogger(FOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        DOknoLogi lo = new DOknoLogi(this, true);
        lo.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        zamykanieAplikacji();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        DOknoSpisZas sz = new DOknoSpisZas(this, true);
        sz.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        DOknoMatEkspl me = new DOknoMatEkspl(this, true);
        me.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        oknoDrukowania();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        CONF.aktualnyRok = (String) jComboBox2.getSelectedItem();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        oknoDrukLista();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void zamykanieAplikacji() {

        Object[] options = {"TAK", "NIE"};
        int n = JOptionPane.showOptionDialog(this,
                "Czy chcesz zamknąć program\n" + MAIN.NazwaProgramu + "?", "Uwaga !!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (n == 0) {
            PLIK.doLogu("INFO   ", "Program zamknięty przez Użytkownika.");
            System.exit(0);
        };

    };
     
    public static void PrzeladujPracownikSzkolenia() throws FileNotFoundException {
        jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.selectFirma(CONF.firma_domyslna)));
        //jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradePracownik()));//GEN_iREPORT.firma_domyslna
        jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie("0")));
        UstawWidok();
    }

    public static void PrzeladujSzkolenia(String ind) throws FileNotFoundException {
        //jTable1.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradePracownik()));//GEN_iREPORT.firma_domyslna
        jTable2.setModel(DbUtils.resultSetToTableModel(MYSQL_BAZA.upgradeSzkolenie(ind)));
        //UstawWidok();
        UstawWidokSzkolenie();
    }

    private static void UstawWidokSzkolenie() {

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(0);
        jTable2.getColumnModel().getColumn(1).setMinWidth(0);
        jTable2.getColumnModel().getColumn(1).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setMinWidth(100);
        jTable2.getColumnModel().getColumn(2).setMaxWidth(100);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(4).setMinWidth(150);
        jTable2.getColumnModel().getColumn(4).setMaxWidth(150);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(0);
        jTable2.getColumnModel().getColumn(5).setMinWidth(0);
        jTable2.getColumnModel().getColumn(5).setMaxWidth(0);
    }

    private static void UstawWidok() {

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(2).setMinWidth(0);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);

        UstawWidokSzkolenie();

        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }

    public static String podajDate() {

        return zegar1.podajDate();
    }

    public static void aktualizujBelke() {
        jLabel6.setText(Integer.toString(MAIN.wpisyPracownik));
        jLabel8.setText(Integer.toString(MAIN.wpisySzkolenie));
        jLabel4.setText(CONF.ipAddress);
        jLabel9.setText(CONF.aktualnyRok);
        jLabel11.setText(CONF.ProgramPath);
    }

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
            java.util.logging.Logger.getLogger(FOknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOknoGlowne().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    public static javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private static CZAS.PanelZegar zegar1;
    // End of variables declaration//GEN-END:variables
}
