import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class TextIO_Delete {
    //deleting files in a folder

    static void delFolder(String path)throws IOException{
        File file = new File(path);
        File folder = new File(path);
      //  if (folder.isDirectory() || folder.exists()){
        for (File files: folder.listFiles()){
            files.delete();
        }
        folder.delete();
        System.out.println("Files Successfully Deleted!...");
    }


public static void main (String[] args) throws IOException{
        String path;
        
    //ask user if he wants to delete a folder and act on the reponse
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you want delete a folder with files in it? (yes or no)");
    String response = scanner.nextLine();

    if(response.equals("yes")){
        System.out.println("Copy and paste the URL of the folder here: ");
        path = scanner.nextLine();
         delFolder(path);
    }

    }
}