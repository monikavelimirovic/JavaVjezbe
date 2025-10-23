import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Unesite tekst da provjerite da li je palindrom: ");
       String tekst = sc.nextLine().trim();
       String okrenutTekst = new StringBuilder(tekst).reverse().toString();
       System.out.print(tekst.equalsIgnoreCase(okrenutTekst));
       sc.close();
    }


}
