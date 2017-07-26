package KavosAparatas.KavosPuodeliai;

import KavosAparatas.*;


/**
 * Created by ozc on 2017.07.25.
 */
public abstract class KavosPuodelis {

    public KavosProduktai produktuKiekiai;
    public String kavosPavadinimas;
    public static boolean arKavaPagaminta;


   public KavosPuodelis(String kavosPavadinimas, int cukrausKiekis, int pupeliuKiekis, int vandensKiekis){
       this.kavosPavadinimas=kavosPavadinimas;
       this.produktuKiekiai=new KavosProduktai( cukrausKiekis,  pupeliuKiekis,  vandensKiekis);

   }


}
