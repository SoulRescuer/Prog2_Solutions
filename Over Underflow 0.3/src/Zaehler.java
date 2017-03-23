
public class Zaehler {
	private Integer einer= new Integer (0);
	private Integer  zehner= new Integer (0);

	public Zaehler(int x, int y) {
		this.einer = x;
		this.zehner = y;
	}

	public void erhoeheUmEins(Zaehler a) throws EinerUeberlauf {
		/*
		 * Soll die �Einer� um Eins erh�hen, den aktuellen Wert der �Einer�
		 * ausgeben und bei einem �berlauf der �Einer� die Exception
		 * EinerUeberlauf werfen
		 */
		if (Integer.valueOf(a.einer) >= 9) {
			throw new EinerUeberlauf();
		} else {
			a.einer=Integer.valueOf(a.einer)+1;
			System.out.println("[Zehner|Einer:]" + " " + a.zehner + a.einer);
		
		}

	}

	/*
	 * soll die �Zehner� um Eins erh�hen, den aktuellen Wert der �Zehner�
	 * ausgeben und bei einem �berlauf der �Zehner� also Zaehler= 100 die
	 * Exception Ueberlauf werfen.
	 */
	public void erhoeheUmZehn(Zaehler a) throws Ueberlauf {
		if (Integer.valueOf(a.zehner) >= 9) {
			throw new Ueberlauf("Ueberlauf!");
		} else {
			a.zehner=Integer.valueOf(a.zehner)+1;
			System.out.println("[Zehner|Einer:]" + " " + a.zehner + a.einer);
		}
	}

	/*
	 * Soll um Eins hochz�hlen, indem die Methode erhoeheUmEins aufgerufen wird.
	 * Wird ein �berlauf der �Einer� durch das Auftreten einer entsprechenden
	 * Exception signalisiert, dann sollen die �Einer� zur�ck auf Null gesetzt
	 * und daf�r die �Zehner�durch Aufruf von erhoeheUmZehn erh�ht werden.
	 * Danach soll dieser �berlauffehler beseitigt sein.
	 */
	public static void zaehlen(Zaehler a) throws Ueberlauf, EinerUeberlauf {
		try{
			a.erhoeheUmEins(a);
		} catch (EinerUeberlauf e) {
			System.err.println("Ein Einer�berlauf fand stat! ");
			a.einer = 0;
			a.erhoeheUmZehn(a);
		}
	}

}
