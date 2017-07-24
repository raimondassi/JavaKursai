package KavosAparatas;

//import static KavosAparatas.KavosProduktai.*;

import static KavosAparatas.KavosProduktai.*;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosAparatas {

    static int panaudojimuSkaicius;
    static int PANAUDOJIMO_SKAICIAUS_KONSTANTA = 100;


    public KavosAparatas() {
    }
    public KavosAparatas(KavosProduktai kavosProduktai){

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


    void setKavosAparatoProduktus( int cukrausKiekis, int pupeliuKiekis, int vandensKiekis){
        KavosProduktai.cukrausKiekis=cukrausKiekis;
        KavosProduktai.pupeliuKiekis=pupeliuKiekis;
        KavosProduktai.vandensKiekis=vandensKiekis;
    }



    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimuSkaicius() {
        this.panaudojimuSkaicius = 0;
    }

    int papildytiVandens() {
        return vandensKiekis=VANDENS_PAPILDYMAS;
    }

    int papildytiPupeliu() {
        return pupeliuKiekis=PUPELIU_PAPILDYMAS;
    }

    int papildytiCukraus() {
        return cukrausKiekis=CUKRAUS_PAPILDYMAS;
    }






    void tikrinameArNereikiaKoNorsPapildyti() {
        if (vandensKiekis <= MINIMALUS_VANDENS_KIEKIS) {
            papildytiVandens();
            System.out.println("Pasiektas minimalus vandens kiekis: papildome vandeni");
        }
        if (pupeliuKiekis <= MINIMALUS_PUPELIU_KIEKIS) {
            papildytiPupeliu();
            System.out.println("Pasiektas minimalus pupeliu kiekis: papildome pupeles");
            if (cukrausKiekis <= MINIMALUS_CUKRAUS_KIEKIS) {
                papildytiCukraus();
                System.out.println("Pasiektas minimalus cukraus kiekis: papildome cukru");
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

    void isvalomeKavosAparatoProduktus(){
        cukrausKiekis=0;
        vandensKiekis=0;
        pupeliuKiekis=0;
    };

    void atliekamePlovima() {
        panaudojimuSkaicius = 0;
    }

     void pranesameInformacijaPoKiekvienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + KavosProduktai.vandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + KavosProduktai.pupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + cukrausKiekis);
        System.out.println("Iki issiplovimo liko: " + (PANAUDOJIMO_SKAICIAUS_KONSTANTA - panaudojimuSkaicius));
    }

     void visiTikrinimaiIrPranesimai() {
        tikrinameArNereikiaKoNorsPapildyti();
        tikrinamePanaudojimuBusena();
        pranesameInformacijaPoKiekvienoPanaudojimo();
    }

}
