
import java.awt.event.ActionEvent;
import javax.swing.*;


/**
 *
 * @author tm325716
 * 
**/

public class TransfertDlg extends javax.swing.JDialog {

    private LesJoueurs lj; //collection des joueurs, pour initialiser la liste déroulante avec les pseudos des joueurs
    private int indj; //indice joueur courant
    //private Transfert tc; // cette classe sera étudiée ultérieurement –laisser l’attribut en commentaire
    private boolean ok; // indicateur pour savoir le transfert a bien été effectué.
    private int indjs; //indice du joueur sélectionnédans la liste déroulante
    private String fs; //famille du personnage sélectionné en cliquant sur un des personnages du joueur sélectionné
    
    public TransfertDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj, int indj){
        // Constructeur de la class TransfertDlg qui fait appel au constructeur de la superclas, JDialog, avec un paramètre qui gère la boite et un mode d'ouverture bloquant
        // On initialise aussi les attributs, ainsi que la fenêtre avec la méthode initComponents
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        this.lj = lj;
        this.indj = indj;
        // this.tc=null;
        this.ok = false;
        this.fs = null;
        initCombo(); // méthode pour remplir la liste déroulante
        indjs = 0;
        Message.setText("Le joueur "+lj.getJoueur(indj).getPseudo()+" a obtenu une famille complète"); // On met un text au JLabel Message 
        Infos.setText("Personnages de "+lj.getJoueur(indj).getPseudo()+" : \n"+lj.getJoueur(indj).getPaquet()); // On rempli le JTextArea avec le pseudo du personnage et le paquet du joueur 
    }
    
    public boolean getOk(){
        // Getter pour récupérer l'attribut ok
        return this.ok;
    }
    
    /*
    public Transfert getTransfert(){
        // Getter pour récupérer l'attribut tc
        return this.tc;
    }
    */
    
    public void initCombo(){
        // Méthode qui permet d'initialiser la JComboBox en y mettant tout les pseudos des joueurs 
        for(int i=0; i<this.lj.getNbJoueurs(); i++){
            ComboJoueurs.addItem(this.lj.getJoueur(i).getPseudo());
        }
    }
    
    public void initPanneau(){
        // Méthode qui initialise le Panneau de gauche en le remplissant dynamiquement avec des boutons
        PanneauG.removeAll();
        this.repaint();
        LesPersonnages lcs = lj.getJoueur(indj).getPaquet();
        int t = lcs.getTaille();
        int n = 1+(t-1)/4;
        PanneauG.setLayout(new java.awt.GridLayout(4, n));
        for(int i=0; i<t; i++){
            JButton bt = new JButton();
            bt.setName(lcs.getPerso(i).getFamille());
            bt.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    boutonActionPerformed(evt);
                }
            });
        
        }
        this.pack();
    }
    
    public void affichePanneau(){
        // Cette méthode permet d'affciher visuellement tout les boutons du Panneau gauche 
        LesPersonnages pjc = lj.getJoueur(indj).getPaquet();
        for(int i=0; i<pjc.getTaille(); i++){
            JButton bt = (JButton)PanneauG.getComponent(i);
            bt.setIcon(new ImageIcon(pjc.getPerso(i).getPhoto()));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauG = new javax.swing.JPanel();
        PanneauM = new javax.swing.JPanel();
        PanneauMidHaut = new javax.swing.JPanel();
        Message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboJoueurs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Infos = new javax.swing.JTextArea();
        PanneauMidBas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanneauD = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 3));

        PanneauG.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(PanneauG);

        PanneauM.setLayout(new java.awt.BorderLayout());

        PanneauMidHaut.setLayout(new java.awt.GridLayout(5, 1));

        Message.setText("jLabel1");
        PanneauMidHaut.add(Message);

        jLabel2.setText("jLabel2");
        PanneauMidHaut.add(jLabel2);

        jLabel3.setText("jLabel2");
        PanneauMidHaut.add(jLabel3);

        ComboJoueurs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboJoueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboJoueursActionPerformed(evt);
            }
        });
        PanneauMidHaut.add(ComboJoueurs);

        Infos.setColumns(20);
        Infos.setRows(5);
        jScrollPane1.setViewportView(Infos);

        PanneauMidHaut.add(jScrollPane1);

        PanneauM.add(PanneauMidHaut, java.awt.BorderLayout.CENTER);

        jButton1.setText("Transfert");
        PanneauMidBas.add(jButton1);

        jButton2.setText("Fermer");
        PanneauMidBas.add(jButton2);

        PanneauM.add(PanneauMidBas, java.awt.BorderLayout.SOUTH);

        getContentPane().add(PanneauM);

        PanneauD.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(PanneauD);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboJoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboJoueursActionPerformed
        // Méthode qui au clic sur un élément de la JComboBox va soit effacer le Panneau de gauche si le joueur choisie est le même, 
        // sinon affciher les infos du joueur séléctionner dans la JComboBox
        this.indjs = ComboJoueurs.getSelectedIndex();
        if(this.indjs != -1){
            if(this.indjs == this.indj){
                Infos.setText("Sélectionnez un joueur différent du joueur courant !");
                PanneauG.removeAll();
                PanneauG.repaint();
            }
            else{
                Infos.setText("\nJoueur sélectionné: "+lj.getJoueur(indjs).toString());
                initPanneau();
                affichePanneau();
            }
        }
    }//GEN-LAST:event_ComboJoueursActionPerformed

    private void boutonActionPerformed(ActionEvent evt){
        // Méthode qui au clic sur un des boutons génerer dynamiquement va être entourer d'une bordure 
        LesPersonnages lp = lj.getJoueur(indjs).getPaquet();
        int t = lp.getTaille();
        JButton bt=(JButton) evt.getSource();
        fs = bt.getName();// la proprité Name, contient ici le nom du personnage affiché sur le bouton
        for(int i = 0; i < t; i++){
            JButton b = (JButton)(PanneauG.getComponent(i));
            if (b.getName().equals(fs))
                b.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(255, 0, 0)));
            else
                b.setBorder(null);
        }
        LesPersonnages lps = lp.getPersosFamilles(fs);
        Infos.setText("Vous pouvez récupérer "+lps.getTaille()+" personnages : \n"+lps); // affiche le nombre que  le joueur peux récuperer
    }
    
    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                TransfertDlg dialog = new TransfertDlg(new javax.swing.JFrame(), true, null, 4);
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
    private javax.swing.JComboBox<String> ComboJoueurs;
    private javax.swing.JTextArea Infos;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel PanneauD;
    private javax.swing.JPanel PanneauG;
    private javax.swing.JPanel PanneauM;
    private javax.swing.JPanel PanneauMidBas;
    private javax.swing.JPanel PanneauMidHaut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
