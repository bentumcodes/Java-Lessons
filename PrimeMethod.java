public class PrimeMethod {
    static boolean isPrime(int n){
    for (int i=2; i<n/2;i++){// diving by 2 shortens the time for the process
        if (n % i == 0)
            
          return false;

    }return true;
     

    }
public static void main(String[] args){

int x =51;

System.out.println(isPrime(x));

}
}
