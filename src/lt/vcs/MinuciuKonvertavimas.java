package lt.vcs;

import java.util.Scanner;

/**
 * Created by ozc on 2017.07.11.
 */
public class MinuciuKonvertavimas {

    public static void konvertuojaIsMinuciuIValandasMinutesSekundes() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Iveskite minutes");
        int ivestosMinutes=scanner.nextInt();
        int dienos=ivestosMinutes/1440;
        int valandos=ivestosMinutes%1440/60;
        int minutes=ivestosMinutes%1440%60;
        System.out.println(" Is ivestu minuciu gaunasi: dienos: "+ dienos+" valandos: "+valandos+" minutes: "+minutes );
        scanner.close();

    }
}
