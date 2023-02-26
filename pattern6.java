public class pattern6 {
    public static void main(String[] args){
    
        int i,j,row=8,k;
        for(i=0;i<=row-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=row-1-i;k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
     }
}
