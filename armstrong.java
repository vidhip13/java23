import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        int temp;
        int rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
         n = sc.nextInt();
         temp =n;
        while (temp != 0) {
             rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("the number is an armstrong number");
        } else {
            System.out.println("the number is not an armstrong number");
        }
    }
}
