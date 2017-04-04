package my.Package.Marius;

public class Lkw extends Fahrzeug {
	private final static double maxSpeed = 105.0;
	private final static double acceleration = 0.5;
	private final double maxLadung;
	private double ladung;

	//Konstruktor LKW
	public Lkw(String name, double ladung, double maxLadung) {
		super(name);
		this.ladung = ladung;
		this.maxLadung = maxLadung;
	}

	@Override
	public double beschleunigen(double sekunden) {
		double tempCurrentSpeed = Lkw.acceleration * sekunden;
		double timeToReachMaxSpeed;
		double tempPosition;
		if (tempCurrentSpeed >= hoechstGeschwindigkeit()) {
			setGeschwindigkeit(hoechstGeschwindigkeit());
			tempCurrentSpeed = hoechstGeschwindigkeit();
			timeToReachMaxSpeed = tempCurrentSpeed / Lkw.acceleration;
			tempPosition = 0.5 * Lkw.acceleration * sekunden * sekunden;
			setPosition(tempPosition / 1000.0);
			super.fahren((sekunden - timeToReachMaxSpeed) / 60.0);
		} else {
			setGeschwindigkeit(tempCurrentSpeed);
			tempPosition = super.getPosition();
			tempPosition += ((0.5 * Lkw.acceleration * sekunden * sekunden) / 1000.0);
			setPosition(tempPosition);
		}
		return super.position;
	}

	public void beladen(double ladungInTonnen) {
		if (istVollBeladen() == true || ladungInTonnen+ladung>maxLadung) {
			System.err.println(super.getName()+" hat die Maximal Ladung schon erreicht!! ");
		} else {
			this.ladung += ladungInTonnen;
		}
	}

	public void entladen(double ladungInTonnen) {
		if (ladung - ladungInTonnen >=0) {
			this.ladung -= ladungInTonnen;
		} else if (ladungInTonnen >= ladung) {
			System.err.println(super.getName()+" hat nicht so viel geladen!! ");
		}
	}

	public boolean istVollBeladen() {
		if (ladung != maxLadung) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public double stoppen() {
		double tempCurrentSpeed4 = getGeschwindigkeit();
		double tempAnhalteweg = getAnhalteweg();
		double tempPosition = getPosition();
		double tempBremsverz�gerung;
		if (istVollBeladen() == true) {
			tempBremsverz�gerung = 3.0;
			tempAnhalteweg = (0.5 * (tempCurrentSpeed4 * tempCurrentSpeed4 / tempBremsverz�gerung)
					+ (tempCurrentSpeed4 / 10.0) * 3.0);
			setGeschwindigkeit(0.0);
			setAnhalteweg(tempAnhalteweg);
			setPosition(tempPosition +(tempAnhalteweg/1000.0));
			return tempAnhalteweg;
		} else {
			tempBremsverz�gerung = 5.0;
			tempAnhalteweg = (0.5 * (tempCurrentSpeed4 * tempCurrentSpeed4 / tempBremsverz�gerung)
					+ (tempCurrentSpeed4 / 10.0) * 3.0);
			setGeschwindigkeit(0.0);
			setAnhalteweg(tempAnhalteweg);
			setPosition(tempPosition +(tempAnhalteweg/1000.0));
			return tempAnhalteweg;
		}

	}

	@Override
	public double hoechstGeschwindigkeit() {
		return Lkw.maxSpeed /3.6;
	}

	@Override
	public double fahren(double minuten) {
		return super.fahren(minuten);
	}

	public static double getAcceleration() {
		return Lkw.acceleration;
	}

	@Override
	public String toString() {
		StringBuffer c = new StringBuffer();
		c.append("\t");
		c.append("Ladung: " + ladung +"t" + "\t");
		c.append("MaxLadung: " +maxLadung +"t" +"\t");
		return super.toString() + c.toString();
	}

}
