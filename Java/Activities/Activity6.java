public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane= new Plane(10);
		plane.onboard("Rakesh");
		plane.onboard("Ramesh");
		System.out.println("The take off time is: " +plane.takeOff());
		System.out.println("List of passengers is:" +plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("The plane landed at: " +plane.getLastTimeLanded());
	}

}
