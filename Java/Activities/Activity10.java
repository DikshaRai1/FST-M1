import java.util.HashSet;
import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(3);
		hs.add(4);
		hs.add(3);
		hs.add(8);
		System.out.println("The size of the Hashset is: "+ hs.size());				//Prints size of the HashSet
		System.out. println("Number removed from the list " +hs.remove(3));			//Removing an element from HashSet
		System.out. println("Number not removed from the list " +hs.remove(10));	//Removing an element which is not present in the HashSet
		int element;
		System.out.println("Enter a number to search in the HashSet");
		Scanner scanner = new Scanner(System.in);
		element=scanner.nextInt();
		if(hs.contains(element))													//Check if a name exists in the ArrayList.
			System.out.println("Number exists in the HashSet");							
		else
			System.out.println("Number doesn't exist in the HashSet");
		System.out.println(hs);
		scanner.close();
	}
}
