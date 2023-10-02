import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,k=0,ns;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("enter the number in the cell");
            m[i]=sc.nextInt();
        }
        System.out.println("enter the number to be search");
        ns=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(m[i]==ns)
            k=1;
        }
        if(k==1)
        System.out.println("the  number is present");
        else
        System.out.println("the number is not present");
    }
}
