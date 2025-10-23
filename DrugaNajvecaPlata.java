import java.util.Arrays;

public class DrugaNajvecaPlata {

	public static void main(String[] args) {
		int[] plate = {540, 690, 900};//moze naravno i sa unosom korisnika ali j malo duzi kod
Arrays.sort(plate); 
int drugaNajveca = plate[plate.length - 2];
System.out.println("Druga najveća plata je: " + drugaNajveca);
		}
	}


