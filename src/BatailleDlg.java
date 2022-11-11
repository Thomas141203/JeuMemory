
/**
 *
 * @author tm325716
 */

public class BatailleDlg extends javax.swing.JDialog {

    private LesJoueurs lj;
    private int indj;
    private Joueur adversaire;
    private boolean ok;
    // private Bataille b
    
    public BatailleDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeJ = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Joueur = new javax.swing.JLabel();
        Adversaire = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfosCarte1 = new javax.swing.JTextArea();
        Carte1 = new javax.swing.JButton();
        Carte2 = new javax.swing.JButton();
        IC2 = new javax.swing.JScrollPane();
        InfosCarte2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Vainqueur = new javax.swing.JLabel();
        Annuler = new javax.swing.JButton();
        Demarrer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);

        ListeJ.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListeJ);

        jPanel5.add(jScrollPane2);

        getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        Joueur.setText("jLabel2");
        jPanel2.add(Joueur);

        Adversaire.setText("jLabel2");
        jPanel2.add(Adversaire);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        InfosCarte1.setColumns(20);
        InfosCarte1.setRows(5);
        jScrollPane1.setViewportView(InfosCarte1);

        jPanel3.add(jScrollPane1);

        Carte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anonyme.png"))); // NOI18N
        jPanel3.add(Carte1);

        Carte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anonyme.png"))); // NOI18N
        jPanel3.add(Carte2);

        InfosCarte2.setColumns(20);
        InfosCarte2.setRows(5);
        IC2.setViewportView(InfosCarte2);

        jPanel3.add(IC2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        Vainqueur.setText("jLabel2");
        jPanel4.add(Vainqueur);

        Annuler.setText("Annuler/Fermer");
        jPanel4.add(Annuler);

        Demarrer.setText("Démarrer");
        jPanel4.add(Demarrer);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BatailleDlg dialog = new BatailleDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Adversaire;
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Carte1;
    private javax.swing.JButton Carte2;
    private javax.swing.JButton Demarrer;
    private javax.swing.JScrollPane IC2;
    private javax.swing.JTextArea InfosCarte1;
    private javax.swing.JTextArea InfosCarte2;
    private javax.swing.JLabel Joueur;
    private javax.swing.JList<String> ListeJ;
    private javax.swing.JLabel Vainqueur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
