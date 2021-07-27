import java.util.ArrayList;
import java.util.List;

public class Activity4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		System.out.println("Unsorted list: " +list);
		for (int i = 1; i <list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && key < list.get(j)) {
                list.set(j+1, list.get(j));
                --j;
            }
            list.set(j+1, key);
        }
		System.out.println("Sorted list: " +list);
    }
}
