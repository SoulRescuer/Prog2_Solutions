package my.Package.marius;

public class Student extends Person {
	private final int martikelnummer;

	public Student(String vorname, String nachname, String straﬂenname, int hausnummer, int plz, String ort, int martikelnummer,int gehalt) {
		super(vorname, nachname, straﬂenname, hausnummer, plz, ort, gehalt);
		this.martikelnummer=martikelnummer;
	}

	public String toString(){
		return super.toString() + martikelnummer;
	}
}
