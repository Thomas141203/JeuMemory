
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author tm325716
 */

public class VisuPersonnagesDlg extends javax.swing.JDialog {

    private Joueur j; // Attribut de type Joueur correspondant au joueur auquel on veut voir ses cartes
    
    public VisuPersonnagesDlg(java.awt.Frame parent, boolean modal, Joueur j){
        // Constructeur pour initialiser l'attribut, créer la fenêtre et le Trombinoscope
        // Puis on fait appel au constructeur de la superclass avec un paramètre qui gère la boite et un mode d'ouverture bloquant
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        initPanneau();
        this.j = j;
    }

    public void initPanneau(){
        // Méthode qui permet d'initialiser le Trombinoscope avec le nombre de boutons nécessaire
        Trombi.removeAll();
        this.repaint();
        LesPersonnages lcs = this.j.getPaquet();
        int t = lcs.getTaille();
        int n = 1+(t-1)/4;
        Trombi.setLayout(new java.awt.GridLayout(n, n));
        for(int i=0; i<t; i++){
            JButton bt = new JButton();
            bt.setName(lcs.getPerso(i).getFamille());       
        }
        this.pack();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitre = new javax.swing.JPanel();
        LTitre = new javax.swing.JLabel();
        PCentre = new javax.swing.JPanel();
        Trombi = new javax.swing.JPanel();
        PScore = new javax.swing.JPanel();
        LScore = new javax.swing.JLabel();
        PBas = new javax.swing.JPanel();
        Afficher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PTitre.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        LTitre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LTitre.setText("Cartes du joueur :");
        LTitre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PTitre.add(LTitre);

        getContentPane().add(PTitre, java.awt.BorderLayout.NORTH);

        PCentre.setLayout(new java.awt.BorderLayout());

        Trombi.setLayout(new java.awt.BorderLayout());
        PCentre.add(Trombi, java.awt.BorderLayout.CENTER);

        PScore.setLayout(new java.awt.BorderLayout());

        LScore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LScore.setText("Score :");
        LScore.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PScore.add(LScore, java.awt.BorderLayout.WEST);

        PCentre.add(PScore, java.awt.BorderLayout.SOUTH);

        getContentPane().add(PCentre, java.awt.BorderLayout.CENTER);

        PBas.setLayout(new java.awt.GridLayout(1, 1));

        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        PBas.add(Afficher);

        getContentPane().add(PBas, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        // Méthode qui au clic sur le boutons Afficher va remplir les boutons du trombinoscope avec les images des cartes possèder par le joueur courant
        LesPersonnages pjc = this.j.getPaquet();
        for(int i=0; i<pjc.getTaille(); i++){
            JButton bt = (JButton)Trombi.getComponent(i);
            bt.setIcon(new ImageIcon(pjc.getPerso(i).getPhoto()));
        }
    }//GEN-LAST:event_AfficherActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuPersonnagesDlg dialog = new VisuPersonnagesDlg(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton Afficher;
    private javax.swing.JLabel LScore;
    private javax.swing.JLabel LTitre;
    private javax.swing.JPanel PBas;
    private javax.swing.JPanel PCentre;
    private javax.swing.JPanel PScore;
    private javax.swing.JPanel PTitre;
    private javax.swing.JPanel Trombi;
    // End of variables declaration//GEN-END:variables
}
