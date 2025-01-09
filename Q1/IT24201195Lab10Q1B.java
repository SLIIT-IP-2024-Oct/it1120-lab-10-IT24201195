import java.util.Scanner;

public class IT24201195Lab10Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mark between 1-100: ");
		double number = input.nextInt();
		
		assert(number>=0 && number<=100): "invalid mark";
		System.out.println("Mark is validated");
		
		char grade;
		if(number>=75){
			grade = 'A';
		}else if(number>=60){
			grade = 'B';
		}else if(number>=50){
			grade = 'C';
		}else if(number>=40){
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		assert(grade=='A' && number >= 75 || grade == 'B' && number >=60 && number<75 || grade == 'C' && number>=50 && number<60 || grade == 'D' && number>=40 && number<50 || grade == 'F' && number<40): "Incorrect Grade Assigned";
		System.out.println("Grade assigned : " + grade);
	}
}