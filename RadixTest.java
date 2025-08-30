import java.util.Scanner;
public class RadixTest{
	public static void main(String[] args){
		//to check the radix of a number whether Octal, Hexdical or the other
		//request for user input.
		System.out.println("Enter a range of number: ");
		//Create an input object
		
		Scanner input = new Scanner(System.in);
		
		int newNo = input.nextInt();
		if (newNo >= 0 && newNo <=7)
			System.out.println("The radix of the number is Binary");
		else if (newNo >= 0 && newNo < 9)
			System.out.println("The radix of the number is Octal");
		else
			System.out.println("The number is a hexidecimal");
	}
}