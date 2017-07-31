package KavosAparatas.KavosPuodeliai;

import KavosAparatas.*;


/**
 * Created by ozc on 2017.07.25.
 */
public class KavosPuodelis {

    public  KavosProduktai produktuKiekiai;
    public  String kavosPavadinimas;
    public boolean arKavaPagaminta;
    int puodelioTalpa;


    public KavosPuodelis(String kavosPavadinimas, int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.kavosPavadinimas = kavosPavadinimas;
        this.produktuKiekiai = new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);

    }


    int rodykPuodelioTalpa() {
        return puodelioTalpa;
    }


}