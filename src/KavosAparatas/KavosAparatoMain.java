package KavosAparatas;

/**
 * Created by Raimondas on 2017.07.19.
 */
public class KavosAparatoMain {
    public static void main(String[] args) {
        KavosAparatusAptarnaujantiKlase kavosAparatusAptarnaujantiKlase=new KavosAparatusAptarnaujantiKlase();
        KavosAparatas[] kavosaparatuMasyvas= kavosAparatusAptarnaujantiKlase.sukuriaKavosAparatus(10);
        kavosAparatusAptarnaujantiKlase.isvaloVisuAparatuProduktus(kavosaparatuMasyvas);
    }
}
