/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.mtp.b3.benatiapunzano.tp1.chifoumi;

import javax.swing.JOptionPane;

/**
 *
 * @author Sofian
 */
public class Joueur {
    private String nom;
    private int score = 0;
    private IHMSaisie saisie;
    
    public Joueur(String nom){
        setNom(nom);
        saisie = new IHMSaisie(nom);
    }
    
    public void crediter() {
        score += 1;
    }
    
    public Choix Choisir() {
        return saisie.proposerChoix();
    }
    
    public void Ecrirescore() {
        JOptionPane.showMessageDialog(null, "Le score de "+getNom()+" est " + getScore());      
    }
    
    
    public String getNom() {
        return nom;
    }
    
    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }
   
}
