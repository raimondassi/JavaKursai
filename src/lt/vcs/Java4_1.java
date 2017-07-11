package lt.vcs;

import java.util.Scanner;

/**
 * Created by ozc on 2017.07.11.
 */
public class Java4_1 {

    public static void main(String[] args) {


    }

    public static void tikrinameArSkaiciusLyginisArNe(){
            System.out.println("Iveskite skaiciu");
        Scanner scanner=new Scanner(System.in);
        int ivestasSkaicius=scanner.nextInt();
        if (ivestasSkaicius%2==0){
            System.out.println("Skaicius lyginis");}
        else {
            System.out.println("Skaicius nelyginis");
        }
        scanner.close();

    }

    public static void tikrinamePaskutiniSkaitmeni() {
        System.out.println("Iveskite skaiciu");
        Scanner scanner=new Scanner(System.in);
        int ivestasSkaicius=scanner.nextInt();
        switch(ivestasSkaicius%10){
            case 0:
                System.out.println("Paskutinis sk.: 0");
                break;
            case 1:
                System.out.println("Paskutinis sk.: 1");
                break;
            case 2:
                System.out.println("Paskutinis sk.: 2");
                break;
            case 3:
                System.out.println("Paskutinis sk.: 3");
                break;
            case 4:
                System.out.println("Paskutinis sk.: 4");
                break;
            case 5:
                System.out.println("Paskutinis sk.: 5");
                break;
            case 6:
                System.out.println("Paskutinis sk.: 6");
                break;
            case 7:
                System.out.println("Paskutinis sk.: 7");
                break;
            case 8:
                System.out.println("Paskutinis sk.: 8");
                break;
            case 9:
                System.out.println("Paskutinis sk.: 9");
                break;
        }
        scanner.close();
    }

    public static void pasakoKeliazenklisSkaiciusPaduotas(int paduotasSkaicius) {
        int  keliazenklisSkaicius=0;
        while(paduotasSkaicius>1){
            paduotasSkaicius=paduotasSkaicius/10;
            keliazenklisSkaicius++;
        }
        System.out.println("Skaicius yra: " + keliazenklisSkaicius + " zenklis");
    }
// ? keistai spausdina
    public static void atspausdinsKiekSkaiciuDalijasiIsDaliklio(int daliklis, int kiekSkaiciuAtspauzdinti) {
        int[] masyvas={1,5,9,8,7,1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,5,2,3};
        int[] rezultatuMasyvas= new int[kiekSkaiciuAtspauzdinti];
        int k=0;

            for (int i : masyvas) {
               if (masyvas[i]%daliklis==0) {
                   rezultatuMasyvas[k]= masyvas[i];
               k++;
               }

        }
        System.out.print("Naujas padalintas masyvas: ");
        for(int i:rezultatuMasyvas)
        System.out.print(rezultatuMasyvas[i]+" ");
    }

    public static void atspausdinaSkaiciusAtvirksciai(){
        Scanner scanner=new Scanner(System.in);

        scanner.close();
    }


}
