public class queue {
    int q[]=new int[20];
    int f,r,size;
    queue(int n){
for(int i=0;i<20;i++)    
q[i]=0;
f=-1;r=-1;
size=n;
}
void insertqueue(int item)
{
    if(r==size-1)
    System.out.println("queue overflow");
    else{
        if(f==-1 && r==-1)
        {
            f=0; r=0;
        }
        else 
        r=r+1;
        q[r]=item;

    }
}


void deletequeue(){
    if(f==-1 && r==-1)
    System.out.println("queue underflow");
    else{
        int val = q[f];

        if (f==r)
        {
            f=-1;
            r=-1;
        }

        else
        f=f+1;

    }
}

void display()
{
    System.out.println("element of the queue");
    for (int j=f;j<=r;j++)
    System.out.println(q[j]);

}

}


class queue1{
    public static void main(String[] args) {
       
       queue queue=new queue(3);
       queue.deletequeue();



       queue.insertqueue(1);
       queue.insertqueue(2);
       queue.insertqueue(3);
       queue.insertqueue(4);
      queue.insertqueue(5);
      
      queue.display();
queue.deletequeue();
      queue.display();
    }
       }