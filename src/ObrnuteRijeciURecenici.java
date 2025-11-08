import java.util.Scanner;

/**
 Napisati program kojim se učitava rečenica. Štampati rečenicu sa obrnutim
redosledom karaktera u riječima. Primjer: Marko programira -> okraM arimargorp
 */
public class ObrnuteRijeciURecenici {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite recenicu:");
		String recenica=sc.nextLine();
		String[] rijeci = recenica.split(" ");
		StringBuilder rezultat = new StringBuilder();
		
		for(String rijec : rijeci) {
			StringBuilder obrnuto = new StringBuilder(rijec).reverse();
			rezultat.append(obrnuto);
			rezultat.append(" ");
			
			
		}
	System.out.print(rezultat.toString());	
	}
}
