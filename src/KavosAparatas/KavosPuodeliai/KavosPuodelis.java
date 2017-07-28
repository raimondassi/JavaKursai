package KavosAparatas.KavosPuodeliai;

import KavosAparatas.*;


/**
 * Created by ozc on 2017.07.25.
 */
public class KavosPuodelis {

    public static KavosProduktai produktuKiekiai;
    public static String kavosPavadinimas;
    public boolean arKavaPagaminta;
    int puodelioTalpa;
    static int cukrausKiekis;
    static int pupeliuKiekis;
    static int vandensKiekis;

    public static int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public static int getPupeliuKiekis() {
        return pupeliuKiekis;
    }

    public static int getVandensKiekis() {
        return vandensKiekis;
    }



    public KavosPuodelis(String kavosPavadinimas, int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.kavosPavadinimas = kavosPavadinimas;
       ? ////////////// kam reikia, kad kavos puodelis kurtu nauja KavosProduktu objekta???
       // this.produktuKiekiai = new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
        this.cukrausKiekis=cukrausKiekis;
        this.pupeliuKiekis=pupeliuKiekis;
        this.vandensKiekis=vandensKiekis;
    }

  /*
    eiga ar ne tokia:
    susikuri nauja aparato objekta
    tada jam susikuri kavos produktu objekta
    o paskui su kiekvienu puodeliu atimineji is produktu objekto, puodeliui gaminti reikalingus produktus ir kavos aparate tikrini likucius



*/

    int rodykPuodelioTalpa() {
        return puodelioTalpa;
    }


}