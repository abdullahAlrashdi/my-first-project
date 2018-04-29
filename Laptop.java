
public class Laptop extends Equipment {
	
	private double screenSize;
	private int nbCores;
	
	Laptop(String s , String b , double p , double screenSize , int nbcorse ){
		
		super(s , b, p);
		this.nbCores  = nbcorse;
		this.screenSize = screenSize;
	}
	Laptop(Laptop t){
		super((Equipment)t);
		this.screenSize = t.screenSize;
		this.nbCores = t.nbCores; 
	}
	public double computeMaintenanceCost() {
		
		return 0.01*price + nbCores*200;
	}

}
