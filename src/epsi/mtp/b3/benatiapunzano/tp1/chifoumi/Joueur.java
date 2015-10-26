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
public class Joueur {
    private String nom;
    private int score = 0;
    private IHMSaisie saisie;
    
    public Joueur(String n){
        nom=n;
        saisie=new IHMSaisie(nom);
    }
    
    public void crediter() {
        score=getScore()+1;
    }
    
    public Choix Choisir() {
        return saisie.proposerChoix();
    }
    
    public void Ecrirescore() {
        System.out.println("");
              
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }
   
}
