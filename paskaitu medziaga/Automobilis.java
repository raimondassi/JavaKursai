package lt.vcs.andrius.pavyzdziai;

public class Automobilis {

    public static int sukurtuAutomobiliuSkaicius = 0;
    
    public static void kiekAutomobiliu(){
        System.out.println(sukurtuAutomobiliuSkaicius);
       
    }
    
    public boolean equals(Automobilis kitasAuto){
        if(this.gamintojas.equals(kitasAuto.getGamintojas())){
            return true;
        }
        return false;
    }

    private String spalva;
    private int ratuSkaicius;
    private String variklis;
    private String gamintojas;

    public Automobilis() {
        sukurtuAutomobiliuSkaicius++;
        gamintojas = "kazkoks automobilis";
    }

    public Automobilis(String gamintojas, int ratuSkaicius) {
        sukurtuAutomobiliuSkaicius++;
        this.gamintojas = gamintojas;
        this.ratuSkaicius = ratuSkaicius;
    }

    public void setRatuSkaicius(int ratuSkaicius){
        this.ratuSkaicius = ratuSkaicius;
    }
    
    public int getRatuSkaicius(){
        return this.ratuSkaicius;
    }
    
    public String getGamintojas(){
        return this.gamintojas;
    }

    public void gazuok() {
        System.out.println(gamintojas + " gazuoja!");
    }

    public void stabdyk() {
        System.out.println(gamintojas + " sustojo!");
    }

    public void keiskGamintoja(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public static void main(String[] args) {

    }
}
