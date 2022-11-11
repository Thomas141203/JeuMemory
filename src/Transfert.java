
/**
 *
 * @author Thomas
 */

public class Transfert extends Action{
    
    private Joueur cible; // joueur à qui les cartes vont être prises
    private String fp; // famille de la carte sélectionnée
    private LesPersonnages cartesTransferees; // cartes transférées
    
    public Joueur getJoueurCible(){
        // accesseur en lecture de joueur cible
        return this.cible;
    }
    
    public LesPersonnages getCartesTransferees(){
        // accesseurs en lecture des cartes transferees
        return cartesTransferees;
    }
    
    public Transfert(Joueur sc, Joueur c, String f){
        // Constructeur de la class Transfert
        super(sc, "Transfert de cartes"); // apple au constructeur de la class Action
        // initialisation des attributs
        this.cible = c;
        this.fp = f;
        this.cartesTransferees = new LesPersonnages();
    }
    
    public int execute(){
        // méthode execute qui permet l'execution d'un Transfert de cartes
        // renvoie le nombre de cartes qui ont été transférées
        int res = 0;
        if(fp != null){ 
            // on récupère et retires les cartes de la personne cibler et on les ajoutes au paquet du personnage 
            LesPersonnages cartestransferees = cible.getPaquet().retirePersosFamille(fp);
            this.getJ().getPaquet().ajoutePersos(cartestransferees);
            this.cartesTransferees = cartestransferees;
            //this.cartesTransferees.ajoutePersos(cartestransferees);
            this.setDeroulement("Le joueur "+this.getJ().getPseudo()+" a pris les cartes de la famille "+fp+" au joueur "+cible.getPseudo()+".");
            res = cartestransferees.getTaille();
        }
        return res;
    }
}