package AntanoAparatas.pamoka;

public class produktaiKavosAparatui {

	public int CukrausKiekis = 50;
	public int PupeliuKiekis = 50;
	public int VandensKiekis = 50;
	

	public produktaiKavosAparatui() {
		this.CukrausKiekis = CukrausKiekis;
		this.PupeliuKiekis = PupeliuKiekis;
		this.VandensKiekis = VandensKiekis;

	}
	
	public void produktuPriskyrimas(int f1, int g1, int h1) { 
		
		CukrausKiekis = f1;
		PupeliuKiekis = g1;
		VandensKiekis = h1;
		
	   System.out.println("Aparatas papildytas: cukraus " + f1 + " pupeliu " + g1 + " vandens.");

		
		
	}
	
public void getcukrausKiekis() {
		
		this.CukrausKiekis = CukrausKiekis;
		
		System.out.println(this.CukrausKiekis);
	}
	
	public void getpupeliuKiekis() {
			this.PupeliuKiekis = PupeliuKiekis;
		
		System.out.println(this.PupeliuKiekis);
		
		
	}
	
	public void getvandensKiekis() {
		this.VandensKiekis = VandensKiekis;
	
	System.out.println(this.VandensKiekis);
	
	
	}
	
	public int getVandensKiekis() {
		return VandensKiekis;
		
	}

	public void setVandensKiekis(int vandensKiekis) {
		this.VandensKiekis = vandensKiekis;
	}

	public int getCukrausKiekis() {
		return CukrausKiekis;
	}

	public void setCukrausKiekis(int cukrausKiekis) {
		this.CukrausKiekis = cukrausKiekis;
	}

	public int getPupeliuKiekis() {
		return PupeliuKiekis;
	}

	public void setPupeliuKiekis(int pupeliuKiekis) {
		this.PupeliuKiekis = pupeliuKiekis;
	}
}

