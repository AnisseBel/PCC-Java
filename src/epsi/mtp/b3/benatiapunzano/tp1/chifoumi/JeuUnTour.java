/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.mtp.b3.benatiapunzano.tp1.chifoumi;

import javax.swing.JOptionPane;
import epsi.mtp.b3.benatiapunzano.tp1.*;

/**
 *
 * @author Sofian
 */
public class JeuUnTour {
    private Joueur PlayerA;
    private Joueur PlayerB;
    private int score;
    
    public JeuUnTour(String A, String B, int score){
        PlayerA = new Joueur(A);
        PlayerB = new Joueur(B);
        this.score = score;
    }
    
    public int Jouer(){
        boolean fini = false;
        while(!fini){
        
        Tour();
        JOptionPane.showMessageDialog(null, "Score :\n"+PlayerA.getNom()+" : "+PlayerA.getScore()+"\n"+PlayerB.getNom()+" : "+PlayerB.getScore(), "Résultat", JOptionPane.INFORMATION_MESSAGE, null);
        //PlayerA.Ecrirescore();
        //PlayerB.Ecrirescore();
        if(PlayerA.getScore() == score || PlayerB.getScore() == score ){
            fini = true;  
            }
        }
        int rejouer = conclure();
        return rejouer;
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
    public int conclure(){
        Object[] btn={"Rejouer","Quitter"};
        int rejouer = 3;
        if( PlayerA.getScore() > PlayerB.getScore()){
        rejouer = JOptionPane.showOptionDialog(null, "Le vainqueur est "+PlayerA.getNom(), "CHI-FOU-MI", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);    
        //System.out.println("Le vainqueur est "+PlayerA.getNom());
        }else{
       rejouer = JOptionPane.showOptionDialog(null, "Le vainqueur est "+PlayerB.getNom(), "CHI-FOU-MI", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,btn,btn[0]);    
        //System.out.println("Le vainqueur est "+PlayerB.getNom());
        }
        return rejouer;
    }
}
