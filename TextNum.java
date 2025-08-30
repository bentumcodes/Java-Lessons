import java.util.Scanner;
public class TextNum{
	public static void main (String[] args){
		//to check whether a is greater than b or check
		// declare variables with values
		
		int a =20;
		int b = 15;
		int c = 25;
		
		if(a > b && a > c){
			System.out.println(a);
		}
		else if(b > c){
			System.out.println(b);
		}
		else
			System.out.println(c);
	}
}