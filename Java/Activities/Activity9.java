import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		myList.add("Hema");
		myList.add("Rekha");
		myList.add("Jaya");
		myList.add("Sushma");
		myList.add("Meena");
		myList.forEach((e)-> {
			System.out.println(e);
		});
		System.out.println("3rd element of list is: " +myList.get(2));          				//3rd name in the ArrayList
		String element;
		System.out.println("Enter a name to search in the list");
		Scanner scanner = new Scanner(System.in);
		element=scanner.nextLine();
		if(myList.contains(element))															//Check if a name exists in the ArrayList.
			System.out.println("Name exists in the list");							
		else
			System.out.println("Name doesn't exist in the list");
		System.out.println("The list has " +myList.size() + " names");							//Number of names in the ArrayList.
		myList.remove("Rekha");
		System.out.println("The list has " +myList.size() + " names after deletion");			//Number of names in the ArrayList.
		scanner.close();
	}

}
