import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileReading {
    public static void main(String[] args)throws IOException{

        //read data from CSV file
        //method 1: using Scanner

        File file = new File ("/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/trial/logger.csv");
        
        Scanner scanner = new Scanner(file);
        //scanner.useDelimiter(",");
        System.out.println(" NAME "+ "\t" + " | "+ "   AGE  "+ "\t"+ "|" +"\t"+" EMAIL ");
        System.out.println("=======================================================");
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            Scanner newLine = new Scanner(line);
            
            newLine.useDelimiter(",");

            String name = newLine.next();
            int age = newLine.nextInt();
            String email = newLine.next();

            
            System.out.println(name+ "\t" +" | "+"\t"+ age + "\t" + "|"+"\t"+email);
                                newLine.close();
        }
        scanner.close();
    }
    
}
