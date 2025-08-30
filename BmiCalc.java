import java.util.Scanner;
public class BmiCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the weight and height
		System.out.println("Please enter your weight(pounds) and height(inches): ");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		//calculate the BMI
		final double KILOGRAMS = 0.45359237;
		final double INCHE_METER = 0.0254;
		
		double heightMeter = height * INCHE_METER;
		double bmi = (weight * KILOGRAMS) / (heightMeter * heightMeter);
		
		if (bmi < 18.5){
		System.out.println("Your BMI is: " + bmi + " You're UNDERWEIGHT! Seek medical attention");}
		else if (bmi <25.0){
		System.out.println("Your BMI is: " + bmi + " You're NORMAL! Keep a good diet always");}
		else if (bmi < 30.0){
		System.out.println("Your BMI is: " + bmi + " You're OVERWEIGHT! Seek medical attention");} 
		else {
		System.out.println("Your BMI is: " +bmi+ " Ei OBOLO! death is near");}
	}
}
			
	
		
