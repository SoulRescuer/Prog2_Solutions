package my.Package.Marius;

public class Star implements Mobile {
	public double weight;
	
	public Star(double weight) throws IllegalArgumentException {
		
		if(weight <0){
			throw new IllegalArgumentException();
		} else
			this.weight=weight;
		
	}

	@Override
	public double weight() {
		return weight;
	}

	public void balance() {
		
	}
	
	public String toString(){
		return ("Star | Gewicht: "+weight);
	}
}
