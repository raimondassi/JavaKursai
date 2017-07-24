package KavosAparatas;

import KavosAparatas.*;

/**
 * Created by Raimondas on 2017.07.17.
 */
public class KavosAparatusAptarnaujantiKlase {


    public KavosAparatas[] sukuriaKavosAparatus(int kavosAparatuKiekis) {

        KavosAparatas kavosAparatuMasyvas[] = new KavosAparatas[kavosAparatuKiekis];

        for (int i = 0; i < kavosAparatuKiekis; i++) {
            KavosAparatas kavosAparatas = new KavosAparatas();
            kavosAparatuMasyvas[i] = kavosAparatas;
        }
        return kavosAparatuMasyvas;
    }


    public void isvaloVisuAparatuProduktus(KavosAparatas[] kavosAparatai) {
        for (int i = 0; i < kavosAparatai.length; i++) {
            kavosAparatai[i].atliekamePlovima();
        }


    }


}


