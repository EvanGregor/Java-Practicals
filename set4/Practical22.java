import java.util.*;
import java.io.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);

}

class calledMyCalculator implements AdvancedArithmetic{

    public int  divisor_sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
        
    }
}
public class Practical22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        calledMyCalculator s = new calledMyCalculator();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of the divisors of the number is: " + s.divisor_sum(n));
        
       
       
    }
    
}
