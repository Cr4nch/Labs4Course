import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;


public class MathAlgo{
    public static void main(String[] argv){
        ArrayList<Integer> primes = Eratospen((new Scanner(System.in)).nextInt());
        for(Integer i:primes)
            System.out.printf("%d ",i);
        System.out.println();
        return;
    }
    
    
    public static ArrayList<Integer>  Eratospen(int n){
        ArrayList<Boolean> primes = new ArrayList<>(Arrays.asList(new Boolean[n+1]));
        ArrayList<Integer> res = new ArrayList<>();
        Collections.fill(primes,true);
        primes.set(0,false); 
        primes.set(1,false);
        for(int i=2;i<=n;i++){
            if(primes.get(i)==Boolean.TRUE){
                if(((long)i)*i <=n)
                for(int j=i*i;j<=n;j+=i)
                    primes.set(j,false);
                res.add(i);
            }
        }
        return res;
    }
}
