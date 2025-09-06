import java.util.*;

public class UsingTokens {
    public static void main(String[] args){
        //using tokenizer

     //this method requires the string be instatiated first
        String userMessage = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(userMessage);

        String str1 = tokenizer.nextToken();
        String str2 = tokenizer.nextToken();

        System.out.println(str1+ "\n");
        System.out.println(str2+"\n");
    }
}
