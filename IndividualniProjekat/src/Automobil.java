class  Automobil extends Vozilo{
	private int brojVrata;
	private String tipMotora;
	
	
	public Automobil(String proizvodjac, int godina, int kubikaza, String boja, int brojVrata, String tip ) {
		super(proizvodjac, godina, kubikaza, boja);
		this.brojVrata = brojVrata;
		tipMotora = tip;
	
	}
	public int getBrojVrata() {
		return brojVrata;
	}
	public String getTipMotora() {
		return tipMotora;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}
	
@Override
 public double izracunajCijenuRegistracije() {
    double cijena = super.izracunajCijenuRegistracije();
 if (tipMotora.equalsIgnoreCase("dizel"))
    cijena += 20;
    return cijena;
    }
	
@Override
public void prikaziInfo() {
    super.prikaziInfo();
    System.out.println("Broj vrata: " + brojVrata+"Tip motora: " + tipMotora+ "Ukupna cijena registracije: " + izracunajCijenuRegistracije() + " EUR\n");
   
}
}
	


