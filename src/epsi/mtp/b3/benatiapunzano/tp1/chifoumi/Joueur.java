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
        score=score+1;
    }
}
