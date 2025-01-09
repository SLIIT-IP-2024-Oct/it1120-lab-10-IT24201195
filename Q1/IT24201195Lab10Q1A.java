import java.util.Scanner;

public class IT24201195Lab10Q1A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter mark between 1-100: ");
		double number = input.nextInt();
		
		assert(number>=0 && number<=100): "invalid mark";
		System.out.println("Mark is validated");
	}
}	