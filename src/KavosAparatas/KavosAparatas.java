package KavosAparatas;

//import static KavosAparatas.KavosProduktai.*;

import KavosAparatas.KavosPuodeliai.*;

import static KavosAparatas.KavosProduktai.*;


/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosAparatas {

     int panaudojimuSkaicius;
    static int sukurtuKavosAparatuSkaicius;

    static void suskaiciuosSukurtuAparatuSkaiciu(){
        /??????????????? kaip tuos objektus suskaiciuoti


        System.out.println("Viso buvo sukurta: "+sukurtuKavosAparatuSkaicius);
    }


    public KavosAparatas() {
    }

    public KavosAparatas(KavosProduktai kavosProduktai) {

    }

    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

    public int getPupeliuKiekis() {
        return pupeliuKiekis;
    }


    void setKavosAparatoProduktus(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        KavosProduktai.cukrausKiekis = cukrausKiekis;
        KavosProduktai.pupeliuKiekis = pupeliuKiekis;
        KavosProduktai.vandensKiekis = vandensKiekis;
    }


    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimuSkaicius() {
        this.panaudojimuSkaicius = 0;
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


    void tikrinameArNereikiaKoNorsPapildyti() {
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

    void tikrinamePanaudojimuBusena() {
        if (panaudojimuSkaicius == Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA) {
            System.out.println("Atliekamas plovimas, nes panaudojai aparata " + panaudojimuSkaicius + " kartu");
            atliekamePlovima();
        }
        panaudojimuSkaicius++;
    }

    void isvalomeKavosAparatoProduktus() {
        cukrausKiekis = 0;
        vandensKiekis = 0;
        pupeliuKiekis = 0;
    }

    ;

    void atliekamePlovima() {
        panaudojimuSkaicius = 0;
    }

    void pranesameInformacijaPoKiekvienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + KavosProduktai.vandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + KavosProduktai.pupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + cukrausKiekis);
        System.out.println("Iki issiplovimo liko: " + (Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA - panaudojimuSkaicius));
    }

    void visiTikrinimaiIrPranesimai() {
        tikrinameArNereikiaKoNorsPapildyti();
        tikrinamePanaudojimuBusena();
        pranesameInformacijaPoKiekvienoPanaudojimo();
    }

    public void gaminaKava(String kavosPavadinimas) {
        KavosPuodelis kavosPuodelis = new KavosPuodelis(kavosPavadinimas);
        KavosProduktai kavosProduktai=new KavosProduktai();

        switch (kavosPavadinimas) {
            case "espresso":
               new EspressoPuodelis();
               //????????????? kavosProduktai.setKavosProduktai(KavosPuodelis);
                break;
            case "capucino":
                new CapucinoPuodelis();
                break;
            case "latte":
                new LattePuodelis();
                break;

        }

    }

}
