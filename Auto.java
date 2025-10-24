
public class Auto {
private String markaAuta;
private int godiste;
private int snagaMotora;
private boolean prodato;
private int kubikazaMotora;
private boolean registrovan;
private static int brojProdatih;

//konstruktor
public Auto() {
this.markaAuta = "";
this.godiste = 0;
this.snagaMotora= 0;
this.prodato = false;
this.kubikazaMotora =0;
this.registrovan = false;

}
public Auto(String markaa,int godiste,int snaga,boolean prodato, int kubikaza, boolean registrovan) {
	markaAuta = markaa;
	this.godiste = godiste;
	snagaMotora = snaga;
	this.prodato = prodato;
	kubikazaMotora = kubikaza;
	this.registrovan = registrovan;
	if(this.prodato)
		brojProdatih++;
	this.registrovan = godiste  < 1985 ? false : registrovan;
	
}
public String getMarkaAuta() {
	return markaAuta;
}
public int getGodiste() {
	return godiste;
}
public int getSnagaMotora() {
	return snagaMotora;
}
public boolean isProdato() {
	return prodato;
}
public int getKubikazaMotora() {
	return kubikazaMotora;
}
public boolean isRegistrovan() {
	return registrovan;
}
public static int getBrojProdatih() {
	return brojProdatih;
}


public void setMarkaAuta(String markaAuta) {
	this.markaAuta = markaAuta;
}
public void setGodiste(int godiste) {
	if (godiste >= 2025) {
		System.out.print("Nismo jos dosli do tu");
		
	}
}
public void setSnagaMotora(int snagaMotora) {
	this.snagaMotora = snagaMotora;
}
public void setProdato(boolean prodato) {
	this.prodato = prodato;
}
public void setKubikazaMotora(int kubikazaMotora) {
	this.kubikazaMotora = kubikazaMotora;
}
public void setRegistrovan(boolean registrovan) {
	this.registrovan = registrovan;
}
public static void setBrojProdatih(int brojProdatih) {
	Auto.brojProdatih = brojProdatih;
}

public static int brojProdatih() {
	return brojprodatih;
}

public boolean mozemoRegistrovati() {
	return godiste >= 1985;
}

public static double koeficijentZaGodiste(int god) {
	if (god < 1985) return 0.0;
	if (god <=2000) return 3.0;
	if (god<=2010) return 2.0;
	return 0.0;
	
}
public double cijenaRegistracije() {
	if(!mozemoRegistrovati()) return 0.0;
	
	return koeficijentZaGodiste(godiste) * kubikazaMotora * snagaMotora;
}

@Override
public String toString() {
	return String.format("Auto[marka=%s, godiste=%d, snaga=%.1f, " 
						+ "kubikaza=%1.f, registrovan=%s, prodato=%s,cijenaReg=%.2f] "
						,markaAuta, godiste, snagaMotora, kubikazaMotora, 
						registrovan ? "da" : "ne ",
								prodato ? "da": "ne", cijenaRegistracije());
}


}

