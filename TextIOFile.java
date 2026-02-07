import java.io.File;
import java.io.IOException;

public class TextIOFile {
    //create a method that writes a text file 

    static void myFile (String filepath) throws IOException{
        //create an object of the file
        File file = new File(filepath);
        //check whether the file exits first
        if (!file.exists()){
            file.createNewFile();
            System.out.println("File has been created at : "+filepath);
        }
        else{
            System.out.println("File exists! Check and try again");
        }
    }
        static boolean myfileExit(String paths){
            File file = new File(paths);
            System.out.println("It Exist");
            return file.exists();
        
    }

    public static void main(String[] args)throws IOException{
        //call the file method

        String filepath = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/sampleFolder/lent3.txt";
         myFile(filepath);
         String folderpath = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/sampleFolder";
         myfileExit(folderpath);
    }
}
