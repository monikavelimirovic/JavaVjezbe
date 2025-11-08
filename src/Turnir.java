import java.util.ArrayList;

public class Turnir {
private String nazivTurnira;
private ArrayList<String[]> listaIgraca;
private int brojRundi;

public Turnir(String nazivTurnira, int brojRundi) {
	this.nazivTurnira = nazivTurnira;
	this.listaIgraca = new ArrayList<>();
	setBrojRundi(brojRundi);
}
public String getNazivTurnira() {
	return nazivTurnira;
}
public ArrayList<String[]> getListaIgraca() {
	return listaIgraca;
}
public int getBrojRundi() {
	return brojRundi;
}


public void setNazivTurnira(String nazivTurnira) {
	this.nazivTurnira = nazivTurnira;
}
public void setListaIgraca(ArrayList<String[]> listaIgraca) {
	this.listaIgraca = listaIgraca;
}
public void setBrojRundi(int brojRundi) {
	if(brojRundi>0 && brojRundi<10)this.brojRundi = brojRundi;
}

public void dodajIgraca(String imeIgraca) {
	String[] igrac= {imeIgraca,"0"};
	listaIgraca.add(igrac);}

public void obrisiIgraca(String ime) {
	for(int i=0;i<listaIgraca.size();i++) {
		if(listaIgraca.get(i)[0].equalsIgnoreCase(ime)) {
			listaIgraca.remove(i);
		break;}
	}

}


}

