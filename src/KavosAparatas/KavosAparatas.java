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
        KavosPuodelis kavosPuodelis = null;
        switch (kavosPavadinimas) {
            case "espresso":
                kavosPuodelis = new EspressoPuodelis();
                KavosProduktai produktaiIsEspressoPuodelio = kavosPuodelis.produktuKiekiai;
                this.kavosProduktuKiekis.setCukrausKiekis(this.kavosProduktuKiekis.getCukrausKiekis() - produktaiIsEspressoPuodelio.getCukrausKiekis());
                this.kavosProduktuKiekis.setPupeliuKiekis(this.kavosProduktuKiekis.getPupeliuKiekis() - produktaiIsEspressoPuodelio.getPupeliuKiekis());
                this.kavosProduktuKiekis.setVandensKiekis(this.kavosProduktuKiekis.getVandensKiekis() - produktaiIsEspressoPuodelio.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "capucino":
                kavosPuodelis = new CapucinoPuodelis();
                KavosProduktai produktaiIsCapucinoPuodelio = kavosPuodelis.produktuKiekiai;
                this.kavosProduktuKiekis.setCukrausKiekis(this.kavosProduktuKiekis.getCukrausKiekis() - produktaiIsCapucinoPuodelio.getCukrausKiekis());
                this.kavosProduktuKiekis.setPupeliuKiekis(this.kavosProduktuKiekis.getPupeliuKiekis() - produktaiIsCapucinoPuodelio.getPupeliuKiekis());
                this.kavosProduktuKiekis.setVandensKiekis(this.kavosProduktuKiekis.getVandensKiekis() - produktaiIsCapucinoPuodelio.getVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "latte":
                kavosPuodelis = new LattePuodelis();
                KavosProduktai produktaiIsLattePuodelio = kavosPuodelis.produktuKiekiai;
                this.kavosProduktuKiekis.setCukrausKiekis(this.kavosProduktuKiekis.getCukrausKiekis() - produktaiIsLattePuodelio.getCukrausKiekis());
                this.kavosProduktuKiekis.setPupeliuKiekis(this.kavosProduktuKiekis.getPupeliuKiekis() - produktaiIsLattePuodelio.getPupeliuKiekis());
                this.kavosProduktuKiekis.setVandensKiekis(this.kavosProduktuKiekis.getVandensKiekis() - produktaiIsLattePuodelio.getVandensKiekis());
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
        kavosProduktai.setCukrausKiekis(kavosProduktai.getCukrausKiekis() - kavosTipas.kavosPuodelis.produktuKiekiai.getCukrausKiekis());
        kavosProduktai.setPupeliuKiekis(kavosProduktai.getPupeliuKiekis() - kavosTipas.kavosPuodelis.produktuKiekiai.getPupeliuKiekis());
        kavosProduktai.setVandensKiekis(kavosProduktai.getVandensKiekis() - kavosTipas.kavosPuodelis.produktuKiekiai.getVandensKiekis());
        kavosPuodelis.arKavaPagaminta = true;
        return kavosPuodelis;
    }


    public KavosPuodelis gaminkKavaSuMap(String kavosPavadinimas) {
        Map<String, KavosPuodelis> kavosPavadinimasKavosPuodelisMap = new HashMap<String, KavosPuodelis>();
        kavosPavadinimasKavosPuodelisMap.put("CAPUCINO", new CapucinoPuodelis());
        kavosPavadinimasKavosPuodelisMap.put("ESPRESSO", new EspressoPuodelis());
        kavosPavadinimasKavosPuodelisMap.put("LATTE", new LattePuodelis());
        if (kavosPavadinimasKavosPuodelisMap.containsKey(kavosPavadinimas.toUpperCase())) {
            KavosPuodelis gautasPuodelis = kavosPavadinimasKavosPuodelisMap.get(kavosPavadinimas.toUpperCase());

            kavosPuodelis.produktuKiekiai.setCukrausKiekis(kavosPuodelis.produktuKiekiai.getCukrausKiekis()-gautasPuodelis.produktuKiekiai.getCukrausKiekis());

            

            System.out.println("");

        } else {
            System.out.println("Nera tokios kavos pavadinimo, pasirink kita kava");
        }
        return null;
    }
}



