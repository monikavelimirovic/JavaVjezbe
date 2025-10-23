import java.util.Scanner;
     private static boolean jeSamoglasnik(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Unesi string sa više riječi: ");
	        String tekst= scanner.nextLine();
	        int brojSamoglasnika = 0;
	        int brojSlova = 0;
	        for (int i = 0; i < input.length(); i++) {
	        char ch = tekst.charAt(i);
	        if(Character.isLetter(ch)) {
	        	brojSlova++;
	        	if(jeSamoglasnik(ch)) {
	        		brojSamoglasnika++;
	        		
	        	}
	        }
	        }

	        System.out.println("broj samoglasnika je: " + brojSamoglasnika);
	System.out.println("broj samoglasnika je: " +(brojSlova- brojSamoglasnika));
	}
}
