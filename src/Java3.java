

import java.util.Scanner;

public class Java3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

		/*
		 * //pirma uzduotis System.out.println("Iveskite koki skaiciu"); int
		 * skaiciusIvestas=scanner.nextInt();
		 *
		 * System.out.println("Jusu ivestas skacius: " + skaiciusIvestas);
		 *
		 *
		 * //anta uzduotis System.out.println("Iveskiet pirma skaiciu:"); int
		 * pirmasSkaicius=scanner.nextInt();
		 * System.out.println("Iveskite antra skaicius:"); int antrasSkaicius=
		 * scanner.nextInt();
		 *
		 * System.out.println("Sudetu skaiciu suma: "+ sudedameSkaicius(pirmasSkaicius,
		 * antrasSkaicius));
		 */

        // trecia uzduotis

		/*
		 * System.out.println("Iveskite stringa1: ");
		 *
		 * String stringas=scanner.next(); System.out.println("Iveskite stringa2: ");
		 * String stringas2=scanner.next(); System.out.println(" Ivestas stringas: " +
		 * stringas+ " " + stringas2);
		 */

        // ketvirta uzduotis
		/*
		 * System.out.println("Iveskite skaiciu: "); int ivestasSkaicius=
		 * scanner.nextInt(); if (ivestasSkaicius<0) {
		 * System.out.println("Ivestas neigiamas skaicius"); }
		 */
		/*
		 * System.out.println("Iveskite zmogaus amziu: "); int balsavimoSkaicius =
		 * scanner.nextInt(); if (balsavimoSkaicius > 0 && balsavimoSkaicius < 100) {
		 * System.out.println("sis asmuo gali balsuoti"); } else if (balsavimoSkaicius >
		 * 100) { System.out.println("Ivedetas zmogaus amziu yrs daugiau nei 100"); }
		 * else if(balsavimoSkaicius<0) {
		 * System.out.println("Ivestas skaicius yra neigiamas");}
		 */

        // penkta uzduotis

		/*
		 * System.out.println("Iveskite skaiciu :"); int
		 * ketvirtosUzduotiesSkaicius=scanner.nextInt();
		 *
		 * if (ketvirtosUzduotiesSkaicius<0) {
		 * System.out.println("Ivestas neigiamas skaicius");} else if
		 * (ketvirtosUzduotiesSkaicius>100) {
		 * System.out.println("Ivestas skaicius daugiau uz 100");
		 *
		 * } else if(ketvirtosUzduotiesSkaicius>40 && ketvirtosUzduotiesSkaicius<60) {
		 * System.out.println("Ivestas skaicius yra tarp 40 ir 60"); } else {
		 * System.out.println("tiesiog ivesta belekas"); }
		 */

        // ciklu uzduotys
        // pirma uzduotis
		/*
		 * for(int i=0;i<5;i++) { System.out.println("Hello world"); }
		 */
        // antra uzduotis

		/*
		 * System.out.println("Iveskite skaiciu kiek kartu spausdinti si teksta: "); int
		 * antraUzduotisSkaicius=scanner.nextInt(); for (int i=0;
		 * i<antraUzduotisSkaicius; i++) { System.out.println("Hello world"); }
		 */
        // trecia zuduotis
		/*
		 * for (int i=1; i<=50; i++) { System.out.print(" " + i); }
		 */
        // ketvirta uzduotis
		/*
		 * int ketvirtaSuma=0; for (int i=1; i<=100; i++) { ketvirtaSuma=ketvirtaSuma+i;
		 * if (i==100) { System.out.println("suma visu skaiciu: " + ketvirtaSuma);} }
		 */
        // penkta uzduotis
		/*
		 * int i=0; int penktaSuma=0; while (i<=100) { i++; penktaSuma=penktaSuma+i; if
		 * (i==100) { System.out.println("viso suma: " + penktaSuma); } }
		 *
		 */
        // sesta uzduotis
		/*
		 * int i=0; int sestaSuma=0; do { i++; sestaSuma=sestaSuma+i; if (i==100) {
		 * System.out.println("visu skaiciu suma: " + sestaSuma); } } while(i<=100) ;
		 */

        // masyvai

        int masyvas[] = { 1, 2, 5, 8, 9, 78, 12, 45, 125 };
        int masyvoSuma = 0;

        // pirma-antra uzduotis
		/*
		 * for (int i=0;i<=masyvas.length-1;i++) { System.out.println("masyvo narys "+i+
		 * " su reiksme: " + masyvas[i]); masyvoSuma=masyvoSuma+masyvas[i]; if
		 * (i==masyvas.length-1) { System.out.println("masyvo suma: " + masyvoSuma); } }
		 *
		 */

        // trecia uzduotis

        System.out.println("Naujas masyvas ");
        int masyvas2[] = new int[10];
        for (int i = 0; i <= masyvas.length - 1; i++) {
            masyvas2[i] = masyvas[i];
            System.out.print(masyvas2[i] + " ");
            String masyvasStringe = masyvas2.toString();
        }

        // ketvirta uzduotis

        int masyvas5[] = new int[5];
        System.out.println("Iveskite 5 skaicius");
        for (int i = 0; i <= masyvas5.length - 1; i++) {
            masyvas5[i] = scanner.nextInt();
        }
        System.out.println("Pilnas masyvas: ");
        for (int i = 0; i <= masyvas5.length - 1; i++) {
            System.out.print(masyvas5[i] + " ");
        }

        // sesta uzduotis

        System.out.println("Iveskite masyvo dydi: ");
        int masyvoskaicius = scanner.nextInt();
        int reikalingasMasyvas[] = new int[masyvoskaicius];
        int masyvas5Suma = 0;
        System.out.println("Iveskite" + masyvoskaicius + " skaicius uzpildyti masyva");
        for (int i = 0; i <= reikalingasMasyvas.length - 1; i++) {
            reikalingasMasyvas[i] = scanner.nextInt();
            masyvas5Suma = masyvas5Suma + reikalingasMasyvas[i];
        }
        System.out.println("Ivestas masyvas: ");
        // kodel sitas neveikia? for (int i:reikalingasMasyvas) {
        for (int i = 0; i <= reikalingasMasyvas.length - 1; i++) {
            System.out.print(reikalingasMasyvas[i] + " ");
        }
        System.out.println("");
        System.out.println("Visu masyvo nariu " + "suma: " + masyvas5Suma);
        scanner.close();

    }

    public static int sudedameSkaicius(int x, int y) {
        int sudetasSkaicius = x + y;
        return sudetasSkaicius;
    }

    public static void surusiuotiBurbulu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masyva, kuri surusiuosime");
        int masyvoSkaicius=scanner.nextInt();
        int ivestasMasyvas[]=new int[masyvoSkaicius];


        scanner.close();


    }

}

