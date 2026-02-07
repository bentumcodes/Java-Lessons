import java.io.File;

public class TextIO {
    //create a folder in the directory
    static void myfolder(String filepath){
        
        File folder = new File(filepath);
        if (!folder.exists()){
            folder.mkdir(); //this command creates the folder
            System.out.println("Folder has been created successfully at : "+filepath);
        }
        else 
        { 
            System.out.println("Folder exits! Check and try again");
        }
    }

    public static void main(String[] args){
        //call the folder method to create it
        String filepath = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/new folder2";
        myfolder(filepath);
    }
}
