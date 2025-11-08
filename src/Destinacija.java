
public class Destinacija {
private String naziv;
private String drzava;
private double ocjena;
private float udaljenostKm;
private float brojPosjeta;
public Destinacija(String naziv, String drzava, double ocjena, float udaljenostKm, int brojPosjeta) {
	this.naziv = naziv;
	this.drzava = drzava;
	if(ocjena>0 && ocjena <11)this.ocjena = ocjena;
	else this.ocjena=0;
	this.udaljenostKm = udaljenostKm;
	this.brojPosjeta = brojPosjeta;
}
public String getNaziv() {
	return naziv;
}
public String getDrzava() {
	return drzava;
}
public double getOcjena() {
	return ocjena;
}
@Override
public String toString() {
	return "Destinacija [naziv=" + naziv + ", drzava=" + drzava + ", ocjena=" + ocjena + ", udaljenostKm="
			+ udaljenostKm + ", brojPosjeta=" + brojPosjeta + "]";
}
public float getUdaljenostKm() {
	return udaljenostKm;
}
public float getBrojPosjeta() {
	return brojPosjeta;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public void setDrzava(String drzava) {
	this.drzava = drzava;
}
public void setOcjena(int ocjena) {
	if(ocjena>0 && ocjena <11)this.ocjena = ocjena;
	else this.ocjena =0;
}
public void setUdaljenostKm(float udaljenostKm) {
	this.udaljenostKm = udaljenostKm;
}
public void setBrojPosjeta(int brojPosjeta) {
	this.brojPosjeta = brojPosjeta;
}

}
