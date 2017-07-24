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
        int isvalytasCukrus=0, isvalytosPupeles=0, isvalytasVanduo=0;
        for (int i = 0; i < kavosAparatai.length; i++) {
            isvalytasCukrus=isvalytasCukrus+kavosAparatai[i].getCukrausKiekis();
            isvalytosPupeles=isvalytosPupeles+kavosAparatai[i].getPupeliuKiekis();
            isvalytasVanduo=isvalytasVanduo+kavosAparatai[i].getVandensKiekis();
            kavosAparatai[i].isvalomeKavosAparatoProduktus();
        }
        System.out.println("Isvalytas vanduo: "+isvalytasVanduo);
        System.out.println("Isvalytas cukrus: " + isvalytasCukrus);
        System.out.println("Isvalytos pupeles: "+isvalytosPupeles);
    }

    public void isplausimePasirinktaKavosAparataIsMasyvo(KavosAparatas[] kavosAparatas, int konkretausAparatoNumeris){
        kavosAparatas[konkretausAparatoNumeris].atliekamePlovima();
    }

    public void isplaunameVisusKavosAparatus(KavosAparatas[] kavosAparatai){
        for(int i=0; i<kavosAparatai.length;i++){
            kavosAparatai[i].atliekamePlovima();
        }

    }

    public void visiemsAparatamsPriskiriameTaPatiProduktuObjekta(KavosAparatas[] kavosAparatai, KavosProduktai produktuObjektas){
        for(int i=0;i<kavosAparatai.length;i++){
            kavosAparatai[i].
        }


    }


}


