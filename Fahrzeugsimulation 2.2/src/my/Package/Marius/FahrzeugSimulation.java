package my.Package.Marius;

public class FahrzeugSimulation {

	public static void main(String[] args) {
		
		//Beschleunigen und 1 min fahren
		Lkw lkw1 = new Lkw("LKW1", 1.0, 3.0);
		Pkw pkw1 = new Pkw("PKW1");
		PkwOAbs OAbs1 = new PkwOAbs("OABS1");
		PkwOAbs OAbs2 = new PkwOAbs("OABS2");
		lkw1.beschleunigen(30);
		pkw1.beschleunigen(15);
		OAbs1.beschleunigen(15);
		OAbs2.beschleunigen(15);
		lkw1.fahren(1);
		pkw1.fahren(1);
		OAbs1.fahren(1);
		OAbs2.fahren(1);
		System.out.println("PKWS 15s und LKWS 30s beschleunigen + 1 Minute fahren\n");
		System.out.println(lkw1.toString());
		System.out.println(pkw1.toString());
		System.out.println(OAbs1.toString());
		System.out.println(OAbs2.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		
		//20 Minuten weiter fahren mit Aktuelle Geschwindigkiet
		lkw1.fahren(20);
		pkw1.fahren(20);
		OAbs1.fahren(20);
		OAbs2.fahren(20);
		System.out.println("20 Minuten weiter fahren mit aktueller Geschwindigkeit\n");
		System.out.println(lkw1.toString());
		System.out.println(pkw1.toString());
		System.out.println(OAbs1.toString());
		System.out.println(OAbs2.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		
		//Check auf Max Geschwindigkiet
		Lkw lkw2 = new Lkw("LKW2", 1.0, 5.0);
		Pkw pkw2 = new Pkw("PKW2");
		PkwOAbs OAbs3 = new PkwOAbs("OABS3");
		PkwOAbs OAbs4 = new PkwOAbs("OABS4");
		lkw2.beschleunigen(400.0);
		pkw2.beschleunigen(90.0);
		OAbs3.beschleunigen(80.0);
		OAbs4.beschleunigen(100.0);
		System.out.println("Check auf Max Geschwindigkeit \n");
		System.out.println(lkw2.toString());
		System.out.println(pkw2.toString());
		System.out.println(OAbs3.toString());
		System.out.println(OAbs4.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		
		//Bremsphase und Ausgabe des Anhaltewegs mit Random Werten
		Lkw lkw5 = new Lkw("LKW5", 2.0, 4.0);
		Lkw lkw6 = new Lkw("LKW6", 3.0, 3.0);
		Pkw pkw6 = new Pkw("PKW6");
		PkwOAbs OAbs6 = new PkwOAbs("OABS6");
		lkw5.beschleunigen((Math.random()*60));
		lkw6.beschleunigen((Math.random()*60));
		pkw6.beschleunigen((Math.random()*60));
		OAbs6.beschleunigen((Math.random()*60));
		lkw5.fahren((Math.random()*60));
		lkw6.fahren((Math.random()*60));
		pkw6.fahren((Math.random()*60));
		OAbs6.fahren((Math.random()*60));
		System.out.println("Bremsphase und Beschleunigung und Fahren mit Random-Werten \n");
		System.out.println(lkw5.toString());
		System.out.println(lkw6.toString());
		System.out.println(pkw6.toString());
		System.out.println(OAbs6.toString());
		System.out.println("\n");
		lkw5.stoppen();
		lkw6.stoppen();
		pkw6.stoppen();
		OAbs6.stoppen();
		System.out.println(lkw5.toString());
		System.out.println(lkw6.toString());
		System.out.println(pkw6.toString());
		System.out.println(OAbs6.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		
		//LKWS beladen und entladen
		System.out.println("Check der LKW Berladungs und Entladungs Funktion \n");
		lkw2.beladen(4);
		System.out.println(lkw2.toString());
		lkw2.entladen(3);
		System.out.println(lkw2.toString());
		lkw2.beladen(6);
		lkw2.entladen(6);
		System.out.println("-------------------------------------------------------------------------");

	}

}
