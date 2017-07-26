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
    KavosProduktai kavosProduktai;

    public static void suskaiciuosSukurtuAparatuSkaiciu() {
        System.out.println("Viso buvo sukurta: " + sukurtuKavosAparatuSkaicius);
    }


    public KavosAparatas() {
        sukurtuKavosAparatuSkaicius++;
        kavosProduktai = new KavosProduktai(Konstantos.CUKRAUS_PAPILDYMAS, Konstantos.PUPELIU_PAPILDYMAS, Konstantos.VANDENS_PAPILDYMAS);
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

    public void setCukrausKiekis(int cukrausKiekis) {
        KavosProduktai.cukrausKiekis = cukrausKiekis;
    }

    public void setPupeliuKiekis(int pupeliuKiekis) {
        KavosProduktai.pupeliuKiekis = pupeliuKiekis;
    }

    public void setVandensKiekis(int vandensKiekis) {
        KavosProduktai.vandensKiekis = vandensKiekis;
    }


    void setKavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
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

    public KavosPuodelis gaminaKava(String kavosPavadinimas) {
        KavosPuodelis kavosPuodelis;
        switch (kavosPavadinimas) {
            case "espresso":
                kavosPuodelis = new EspressoPuodelis();
                KavosProduktai isEsptessoProduktai = kavosPuodelis.produktuKiekiai;
                ////////////////////
                setCukrausKiekis(cukrausKiekis - isEsptessoProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isEsptessoProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isEsptessoProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;

                return kavosPuodelis;
            case "capucino":
                kavosPuodelis = new CapucinoPuodelis();
                KavosProduktai isCapucinoProduktai = kavosPuodelis.produktuKiekiai;
                setCukrausKiekis(cukrausKiekis - isCapucinoProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isCapucinoProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isCapucinoProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;

                return kavosPuodelis;
            case "latte":
                kavosPuodelis = new LattePuodelis();
                KavosProduktai isLatteProduktai = kavosPuodelis.produktuKiekiai;
                setCukrausKiekis(cukrausKiekis - isLatteProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isLatteProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isLatteProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;

                return kavosPuodelis;

        }

        return kavosPuodelis;
    }


}
