public class AlphaCounter {
    public static void main(String[] args) throws InterruptedException{
        //This will count a to z small letters
        //Intro Message
        System.out.println("Count the Alphablets with me!:\n");
        for (int i = 97; i <=122;i++){
            //convert value into character
            char x = (char)i;

            System.out.print(x);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }
        System.out.println("\rThanks for counting with me");
    }
    
}
