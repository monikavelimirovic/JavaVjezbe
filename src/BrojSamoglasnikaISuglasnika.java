import java.util.Scanner;

public class BrojSamoglasnikaISuglasnika {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite rijec:");
		String unos = sc.nextLine();
		int brojSam = brojSamoglasnika(unos);
		int brojSug = unos.length() - brojSam;
		System.out.printf("Broj samoglasnika u rijeci je %d a suglasnika %d",brojSam,brojSug);
		

	}

	private static int brojSamoglasnika(String x) {
		x = x.toLowerCase();
		String samoglasnici = "aeiou";
		int brojSam= 0;
				for(int i = 0;i<x.length();i++) {
					if(samoglasnici.indexOf(x.charAt(i))!= -1) {
						brojSam++;
					}
				}
		
		return brojSam ;
	}

}
