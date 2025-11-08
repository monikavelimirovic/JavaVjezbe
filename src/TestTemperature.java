import java.util.ArrayList;
import java.util.Scanner;

public class TestTemperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj temperatura koji zelite da unesete");
		double []temperature = new double[sc.nextInt()];
		for (int i = 0;i<temperature.length;i++) {
			System.out.println("Unesite " +(i+1)+" temperaturu:");
			temperature[i] =sc.nextDouble();
		}
		System.out.println("duzina niza je "+ temperature.length);
		for (int i = 0;i<temperature.length;i++) {
			System.out.print(temperature[i]+" ");
		}
		
		System.out.println("Unesite koju temperaturu zelite da obriste");
		ArrayList<Double> novaLista = new ArrayList<>();
		double temp = sc.nextDouble();
		for(int i =0;i<temperature.length;i++) {
			
		if (temperature[i]!=temp) {
			novaLista.add(temperature[i]);
		}
	}for(double l:novaLista) {
		System.out.print(l + " ");
}
	double prosjek = prosjecnaTemp(temperature);
	System.out.printf("%.2f",prosjek);
} 
	public static double prosjecnaTemp(double []temperature) {
	double zbir = 0.0;
	int brojTemp = temperature.length;
	for(int i = 0;i<brojTemp;i++) {
		zbir += temperature[i];
		
	}
     return (zbir/brojTemp);}
}
