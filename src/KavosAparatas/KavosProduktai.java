package KavosAparatas;

import KavosAparatas.KavosPuodeliai.KavosPuodelis;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
     int KavosProduktaiObjektoCukrausKiekis;
     int KavosProduktaiObjektoPupeliuKiekis;
     int KavosProduktaiObjektoVandensKiekis;


    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.KavosProduktaiObjektoCukrausKiekis = cukrausKiekis;
        this.KavosProduktaiObjektoPupeliuKiekis = pupeliuKiekis;
        this.KavosProduktaiObjektoVandensKiekis = vandensKiekis;
    }


    public KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(KavosProduktaiObjektoCukrausKiekis, KavosProduktaiObjektoPupeliuKiekis, KavosProduktaiObjektoVandensKiekis);
    }



    public  void mazinameKavosProduktusKavosAparateVisGaminantNaujaPuodeli(KavosPuodelis kavosProduktaiIsPuodelio) {
        KavosProduktaiObjektoCukrausKiekis = KavosProduktaiObjektoCukrausKiekis - kavosProduktaiIsPuodelio.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis();
        KavosProduktaiObjektoPupeliuKiekis = KavosProduktaiObjektoPupeliuKiekis - kavosProduktaiIsPuodelio.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis();
        KavosProduktaiObjektoVandensKiekis = KavosProduktaiObjektoVandensKiekis - kavosProduktaiIsPuodelio.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis();


    }


    public int getKavosProduktaiObjektoCukrausKiekis() {
        return KavosProduktaiObjektoCukrausKiekis;
    }

    public int getKavosProduktaiObjektoPupeliuKiekis() {
        return KavosProduktaiObjektoPupeliuKiekis;
    }

    public int getKavosProduktaiObjektoVandensKiekis() {
        return KavosProduktaiObjektoVandensKiekis;
    }

    public void setKavosProduktaiObjektoCukrausKiekis(int kavosProduktaiObjektoCukrausKiekis) {
        this.KavosProduktaiObjektoCukrausKiekis = kavosProduktaiObjektoCukrausKiekis;
    }

    public void setKavosProduktaiObjektoPupeliuKiekis(int kavosProduktaiObjektoPupeliuKiekis) {
        this.KavosProduktaiObjektoPupeliuKiekis = kavosProduktaiObjektoPupeliuKiekis;
    }

    public void setKavosProduktaiObjektoVandensKiekis(int kavosProduktaiObjektoVandensKiekis) {
        this.KavosProduktaiObjektoVandensKiekis = kavosProduktaiObjektoVandensKiekis;
    }

    int papildytiVandens() {
        return KavosProduktaiObjektoVandensKiekis = Konstantos.VANDENS_PAPILDYMAS;
    }

    int papildytiPupeliu() {
        return KavosProduktaiObjektoPupeliuKiekis = Konstantos.PUPELIU_PAPILDYMAS;
    }

    int papildytiCukraus() {
        return KavosProduktaiObjektoCukrausKiekis = Konstantos.CUKRAUS_PAPILDYMAS;
    }

   public void tikrinameArNereikiaKoNorsPapildyti() {
        if (KavosProduktaiObjektoVandensKiekis <= Konstantos.MINIMALUS_VANDENS_KIEKIS) {
            papildytiVandens();
            System.out.println("Pasiektas minimalus vandens kiekis: papildome vandeni");
        }
        if (KavosProduktaiObjektoPupeliuKiekis <= Konstantos.MINIMALUS_PUPELIU_KIEKIS) {
            papildytiPupeliu();
            System.out.println("Pasiektas minimalus pupeliu kiekis: papildome pupeles");
            if (KavosProduktaiObjektoCukrausKiekis <= Konstantos.MINIMALUS_CUKRAUS_KIEKIS) {
                papildytiCukraus();
                System.out.println("Pasiektas minimalus cukraus kiekis: papildome cukru");
            }
        }
    }
    void isvalomeKavosAparatoProduktus() {
        KavosProduktaiObjektoCukrausKiekis = 0;
        KavosProduktaiObjektoVandensKiekis = 0;
        KavosProduktaiObjektoPupeliuKiekis = 0;
    }

    void pranesameInformacijaApieProduktuLikuciusPoKiekvienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + KavosProduktaiObjektoVandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + KavosProduktaiObjektoPupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + KavosProduktaiObjektoCukrausKiekis);

    }



}


