
public class Temperature {
private double [] temperature;
private String datum;
public Temperature() {
	temperature = new double[0];
	datum = "";
}
public Temperature(double[] temperature, String datum) {
	this.temperature = temperature;
	this.datum = datum;
}

public double[] getTemperature() {
	return temperature;
}

public String getDatum() {
	return datum;
}

public void setTemperature(double[] temperature) {
	this.temperature = temperature;
}

public void setDatum(String datum) {
	this.datum = datum;
}

public static double prosjecnaTemp(double []temperature) {
	double zbir = 0.0;
	int brojTemp = temperature.length;
	for(int i = 0;i<brojTemp;i++) {
		zbir += temperature[i];
		
	}
     return (zbir/brojTemp);}

}
