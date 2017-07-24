package KavosAparatas;

import static KavosAparatas.KavosProduktai.*;
import static KavosAparatas.KavosAparatas.*;


/**
 * Created by Raimondas on 2017.07.24.
 */
public class Puodelis {


    Puodelis(String puodelioTipas){

    }

    void gaminameEspresso() {

         Puodelis puodelis=new Puodelis("espresso");
        vandensKiekis = vandensKiekis - 100;
        pupeliuKiekis = pupeliuKiekis - 100;
        cukrausKiekis = cukrausKiekis - 10;

    }


    void gaminameCapucino() {
        vandensKiekis = vandensKiekis - 200;
        pupeliuKiekis = pupeliuKiekis - 100;
        cukrausKiekis = cukrausKiekis - 30;

    }

    void gaminameLatte() {
        vandensKiekis = vandensKiekis - 200;
        pupeliuKiekis = pupeliuKiekis - 150;
        cukrausKiekis = cukrausKiekis - 20;


    }

    public void gaminaKava(String kavosTipas) {

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

}
