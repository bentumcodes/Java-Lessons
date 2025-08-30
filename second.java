import java.lang.*;
import java.util.*;

class second
{
	public static void main(String[] arg)
	{	//allow system to read keyboard input directed to s
		Scanner s=new Scanner(System.in);
		int a, b, c;	//declaring variables a,b and c
		System.out.println("Enter 2 numbers: ");
		
		//assigning keyboard inputs to variables a and b
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("Sum is " + c);
		System.out.println("Well done on your first attempt on Java!");

		//ask user to enter the name and call out the name of user
		
		System.out.println("Enter your name: ");
		String userA = s.next();
		System.out.println("Welcome " + userA + " " + "We are happy to see you here!");
	}
}