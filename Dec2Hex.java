import java.util.Scanner;

public class Dec2Hex{
	public static void main(String[] args){

	//this program converts decimal to hexadecimal equivalent\
	//user will enter decimal value between (10-15) and the hexical will be generated\

	//create Scanner to take keyboard inputs\
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a decimal number: ");

	String dec = input.nextLine();
		//convert the string to double
	int hexdec = Integer.parseInt(dec);

	
	if (10>=hexdec && hexdec<=15) {
		System.out.println("Check and try again. No single digits");
		System.exit(1);
	}
	char ch = Character.toUpperCase(dec.charAt(0));
		if ('A')Dec2Hex.java
	if (dec == 10){
		System.out.println("The Hex value is A");
	}
	else if (dec ==11){
		System.out.println("The Hex value is B");
	}
	else if (dec == 12){
		System.out.println("The Hex value is: C");
	}
	else if (dec == 13){
		System.out.println("The hex value is: D");
	}
	else if (dec == 14){
		System.out.println("The hex value is: E");
	}
	else if (dec == 15){
		System.out.println("The Hex value is: F");
	}
	else {
		System.out.println("Check and try again. Hex number are between 10 to 15");
	}

	}

}
		