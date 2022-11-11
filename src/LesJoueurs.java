
import java.util.ArrayList;

/**
 *
 * @author tm325716
*/

public class LesJoueurs{

    private ArrayList<Joueur> lstJ; //Attribut de type ArrayList<Joueur> qui correspond à une collection de joueur
     
    public LesJoueurs(){
        //Le Constructeur par d�faut qui initialise l'attribut lstJ
        this.lstJ = new ArrayList<Joueur>();
    }
    
    public Joueur getJoueur(int i){
        // Méthode qui renvoie un Joueur selon son indice i dans la collection de joueur 
        if(i>=0 && i<this.lstJ.size())
            return this.lstJ.get(i);
        else 
            return null;
    }
    
    public int getIndiceJoueur(Joueur j){
        // Méthode qui nous renvoie l'indice d'un joueur passé en paramètre
        return this.lstJ.indexOf(j);
    }
    
    public int getNbJoueurs(){
        // Méthode qui renvoie le nombre total de joueur dans la liste
        return this.lstJ.size();
    }
    
    public void ajouteJoueur(Joueur j){
        // Méthode qui ajoute en queue de liste un joueur j donné en paramètre
        this.lstJ.add(j);
    }
    
    public void ajouteJoueurs(LesJoueurs lj){
        // Méthode qui permet d'ajouter une collection de joueur donné en paramètre à la liste courante
        for(int i=0; i < this.getNbJoueurs(); i++){
            this.lstJ.add(getJoueur(i));
        }
    }
    
    public Joueur rechJoueur(String p){
        // Méthode qui recherche un joueur selon un pseudo donné en paramètre et renvoie le joueur si il est trouvé ou la valeur null sinon
        int i=0;
        while(i < getNbJoueurs()){
            if(getJoueur(i).getPseudo().equals(p)){
                return getJoueur(i);
            }
            else i++;
        }
        return null;
    }
    
    public void supprimeJoueur(Joueur j){
        // Méthode qui permet de suppimer un joueur passé en paramètre
        int i=0; 
        boolean trouve = false;
        while(i<getNbJoueurs() && !trouve){
            if(this.getJoueur(i).getPseudo().equals(j.getPseudo())){
                this.lstJ.remove(i);  
                trouve = true;
            }
            else i++;
        } 
    }
    
    public String toString(){
        // Méthode qui renvoie sous forme textuelle les joueurs de la liste en utilisant la méthode toString de la classs Joueur
        String s = "";
        for(int i=0; i<getNbJoueurs(); i++)
            s+=i+"- "+getJoueur(i).toString();
        return s;
    }
    
    public LesJoueurs getGagnants(){
        // Méthode qui renvoie sous forme d'une liste de Joueur le gagnant ou les gagnants en cas de match nul
        int max = getJoueur(0).getScore();
        for(int i=1; i < getNbJoueurs(); i++){
            if(getJoueur(i).getScore() > max)
                max = this.getJoueur(i).getScore();
        }
        LesJoueurs lst = new LesJoueurs();
        for(int i=0; i<getNbJoueurs();i++){
            if(getJoueur(i).getScore()==max)
                lst.ajouteJoueur(getJoueur(i));
        }
        return lst;
    }
}
