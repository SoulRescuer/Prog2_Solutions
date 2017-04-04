package my.Package.Marius;

public class Pkw extends Fahrzeug {
	private final static double maxSpeed = 160.0;
	private final static double acceleration = 2.0;

	//Konstruktor PKW
	public Pkw(String name) {
		super(name);
	}

	@Override
	public double beschleunigen(double sekunden) {
		double tempCurrentSpeed = Pkw.acceleration * sekunden;
		double tempPosition;
		double timeToReachMaxSpeed;
		if (tempCurrentSpeed >= hoechstGeschwindigkeit()) {
			setGeschwindigkeit(hoechstGeschwindigkeit());
			tempCurrentSpeed = hoechstGeschwindigkeit();
			timeToReachMaxSpeed = tempCurrentSpeed / Pkw.acceleration;
			tempPosition = 0.5 * Pkw.acceleration * sekunden * sekunden;
			setPosition(tempPosition / 1000.0);
			fahren((sekunden - timeToReachMaxSpeed) / 60.0);
		} else {
			setGeschwindigkeit(tempCurrentSpeed);
			tempPosition = getPosition();
			tempPosition += ((0.5 * Pkw.acceleration * sekunden * sekunden) / 1000.0);
			setPosition(tempPosition);
		}
		return super.position;
	}

	@Override
	public double stoppen() {
		double tempCurrentSpeed2 = getGeschwindigkeit();
		double tempAnhalteweg = getAnhalteweg();
		double tempPosition2= getPosition();
		tempAnhalteweg = (0.5 * ((tempCurrentSpeed2 / 10.0) * (tempCurrentSpeed2 / 10.0)) + (tempCurrentSpeed2 / 10.0) * 3.0);
		setGeschwindigkeit(0.0);
		setAnhalteweg(tempAnhalteweg);
		setPosition(tempPosition2+(tempAnhalteweg/1000.0));
		return tempAnhalteweg;
	}

	@Override
	public double hoechstGeschwindigkeit() {
		return Pkw.maxSpeed / 3.6;
	}

	@Override
	public double fahren(double minuten) {
		return super.fahren(minuten);
	}

	public static double getAcceleration() {
		return Pkw.acceleration;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
