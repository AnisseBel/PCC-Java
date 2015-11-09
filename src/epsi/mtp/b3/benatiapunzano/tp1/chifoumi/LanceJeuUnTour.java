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
public class LanceJeuUnTour {
    
    public static void main(String[] arg) {
          String A = (String) JOptionPane.showInputDialog(null, "Joueur 1 quel est votre nom ?", "CHI-FOU-MI!", JOptionPane.INFORMATION_MESSAGE,null,null,"Joueur 1");   
          String B = (String) JOptionPane.showInputDialog(null, "Joueur 2 quel est votre nom ?", "CHI-FOU-MI!", JOptionPane.INFORMATION_MESSAGE,null,null,"Joueur 2");
         
    JeuUnTour game = new JeuUnTour(A,B);
	game.Jouer();
        
        
        
    }
}
