/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.mtp.b3.benatiapunzano.tp1.chifoumi;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


/**
 *
 * @author Sofian
 */
public class IHMSaisie extends JOptionPane {
    final static long serialVersionUID = 1;
	JDialog dialogue;
	Choix[] choix = {Choix.CAILLOU, Choix.CISEAUX, Choix.PAPIER};
	public IHMSaisie(String nom) {
		setMessage(nom + ", que jouez-vous ?" );
		setOptions(choix);
		dialogue = createDialog(null, "chifoumi");
	}

	Choix proposerChoix() {
		dialogue.setVisible(true);
		return (Choix)getValue();
	}
//nouveau build
}
