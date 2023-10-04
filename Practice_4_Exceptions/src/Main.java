import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Exception {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = inputScanner.nextInt();
		
		if (num <= 100) {
			System.out.println("your number is " + num);
		} else {
			throw new MyException(num);
		}
		
	}

}
