package KavosAparatas;

import KavosAparatas.KavosPuodeliai.KavosPavadinimas;
import KavosAparatas.KavosPuodeliai.KavosPuodelis;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
     int cukrausKiekis=100;
     int pupeliuKiekis;
     int vandensKiekis;


    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.pupeliuKiekis = pupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }

/*
    public static KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }


/*
    public static void mazinameKavosProduktusKavosAparateVisGaminantNaujaPuodeli(KavosPuodelis kavosProduktaiIsPuodelio) {
        cukrausKiekis = cukrausKiekis - kavosProduktaiIsPuodelio.getCukrausKiekis();
        pupeliuKiekis = pupeliuKiekis - kavosProduktaiIsPuodelio.getPupeliuKiekis();
        vandensKiekis = vandensKiekis - kavosProduktaiIsPuodelio.getVandensKiekis();


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

    public void setCukrausKiekis(int cukrausKiekis) {
        this.cukrausKiekis = cukrausKiekis;
    }

    public void setPupeliuKiekis(int pupeliuKiekis) {
        this.pupeliuKiekis = pupeliuKiekis;
    }

    public void setVandensKiekis(int vandensKiekis) {
        this.vandensKiekis = vandensKiekis;
    }

}
