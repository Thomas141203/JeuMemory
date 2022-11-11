
/**
 *
 * @author tm325716
 */

import java.util.ArrayList;

public class LesPersonnages{
    
    private ArrayList<Personnage> persos; //Attribut de type ArrayList<Personnage> qui correspond � une collection de personnage

    public ArrayList<Personnage> getPersos(){
        // M�thode qui renvoie la liste des personnages 
        return persos;
    }
    
    public LesPersonnages() {
        // Constructeur qui initialise l'attribut persos
        this.persos = new ArrayList<Personnage>();
    }
         
    public int getTaille(){ 
        // M�thode qui renvoie le nombre de personnage de la liste
        return this.persos.size(); 
    }
     
    public int getScore(){ 
        // M�thode qui renvoie le score total de tous les personnages de la liste 
        int sc = 0;
        for(int i=0; i<getTaille(); i++)
           sc += this.getPerso(i).getValeur();
        return sc;
    }
          
    public Personnage getPerso(int i){
        // M�thode qui renvoie un personnage par rapport � un indice donn� en param�tre
        if(i>=0 && i<this.persos.size())
            return this.persos.get(i);
        else 
            return null;
    }
    
    public LesPersonnages getPersosFamilles(String f){
        // M�thode qui renvoie une liste de personnage par rapport � une nom de famille donn� en param�tre sans doublons
        LesPersonnages lp = new LesPersonnages();
        for(int i=0; i<getTaille(); i++)
            if(this.getPerso(i).getFamille().equals(f))
                lp.ajoutePerso(getPerso(i));
        return lp;
    }
    
    public ArrayList<String> getFamilles(){
        // M�thode qui retourne sous forme d'une liste de chaine de caract�res toute les familles du jeu sans doublons
        ArrayList<String> lst = new ArrayList<String>();
        for(int j=0; j<this.persos.size(); j++){
            Personnage p = this.persos.get(j);
            boolean trouve = false;
            for(int i=0; i<lst.size(); i++){
                if(lst.get(i).equals(p.getFamille()))
                    trouve = true;
            }
            if(!trouve)
                lst.add(p.getFamille());
        }
        return lst;
    }
    
    public void ajoutePerso(Personnage p){
        // M�thode qui permet l'ajout d'un personnage pass� en param�tre dans la liste courante
        this.persos.add(p);
    }
    
    public void ajouterPersos(LesPersonnages lp){
        // M�thode qui permet l'ajout d'une collection de personnages pass� en param�tre dans la liste courante
        for(int i=0; i < lp.getTaille(); i++){
            this.persos.add(getPerso(i));
        }
    }
    
    public void retirePersos(){
        // M�thode qui permet de retirer tous les personnages de la liste courante
        this.persos.clear();
    }
    
    public void retirePerso(Personnage p){ 
        // M�thode qui permet de retirer un personnage pass� en param�tre de la liste courante
        int i=0; 
        boolean trouve = false;
        while(i<getTaille() && !trouve){
            if (this.getPerso(i).getNom().equals(p.getNom())){
                this.persos.remove(i);  
                trouve = true;
            }
            else i++;
        }      
    }
    
    public LesPersonnages retirePersos(int n){ 
        // M�thode qui renvoie une liste correspondant � la liste courante et supprime tout les personnages de la liste courante
        LesPersonnages lcr = new LesPersonnages();
        for (int i=0; i<=n; i++){
            lcr.ajoutePerso(getPerso(0));
            this.persos.remove(0);  
        }
        return lcr;
    } 
    
    public LesPersonnages retirePersosFamille(String f){ 
        // M�thode qui retourne tous les personnages d'une famille pass�e en param�tre et vide la liste courante persos 
        LesPersonnages lcr = new LesPersonnages();
        int i = 0;
        while(i<getTaille()){
            if (getPerso(i).getFamille().equals(f)){
                lcr.ajoutePerso(getPerso(i));
                this.persos.remove(i);  
            }
            else i++;
        }
        return lcr;
    }
    
    @Override
    public String toString(){
        // M�thode qui permet de renvoyer sous forme textuelle tous les personnages de la liste courante en utilisant la m�thode toString de la class Personnage 
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i).toString();
        return s;
    }
	
    public LesPersonnages(int nc){
        // Constructeur qui initialise l'attribut persos et qui selon un param�tre nc ajoute un taux de personnage proportionnel au niveau de difficult� choisi
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage("communs", "assault-trooper", 10));
            ajoutePerso(new Personnage("communs", "commando", 20));
            ajoutePerso(new Personnage("rares", "absolute-zero", 10));
            ajoutePerso(new Personnage("rares", "arctice-assassin", 20));
        }
        if (nc >= 10){ // 3 familles
            ajoutePerso(new Personnage("�piques", "brunout", 10));
            ajoutePerso(new Personnage("�piques", "funk-ops", 20));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-can", 20));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace", 10));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 4 familles
            ajoutePerso(new Personnage("communs", "devestrator", 30));
            ajoutePerso(new Personnage("communs", "dominator", 40));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-chn", 30));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-fra", 40));
            ajoutePerso(new Personnage("rares", "brilliant-striker", 40));
            ajoutePerso(new Personnage("rares", "brite-bomber", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-chn", 30));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-fra", 40));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage("communs", "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage("communs", "jungle-scout", 60));
            ajoutePerso(new Personnage("communs", "pathfinder", 70));
            ajoutePerso(new Personnage("rares", "brawler", 30));
            ajoutePerso(new Personnage("rares", "circuit-breaker", 60));
            ajoutePerso(new Personnage("rares", "dazzle", 70));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-gbr", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage("legendaires", "red-knight", 40));
            ajoutePerso(new Personnage("legendaires", "power-chord", 10));
            ajoutePerso(new Personnage("legendaires", "raptor", 20));
            ajoutePerso(new Personnage("legendaires", "raven", 30));
            ajoutePerso(new Personnage("epiques", "shadow-ops", 40));
            ajoutePerso(new Personnage("epiques", "rex", 30));

        }
    }
}
