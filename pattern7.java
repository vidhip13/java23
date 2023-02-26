import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
    
       int i,j,num=1;
       System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       for(i=1;i<=num;i++)
       {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

       }
       for(i=num-1;i>=1;i--)
       {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
       }
     }
}
