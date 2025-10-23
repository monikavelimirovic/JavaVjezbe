import java.util.Scanner;

public class IzStringaRijeci {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Unesi rečenicu: ");
     String recenica = sc.nextLine();
     String[] rijeci = recenica.trim().split("\\s+");
//trim uklanja na pocetku i na kraju rezultat mi je niz stringova - \\s znači "bilo koji razmak" plus jedan zbog dodate rijeci

     System.out.println("Broj riječi u rečenici je: " + rijeci.length);
     


	}

}
