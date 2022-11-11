
/**
 *
 * @author Thomas
 */

public abstract class Action{
    
    private Joueur j; // joueur à l'origine de l'action
    private String descriptif; // nature de l'action
    private String deroulement; // description de ce qui s’est passé durant l’action
    
    public abstract int execute(); //méthode abstraite de la class qui sera définie dans les sous class de Action
    
    public Action(Joueur sc, String s){
        //Constructeur de la class Action 
        this.j=sc;
        this.descriptif=s;
        this.deroulement="";
    }
    
    public void setJ(Joueur j){
        //Acceseur en écriture du Joueur
        this.j = j;
    }
    
    public Joueur getJ(){
        //Acceseur en lecture du Joueur
        return this.j;
    }
    
    public void setDescriptif(String descriptif){
        //Acceseur en écriture du descriptif de l'action
        this.descriptif = descriptif;
    }
    
    public String getDescriptif(){
       //Acceseur en lecture du descriptif de l'action
        return this.descriptif;
    }
    
    public void setDeroulement(String deroulement){
        //Acceseur en écriture du déroulement de l'action
        this.deroulement = deroulement;
    }
    
    public String getDeroulement(){
        //Acceseur en lecture du descriptif de l'action
        return this.deroulement;
    }
    
    public String toString(){
        //méthode toString pour récuperer les informations de l'objet sous forme textuelle
        return "Action effectuée par "+j.getPseudo()+ " : " +descriptif+"\n"+this.deroulement+"\n";
    }
    
}