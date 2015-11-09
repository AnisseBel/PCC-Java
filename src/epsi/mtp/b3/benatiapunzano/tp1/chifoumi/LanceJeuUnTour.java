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
        int score = 0;
        String Stringscore = "";
        boolean rej = false;
                while(!rej){
                    
                
          String A = (String) JOptionPane.showInputDialog(null, "Joueur 1 quel est votre nom ?", "CHI-FOU-MI!", JOptionPane.INFORMATION_MESSAGE,null,null,"Joueur 1");   
          String B = (String) JOptionPane.showInputDialog(null, "Joueur 2 quel est votre nom ?", "CHI-FOU-MI!", JOptionPane.INFORMATION_MESSAGE,null,null,"Joueur 2");
          boolean test = false;
          while(!test){
           Stringscore = (String) JOptionPane.showInputDialog(null, "Nombre de tour ?", "CHI-FOU-MI!", JOptionPane.INFORMATION_MESSAGE,null,null,"Score");
          
          try{
           
           score = Integer.parseInt(Stringscore);
           if(score <= 0 ){
                JOptionPane.showMessageDialog(null, "Entrez un chiffre supérieur à 0", "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
           }else{
               test = true;
           }
   }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrez un chiffre supérieur à 0 ", "Erreur", JOptionPane.INFORMATION_MESSAGE, null);

   }
          }
   
          JeuUnTour game = new JeuUnTour(A,B,score);
	int rejouer = game.Jouer();
        if(rejouer != 0){
            rej = true;
        }
        }
        
        
    }

    
}
