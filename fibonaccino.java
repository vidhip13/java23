import java.util.Scanner;

public class fibonaccino {
    public static void main(String args[])
    {
        int i,j;
        int a=0, b=0, c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        i = sc.nextInt();
        System.out.println("Fibonacci series::");
        for(j=1; j <= i ; j++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a);
        }
    }
}
