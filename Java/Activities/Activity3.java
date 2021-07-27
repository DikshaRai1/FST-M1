import java.util.Scanner;

public class Activity3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age = new Age();
		long seconds;
		System.out.println("Enter seconds to calculate age");
		Scanner scan= new Scanner(System.in);
		seconds=scan.nextLong();
		System.out.println("Age on Mercury: " + age.ageOnMercury(seconds));
		System.out.println("Age on Venus: " +age.ageOnVenus(seconds));
		System.out.println("Age on Earth: " + age.ageOnEarth(seconds));
		System.out.println("Age on Mars: " + age.ageOnMars(seconds));
		System.out.println("Age on Jupiter: " + age.ageOnJupiter(seconds));
		System.out.println("Age on Saturn: " + age.ageOnSaturn(seconds));
		System.out.println("Age on Uranus: " + age.ageOnUranus(seconds));
		System.out.println("Age on Neptune: " + age.ageOnNeptune(seconds));	
		scan.close();
	}

}
