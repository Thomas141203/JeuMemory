
/**
 *
 * @author Thomas
 */

public class Jeu{
    
    private LesPersonnages lesPers; // liste des cartes actuelles du jeu
    private PlateauJeu monP; // la plateau de jeu où se déroule me mémory
    private LesJoueurs lesJ; // liste des joueurs courant
    private int indC; //l'indice du joueur courant, celui qui est entrain de jouer
    private Action act; // l'action actuelle éffectuer par le joueur courant
    
    public Jeu(LesPersonnages lp, LesJoueurs lj, int nbc){
        // Constructeur de la class Jeu qui initialise les attributs
        this.lesPers = lp;
        this.monP = new PlateauJeu(nbc);
        this.lesJ = lj;
        this.indC = 0;
        this.act = null;
    }
    
    public void setIndC(int indC){
        // accesseur en écriture de l'indice courant
        this.indC = indC;
    }
    
    public int getIndC(){
        //retourne l'indice courant
        return indC;
    }
    
    public LesPersonnages getLesPers(){
        // retourne LesPersonnages
        return lesPers;
    }
    
    public PlateauJeu getMonP(){
        // retourne le Plateau de Jeu
        return monP;
    }
    
    public LesJoueurs getLesJ(){
        //retourne LesJoueurs
        return lesJ;
    }
    
    public Action getAct(){
        //retourne l'Action
        return act;
    }
    
    public int getIndSuivant(int j){
        //retourne l'indice du joueur suivant (si l'indice donné en paramètre est celui du dernier joueur, on retournera l'indice du premier joueur)
        return (j+1)%lesJ.getNbJoueurs();
    }
    
    public Joueur getJoueurCourant(){
        //retourne le joueur courant
        return lesJ.getJoueur(indC);
    }
    
    public Joueur getJoueurSuivant(int j){
        //retourne le joueur suivant au joueur ayant l'indice passé en paramètre
        return lesJ.getJoueur(getIndSuivant(j));
    }
    
    public boolean finJeu(){
        // méthode qui vérifie si le jeu est terminer
        return monP.jeuVide();
    }
    
    public int nbPers(){
        // méthode donnant le nombre de cartes totale de tout les joueurs
        int n = 0;
        for(int i=0; i<lesJ.getNbJoueurs(); i++)
            if (i != this.indC) 
                n+=lesJ.getJoueur(i).getNbCartes();
        return n;
    }
    
    public int traiterTour(Joueur jo, int s){ //paramètres, le joueur courant qui joue et l'indice du personnage qui a été gagné
        // méthode qui permet de traiter un tour de jeu lorsque le joueur courant a retourné deux cartes identiques
        // On y attribut aussi une valeur de bonus qui vaut : 
        // 0, si le joeur vient de gagner la partie, si le joueur a tous les perosnnages de sa famille préférée
        // 1, si un transfert de carte peut être réaliser
        // 2, si une bataille doit être faite
        // -1, dans les autres cas
        int bonus = -1;
        Personnage pers = lesPers.getPerso(s);
        jo.getPaquet().ajoutePerso(pers);
        String f = pers.getFamille();
        int npf = lesPers.getPersosFamilles(f).getTaille();
        int npj = jo.getPaquet().getPersosFamilles(f).getTaille();
        if(npf == npj){
            if(f.equals(jo.getFamillePrefere())){
                bonus = 0;
                monP.termineJeu();
            }
            else
                if(this.lesJ.lesAutresJoueursOntDesCartes(lesJ)){
                    if((f.equals("rares")) || (f.equals("communs")))
                        bonus = 1;
                    else{
                        if((f.equals("legendaires")) || (f.equals("epiques")))
                            bonus = 2;
                    }
                }
        }
        return bonus;
    }
}