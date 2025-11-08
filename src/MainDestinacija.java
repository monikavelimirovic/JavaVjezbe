import java.util.ArrayList;

public class MainDestinacija {
	public static void main(String[] args) {
		ArrayList<Destinacija> destinacije = new ArrayList<>();
		destinacije.add(new Destinacija("Pariz", "Francuska", 9.2, 10000, 12000));
		destinacije.add(new Destinacija("Beč", "Austrija", 8.5, 950, 8700));
		destinacije.add(new Destinacija("Istanbul", "Turska", 7.8, 1100, 6500));
		destinacije.add(new Destinacija("Kotor", "Crna Gora", 9.5, 90, 15000));
		destinacije.add(new Destinacija("Barcelona", "Španija", 8.9, 1700, 98000));
		destinacije.add(new Destinacija("Sarajevo", "BiH", 8.1, 300, 7200));
		
		sortiraPoOcjeni(destinacije);
		for(Destinacija d : destinacije) System.out.println(d);

	}

public static ArrayList<Destinacija> najboljeNajblizeDest(ArrayList<Destinacija>lista) {
	ArrayList<Destinacija> najbolja = new ArrayList<>();
	for(Destinacija x : lista) {
		if(x.getOcjena()>8.0 && x.getUdaljenostKm()<1000) 
	najbolja.add(x);
		}
	return najbolja;
	

}
public static Destinacija najveciBrojPosjeta(ArrayList<Destinacija>lista) {
	Destinacija najvece=null;
	float najbrojPos=0;
	for(Destinacija des : lista) {
		if(des.getBrojPosjeta()>najbrojPos) {
			najvece =des;
			najbrojPos=des.getBrojPosjeta();
		}
	}
	return najvece;
}

public static void sortiraPoOcjeni(ArrayList<Destinacija>lista){
	for(int i=0; i< lista.size()-1;i++) {
		for(int j =i+1;j<lista.size();j++) {
			if(lista.get(i).getOcjena()<lista.get(j).getOcjena()) {
				Destinacija temp = lista.get(i);
				lista.set(i,lista.get(j));
				lista.set(j, temp);
			}
		}
	}
}




}	
	





