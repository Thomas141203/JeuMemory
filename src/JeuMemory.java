
/**
 *
 * @author tm325716
 */

public class JeuMemory extends javax.swing.JFrame {
    private LesPersonnages persos; //listes des personnages de la partie (rempli a l aide du niveau choisi dans OptionDlg)
    private LesJoueurs joueurs; //listes des joueurs de la partie (rempli a l'aide du niveau choisi dans OptionDlg)
    private Joueur jc; //joueur courant(en gros celui dont c'est le tour)
    
    public JeuMemory(){
        // Constructeur de la class JeuMemory pour initialiser les attributs et créer l'interface avec la méthode initComponents
        initComponents();
        this.setLocationRelativeTo(null);
        this.persos = new LesPersonnages();
        this.joueurs = new LesJoueurs();
        this.jc = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PGauche = new javax.swing.JPanel();
        PHaut = new javax.swing.JPanel();
        Message1 = new javax.swing.JLabel();
        Message2 = new javax.swing.JLabel();
        Message3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        PBas = new javax.swing.JPanel();
        BDemarrer = new javax.swing.JButton();
        BRecommencer = new javax.swing.JButton();
        PMilieu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MParametres = new javax.swing.JMenu();
        MOptions = new javax.swing.JMenuItem();
        MAjoutJoueur = new javax.swing.JMenuItem();
        MVisualiser = new javax.swing.JMenu();
        MJoueur = new javax.swing.JMenuItem();
        MCarte = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGauche.setLayout(new java.awt.BorderLayout());

        PHaut.setLayout(new java.awt.GridLayout(3, 1));

        Message1.setText("jLabel1");
        PHaut.add(Message1);

        Message2.setText("jLabel1");
        PHaut.add(Message2);

        Message3.setText("jLabel1");
        PHaut.add(Message3);

        PGauche.add(PHaut, java.awt.BorderLayout.NORTH);

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        PGauche.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        PBas.setLayout(new java.awt.GridLayout(1, 2));

        BDemarrer.setText("Démarrer");
        PBas.add(BDemarrer);

        BRecommencer.setText("Recommencer");
        PBas.add(BRecommencer);

        PGauche.add(PBas, java.awt.BorderLayout.SOUTH);

        getContentPane().add(PGauche, java.awt.BorderLayout.WEST);

        PMilieu.setLayout(new java.awt.GridLayout(4, 5));

        jButton1.setText("jButton1");
        PMilieu.add(jButton1);

        jButton2.setText("jButton1");
        PMilieu.add(jButton2);

        jButton3.setText("jButton1");
        PMilieu.add(jButton3);

        jButton4.setText("jButton1");
        PMilieu.add(jButton4);

        jButton5.setText("jButton1");
        PMilieu.add(jButton5);

        jButton6.setText("jButton1");
        PMilieu.add(jButton6);

        jButton7.setText("jButton1");
        PMilieu.add(jButton7);

        jButton8.setText("jButton1");
        PMilieu.add(jButton8);

        jButton9.setText("jButton1");
        PMilieu.add(jButton9);

        jButton10.setText("jButton1");
        PMilieu.add(jButton10);

        jButton11.setText("jButton1");
        PMilieu.add(jButton11);

        jButton12.setText("jButton1");
        PMilieu.add(jButton12);

        jButton13.setText("jButton1");
        PMilieu.add(jButton13);

        jButton14.setText("jButton1");
        PMilieu.add(jButton14);

        jButton15.setText("jButton1");
        PMilieu.add(jButton15);

        jButton16.setText("jButton1");
        PMilieu.add(jButton16);

        jButton17.setText("jButton1");
        PMilieu.add(jButton17);

        jButton18.setText("jButton1");
        PMilieu.add(jButton18);

        jButton19.setText("jButton1");
        PMilieu.add(jButton19);

        jButton20.setText("jButton1");
        PMilieu.add(jButton20);

        getContentPane().add(PMilieu, java.awt.BorderLayout.CENTER);

        MParametres.setText("Paramètres");

        MOptions.setText("Options");
        MOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOptionsActionPerformed(evt);
            }
        });
        MParametres.add(MOptions);

        MAjoutJoueur.setText("Ajout Joueur");
        MAjoutJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAjoutJoueurActionPerformed(evt);
            }
        });
        MParametres.add(MAjoutJoueur);

        jMenuBar1.add(MParametres);

        MVisualiser.setText("Visualiser");

        MJoueur.setText("Joueur");
        MJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJoueurActionPerformed(evt);
            }
        });
        MVisualiser.add(MJoueur);

        MCarte.setText("Carte");
        MCarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCarteActionPerformed(evt);
            }
        });
        MVisualiser.add(MCarte);

        jMenuBar1.add(MVisualiser);

        jMenu1.setText("Test");

        jMenuItem1.setText("Tranfert_Test");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOptionsActionPerformed
        // Cette méthode permet l'ouverture de la boite de dialogue OptionDlg
        OptionDlg diag = new OptionDlg(this, true);
        diag.setVisible(true);
        if(diag.getOk() == true){
            LesJoueurs lj = diag.getLj();
            int niveau = diag.getNiveau();
        }
    }//GEN-LAST:event_MOptionsActionPerformed

    private void MAjoutJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAjoutJoueurActionPerformed
        // Cette méthode permet l'ouverture de la boite de dialogue SaisieJoueurDlg
        SaisieJoueurDlg diag = new SaisieJoueurDlg(this, true, this.persos);
        diag.setVisible(true);
        if(diag.getModeFermeture() == true){
            this.joueurs.ajouteJoueur(diag.getJoueur());
        }
    }//GEN-LAST:event_MAjoutJoueurActionPerformed

    private void MJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJoueurActionPerformed
        // Cette méthode permet l'ouverture de la boite de dialogue VisuJoueurDlg
        VisuJoueursDlg diag = new VisuJoueursDlg(this, true, this.joueurs);
        diag.setVisible(true);
    }//GEN-LAST:event_MJoueurActionPerformed

    private void MCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCarteActionPerformed
        // Cette méthode permet l'ouverture de la boite de dialogue VisuPersonnagesDlg
        Joueur j = new Joueur("FanMemory", "commun");
        j.initPaquetTest();
        VisuPersonnagesDlg diag = new VisuPersonnagesDlg(this, true, j);
    }//GEN-LAST:event_MCarteActionPerformed
    
    private void Tranfert_TestActionPerformed(java.awt.event.ActionEvent evt){
        // Simple méthode de test pour les futurs avancement avec la class Transfert
        Joueur j1=new Joueur("FanMemory0", "commun");
        j1.initPaquetTest();
        Joueur j2=new Joueur("FanMemory1", "commun");
        j2.getPaquet().ajoutePerso(new Personnage("epiques", "burnout", 20));
        j2.getPaquet().ajoutePerso(new Personnage("epiques", "funk-ops", 30));
        j2.getPaquet().ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
        this.joueurs.ajouteJoueur(j1);
        this.joueurs.ajouteJoueur(j2);
        TransfertDlg diag = new TransfertDlg(this,true,joueurs,0 );
        diag.setVisible(true);}
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDemarrer;
    private javax.swing.JButton BRecommencer;
    private javax.swing.JTextArea Edition;
    private javax.swing.JMenuItem MAjoutJoueur;
    private javax.swing.JMenuItem MCarte;
    private javax.swing.JMenuItem MJoueur;
    private javax.swing.JMenuItem MOptions;
    private javax.swing.JMenu MParametres;
    private javax.swing.JMenu MVisualiser;
    private javax.swing.JLabel Message1;
    private javax.swing.JLabel Message2;
    private javax.swing.JLabel Message3;
    private javax.swing.JPanel PBas;
    private javax.swing.JPanel PGauche;
    private javax.swing.JPanel PHaut;
    private javax.swing.JPanel PMilieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
