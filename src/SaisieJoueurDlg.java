import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author tm325716
 */

public class SaisieJoueurDlg extends javax.swing.JDialog{

    private Joueur joueur; // Attribut de type Joueur permettant de récupérer les informations du joueur en cour de création
    private LesPersonnages persos; // Attribut de type LesPersonnages 
    private boolean modeFermeture; // Attribut de type boolean nous renseignant sur le mode de fermeture de la JDialogue (true si il clic sur valider false sinon)
    private ImageIcon photo; // Attribut de type ImageIcon pour récupérer la photo choisi par le joueur et lui associe
    
    public SaisieJoueurDlg(java.awt.Frame parent, boolean modal, LesPersonnages lp){
        // Constructeur qui initialise les attributs, créer la fenêtre graphique avec la méthode initComponents, initialise la JList
        // et l'appel au constructeur de la superclass en lui donnant comme paramètre le fenêtre qui gère la boite et un mode d'ouverture bloquant
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        initListeFamilles();
        this.joueur = null;
        this.persos = lp;
        this.modeFermeture = false;
        this.photo = null;
    }

    public Joueur getJoueur(){
        // Méthode qui renvoie l'attribut joueur
        return this.joueur;
    }

    public boolean getModeFermeture(){
        // Méthode qui renvoie le mode de fermeture de la boite
        return this.modeFermeture;
    }
    
    public void initListeFamilles(){
        // Méthode permettant d'initialiser le JList avec le nom des familles de personnages
        // on y créer un modèle par défault pour pouvoir ajouter par la suite des éléments dans la JList
        DefaultListModel mod = new DefaultListModel();
        ListeFamilles.setModel(mod);
        mod.addElement("communs");
        mod.addElement("rares");
        mod.addElement("épiques");
        mod.addElement("alpins-femmes");
        mod.addElement("as des pistes");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pseudo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeFamilles = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        Parcourir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Photo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setText("Créez votre joueur");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel3.setLayout(new java.awt.GridLayout(6, 1));

        jLabel2.setText("Donnez votre pseudo");
        jLabel2.setMaximumSize(new java.awt.Dimension(137, 10));
        jLabel2.setMinimumSize(new java.awt.Dimension(137, 10));
        jLabel2.setPreferredSize(new java.awt.Dimension(137, 10));
        jPanel3.add(jLabel2);

        Pseudo.setColumns(20);
        Pseudo.setRows(5);
        jScrollPane1.setViewportView(Pseudo);

        jPanel3.add(jScrollPane1);

        jLabel3.setText("Quelle est votre famille préférée de perso");
        jLabel3.setPreferredSize(new java.awt.Dimension(272, 10));
        jPanel3.add(jLabel3);

        jScrollPane2.setViewportView(ListeFamilles);

        jPanel3.add(jScrollPane2);

        jLabel4.setText("Choisissez une photo ");
        jPanel3.add(jLabel4);

        Parcourir.setText("Parcourrir");
        Parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcourirActionPerformed(evt);
            }
        });
        jPanel3.add(Parcourir);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(Photo, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel5.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel5.add(Valider);

        jPanel4.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcourirActionPerformed
        // Méthode qui permet à l'utilisateur de parcourir les fichiers de son ordinateur pour choisir une image et l'attribuer à la photo du joueur 
        JFileChooser jf= new JFileChooser();
        if(jf.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            String path = jf.getSelectedFile().getPath();
            Image img=Toolkit.getDefaultToolkit().getImage(path);
            img = img.getScaledInstance(Photo.getWidth()-10, Photo.getHeight()-10, Image.SCALE_DEFAULT);
            photo = new ImageIcon(img);
            Photo.setIcon(photo);
        }
    }//GEN-LAST:event_ParcourirActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // Méthode qui vérifie que le joueur à choisi au moins un pseudo et une famille préférée pour instancier ce nouveau joueur
        int ind = ListeFamilles.getSelectedIndex();
        String a = ListeFamilles.getSelectedValue();
        if(Pseudo != null && ind != -1){
            Joueur newJoueur = new Joueur(Pseudo.getText(), a);
            this.modeFermeture = true;
            if(this.photo == null){
                
            }
            else
                this.joueur.setPhoto(this.photo);
                this.setVisible(false);
                this.dispose();
        }
        else if(Pseudo == null)
            Pseudo.setText("Erreur, pas de pseudo seléctionné");
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // Méthode qui au clic sur la bouton annuler change le mode de fermeture et ferme la fenêtre 
        this.modeFermeture = false;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaisieJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaisieJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaisieJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaisieJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SaisieJoueurDlg dialog = new SaisieJoueurDlg(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton Annuler;
    private javax.swing.JList<String> ListeFamilles;
    private javax.swing.JButton Parcourir;
    private javax.swing.JButton Photo;
    private javax.swing.JTextArea Pseudo;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
