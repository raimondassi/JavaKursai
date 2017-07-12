/**
 * Created by ozc on 2017.07.12.
 */
public class Java4DvigubiCiklai {

    static void atspausdinsStaciakampiPagalIvestusParametrus(int ilgis, int aukstis){
      int i=0;
        String simbolis="#";
        while (i<aukstis) {
            System.out.println("");
            int k=0;
            while (k < ilgis) {
                System.out.print(simbolis);
                k++;
            }
            i++;
        }
    }

    static void atspausdinsPrasikeiciantiStaciakampiPagalIvestusParametrus(int ilgis, int aukstis){
        int i=0;
        String simbolis="#";
        while (i<aukstis) {
            System.out.println("");
            if (i%2==0){
                System.out.print("  ");}
            int k=0;
            while (k < ilgis) {
                System.out.print(simbolis);
                k++;
            }
            i++;
        }
    }
}
