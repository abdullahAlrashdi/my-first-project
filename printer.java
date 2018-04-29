
public class printer extends Equipment {
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	printer(String s , String b , double p , int speed){
		super(s , b , p );
		this.speed = speed;
	}
	printer(printer p){
		super((Equipment)p);
		this.speed = p.speed;
	}

	public double computeMaintenanceCost() {
		return (0.02*price) + (speed*200);
	}
}
