package my.Package.Marius;

public class PkwOAbs extends Pkw {
	private final static double maxSpeed = 140.0;

	//Konstruktor PkwOAbs
	public PkwOAbs(String name) {
		super(name);
	}

	@Override
	public double beschleunigen(double sekunden) {
		double tempCurrentSpeed = Pkw.getAcceleration() * sekunden;
		double tempPosition;
		double timeToReachMaxSpeed;
		if (tempCurrentSpeed >= hoechstGeschwindigkeit()) {
			setGeschwindigkeit(hoechstGeschwindigkeit());
			tempCurrentSpeed = hoechstGeschwindigkeit();
			timeToReachMaxSpeed = tempCurrentSpeed / Pkw.getAcceleration();
			tempPosition = 0.5 * Pkw.getAcceleration() * sekunden * sekunden;
			setPosition(tempPosition / 1000.0);
			fahren((sekunden - timeToReachMaxSpeed) / 60.0);
		} else {
			setGeschwindigkeit(tempCurrentSpeed);
			tempPosition = super.getPosition();
			tempPosition += ((0.5 * Pkw.getAcceleration() * sekunden * sekunden) / 1000.0);
			setPosition(tempPosition);
		}
		return super.position;
	}

	@Override
	public double stoppen() {
		double tempCurrentSpeed2 = getGeschwindigkeit();
		double tempAnhalteweg = getAnhalteweg();
		double tempPosition2 = getPosition();
		tempAnhalteweg = (((tempCurrentSpeed2 / 10.0) * (tempCurrentSpeed2 / 10.0)) + (tempCurrentSpeed2 / 10.0) * 3.0);
		setGeschwindigkeit(0.0);
		setAnhalteweg(tempAnhalteweg);
		setPosition(tempPosition2 + (tempAnhalteweg/1000.0));
		return tempAnhalteweg;
	}

	@Override
	public double hoechstGeschwindigkeit() {
		return PkwOAbs.maxSpeed /3.6;
	}

	@Override
	public double fahren(double minuten) {
		return super.fahren(minuten);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}