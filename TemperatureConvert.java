import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//request for user input
		System.out.print("Enter fahrenheit value to be converted into celcius: ");
		
		double fahrenheit = input.nextDouble();
		
		//Convert fahrenheit to Celcius
		
		double celcius = (5.0 / 9)*(fahrenheit -32);
		
		System.out.println(fahrenheit + " fahrenheit is equal to " + celcius + " celcius.");
	}
}