import java.util.Scanner;

public class DvaUzastopnaSlova {

	public static void main(String[] args) {
		// Dat je string u kojem se neka dva uzastopna slova ponavljaju. Pronaći koja su to slova.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string:");
		String tekst=sc.nextLine();
		boolean nadjeno = false;
		for(int i = 0;i<tekst.length()-1;i++) {
			if(tekst.charAt(i)==tekst.charAt(i+1)) {
				System.out.print("Nadjena su dva ista karaktera '"+ tekst.charAt(i)+ "' na indeksnoj lokaciji "+ i + " i " + (i+1) );
				nadjeno = true;
			}
		}

	if(!nadjeno) System.out.print("Nema duplikata");}

}
