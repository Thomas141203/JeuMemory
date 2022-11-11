
/**
 *
 * @author Thomas
 */

public class Bataille extends Action{
    
    private Joueur adversaire; // attribut de type Joueur désignant l'adversaire de la bataille
    
    public Bataille(Joueur sc, Joueur a){
        // Constructeur de la class Bataille, on fait appel au constructeur de la class hériter et on initialise l'attribut
        super(sc, "Bataille");
        this.adversaire = a;
    }
    
    public Joueur getAdversaire(){
        // Accesseur en lecture de l'attribut adversaire
        return adversaire;
    }
    
    public int execute(){
        // Méthode execute qui permet l'execution d'une bataille entre le joueur courant qui a declenché la bataille et l'adversaire désigner
        // On réalise la comparaison des deux premières cartes respectives du paquet des deux joueurs
        // On renvoie 1 si le joueur courant gagne, 2 si l'adversaire gagne, la valeur 0 en cas d'égalité et -1 si la bataille ne peut pas être réaliser
        int res = -1;
        if(adversaire.getPaquet().getTaille()>0 && this.getJ().getPaquet().getTaille()>0){
            // On vérifie que les deux joueures on des cartes
            res = -1;
            Personnage c1 = this.getJ().getPaquet().getPerso(0);
            Personnage c2 = adversaire.getPaquet().getPerso(0);
            this.getJ().getPaquet().retirePersos(0);
            adversaire.getPaquet().retirePersos(0);
            if(c1.getValeur()==c2.getValeur()){
                // On vérifie si les cartes tirer des joueurs sont égales
                res = 0;
                this.getJ().getPaquet().ajoutePerso(c1);
                adversaire.getPaquet().ajoutePerso(c2);
            }
            else{
                if(c1.getValeur()>c2.getValeur()){
                    // On vérifie si le joueur courant à une carte avec une plus grande valeur
                    res = 1;
                    this.getJ().getPaquet().ajoutePerso(c1);
                    this.getJ().getPaquet().ajoutePerso(c2);
                }
                else{ // sinon c'est l'adversaire qui à une carte plus grande
                    res = 2;
                    adversaire.getPaquet().ajoutePerso(c2);
                    adversaire.getPaquet().ajoutePerso(c1);
                }
            }
        }
        if(adversaire.getPaquet().getTaille() == 0 || this.getJ().getPaquet().getTaille() == 0){
            // On vérifie si les deux joueurs on tout les deux 0 cartes
            // Puis on donne le déroulement de la Bataille
            String s = "";
            if(res == 1)
                s = this.getJ().getPseudo();
            if(res == 2)
                s = adversaire.getPseudo();
            this.setDeroulement("Le joueur"+this.getJ().getPseudo()+"à joué contre"+adversaire.getPseudo()+". Le gagnant est : "+s+".");
        }
        return res;
    }
    
}