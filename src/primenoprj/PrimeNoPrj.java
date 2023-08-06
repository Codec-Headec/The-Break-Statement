package primenoprj;
import java.util.*;

public class PrimeNoPrj{
    public static void main(String[] args) {
        int num, i;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();

        i = 2;
        while (i <= num-1)
        {
            if (num%i == 0)
            {
                System.out.println("Not a Prime number");
                break;
            }
            i++;
        }
        if (i == num)
        {
            System.out.println("Prime Number");
        }
    }
}