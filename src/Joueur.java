
import javax.swing.*;

/**
 *
 * @author lm437761
 */

public class Joueur{
    private String pseudo; // Attribut de type String qui permet de récupérer le pseudo d'un joueur
    private String famillePrefere; // Attribut de type String qui permet de savoir la famille préférée que le joueur choisira
    private LesPersonnages paquet; // Attribut de type LesPersonnages qui permet d'avoir la collection des personnages du joueur courant
    private ImageIcon photo; // Attribut de type ImageIcon qui permet de mettre une photo associé au joueur si il le souhaite

    // Méthode qui recupère le pseudo
    public String getPseudo(){
        return this.pseudo;
    }

    // Méthode qui recupère sa famille préférée
    public String getFamillePrefere() {
        return this.famillePrefere;
    }
    
    //Méthode qui recupère le paquet de personnages
    public LesPersonnages getPaquet(){
        return this.paquet;
    }
    
    //Méthode qui recupère la photo
    public ImageIcon getPhoto(){
        return this.photo;
    }

    //Méthode qui remplace le pseudo
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    // Méthode qui remplace la famille préférée
    public void setFamillePrefere(String famille) {
        this.famillePrefere = famille;
    }
    
    //Méthode qui remplace le paquet de personnage
    public void setPaquet(LesPersonnages paquet){
        this.paquet = paquet;
    }
    
    //Méthode qui remplace la photo
    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    
    //Constructeur par défaut, initialise les 4 attributs
    public Joueur(){
        setPseudo("Joueur");
        setFamillePrefere("");
        setPaquet(new LesPersonnages());
        setPhoto(new ImageIcon(getClass().getResource("/img/joueurDefaut.png")));
    }
    
    //Constructeur avec comme paramètre le pseudo et la famille préférée du joueur
    public Joueur(String pseudo, String familleprefere){
        this.pseudo = pseudo;
        this.famillePrefere = familleprefere;
        setPaquet(new LesPersonnages());
        setPhoto(new ImageIcon(getClass().getResource("/img/joueurDefaut.png")));
    }
    
    //Méthode toString, pour définir l'objet joueur de manière textuelle
    public String toString(){
        return "Joueur" + this.pseudo + "\n"
                + "famille préférée : " + this.famillePrefere +"\n"
                + "en possession des personnages : " + this.paquet + "\n"
                + "score : " + this.getScore();
    }
    
    //Méthode qui récupere le score du joueur courant en sommant la valeur de chaque carte qu'il possède
    public int getScore(){
        int nb = 0;
        
        for(int i=0; i< this.paquet.getPersos().size(); i++){
            nb += this.paquet.getScore();
        }
        
        return nb;
    }
    
    //Méthode qui ajoute un personnage passé en paramètre dans la collection du joueur courant
    public void ajoutePersoPaquet(Personnage p){
        this.paquet.ajoutePerso(p);
    }
    
    public void initPaquetTest(){
        ajoutePersoPaquet(new Personnage("communs", "assault-trooper", 10));
        ajoutePersoPaquet(new Personnage("communs", "commando", 20));
        ajoutePersoPaquet(new Personnage("rares", "absolute-zero", 10));
    }
}
