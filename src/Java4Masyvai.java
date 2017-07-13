import java.util.Scanner;


/**
 * Created by ozc on 2017.07.12.
 */
public class Java4Masyvai {
    //????????????????????????? Kodel negalima i switch paduoti boolean reiksmes? ir kodel neveikia tas i:pirmasMasyvas
    // nes switche negalime daryti palyginimu
    static void patikrinaArDuMasyvaiYraLygus() {
        Integer[] pirmasMasyvas = {1, 2, 3, 4, 5};
        Integer[] antrasMasyvas = {1, 2, 3, 4, 5};
        boolean arNelygusPagalReiksmes = false;

        boolean arLygusPagalIlgi = pirmasMasyvas.length == antrasMasyvas.length;
        if (arLygusPagalIlgi) {
            for (Integer i : pirmasMasyvas) /*(int i = 0; i < pirmasMasyvas.length; i++)*/ {
                if (pirmasMasyvas[i] != antrasMasyvas[i]) {
                    arNelygusPagalReiksmes = true;
/*
                switch (pirmasMasyvas[i]==antrasMasyvas[i]){
                    case true:
                        boolean arLygusPagalReiksmes=true;
                    case false:
                        boolean arNelygusPagalReiksmes=true;
*/
                }
            }
        }
            if (arLygusPagalIlgi && !arNelygusPagalReiksmes) {
                System.out.println("Masyvai lygus");
            } else {
                System.out.println("Masyvai nelygus");
            }
        }

    static void spausdinaKiekKokiuSkaiciuIvestaIkiMinus1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Iveskite skaiciu nuo -1 iki 10");
        int ivestasSkaicius=scanner.nextInt();
        String pilnasStringas="";

        while(ivestasSkaicius!=-1){
            pilnasStringas=pilnasStringas+" "+ ivestasSkaicius;
            System.out.println("Iveskite kita sk");
            ivestasSkaicius=scanner.nextInt();
        }
            System.out.println("Visas ivestas stringas" + pilnasStringas);

        scanner.close();

    }





    }


