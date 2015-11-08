/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.mtp.b3.benatiapunzano.tp1.chifoumi;


/**
 *
 * @author Sofian
 */
public class JeuUnTour {
    private Joueur PlayerA;
    private Joueur PlayerB;
    
    public JeuUnTour(String A, String B){
        PlayerA = new Joueur(A);
        PlayerB = new Joueur(B);
    }
    
    public void Jouer(){
        Tour();
        PlayerA.Ecrirescore();
        PlayerB.Ecrirescore();
        
    }
    
    public void Tour(){
        Choix ChoixA = PlayerA.Choisir();
        Choix ChoixB = PlayerB.Choisir();
        
       if(ChoixA == Choix.PAPIER){
            if(ChoixB == Choix.PAPIER){
        System.out.println("Egalité");
            }if(ChoixB == Choix.CAILLOU){
                PlayerA.crediter();
            }if(ChoixB == Choix.CISEAUX){
                PlayerB.crediter();
            }   
       }
       if(ChoixA == Choix.CISEAUX){
            if(ChoixB == Choix.PAPIER){
             PlayerA.crediter();
            }if(ChoixB == Choix.CAILLOU){
             PlayerB.crediter();
            }if(ChoixB == Choix.CISEAUX){
                System.out.println("Egalité");
            } 
       }
       if(ChoixA == Choix.CAILLOU){
            if(ChoixB == Choix.PAPIER){
            PlayerB.crediter();
            }if(ChoixB == Choix.CAILLOU){
               System.out.println("Egalité");
            }if(ChoixB == Choix.CISEAUX){
            PlayerA.crediter();
            } 
       }
                
    }
    public void conclure(){
        if( PlayerA.getScore() > PlayerB.getScore()){
            System.out.println("Winner is "+PlayerA.getNom());
        }else{
            System.out.println("Winner is "+PlayerB.getNom());
        }
    }
}
