public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	Car(int tyres1, int doors1) {
		this.tyres=tyres1;
		this.doors=doors1;
	}
	void displayCharacteristics() {
		System.out.println("Color of the car is " + color);
		System.out.println("Transmission of the car is " + transmission);
		System.out.println("Car is made in " + make);
		System.out.println("Car has " + tyres + " tyres");
		System.out.println("Car has " + doors + " doors");
	}
	void accelarate() {
		System.out.println("Car is moving forward.");
	}
	void brake(){
		System.out.println("Car has stopped.");
	}
}
