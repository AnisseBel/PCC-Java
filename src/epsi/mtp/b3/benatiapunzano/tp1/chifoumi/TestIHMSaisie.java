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
public class TestIHMSaisie {
    public static void main(String[] arg) {
		IHMSaisie saisie = new IHMSaisie("toto");
		Choix choix = saisie.proposerChoix();
		System.out.println("Le choix de toto est " + choix);
	}

}
