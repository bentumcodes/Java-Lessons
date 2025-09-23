import java.util.Scanner;

public class AreaOfRecMtd {
    //method for int
    static int area(int x, int y){
        int z = x * y;
        return z;
    }
    //mtd for float
    static float area(float x, float y){
        float z = x * y;
        return z;
    }
    //mtd for double
    static double area(double x, double y){
        double z = x * y;
        return z;
    }
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
    System.out.println("To calculate the area of a rectangle, What is the ");
    //  //the responds are stored in an array which are passed into the method
    
    // int[] m = new int[2];
    // //the array of the parameter is to print them without repeating System.out.print
    // String[] res = {"Length: ","Breath: "};
    //  for (int i = 0;i < res.length; i++ ){
    //     System.out.println(res[i]);
    //      m[i]= input.nextInt();
        

         
     //}
     
     //System.out.println(area(m[0],m[1]));
// 2nd approach to consider the method overloading 
System.out.println("Length: ");
 float m= input.nextFloat();
//int m= input.nextInt();
System.out.println("Breathe: ");
//int n = input.nextInt();
float n= input.nextFloat();
System.out.println(area(m,n));

    }
}
