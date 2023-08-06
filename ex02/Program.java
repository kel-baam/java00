import java.util.Scanner;

public class Program
{
    static int sumNum(int x)
    {
        int num = 0;
        while(x > 0)
        {
            num = num +(x % 10);
            x=  x / 10;
        }
        return num;
    }

    static int isPrime(int x)
    {
        int i = 2;
        x = sumNum(x);
        if(x <= 1)
            return 0;
        while(i <= Math.sqrt(x))
        {
            if(x % i == 0)
                return 0;
            i++;
        }
        return 1;
    }
    public static void main(String[]args)
    {
        int num;
        int primeNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        num = scanner.nextInt();

        while(num != 42)
        {
            if(isPrime(num)==1)
            primeNum++;
            System.out.print(" ");
            num = scanner.nextInt();
        }
        System.out.println("Count of coffee-request : "+ primeNum);
    }
}
