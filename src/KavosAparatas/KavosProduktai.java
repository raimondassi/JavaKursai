package KavosAparatas;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class
KavosProduktai {
    static int cukrausKiekis;
    static int pupeliuKiekis;
    static int vandensKiekis;


    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.pupeliuKiekis = pupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }

    public KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }


    public KavosProduktai setKavosProduktusVisSukuriantNaujaKavosProduktuObjekta() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }

    public void setKavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = this.cukrausKiekis - cukrausKiekis;


    }


    public static int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public static int getPupeliuKiekis() {
        return pupeliuKiekis;
    }

    public static int getVandensKiekis() {
        return vandensKiekis;
    }

    public static void setCukrausKiekis(int cukrausKiekis) {
        KavosProduktai.cukrausKiekis = cukrausKiekis;
    }

    public static void setPupeliuKiekis(int pupeliuKiekis) {
        KavosProduktai.pupeliuKiekis = pupeliuKiekis;
    }

    public static void setVandensKiekis(int vandensKiekis) {
        KavosProduktai.vandensKiekis = vandensKiekis;
    }

}
