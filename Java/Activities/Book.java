public abstract class Book {
	String title;
	
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}
class MyBook extends Book{
	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		super.title=s;
	}
	
}