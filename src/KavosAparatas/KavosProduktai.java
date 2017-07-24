package KavosAparatas;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
    static int cukrausKiekis;
    static int pupeliuKiekis;
    static int vandensKiekis;
    final static int  MINIMALUS_VANDENS_KIEKIS=200;
    final static int MINIMALUS_PUPELIU_KIEKIS=150;
    final static int MINIMALUS_CUKRAUS_KIEKIS=30;
    final static int VANDENS_PAPILDYMAS=10000;
    final static int PUPELIU_PAPILDYMAS=5000;
    final static int CUKRAUS_PAPILDYMAS=1000;

    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.pupeliuKiekis = pupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }

    public KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }
/*
   void setKavosProduktus( int cukrausKiekis, int pupeliuKiekis, int vandensKiekis){
         this.cukrausKiekis=cukrausKiekis;
         this.pupeliuKiekis=pupeliuKiekis;
         this.vandensKiekis=vandensKiekis;
   }
*/

    void setKavosProduktus() {
        new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }
 /*  void getKavosProduktus(){
       return cukrausKiekis;
       return pupeliuKiekis;
       return vandensKiekis;
   }
   */


    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public int getPupeliuKiekis() {
        return pupeliuKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

}
