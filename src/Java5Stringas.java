import java.util.Scanner;

public class Java5Stringas {
	static void veiksmaiSuStringu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ivesk stringa: ");
		String ivedamasStringas = scanner.next();

		System.out.println("Stringo ilgis: "+ ivedamasStringas.length());
		System.out.println("Pirmo a indeksas: "+ ivedamasStringas.indexOf("a"));
		System.out.println("Paskutines a indeksas: "+ ivedamasStringas.lastIndexOf("a"));
		 System.out.println("Nuvalome tarpus visur: "+ ivedamasStringas.replace(" ", ""));
		System.out.println("Stkringas i didziasias: "+ ivedamasStringas.toUpperCase());
		System.out.println("Ar stringas baigiasi abc: "+ ivedamasStringas.endsWith("abc"));
		 System.out.println("Ar talpina teksta test viduje" +ivedamasStringas.valueOf("test"));
		 System.out.println(" pakeikciame abc i def" + ivedamasStringas.replace("abc", "def"));
		 System.out.println("teksto abc indeksas " +ivedamasStringas.indexOf("abc"));
		 System.out.println("tekso abc vieta: "+ ivedamasStringas);
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 

		scanner.close();
	}

}
