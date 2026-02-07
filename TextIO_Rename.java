import java.io.File;

public class TextIO_Rename {
    
    //create method that takes two parameters, old and new path
   static void renameFolder (String oldPath, String newPath) {
        //create an object to access the file
        File oldFolder = new File (oldPath);
        File newFolder = new File (newPath);
        if (oldFolder.exists()){
            //oldFolder.renameTo(newFolder);//renames the folder
            oldFolder.delete();//deletes the folder
            //System.out.println("folder successfully renames");
            System.out.println("Folder successfully deleted!");
        }
       else {
            newFolder.mkdir();
            System.out.println("New folder has been created successfully at: "+newPath);
        }
    }
    public static void main (String[] args){
        //call the methods

        String oldPath = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/creative Bright Studio new";
        String newPath = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/bentumcodes new";
        renameFolder(oldPath, newPath);
    }
}
