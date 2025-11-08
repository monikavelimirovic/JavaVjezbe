import java.util.ArrayList;
import java.util.Arrays;

"""
		Napisati funkciju longest_increasing koja ima jedan parametar i to input_array
(predstavlja niz cijelih brojeva), a nalazi najduži neopadajuću podniz pozitivnih
cijelih brojeva (brojevi veći od 0) i vraća taj niz.
Primjer: Input: {1, 2, 3, -1, 0, 5, 6, 7, 10, 10, 1} Output: {5, 6, 7, 10, 10]}
"""
public class LongestIncrising {

	public static void main(String[] args) {
		ArrayList<Integer> unos = new ArrayList<>(Arrays.asList(1, 2, 3, -1, 0, 5, 6, 7, 10, 10, 1));
		System.out.print(longestInc(unos));

	}
public static ArrayList<Integer> longestInc( ArrayList<Integer> x) {
	ArrayList<Integer> trenutna = new ArrayList<>();
	ArrayList<Integer> najduza = new ArrayList<>();
	
	for(int i =0;i<x.size()-1;i++) {
		  int broj = x.get(i);
		if(x.get(i) < x.get(i+1)) {
			trenutna.add(x.get(i),x.get(i+1));
		}
		else if(trenutna.size()>najduza.size()) {
			najduza.clear();
			najduza.addAll(trenutna);
		}
		else trenutna.clear();	
	
	}
	return najduza;
}
}
