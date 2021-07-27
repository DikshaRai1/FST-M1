public class Bicycle implements BicycleOperations, BicycleParts{
	int currentSpeed;
	int gears;
	public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
	@Override
	public int applyBrake(int decrement){
		currentSpeed-=decrement;
		return currentSpeed;
	}
	
	@Override
	public int speedUp(int increment) {
		currentSpeed += increment;
        return currentSpeed;
	}
	
}
class MountainBike extends Bicycle{
	int seatHeight;
	public MountainBike( int cycleGears, int speed, int seatHeight){
		super(speed, cycleGears);
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue) {
		this.seatHeight = newValue;
	}
	@Override
	public String bicycleDesc() {
		System.out.println("Seat height is: "+seatHeight);
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
}

