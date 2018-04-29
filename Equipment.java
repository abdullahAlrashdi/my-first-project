
public abstract class Equipment {

	private String serialNo;
	private String brand;
	protected double price;
	
	Equipment(String s , String b , double p){
		
		serialNo = s;
		brand = b;
		price  = p;
	}
	Equipment (Equipment e ){
		this.brand = e.brand;
		this.serialNo = e.serialNo;
		this.price = e.price;
	}
	public abstract double computeMaintenanceCost();
	
	
}
