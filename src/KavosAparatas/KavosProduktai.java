package KavosAparatas;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
    static int cukrausKiekis;
    static int pupeliuKiekis;
    static int vandensKiekis;

    public  KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis){
        this.cukrausKiekis=cukrausKiekis;
        this.pupeliuKiekis=pupeliuKiekis;
        this.vandensKiekis=vandensKiekis;
    }

     public KavosProduktai gausKavosProduktuKopija(){
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }

   void setKavosProduktus( int cukrausKiekis, int pupeliuKiekis, int vandensKiekis){
         this.cukrausKiekis=cukrausKiekis;
         this.pupeliuKiekis=pupeliuKiekis;
         this.vandensKiekis=vandensKiekis;
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
