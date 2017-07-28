package KavosAparatas;
//import static KavosAparatas.KavosProduktai.*;

import KavosAparatas.KavosPuodeliai.*;

import java.util.HashMap;
import java.util.Map;

import static KavosAparatas.KavosProduktai.*;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosAparatas {
    private static CapucinoPuodelis capucinoPuodelis = new CapucinoPuodelis();
    private static EspressoPuodelis espressoPuodelis = new EspressoPuodelis();
    private static LattePuodelis lattePuodelis = new LattePuodelis();
    static int  panaudojimuSkaicius;
    static int sukurtuKavosAparatuSkaicius;
    static KavosProduktai kavosProduktuPapildymas;

    public static void suskaiciuosSukurtuAparatuSkaiciu() {
        System.out.println("Viso buvo sukurta: " + sukurtuKavosAparatuSkaicius);
    }

     public  KavosAparatas() {
        sukurtuKavosAparatuSkaicius++;

         kavosProduktuPapildymas = new KavosProduktai(Konstantos.CUKRAUS_PAPILDYMAS, Konstantos.PUPELIU_PAPILDYMAS, Konstantos.VANDENS_PAPILDYMAS);
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

    public static void setCukrausKiekis(int cukrausKiekis) {
        KavosProduktai.cukrausKiekis = cukrausKiekis;
    }

    public static void setPupeliuKiekis(int pupeliuKiekis) {
        KavosProduktai.pupeliuKiekis = pupeliuKiekis;
    }

    public static void setVandensKiekis(int vandensKiekis) {
        KavosProduktai.vandensKiekis = vandensKiekis;
    }

    void setKavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        KavosProduktai.cukrausKiekis = cukrausKiekis;
        KavosProduktai.pupeliuKiekis = pupeliuKiekis;
        KavosProduktai.vandensKiekis = vandensKiekis;
    }

    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimuSkaicius() {
        this.panaudojimuSkaicius = 0;
    }

    int papildytiVandens() {
        return vandensKiekis = Konstantos.VANDENS_PAPILDYMAS;
    }

    int papildytiPupeliu() {
        return pupeliuKiekis = Konstantos.PUPELIU_PAPILDYMAS;
    }

    int papildytiCukraus() {
        return cukrausKiekis = Konstantos.CUKRAUS_PAPILDYMAS;
    }

    void tikrinameArNereikiaKoNorsPapildyti() {
        if (vandensKiekis <= Konstantos.MINIMALUS_VANDENS_KIEKIS) {
            papildytiVandens();
            System.out.println("Pasiektas minimalus vandens kiekis: papildome vandeni");
        }
        if (pupeliuKiekis <= Konstantos.MINIMALUS_PUPELIU_KIEKIS) {
            papildytiPupeliu();
            System.out.println("Pasiektas minimalus pupeliu kiekis: papildome pupeles");
            if (cukrausKiekis <= Konstantos.MINIMALUS_CUKRAUS_KIEKIS) {
                papildytiCukraus();
                System.out.println("Pasiektas minimalus cukraus kiekis: papildome cukru");
            }
        }
    }

    void tikrinamePanaudojimuBusena() {
        if (panaudojimuSkaicius == Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA) {
            System.out.println("Atliekamas plovimas, nes panaudojai aparata " + panaudojimuSkaicius + " kartu");
            atliekamePlovima();
        }
        panaudojimuSkaicius++;
    }

    void isvalomeKavosAparatoProduktus() {
        cukrausKiekis = 0;
        vandensKiekis = 0;
        pupeliuKiekis = 0;
    }


    void atliekamePlovima() {
        panaudojimuSkaicius = 0;
    }

    void pranesameInformacijaPoKiekvienoPanaudojimo() {
        System.out.println("Likes vandens kiekis: " + KavosProduktai.vandensKiekis);
        System.out.println("Lines pupeliu kiekis: " + KavosProduktai.pupeliuKiekis);
        System.out.println("Likes cukraus kiekis: " + cukrausKiekis);
        System.out.println("Iki issiplovimo liko: " + (Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA - panaudojimuSkaicius));
    }

    void visiTikrinimaiIrPranesimai() {
        tikrinameArNereikiaKoNorsPapildyti();
        tikrinamePanaudojimuBusena();
        pranesameInformacijaPoKiekvienoPanaudojimo();
    }

    public  KavosPuodelis gaminaKava(String kavosPavadinimas) {
        //////////////////nuimk kavosPuodelio inicializacija null;
        KavosPuodelis kavosPuodelis = null;
        switch (kavosPavadinimas) {
            case "espresso":
                kavosPuodelis = new EspressoPuodelis();
                KavosProduktai isEspressoProduktai = kavosPuodelis.produktuKiekiai;
                ////////////////////
                setCukrausKiekis(cukrausKiekis - isEspressoProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isEspressoProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isEspressoProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "capucino":
                kavosPuodelis = new CapucinoPuodelis();
                KavosProduktai isCapucinoProduktai = kavosPuodelis.produktuKiekiai;
                setCukrausKiekis(cukrausKiekis - isCapucinoProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isCapucinoProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isCapucinoProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "latte":
                kavosPuodelis = new LattePuodelis();
                KavosProduktai isLatteProduktai = kavosPuodelis.produktuKiekiai;
                setCukrausKiekis(cukrausKiekis - isLatteProduktai.getCukrausKiekis());
                setPupeliuKiekis(pupeliuKiekis - isLatteProduktai.getPupeliuKiekis());
                setVandensKiekis(vandensKiekis - isLatteProduktai.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            default:
                System.out.println("Neturime tokio kavos tipo");
        }
        return kavosPuodelis;
    }

    public static KavosPuodelis gaminkKavaSuEnum(String kavosPavadinimas) {
        KavosPavadinimas kavosTipas = KavosPavadinimas.valueOf(kavosPavadinimas.toUpperCase());
        KavosPuodelis kavosPuodelis = kavosTipas.getKavosPuodelis();
        KavosProduktai kavosProduktai = kavosPuodelis.produktuKiekiai;
        setCukrausKiekis(cukrausKiekis - kavosProduktai.getCukrausKiekis());
        setPupeliuKiekis(pupeliuKiekis - kavosProduktai.getPupeliuKiekis());
        setVandensKiekis(vandensKiekis - kavosProduktai.getVandensKiekis());
        kavosPuodelis.arKavaPagaminta = true;
        return kavosPuodelis;
    }

    public static KavosPuodelis gaminkKavaSuMap(String kavosPavadinimas) {
        Map<String, KavosPuodelis> kavosPavadinimasKavosPuodelisMap = new HashMap<String, KavosPuodelis>();
        kavosPavadinimasKavosPuodelisMap.put("CAPUCINO", capucinoPuodelis);
        kavosPavadinimasKavosPuodelisMap.put("ESPRESSO", espressoPuodelis);
        kavosPavadinimasKavosPuodelisMap.put("LATTE", lattePuodelis);
        if (kavosPavadinimasKavosPuodelisMap.containsKey(kavosPavadinimas.toUpperCase())) {
            KavosPuodelis gautasPuodelis = kavosPavadinimasKavosPuodelisMap.get(kavosPavadinimas.toUpperCase());

            System.out.println("vandens kopija prie atimamnt " + KavosProduktai.gausKavosProduktuKopija().getVandensKiekis());

            KavosProduktai.mazinameKavosProduktusKavosAparateVisGaminantNaujaPuodeli(gautasPuodelis);

            System.out.println("vandens kopija po atimamnt " + KavosProduktai.gausKavosProduktuKopija().getVandensKiekis());

            ///????????????? kam man reikalinga Gaminant kav? ieškoti ar toks puodelis jau yra. Radus, pagaminti puodelio
          // ir produkt? kopij? bei perduoti gaminimui.

        } else {
            System.out.println("Nera tokios kavos pavadinimo, pasirink kita kava");
        }
        return null;
    }
}



