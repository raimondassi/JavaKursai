package KavosAparatas;

//import static KavosAparatas.KavosProduktai.*;

import static KavosAparatas.KavosProduktai.*;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosAparatas {

    int panaudojimuSkaicius;
    int PANAUDOJIMO_SKAICIAUS_KONSTANTA = 100;


    public KavosAparatas() {
    }

    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
        this.panaudojimuSkaicius = panaudojimuSkaicius;
    }

    int papildytiVandens() {
        return 0;
    }

    int papildytiPupeliu() {
        return 0;
    }

    int papildytiCukraus() {
        return 0;
    }

    void gaminkKava(String kavosTipas) {
        switch (kavosTipas) {
            case "espresso":
                gaminameEspresso();
                break;
            case "capucino":
                gaminameCapucino();
                break;
            case "latte":
                gaminameLatte();
                break;
        }
    }


    void gaminameEspresso() {
        vandensKiekis = vandensKiekis - 100;
        pupeliuKiekis = pupeliuKiekis - 100;
        cukrausKiekis = cukrausKiekis - 10;
        visiTikrinimaiIrPranesimai();
    }


    void gaminameCapucino() {
        vandensKiekis = vandensKiekis - 200;
        pupeliuKiekis = pupeliuKiekis - 100;
        cukrausKiekis = cukrausKiekis - 30;
        visiTikrinimaiIrPranesimai();
    }

    void gaminameLatte() {
        vandensKiekis = vandensKiekis - 200;
        pupeliuKiekis = pupeliuKiekis - 150;
        cukrausKiekis = cukrausKiekis - 20;
        visiTikrinimaiIrPranesimai();

    }

    void tikrinameArNereikiaKoNorsPapildyti() {
        if (vandensKiekis < 200) {
            papildytiVandens();
        }
        if (pupeliuKiekis < 150) {
            papildytiPupeliu();
            if (cukrausKiekis < 30) {
                papildytiCukraus();
            }
        }
    }

    void tikrinamePanaudojimuBusena() {
        if (panaudojimuSkaicius == PANAUDOJIMO_SKAICIAUS_KONSTANTA) {
            System.out.println("Atliekamas plovimas, nes panaudojai aparata " + panaudojimuSkaicius + " kartu");
            atliekamePlovima();
        }
        panaudojimuSkaicius++;
    }

    void atliekamePlovima() {
        panaudojimuSkaicius = 0;
    }

    void pranesameInformacijaPoKikevienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + KavosProduktai.vandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + KavosProduktai.pupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + cukrausKiekis);
        System.out.println("Iki issiplovimo liko: " + (PANAUDOJIMO_SKAICIAUS_KONSTANTA - panaudojimuSkaicius));
    }

    void visiTikrinimaiIrPranesimai() {
        tikrinameArNereikiaKoNorsPapildyti();
        tikrinamePanaudojimuBusena();
        pranesameInformacijaPoKikevienoPanaudojimo();
    }

}
