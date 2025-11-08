import java.util.ArrayList;

/**
 Ulaz je niz etiketa spojenih zarezima i tarabama, npr.
"AI,urgent,#students,#aiClub,research,#hpc,UDG,#Students".
Napisati metodu koja treba da vrati uređenu listu/niz jedinstvenih hashtagova
(samo one koje počinju sa #), bez duplikata i bez razlike malih/velikih slova,
spojenu nazad u string odvojen zarezom (npr. "#ai","#students","#hpc").
Ostatak riječi ignoriši.	
	
 */
public class StringStudent {

	public static void main(String[] args) {
		String etikete = "AI,urgent,#students,#aiClub,research,#hpc,UDG,#Students";
     String [] etiketa = etikete.split(",");
    System.out.println(uredjeniHashtagovi(etiketa));
	}
 public static ArrayList<String> uredjeniHashtagovi(String [] niz){
	 ArrayList<String> filtriranaLista = new ArrayList<>();
	 for(int i = 0;i<niz.length;i++) {
		 if(niz[i].startsWith("#") && !filtriranaLista.contains(niz[i])) {
			 filtriranaLista.add(niz[i]);
		 }
	 }
	 
 return filtriranaLista;}
}
