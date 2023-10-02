import java.util.*;

class stack
{ 

    int s[]=new int[20];
        int sp,n,nn;
        stack()
        {
            for(int i=0;i<20;i++)
            s[i]=0;
            sp=-1;
            n=nn;
        }

        void pushdata(int item)
        {
            if(sp==(n-1))
            System.out.println("stack overflows");

            else
            {
                sp++;
                s[sp]=item;
            }
        }
        


        void popdata()
        {
            int v;
            if(sp==-1)
            System.out.println("stack underflow");
            else{
                v=s[sp];
                System.out.println("popped out element is :"+v);
                sp--;
            }
        }


        void display()
        {
            if (sp==-1)
            System.out.println("stack empty");
        else
        {
            System.out.println(s[sp]);
            System.out.println( "    -----");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println(s[i]);
                System.out.println("   -----");
            }
        }


    }

        public Integer pop() {
            return null;
        }

}

     class stack1{
        public  static void main(String[] args) {
           
           stack stack=new stack(3);
           stack.popdata();
    
    
    
           stack.pushdata(1);
           stack.pushdata(2);
           stack.pushdata(3);
           stack.pushdata(4);
           stack.pushdata(5);
        
        
          
         stack.display();
    stack.popdata();
          stack.display();
        }
           }
        