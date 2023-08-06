import java.util.Scanner;

public class test 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        int i =0;
        int save=0;
        int weeks=0 ;
        Scanner scanner =new Scanner(System.in);
        int num;
        while(weeks <4)
        {
            
            while(i < 5)
            {
                num= scanner.nextInt();
                System.out.println(num);
                i++;
            }
            weeks++;
        }
        
    }
}
