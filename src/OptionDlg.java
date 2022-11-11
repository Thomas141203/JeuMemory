
import javax.swing.ImageIcon;

/**
 *
 * @author tm325716
 */

public class OptionDlg extends javax.swing.JDialog {

    private LesJoueurs lj; // Attribut correspondant aux joueurs séléctionnées
    private int niveau; // Attribut représentant le niveau du jeu (4,10,18,32)
    private boolean ok; // Indicateur de fermeture 
    
    
    public OptionDlg(java.awt.Frame parent, boolean modal){
        // Constructeur pour initialiser les attributs et créer la fenêtre avec la méthode initComponents
        // Puis on fait appel au constructeur de la superclass avec un paramètre qui gère la boite et un mode d'ouverture bloquant
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        lj = new LesJoueurs();
        BLara.setSelected(true);
        niveau = 4;
        enfant.setSelected(true);
        ok = false;
        BPhoto.setText("");
        BPhoto.setIcon(new ImageIcon(getClass().getResource("/img/lara.jpg")));
    }
    
    public LesJoueurs getLj(){
        //getter de l'attribut lj
        return this.lj;
    }

    public int getNiveau(){
        //getter de l'attribut niveau
        return this.niveau;
    }

    public boolean getOk(){
        //getter de l'attribut ok
        return this.ok;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PCentre = new javax.swing.JPanel();
        PNiveau = new javax.swing.JPanel();
        PTNiveau = new javax.swing.JPanel();
        LTTaillejeu = new javax.swing.JLabel();
        BRadio = new javax.swing.JPanel();
        enfant = new javax.swing.JRadioButton();
        debutant = new javax.swing.JRadioButton();
        avance = new javax.swing.JRadioButton();
        expert = new javax.swing.JRadioButton();
        PJoueur = new javax.swing.JPanel();
        PTJoueur = new javax.swing.JPanel();
        LTJoueur = new javax.swing.JLabel();
        BJoueur = new javax.swing.JPanel();
        BLara = new javax.swing.JCheckBox();
        BJack = new javax.swing.JCheckBox();
        BSebastien = new javax.swing.JCheckBox();
        BAmadeus = new javax.swing.JCheckBox();
        PInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        BPhoto = new javax.swing.JButton();
        PBas = new javax.swing.JPanel();
        BAnnuler = new javax.swing.JButton();
        BValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PCentre.setLayout(new java.awt.GridLayout(1, 3));

        PNiveau.setLayout(new java.awt.BorderLayout());

        LTTaillejeu.setText("Choisissez la taille du jeu");
        PTNiveau.add(LTTaillejeu);

        PNiveau.add(PTNiveau, java.awt.BorderLayout.NORTH);

        BRadio.setLayout(new java.awt.GridLayout(4, 1));

        buttonGroup1.add(enfant);
        enfant.setText("enfant ( 4 personnages, 2 familles)");
        enfant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfantActionPerformed(evt);
            }
        });
        BRadio.add(enfant);

        buttonGroup1.add(debutant);
        debutant.setText("débutant ( 10 personnages, 2 familles)");
        debutant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debutantActionPerformed(evt);
            }
        });
        BRadio.add(debutant);

        buttonGroup1.add(avance);
        avance.setText("avancé ( 18 personnages, 4 familles)");
        avance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanceActionPerformed(evt);
            }
        });
        BRadio.add(avance);

        buttonGroup1.add(expert);
        expert.setText("expert ( 32 personnages, 6 familles)");
        expert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertActionPerformed(evt);
            }
        });
        BRadio.add(expert);

        PNiveau.add(BRadio, java.awt.BorderLayout.CENTER);

        PCentre.add(PNiveau);

        PJoueur.setLayout(new java.awt.BorderLayout());

        LTJoueur.setText("Choisissez les joueurs créés par défaut");
        PTJoueur.add(LTJoueur);

        PJoueur.add(PTJoueur, java.awt.BorderLayout.NORTH);

        BJoueur.setLayout(new java.awt.GridLayout(4, 1));

        BLara.setText("Lara");
        BJoueur.add(BLara);

        BJack.setText("Jack");
        BJoueur.add(BJack);

        BSebastien.setText("Jean-Sébastien");
        BJoueur.add(BSebastien);

        BAmadeus.setText("Amadeus");
        BJoueur.add(BAmadeus);

        PJoueur.add(BJoueur, java.awt.BorderLayout.CENTER);

        PCentre.add(PJoueur);

        PInfo.setLayout(new java.awt.GridLayout(2, 1));

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        PInfo.add(jScrollPane1);
        PInfo.add(BPhoto);

        PCentre.add(PInfo);

        getContentPane().add(PCentre, java.awt.BorderLayout.CENTER);

        PBas.setLayout(new java.awt.GridLayout(1, 2));

        BAnnuler.setText("Annuler");
        BAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnnulerActionPerformed(evt);
            }
        });
        PBas.add(BAnnuler);

        BValider.setText("Valider");
        BValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BValiderActionPerformed(evt);
            }
        });
        PBas.add(BValider);

        getContentPane().add(PBas, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnnulerActionPerformed
        // Méthode qui au clic du bouton Annuler va fermer la boîte dialogue
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BAnnulerActionPerformed

    private void enfantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfantActionPerformed
        // Cette méthode fait que quand le joueur choisie la taille de jeu enfant, le niveau est mit à 4
        this.niveau = 4;
    }//GEN-LAST:event_enfantActionPerformed

    private void debutantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debutantActionPerformed
        // Cette méthode fait que quand le joueur choisie la taille de jeu debutant, le niveau est mit à 10
        this.niveau = 10;
    }//GEN-LAST:event_debutantActionPerformed

    private void BValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BValiderActionPerformed
        // Cette méthode permet d'ajouter à la liste des joueurs les joueurs séléctionner
        // Et que si il y a au minimum deux joueurs alors on met l'attribut ok sur true et on ferme cette boîte dialogue
        if (BLara.isSelected()){
            Joueur j = new Joueur("Lara", "epiques");
            j.setPhoto(new ImageIcon(getClass().getResource("/img/lara.jpg"))); 
            this.lj.ajouteJoueur(j);
        }
        
        if (BJack.isSelected()){
            Joueur j = new Joueur("Jack", "rares");
            j.setPhoto(new ImageIcon(getClass().getResource("/img/jack.png"))); 
            this.lj.ajouteJoueur(j);
        }
        
        if (BSebastien.isSelected()){
            Joueur j=new Joueur("Jean-Sébastien", "alpins-femmes");
            j.setPhoto(new ImageIcon(getClass().getResource("/img/bach.jpg"))); 
            this.lj.ajouteJoueur(j);
        }
        
        if (BAmadeus.isSelected()){
            Joueur j=new Joueur("Amadeus", "communs");
            j.setPhoto(new ImageIcon(getClass().getResource("/img/amadeus.jpg"))); 
            this.lj.ajouteJoueur(j);
        }
        
        if(this.lj.getNbJoueurs() >= 2){
            ok = true;
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_BValiderActionPerformed

    private void avanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanceActionPerformed
        // Cette méthode fait que quand le joueur choisie la taille de jeu avancé, le niveau est mit à 18
        this.niveau = 18;
    }//GEN-LAST:event_avanceActionPerformed

    private void expertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertActionPerformed
        // Cette méthode fait que quand le joueur choisie la taille de jeu expert, le niveau est mit à 32
        this.niveau = 32;
    }//GEN-LAST:event_expertActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OptionDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OptionDlg dialog = new OptionDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox BAmadeus;
    private javax.swing.JButton BAnnuler;
    private javax.swing.JCheckBox BJack;
    private javax.swing.JPanel BJoueur;
    private javax.swing.JCheckBox BLara;
    private javax.swing.JButton BPhoto;
    private javax.swing.JPanel BRadio;
    private javax.swing.JCheckBox BSebastien;
    private javax.swing.JButton BValider;
    private javax.swing.JTextArea Edition;
    private javax.swing.JLabel LTJoueur;
    private javax.swing.JLabel LTTaillejeu;
    private javax.swing.JPanel PBas;
    private javax.swing.JPanel PCentre;
    private javax.swing.JPanel PInfo;
    private javax.swing.JPanel PJoueur;
    private javax.swing.JPanel PNiveau;
    private javax.swing.JPanel PTJoueur;
    private javax.swing.JPanel PTNiveau;
    private javax.swing.JRadioButton avance;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton debutant;
    private javax.swing.JRadioButton enfant;
    private javax.swing.JRadioButton expert;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
