package KavosAparatas;

import java.util.*;

/**
 * Created by ozc on 2017.07.25.
 */
public class KavosAparatoPagalbineKlase extends KavosAparatusAptarnaujantiKlase {


    List<KavosAparatas> kavosAparatuSarasas = new ArrayList<KavosAparatas>();


//////////////Kavos aparato pagalbinėje klasėje overloadinti metodus, kurie naudoja masyvus panaudojant: map, list

    public List<KavosAparatas> sukuriaKavosAparatuSarasa(int kavosAparatuKiekis) {
        for (int i = 0; i <= kavosAparatuKiekis; i++) {
            kavosAparatuSarasas.add(new KavosAparatas());

        }

        return kavosAparatuSarasas;

    }


    Map<Integer, KavosAparatas> kavosAparatuMapas = new HashMap<Integer, KavosAparatas>();

    public Map<Integer, KavosAparatas> sukuriaKavosAparatuMapa(int kavosAparatuKiekis) {
        for (int i = 0; i <= kavosAparatuKiekis; i++) {
            kavosAparatuMapas.put(i, new KavosAparatas());
        }
        return kavosAparatuMapas;

    }

}
