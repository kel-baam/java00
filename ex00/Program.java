

public class Program
{
    public static void main(String[] args)
    {
        int num =123456;
        int result = 0;
        for(int i = 0; i<6;i++)
        {
            result= result +(num   % 10);
            num=num/10;
        }
          result= result +(num   % 10);
            num=num/10;          result= result +(num   % 10);
            num=num/10;          result= result +(num   % 10);
            num=num/10;          result= result +(num   % 10);
            num=num/10;          result= result +(num   % 10);
            num=num/10;          result= result +(num   % 10);
            num=num/10;
        System.out.println(result);
    }
}
