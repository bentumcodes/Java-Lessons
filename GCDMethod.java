public class GCDMethod {

    //this method calculates the GCD or HCF of 2 numbers
    static int gcd(int m,int n){
        
       while ( m != n){
            
            if (m > n){
                m = m -n;
            }else 
                n =n-m;
        }
      return m;  
    } 

    public static void main(String[] args){
       int x =35, y=15;
        System.out.println("The HCF between "+x+ " and "+y+ " is :" + gcd(x,y));
    }
    
}
