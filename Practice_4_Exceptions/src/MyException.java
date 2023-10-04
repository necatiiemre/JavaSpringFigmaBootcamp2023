
public class MyException extends Exception {
	
	public MyException(int number) {
		super(number + " is greather than 100");
	}
}
