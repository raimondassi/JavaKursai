package KavosAparatas;
//import static KavosAparatas.KavosProduktai.*;

import KavosAparatas.KavosPuodeliai.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosAparatas {
    int panaudojimuSkaicius;
    static int sukurtuKavosAparatuSkaicius;
    KavosProduktai kavosProduktuKiekis;

    public static void suskaiciuosSukurtuAparatuSkaiciu() {
        System.out.println("Viso buvo sukurta: " + sukurtuKavosAparatuSkaicius);
    }

    public KavosAparatas() {
        sukurtuKavosAparatuSkaicius++;
        kavosProduktuKiekis = new KavosProduktai(Konstantos.CUKRAUS_PAPILDYMAS, Konstantos.PUPELIU_PAPILDYMAS, Konstantos.VANDENS_PAPILDYMAS);
    }


    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimuSkaicius() {
        this.panaudojimuSkaicius = 0;
    }


    void tikrinamePanaudojimuBusena() {
        if (panaudojimuSkaicius == Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA) {
            System.out.println("Atliekamas plovimas, nes panaudojai aparata " + panaudojimuSkaicius + " kartu");
            atliekamePlovima();
        }
        panaudojimuSkaicius++;
    }

    void pranesameInformacijaApiePanaudijimuSkaiciuPoKiekvienoPanaudojimo() {
        System.out.println("Iki issiplovimo liko: " + (Konstantos.PANAUDOJIMO_SKAICIAUS_KONSTANTA - panaudojimuSkaicius));
    }


    void atliekamePlovima() {
        panaudojimuSkaicius = 0;
    }


    public KavosPuodelis gaminaKava(String kavosPavadinimas) {

        KavosPuodelis kavosPuodelis;
        switch (kavosPavadinimas) {
            case "espresso":
                kavosPuodelis = new EspressoPuodelis();
                KavosProduktai isEspressoProduktai = kavosPuodelis.produktuKiekiai;
                this.kavosProduktuKiekis.setCukrausKiekis(this.kavosProduktuKiekis.getCukrausKiekis() - kavosPuodelis.produktuKiekiai.getCukrausKiekis());
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

    public KavosPuodelis gaminkKavaSuMap(String kavosPavadinimas) {
        Map<String, KavosPuodelis> kavosPavadinimasKavosPuodelisMap = new HashMap<String, KavosPuodelis>();
        kavosPavadinimasKavosPuodelisMap.put("CAPUCINO", capucinoPuodelis);
        kavosPavadinimasKavosPuodelisMap.put("ESPRESSO", espressoPuodelis);
        kavosPavadinimasKavosPuodelisMap.put("LATTE", lattePuodelis);
        if (kavosPavadinimasKavosPuodelisMap.containsKey(kavosPavadinimas.toUpperCase())) {
            KavosPuodelis gautasPuodelis = kavosPavadinimasKavosPuodelisMap.get(kavosPavadinimas.toUpperCase());


            //  System.out.println("vandens kopija prie atimamnt " + KavosProduktai.gausKavosProduktuKopija().getVandensKiekis());

            //KavosProduktai.mazinameKavosProduktusKavosAparateVisGaminantNaujaPuodeli(gautasPuodelis);

            //  System.out.println("vandens kopija po atimamnt " + KavosProduktai.gausKavosProduktuKopija().getVandensKiekis());

            ///????????????? kam man reikalinga Gaminant kav? ie�koti ar toks puodelis jau yra. Radus, pagaminti puodelio
            // ir produkt? kopij? bei perduoti gaminimui.

        } else {
            System.out.println("Nera tokios kavos pavadinimo, pasirink kita kava");
        }
        return null;
    }
}



