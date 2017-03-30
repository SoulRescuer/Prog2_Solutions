package my.Package.marius;

public class Main {

	public static void main(String[] args) {
		
		Student aStudent = new Student("Peter", "M�ller", "Hauptstrasse", 4, 96450, "Coburg", 455555, 1000 );
		Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", 21, 96450, "Coburg", "Betriebssysteme", 1000 );
		Person aPerson = new Person ("Name", "Person", "Personstrasse", 3, 96450, "Personstadt", 0);
		Student bStudent = new Student ("Ich", "Du", "Street", 1, 96450, "Ort", 1234567, 0);
		Dozent bDozent = new Dozent("Dozent", "Nachname", "Dozentstra�e", 3, 96450, "Coburg", "Betriebssysteme", 1 );
		
		Person[] pArray = new Person[5];
		pArray[0] = aStudent;
		pArray[1] = bStudent;
		pArray[2] = aDozent;
		pArray[3] = bDozent;
		pArray[4] = aPerson;
		
		for (Person p : pArray){
			System.out.println(p.toString());
		}
		 

	}

}
