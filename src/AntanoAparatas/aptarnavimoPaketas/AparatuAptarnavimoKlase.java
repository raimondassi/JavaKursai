package AntanoAparatas.aptarnavimoPaketas;

import AntanoAparatas.pamoka.*;

public class AparatuAptarnavimoKlase {

	public void masyvoKurimas() {
		
		AparatuAptarnavimoKlase[] aparatuMasyvas = new AparatuAptarnavimoKlase[10];
		
		for (int i=0; i < aparatuMasyvas.length; i++) {
			
			aparatuMasyvas[i] = new AparatuAptarnavimoKlase();
			
			System.out.println(aparatuMasyvas[i]);
		}		
		
	}

	public static void main(String args[]) {

		AparatuAptarnavimoKlase b1 = new AparatuAptarnavimoKlase();
		b1.masyvoKurimas();

	}

}
