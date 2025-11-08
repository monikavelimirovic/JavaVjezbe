
public class Film {
private String naziv;
private String zanr;
private double ocjena;
private int trajanjeMin;

public Film() {
	naziv = "";
	zanr="";
    ocjena= 0.0;
    trajanjeMin =0;
}
public Film(String naziv, String zanr, double ocjena, int trajanjeMin) {
	this.naziv = naziv;
	this.zanr = zanr;
	this.ocjena = ocjena;
	this.trajanjeMin = trajanjeMin;
}


public String getNaziv() {
	return naziv;}
public String getZanr() {
	return zanr;}
public double getOcjena() {
	return ocjena;}
public int getTrajanjeMin() {
	return trajanjeMin;}


public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public void setZanr(String zanr) {
	this.zanr = zanr;
}
public void setOcjena(double ocjena) {
	this.ocjena = ocjena;
}
public void setTrajanjeMin(int trajanjeMin) {
	this.trajanjeMin = trajanjeMin;
}
@Override
public String toString() {
	return "Film [naziv = " + naziv + ", zanr= " + zanr + ", ocjena= " + ocjena + ", trajanjeMin = " + trajanjeMin + "]";
}
}
