import java.util.Scanner;

/**
 Dat je string sastavljen od karaktera 0 i 1. Karakter 0 predstavlja slobodno polje, a 1
predstavlja zauzeto polje. Vaš zadatak je da za zadatu poziciju u stringu provjerite da
li su susjedna polja slobodna (lijevo i desno). Napomena: za prvo polje gledate same
desno polje, za poslednje polje samo lijevo polje, a za ostala i lijevo i desno polje. Npr.
ako je string 01010, a zadata pozicija 2 (indeksiranje kreće od nule), treba štampati 0
jer nema slobodnih polja.
 */
public class SlobodnaPolja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String unos= sc.nextLine();
		int pozicija= sc.nextInt();
		if(pozicija<0 || pozicija> unos.length()) { 
			System.out.print("Neispravan unos!");
			return;}
		boolean slobodno = false;
		if (pozicija ==0) {
			slobodno =(unos.charAt(1)=='0');
		}
		else if(pozicija==unos.length()-1) {
			slobodno = (unos.charAt(unos.length()-2)=='0');
		}else {
			if(unos.charAt(pozicija-1)=='0'||unos.charAt(pozicija+1)=='0') slobodno = true;
		}
	System.out.print(slobodno? 1:0);}
}

