
public enum Studenti {
	MONIKA_VELIMIROVIC(10, 10, 10),
	MILICA_MILIC(9, 9, 8),
	IVAN_DJURISIC(10, 7, 9),
	JOVANA_JOVANOVIC(6, 8, 7),
	JOVANA_LJEPAVIC(6, 7, 10);
	
private final int ocjena1;

private final int ocjena2;

private final int ocjena3;
	
Studenti(int ocjena1, int ocjena2, int ocjena3) {
this.ocjena1 = ocjena1;
this.ocjena2 = ocjena2;
this.ocjena3 = ocjena3;
	}

	public double prosjek() {
	return (ocjena1 + ocjena2 + ocjena3) / 3.0;
	}

	@Override
	public String toString() {
String ime = this.name().replace("_", " ");
return ime.charAt(0) + ime.substring(1).toLowerCase();

}
