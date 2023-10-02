import java.util.Scanner;

public class singledimensionalarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j=0,t,min;
        int m[]=new int[10];
        for(i=0;i<5;i++)
        {
            System.out.println("enter the number in cell");
            m[i]=sc.nextInt();
         }

         for(i=0;i<4;i++)
         {
            min=i;
            for(j=i+1;j<5;j++)
            {
                if(m[j]<m[min])
                min=j;
            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
         }
         System.out.println("the asending order is");
         for(i=0;i<5;i++)
         System.out.println(m[i]);
    }
}
