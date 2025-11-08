
public class GPSprijemnik {
private String nazivPrijemnika;
private String seriskiBroj;
private double latitude;
private double longitude;
private double altitude;
public GPSprijemnik(String naziv, String seriskiBroj, double latitude, double longitude, double altitude) {
	this.nazivPrijemnika = naziv;
	this.seriskiBroj = seriskiBroj;
	this.latitude = latitude;
	this.longitude = longitude;
	this.altitude = altitude;
}
public GPSprijemnik() {
	nazivPrijemnika = "";
	seriskiBroj = "";
	latitude=0.0;
	longitude=0.0;
	altitude=0.0;
	
	
}
public String getNazivPrijemnika() {
	return nazivPrijemnika;
}
public String getSeriskiBroj() {
	return seriskiBroj;
}
public double getLatitude() {
	return latitude;
}
public double getLongitude() {
	return longitude;
}
public double getAltitude() {
	return altitude;
}


public void setNazivPrijemnika(String nazivPrijemnika) {
	this.nazivPrijemnika = nazivPrijemnika;
}
public void setSeriskiBroj(String seriskiBroj) {
	this.seriskiBroj = seriskiBroj;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public void setAltitude(double altitude) {
	this.altitude = altitude;
}

public static GPSprijemnik traziPoSeriskomBroju(GPSprijemnik[] niz ,String seriskiBroj) {
	GPSprijemnik srbr = null;
	for(GPSprijemnik n:niz) {
		if(n.getSeriskiBroj().equals(seriskiBroj))
			srbr = n;
		return srbr;
	}return null;
	
}
}
