package KavosAparatas.KavosPuodeliai;

import KavosAparatas.*;

/**
 * Created by ozc on 2017.07.25.
 */
public enum     KavosPavadinimas {
    CAPUCINO (new CapucinoPuodelis()), ESPRESSO (new EspressoPuodelis()), LATTE (new LattePuodelis()) ;

    public   KavosPuodelis kavosPuodelis;

    KavosPavadinimas(KavosPuodelis kavosPuodelis){
        this.kavosPuodelis=kavosPuodelis;

    }

    public KavosPuodelis getKavosPuodelis(){
        return kavosPuodelis;
}
    }
