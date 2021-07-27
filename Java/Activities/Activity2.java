public class Activity2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,77,10,54,-11,10};
		int i,sum=0;
		
		for(i=0;i<array.length;i++) {
			if(array[i]==10) {
				sum=sum+array[i];
			}
		}
		if(sum==30) {
			System.out.println(true);
		}
		else
			System.out.println(false);
		
	}

}
