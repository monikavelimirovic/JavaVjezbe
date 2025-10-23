import java.util.ArrayList;
import java.util.Scanner;

public class Parnineg {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Unesite duzinu niza: ");
int duzina = sc.nextInt();
int[] niz= new int[duzina];
ArrayList<Integer> parneg = new ArrayList<>();
for (int i=0; i < duzina;i++) {
System.out.printf("Unesite %d element niza: ",i+1);
niz[i] = sc.nextInt();
 if(niz[i]<0 && niz[i]%2==0) {
	 parneg.add(niz[i]);
 }

}
for(int broj : parneg) {
	System.out.println(broj);
}



	
sc.close()	;
	}
}
