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
    KavosProduktai kavosAparatoObjektoKavosProduktai;


    public static void suskaiciuosSukurtuAparatuSkaiciu() {
        System.out.println("Viso buvo sukurta: " + sukurtuKavosAparatuSkaicius);
    }


    public KavosAparatas() {
        sukurtuKavosAparatuSkaicius++;
        kavosAparatoObjektoKavosProduktai = new KavosProduktai(Konstantos.CUKRAUS_PAPILDYMAS, Konstantos.PUPELIU_PAPILDYMAS, Konstantos.VANDENS_PAPILDYMAS);
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
                KavosProduktai produktaiIsEspressoPuodelio = kavosPuodelis.kavosPuodelioObjektoKavosProduktai;
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoCukrausKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis() - produktaiIsEspressoPuodelio.getKavosProduktaiObjektoCukrausKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoPupeliuKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis() - produktaiIsEspressoPuodelio.getKavosProduktaiObjektoPupeliuKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoVandensKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis() - produktaiIsEspressoPuodelio.getKavosProduktaiObjektoVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "capucino":
                kavosPuodelis = new CapucinoPuodelis();
                KavosProduktai produktaiIsCapucinoPuodelio = kavosPuodelis.kavosPuodelioObjektoKavosProduktai;
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoCukrausKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis() - produktaiIsCapucinoPuodelio.getKavosProduktaiObjektoCukrausKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoPupeliuKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis() - produktaiIsCapucinoPuodelio.getKavosProduktaiObjektoPupeliuKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoVandensKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis() - produktaiIsCapucinoPuodelio.getKavosProduktaiObjektoVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            case "latte":
                kavosPuodelis = new LattePuodelis();
                KavosProduktai produktaiIsLattePuodelio = kavosPuodelis.kavosPuodelioObjektoKavosProduktai;
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoCukrausKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis() - produktaiIsLattePuodelio.getKavosProduktaiObjektoCukrausKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoPupeliuKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis() - produktaiIsLattePuodelio.getKavosProduktaiObjektoPupeliuKiekis());
                this.kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoVandensKiekis(this.kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis() - produktaiIsLattePuodelio.getKavosProduktaiObjektoVandensKiekis());
                kavosPuodelis.arKavaPagaminta = true;
                return kavosPuodelis;
            default:
                System.out.println("Neturime tokio kavos tipo");
        }
        return kavosPuodelis;
    }


    public KavosPuodelis gaminkKavaSuEnum(String kavosPavadinimas) {
        KavosPavadinimas kavosTipas = KavosPavadinimas.valueOf(kavosPavadinimas.toUpperCase());
        KavosPuodelis kavosPuodelis = kavosTipas.getKavosPuodelis();
        KavosProduktai kavosProduktai = kavosPuodelis.kavosPuodelioObjektoKavosProduktai;
        System.out.println("cukraus kiekis pries: " + kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis());
        kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoCukrausKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis() - kavosProduktai.getKavosProduktaiObjektoCukrausKiekis());
        kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoPupeliuKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis()-kavosProduktai.getKavosProduktaiObjektoPupeliuKiekis());
        kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoVandensKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis()-kavosProduktai.getKavosProduktaiObjektoVandensKiekis());

        System.out.println("cukraus kiekis po: " + kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis());
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
            System.out.println("cukraus kiekis pries: " + kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis());
            kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoCukrausKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis() - gautasPuodelis.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis());
            kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoPupeliuKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis() - gautasPuodelis.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoPupeliuKiekis());
            kavosAparatoObjektoKavosProduktai.setKavosProduktaiObjektoVandensKiekis(kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis() - gautasPuodelis.kavosPuodelioObjektoKavosProduktai.getKavosProduktaiObjektoVandensKiekis());
            System.out.println("cukraus kiekis po: " + kavosAparatoObjektoKavosProduktai.getKavosProduktaiObjektoCukrausKiekis());


        } else {
            System.out.println("Nera tokios kavos pavadinimo, pasirink kita kava");
        }
        return null;
    }
}



