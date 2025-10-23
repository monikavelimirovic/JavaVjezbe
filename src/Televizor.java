
public class Televizor {
	//pravim atribute
private int brojKanala;
private String imeKanala;
private int jacinaTona;
 //konstruktor
public Televizor(int brojKanala, String imeKanala, int jacinatona) {
	if (brojKanala >= 1) {
		this.brojKanala = brojKanala;
	}
	else {
		this.brojKanala = 1;
	}
	this.imeKanala = imeKanala;
	if (jacinatona > 0 || jacinatona < 11) {
		this.jacinaTona = jacinatona;
	}
	else {
		jacinaTona = 1;
	}
}
public int uzmiBrojKanala() {
	return brojKanala;
}

public String uzmiImeKanala() {
	return imeKanala;
}

public int uzmitJacinaTona() {
	return jacinaTona;
}
public void postJacinaTona(int jacinaTona) {
	if(jacinaTona > 0 || jacinaTona <11) 
	{this.jacinaTona = jacinaTona;}
	else{
		jacinaTona= 1;
	}}
public void postBrojKanala(int brojKanala) {
	if(brojKanala > 0) {
		this.brojKanala = brojKanala;}
	else {
	this.brojKanala = brojKanala;
	}
	}

public void postImeKanala(String imeKanala) {
	this.imeKanala = imeKanala;
}
public void pojacajTon() {
	if (jacinaTona < 10) {
		jacinaTona++;
		}
	else {
		System.out.print("Ton je vec na maksimumu");
	}
	}
public void ispisi() {
	System.out.println("Broj kanala: " + brojKanala);
    System.out.println("Naziv kanala: " + imeKanala);
    System.out.println("Jačina tona: " + jacinaTona);
}
}

