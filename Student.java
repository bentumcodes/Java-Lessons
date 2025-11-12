import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String school;
     private int grade;

    // public Student(){
    //    this.name = "unknown";
    // this.age=0;}
    void displayInfo(){
        System.out.println("Hello! "+name+ " You are "+age+ "years old.");
        System.out.println("The name of your school is: "+school+ " and you are in grade: "+grade);
    }
     
     //creating a constructor
    //  public Student(String x, int y){
    //     this.school = x;
    //     this.grade = y;
    //  }  
    
    public static void main (String[] args){
        //scanner for input
        Scanner input = new Scanner(System.in);
        
        //create objects to call out variables and methods
        

        Student newStu = new Student();

        System.out.println("What is your name? ");
        newStu.name= input.nextLine();

        System.out.println("What is your age? ");

        newStu.age = input.nextInt();
        input.nextLine();

      
        System.out.println("What is the name of your school?: ");
        String x= input.nextLine();
        newStu.school =x;
        System.out.println("What is your grade?: ");
        int y = input.nextInt(); 
        newStu.grade = y;
           
           
        newStu.displayInfo();
 
        input.close();
System.out.println("");
System.out.println(newStu.name+ " "+ newStu.age+ " "+newStu.school+ " "+ newStu.grade);


    }
    
}
