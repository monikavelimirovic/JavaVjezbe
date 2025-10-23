import java.util.Scanner;

public class StringUKarakter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Unesite lista brojeva:");
	String brojevi = sc.nextLine();
	StringBuilder rez = new StringBuilder();
	 for (int i =0; i < brojevi.length();i++) {
		 char c = brojevi.charAt(i); //ovime uzimamo karakter iz stringa na poziciji i
		 int broj = Character.getNumericValue(c);
		 
		 if(broj %2==0) {
			 rez.append("1");
			 
		 }
		 else {
			 rez.append("0");
		 }
		 
	 }
	
System.out.print(rez.toString()); //moramo kod buildera da pretvorimo na kraju u string da bi stampali
	}

}
