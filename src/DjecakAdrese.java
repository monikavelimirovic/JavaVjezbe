import java.util.ArrayList;
import java.util.Scanner;

public class DjecakAdrese {

	public static void main(String[] args) {
		int zbirPrijeNule = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		int[] niz= new int[duzina];
		
		for (int i=0; i < duzina;i++) {
		System.out.printf("Unesite %d element niza: ",i+1);
		niz[i] = sc.nextInt();
		 
		 }
		for (int i=0; i < duzina;i++) {
			if(niz[i] != 0) {
			 zbirPrijeNule += niz[i];
		 }
		 else {
			 System.out.printf("Zbir brojeva prije nego sto je naisao na 0 je:%d ",zbirPrijeNule);	}
		
		}}
	

}
