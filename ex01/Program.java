import java.util.Scanner;
//can i use exit or not
public class Program
{
    public static void main(String[]args)
    {
        int num;
        int i = 2;
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("->  ");
        num = scanner.nextInt();
        if(num <= 1)
            System.out.println(" IllegalArgument");
        else
        {
            while(i <= Math.sqrt(num))
           {
                if(num % i ==0)
                {
                    flag = 1;
                    System.err.println("false "+(i-1));
                    break;
                }
                i++;
           }
           if(flag ==0)
                System.out.println("True "+(i-1));
        }
    }
}
