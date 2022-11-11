import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 *
 * @author Thomas
 */

public class InitDlg extends javax.swing.JDialog{
    
    //attributs
    private int nc;//niveau (4, 10, 18, 32)
    private LesJoueurs lj;//les joueurs sélectionnés
    private boolean ok;//true pour Valider, false pour Annuler
    
    public InitDlg(java.awt.Frame parent, boolean modal){
        super(parent, modal);//appel au constructeur de la classe ancètre
        initComponents();//création de l'interface par l'EDI
        //initialisation des attributs
        this.nc = 4;
        this.lj = new LesJoueurs();
        this.ok = false;
    }
    
    //accesseurs d’accès en lecture des attributs
    public int getNiveau(){
        return this.nc;
    }
    
    public LesJoueurs getJoueurs(){
        return this.lj;
    }
    
    public boolean getOk(){
        return this.ok;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LTaille = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Enfant = new javax.swing.JRadioButton();
        Débutant = new javax.swing.JRadioButton();
        Avancé = new javax.swing.JRadioButton();
        Expert = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        LJoueur = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CLara = new javax.swing.JCheckBox();
        CJack = new javax.swing.JCheckBox();
        CJS = new javax.swing.JCheckBox();
        CAma = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        BPhoto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setLayout(new java.awt.BorderLayout());

        LTaille.setText("Choisissez la taille du jeu");
        jPanel4.add(LTaille, java.awt.BorderLayout.NORTH);

        jPanel6.setLayout(new java.awt.GridLayout(4, 1));

        buttonGroup1.add(Enfant);
        Enfant.setSelected(true);
        Enfant.setText("enfant (4 persos, 2 familles, 8 cartes)");
        Enfant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnfantActionPerformed(evt);
            }
        });
        jPanel6.add(Enfant);

        buttonGroup1.add(Débutant);
        Débutant.setText("débutant (10 persos, 2 familles, 20 cartes)");
        Débutant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DébutantActionPerformed(evt);
            }
        });
        jPanel6.add(Débutant);

        buttonGroup1.add(Avancé);
        Avancé.setText("avancé (18 persos,4 familles, 36 cartes)");
        Avancé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvancéActionPerformed(evt);
            }
        });
        jPanel6.add(Avancé);

        buttonGroup1.add(Expert);
        Expert.setText("expert (32 persos,6 familles, 64 cartes)");
        Expert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpertActionPerformed(evt);
            }
        });
        jPanel6.add(Expert);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        LJoueur.setText("Choisissez les joueurs créés par défaut");
        jPanel5.add(LJoueur, java.awt.BorderLayout.NORTH);

        jPanel7.setLayout(new java.awt.GridLayout(4, 1));

        CLara.setText("Lara");
        CLara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLaraActionPerformed(evt);
            }
        });
        jPanel7.add(CLara);

        CJack.setText("Jack");
        CJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJackActionPerformed(evt);
            }
        });
        jPanel7.add(CJack);

        CJS.setText("Jean-Sébastien");
        CJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJSActionPerformed(evt);
            }
        });
        jPanel7.add(CJS);

        CAma.setText("Amadeus");
        CAma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAmaActionPerformed(evt);
            }
        });
        jPanel7.add(CAma);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        Edition.setColumns(20);
        Edition.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        jPanel2.add(jScrollPane1);

        BPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memory/img/lara.jpg"))); // NOI18N
        jPanel2.add(BPhoto);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel3.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel3.add(Valider);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLaraActionPerformed
        //gestionnaires du clic sur Lara pour afficher set informations relatives
        Joueur j = new Joueur("Lara", "epiques");//création d'un joueur ayant comme pseudo Lara et comme famille préférée epiques
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/lara.jpg")));//on met l'ImageIcon correspondant au joueur à son attribut photo
        Edition.setText(j.toString());//on affiche ses informations textuelles dans la zone d’édition
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);//on récupère la photo du joueur
        //cette photo est redimentionnée à la taille du bouton "BPhoto", mais ceci va agrandir le bouton à chaque fois
        BPhoto.setIcon(new ImageIcon(img));//on affiche sa photo sur le bouton "BPhoto"
    }//GEN-LAST:event_CLaraActionPerformed

    private void CJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJackActionPerformed
        //gestionnaires du clic sur Jack pour afficher set informations relatives
        Joueur j = new Joueur("Jack", "rares");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/jack.png")));
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_CJackActionPerformed

    private void CJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJSActionPerformed
        //gestionnaires du clic sur Jean-Sébastien pour afficher set informations relatives
        Joueur j = new Joueur("Jean-Sébastien", "alpins-femmes");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/bach.jpg")));
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_CJSActionPerformed

    private void CAmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAmaActionPerformed
        //gestionnaires du clic sur Amadeus pour afficher set informations relatives
        Joueur j = new Joueur("Amadeus", "communs");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/mozart.jpg")));
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_CAmaActionPerformed

    private void EnfantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnfantActionPerformed
        this.nc = 4; // on établie le niveau de la partie à 4 personnages soit 8 cartes
    }//GEN-LAST:event_EnfantActionPerformed

    private void DébutantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DébutantActionPerformed
        this.nc = 10;// on établie le niveau de la partie à 10 personnages soit 20 cartes
    }//GEN-LAST:event_DébutantActionPerformed

    private void AvancéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvancéActionPerformed
        this.nc = 18; // on établie le niveau de la partie à 18 personnages soit 36 cartes
    }//GEN-LAST:event_AvancéActionPerformed

    private void ExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpertActionPerformed
        this.nc = 32; // on établie le niveau de la partie à 32 personnages soit 64 cartes
    }//GEN-LAST:event_ExpertActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // Au clic sur le bouton Valider, on vérifie les joueurs qui ont été séléctionner et ajouter à la liste de Joueur 
        this.ok = true;
        if(CLara.isSelected()){
            Joueur j = new Joueur("Lara", "epiques");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/lara.jpg")));
            this.lj.ajouteJoueur(j);//ajout du joueur dans les joueurs
        }
        if(CJack.isSelected()){
            Joueur j = new Joueur("Jack", "rares");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/jack.png")));
            this.lj.ajouteJoueur(j);//ajout du joueur dans les joueurs
        }
        if(CJS.isSelected()){
            Joueur j = new Joueur("Jean-Sébastien", "alpins-femmes");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/bach.jpg")));
            this.lj.ajouteJoueur(j);//ajout du joueur dans les joueurs
        }
        if(CAma.isSelected()){
            Joueur j = new Joueur("Amadeus", "communs");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/mozart.jpg")));
            this.lj.ajouteJoueur(j);//ajout du joueur dans les joueurs
        }
        //this.ok = true; //car nous avaons appuyé sur Valider
        this.setVisible(false); //ferme la fenêtre
        this.dispose();//pour mieux libérer l'espace mémoire
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // Au clic sur le bouton Annuler, on ferme la fenêtre
        this.ok = false;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                InitDlg dialog = new InitDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e){
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JRadioButton Avancé;
    private javax.swing.JButton BPhoto;
    private javax.swing.JCheckBox CAma;
    private javax.swing.JCheckBox CJS;
    private javax.swing.JCheckBox CJack;
    private javax.swing.JCheckBox CLara;
    private javax.swing.JRadioButton Débutant;
    private javax.swing.JTextArea Edition;
    private javax.swing.JRadioButton Enfant;
    private javax.swing.JRadioButton Expert;
    private javax.swing.JLabel LJoueur;
    private javax.swing.JLabel LTaille;
    private javax.swing.JButton Valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}