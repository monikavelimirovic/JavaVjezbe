import java.util.Scanner;

public class Broker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite kupovine i prodaje brokera(S za prodaju i B za kupovinu): ");
		String str = sc.nextLine();
		String[] djelovi = str.trim().split("\\s+");
		int rezultat = 0;
      for (String el:djelovi) {
    	  char tip =  el.charAt(0); //da vidimo koji je tip
    	  int cifra = Integer.parseInt(el.substring(1)); //sad pretvaramo broj posle stringa u  u br
    	  if(tip == 'S'|| tip=='s') {
    		  rezultat +=cifra;
    	  }
    	  else rezultat -=cifra;
      }
System.out.print("Stanje brokera je: " + rezultat + "$");	}

}
