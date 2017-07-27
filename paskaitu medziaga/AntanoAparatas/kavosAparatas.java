package AntanoAparatas;
import AntanoAparatas.pamoka.*;

import java.util.Scanner;

import AntanoAparatas.aptarnavimoPaketas.AparatuAptarnavimoKlase;

public class kavosAparatas {

	public int cukrausKiekis = 0;
	public int pupeliuKiekis = 0;
	public int vandensKiekis = 0;

	public int panaudojimuSkaicius = 0;

	public final int PANAUDOJIMU_SKAICIUS = 100;

	public kavosAparatas() {
		 produktaiKavosAparatui p = new produktaiKavosAparatui();
	     p.produktuPriskyrimas(50, 50, 50);
	     
		
		
		this.cukrausKiekis = cukrausKiekis;
		this.pupeliuKiekis = pupeliuKiekis;
		this.vandensKiekis = vandensKiekis;

	}

	public void kavosGamyba(String kavosTipas) {

		switch (kavosTipas) {
		case "dviguba":
			kavosGamyba(4, 4, 4);
			System.out.println("dviguba");
			break;
		case "late":
			kavosGamyba(3, 3, 3);
			System.out.println("late");
			break;
		case "amerikano":
			kavosGamyba(2, 2, 2);
			System.out.println("amerikano");
			break;
		default:
			System.out.println("Rinkis dviguba, late arba amerikano ne " + kavosTipas);

		}

	}

	public void kavosGamyba(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
		if (arUztenka(cukrausKiekis, pupeliuKiekis, vandensKiekis) && !aparatoValymas()) {

			this.cukrausKiekis = this.cukrausKiekis - cukrausKiekis;
			this.pupeliuKiekis = this.pupeliuKiekis - pupeliuKiekis;
			this.vandensKiekis = this.vandensKiekis - vandensKiekis;

			panaudojimuSkaicius++;
		

		}
	}

	
	public boolean aparatoValymas() {
		if (panaudojimuSkaicius >= PANAUDOJIMU_SKAICIUS) {

			System.out.println("reikia isvalyt");

			return true;

		} else {

			System.out.println("valymo NEreikia");

			return false;
		}

	}

	public boolean arUztenka(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
		if (this.cukrausKiekis >= 2 && this.pupeliuKiekis >= 2 && this.vandensKiekis >= 2) {

			System.out.println("produktu uztenka");
			return true;
		}
		System.out.println("produktu NEuztenka");
		return false;

	}

	public void getcukrausKiekis() {
		
		this.cukrausKiekis = cukrausKiekis;
		
		System.out.println(this.cukrausKiekis);
	}
	
	public void getpupeliuKiekis() {
			this.pupeliuKiekis = pupeliuKiekis;
		
		System.out.println(this.pupeliuKiekis);
		
		
	}
	
	public void getvandensKiekis() {
		this.vandensKiekis = vandensKiekis;
	
	System.out.println(this.vandensKiekis);
	
	
}
	
	public void getStatus() {
		System.out.println("Cukraus kiekis: " + cukrausKiekis);
		System.out.println("Kavos pupeliu kiekis " + pupeliuKiekis);
		System.out.println("Vandens kiekis: " + vandensKiekis);
		System.out.println("Iki plovimo liko: " + (PANAUDOJIMU_SKAICIUS - panaudojimuSkaicius));
		System.out.println(" ");

	}

	public void produktuPapildymas() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Kiek papildyti cukraus?");
		cukrausKiekis += scn.nextInt();

		System.out.println("Kiek papildyti kavos pupeliu?");
		pupeliuKiekis += scn.nextInt();
		System.out.println("Kiek papildyti vandens?");
		vandensKiekis += scn.nextInt();
		//kavosTipoIvedimas();
		scn.close();
	}
	
	
	
	public static void main(String[] args) {
		 produktaiKavosAparatui p = new produktaiKavosAparatui();
	     p.produktuPriskyrimas(50, 50, 50);
	     
     kavosAparatas k = new kavosAparatas();
     k.kavosGamyba("dviguba");
     k.getcukrausKiekis();
     
     AparatuAptarnavimoKlase b1 = new AparatuAptarnavimoKlase();
     b1.masyvoKurimas();
     
  
	}

}
