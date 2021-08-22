public class Activity8 {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		try{
			Activity8.exceptionTest("Testing custom exception");
			Activity8.exceptionTest(null);
		}catch(CustomException c){
			System.out.println(c.getMessage());
		}		
	}
	static String exceptionTest(String value) throws CustomException{
		if(value==null){
			throw new CustomException("String is null");
		}
		else{
		return value;
		}
	}

}
