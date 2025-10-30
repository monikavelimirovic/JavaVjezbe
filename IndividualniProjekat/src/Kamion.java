
class Kamion extends Vozilo{
private int kapacitet;
private boolean imaPrikolicu;
	

public Kamion(String proizvodjac, int godina, int kubikaza, String boja, int kapacitet,boolean ima) {
		super(proizvodjac, godina, kubikaza, boja);
		this.kapacitet = kapacitet;
		imaPrikolicu = ima;
	}

public int getKapacitet() {
	return kapacitet;
}
public boolean isImaPrikolicu() {
	return imaPrikolicu;
}

public void setKapacitet(int kapacitet) {
	this.kapacitet = kapacitet;
}
public void setImaPrikolicu(boolean imaPrikolicu) {
	this.imaPrikolicu = imaPrikolicu;
}


@Override
public double izracunajCijenuRegistracije() {
    double cijena = super.izracunajCijenuRegistracije();
    if (imaPrikolicu)
        cijena += 50;
    return cijena;
}

@Override
public void prikaziInfo() {
    super.prikaziInfo();
    System.out.println("Kapacitet tereta: " + kapacitet+ " t" + "Ima prikolicu: " + (imaPrikolicu ? "da" : "ne") +"Ukupna cijena registracije: " + izracunajCijenuRegistracije() + " EUR\n");

}








}


}
