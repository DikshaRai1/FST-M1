import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		List<Integer> list =new ArrayList<>();
		Random indexGen = new Random();
		System.out.println("Enter any integers to continue");
		System.out.println("Press E to exit ");
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		Integer nums[] = list.toArray(new Integer[0]);
		int index=indexGen.nextInt(nums.length-1);
		System.out.println("The value at index " +index + " is " +nums[index]);
		scan.close();
	}

}
