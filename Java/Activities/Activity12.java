public class Activity12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable ad1 = (a, b) -> (a + b);
		Addable ad2= (int a, int b) -> { return a+b ;};
		System.out.println("Output of Lambda Expression : "+ ad1.add(1, 2));
		System.out.println("Output of Lambda Function : " + ad2.add(5, 9));
	}
}
