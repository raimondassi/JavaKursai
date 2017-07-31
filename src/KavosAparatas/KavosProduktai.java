package KavosAparatas;

import KavosAparatas.KavosPuodeliai.KavosPavadinimas;
import KavosAparatas.KavosPuodeliai.KavosPuodelis;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
     int cukrausKiekis;
     int pupeliuKiekis;
     int vandensKiekis;


    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.pupeliuKiekis = pupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }


    public KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }



    public  void mazinameKavosProduktusKavosAparateVisGaminantNaujaPuodeli(KavosPuodelis kavosProduktaiIsPuodelio) {
        cukrausKiekis = cukrausKiekis - kavosProduktaiIsPuodelio.produktuKiekiai.getCukrausKiekis();
        pupeliuKiekis = pupeliuKiekis - kavosProduktaiIsPuodelio.produktuKiekiai.getPupeliuKiekis();
        vandensKiekis = vandensKiekis - kavosProduktaiIsPuodelio.produktuKiekiai.getVandensKiekis();


    }


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

    int papildytiVandens() {
        return vandensKiekis = Konstantos.VANDENS_PAPILDYMAS;
    }

    int papildytiPupeliu() {
        return pupeliuKiekis = Konstantos.PUPELIU_PAPILDYMAS;
    }

    int papildytiCukraus() {
        return cukrausKiekis = Konstantos.CUKRAUS_PAPILDYMAS;
    }

   public void tikrinameArNereikiaKoNorsPapildyti() {
        if (vandensKiekis <= Konstantos.MINIMALUS_VANDENS_KIEKIS) {
            papildytiVandens();
            System.out.println("Pasiektas minimalus vandens kiekis: papildome vandeni");
        }
        if (pupeliuKiekis <= Konstantos.MINIMALUS_PUPELIU_KIEKIS) {
            papildytiPupeliu();
            System.out.println("Pasiektas minimalus pupeliu kiekis: papildome pupeles");
            if (cukrausKiekis <= Konstantos.MINIMALUS_CUKRAUS_KIEKIS) {
                papildytiCukraus();
                System.out.println("Pasiektas minimalus cukraus kiekis: papildome cukru");
            }
        }
    }
    void isvalomeKavosAparatoProduktus() {
        cukrausKiekis = 0;
        vandensKiekis = 0;
        pupeliuKiekis = 0;
    }

    void pranesameInformacijaApieProduktuLikuciusPoKiekvienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + vandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + pupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + cukrausKiekis);

    }



}


