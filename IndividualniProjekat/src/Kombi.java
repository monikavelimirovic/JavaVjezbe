
class Kombi extends Vozilo{
private int kapacitetPutnika;

public Kombi(String proizvodjac, int godina, int kubikaza, String boja,int kapacitet) {
	super(proizvodjac, godina, kubikaza, boja);
	kapacitetPutnika=kapacitet;}

public int getKapacitetPutnika() {
return kapacitetPutnika;
	}
public void setKapacitetPutnika(int kapacitetPutnika) {
	this.kapacitetPutnika = kapacitetPutnika;
	}

@Override
public double izracunajCijenuRegistracije() {
    double cijena = super.izracunajCijenuRegistracije();
    if (kapacitetPutnika>8)
        cijena += 30;
    return cijena;
}

@Override 
 
public void prikaziInfo() {
	super.prikaziInfo();
	System.out.print("Kapacitet putnika: " + kapacitetPutnika);
}


}
