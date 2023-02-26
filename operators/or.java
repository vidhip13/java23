// or operator (|| or)

public class or {
        public static void main(String[] args){

            int a=10;
            int b=20;
            int c=30;
            System.out.println(a<b || a<c); //true && true = true
            System.out.println(a>b || a<c); //false && true= true
            System.out.println(a>b || b>c); //false && false= false
        }
}