import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class readCSV {
    public static void main(String[] args)throws IOException{

            String csvFile = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/trial/logger.csv";
            PrintWriter filePrint = new PrintWriter(csvFile);
            filePrint.println("Name,Age,email");
            filePrint.println("Bentum,30,ben@gmail.com"+"\n"+
                            ("John,12,john@gmail.com"));
            filePrint.println("James,34,james@gmail.com");
            filePrint.close();

            System.out.println("Files successfully written to: "+csvFile);


            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String csvOutput;

            while ((csvOutput = br.readLine()) != null){
                System.out.println(csvOutput);
            }



    }
}
