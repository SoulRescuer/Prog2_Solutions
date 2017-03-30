package my.Package.marius;


public class Person {
	public String vorname;
	public String nachname;
	public String straﬂenname;
	public int hausnummer;
	public int plz;
	public String ort;
	public int gehalt;
	
	
	
	
	
	//Konstruktor Person
	public Person (String vorname, String nachname, String straﬂenname, int hausnummer, int plz, String ort, int gehalt){
		this.vorname=vorname;
		this.nachname=nachname;
		this.straﬂenname=straﬂenname;
		this.hausnummer=hausnummer;
		this.plz=plz;
		this.ort=ort;
		this.gehalt=gehalt;
	}
	
	
	
	
	//Getter und Setter
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStraﬂenname() {
		return straﬂenname;
	}
	public void setStraﬂenname(String straﬂenname) {
		this.straﬂenname = straﬂenname;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public int getGehalt() {
		return gehalt;
	}
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	@Override
	public String toString(){
		return vorname + " "+ nachname+ " "+ straﬂenname+ " " + hausnummer+ " "+plz+ " " +ort +" ";
	}
	

}
