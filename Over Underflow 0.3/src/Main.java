
public class Main {

	// Zaehlerobjekt Erzeugen und Z�hlen lassen in Enlosschleife. Bei 99
	// Ueberlauf! ausgeben
	// Sonst EinerUeberlauf anzeigen.

	public static void main(String[] args) {

		Zaehler counter = new Zaehler(0, 0);

		while (true) {
				try {
					Zaehler.zaehlen(counter);
				} catch (Ueberlauf e) {
					break;
				} catch (EinerUeberlauf e) {
					continue;
				}
		}

	}
}