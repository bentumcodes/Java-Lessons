import java.util.Scanner;
public class SumIntegers{
	public static void main(String[] args){
		// ask user to give any number between 0 and 1000
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000");
		
		int userNum = input.nextInt();
		int extractNum = userNum % 10;
		int remainNum = userNum / 10;
		int nextNum = remainNum % 10;
		remainNum = remainNum / 10;
		int lastNum = remainNum;
		
		int sumTotal = extractNum + nextNum + lastNum;
		
		//Print out the digits
		System.out.println(extractNum);
		System.out.println(nextNum);
		System.out.println(lastNum);
		System.out.println(" Sum of the digits are: " + sumTotal);
	}
}