import java.util.*;
import java.io.*;

class node
{
    int data;
    node link;
    node()
    {
        data=0;
        link=null;
    }

    void create()throws IOException
    {
        int n;
     InputStreamReader read=new InputStreamReader(System.in);
     BufferedReader in =new BufferedReader(read);
     System.out.println("enter a first data");
     this.data = Integer.parseInt(in.readLine());
     System.out.println("enter the number of node to be created");
        n=Integer.parseInt(in.readLine());
        node temp;
        node ptr = this;
        for(int i=0;i<n;i++)
        {
            temp=new node();
            System.out.println("enter next data");
            temp.data =Integer.parseInt(in.readLine());
            temp.link =null;
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;


        }
    }

    
    
    
    void insertbeg(node start,int x)
    {
        node temp =new node();
        System.out.println("enter elemnet for the new list");
        temp.data=x;
        //temp.link= null;
        temp.link=start;
        start= temp;
        temp=null;
    }

    
    
    
    
    
    void insertmid(node start,int x,int n)
    {
        node temp = new node();
        System.out.println("enter element for the new list");
        temp.link=null;
        node ptr=start;
        temp.data=x;
        int c=0;
        while(c<=n)
        {
            ptr=ptr.link;
            c++;
        }
        temp.link=ptr.link;
        ptr.link=temp;
    }
    
    


void delete(node start,int n)
{
    node ptr =start;
    node ptr1=ptr;
    int c=0;
    while(c<=n)
    {
        ptr1=ptr;
        ptr=ptr.link;c++;
    }
    ptr1.link=ptr.link;
    ptr.link=null;

        ptr=ptr1=null;
        

    }



    


    void display()
    {
        node ptr = this;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
}





public class linklist {
    public static void main(String[] args)throws IOException
     {
      int k,p,ch;
      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in =new BufferedReader(read);
      node first=new node();
      node abc=new node();
      do
      {
            System.out.println("main menu");
            System.out.println("1. create alinklist structure");
            System.out.println("2. insert a list in the begining");
            System.out.println("4. insert a list at middle");
            System.out.println("5.delete a list");
             System.out.println("6.display");
            System.out.println("7.exit");
            
            
            System.out.println("enter your choice");
            ch= Integer.parseInt(in.readLine());
            switch (ch) 
            {
                case 1: first.create();
                    break;
                case 2:
                        System.out.println("enter data forr the new node");
                        k= Integer.parseInt(in.readLine());
                        first.insertbeg(first,k);
                    break;

                    case 4: System.out.println("enter data for the new node");
                    k= Integer.parseInt(in.readLine());
                    System.out.println("enter node number after which node is to be inserted");
                    p=Integer.parseInt(in.readLine());

                    first.insertmid(first,k,p);
                    break;
                    case 5:
                        System.out.println("enter node number to be delted");
                        k= Integer.parseInt(in.readLine());
                        first.delete(first,k);
                    break;


                     case 6 :  System.out.println("data in the linklist are");
                     first.display();
                    
            }
        }while(ch!=7);
        
    }
}
