import java.util.ArrayList;


public class Testiranje {

	public static void main(String[] args) {
		  ArrayList<Vozilo> vozila = new ArrayList<>();
	        vozila.add(new Automobil("Audi", 2008, 2200, "crna", 5, "dizel"));
	        vozila.add(new Kamion("Volvo", 2015, 3000, "bela", 12, true));
	        vozila.add(new Kombi("Mercedes", 2020, 1800, "siva", 9));
	        vozila.add(new Automobil("Toyota", 2018, 1600, "crvena", 3, "benzin"));

	     
	}

}
