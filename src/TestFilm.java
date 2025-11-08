import java.util.ArrayList;

public class TestFilm {

	public static void main(String[] args) {
		ArrayList<Film> filmovi = new ArrayList<>();
		
		filmovi.add(new Film("Inception", "sci-fi", 9.0, 148));
		filmovi.add(new Film("The Godfather", "drama", 9.2, 175));
		filmovi.add(new Film("Parasite", "thriller", 8.6, 132));
		filmovi.add(new Film("Spirited Away", "animation", 8.5, 125));
		filmovi.add(new Film("The Dark Knight", "action", 9.0, 152));
		filmovi.add(new Film("Amélie", "romance", 8.3, 122));
		filmovi.add(new Film("Interstellar", "sci-fi", 8.6, 169));
		filmovi.add(new Film("Whiplash", "drama", 8.5, 107));
		filmovi.add(new Film("Mad Max: Fury Road", "action", 8.1, 120));
		filmovi.add(new Film("Her", "romance", 8.0, 126));

		System.out.printf("%.2f",prosjecnaOcjena(filmovi));
	}
public static Film najduziFilm(ArrayList<Film> lista) {
	Film najduzi = null;
	int duzina =0;
	for(Film l:lista) {
		if(l.getTrajanjeMin()>duzina) {
			najduzi = l;
			duzina = l.getTrajanjeMin();
		}
	}
	return najduzi;}

public static ArrayList<Film> filmoviPoZanru(ArrayList<Film> lista,String zanr){
	ArrayList<Film> filmovi = new ArrayList<>();
	for(Film l : lista) {
		if(l.getZanr().contains(zanr)) {
			filmovi.add(l);
		}
	}
	return filmovi;
}

public static double prosjecnaOcjena(ArrayList<Film> lista) {
	double zbir = 0.0;
	int ukupanBr = lista.size();
	for(Film l:lista ) {
		zbir+=l.getOcjena();}
    double prosjek = zbir/ukupanBr;
    return prosjek;
}


}
