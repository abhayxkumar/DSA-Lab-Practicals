import java.util.Scanner;
public class CircularQueueUsingArray
{
    int ar[];
    int Front,Rear;


    CircularQueueUsingArray()
    {
        ar=new int[5];
        Front=-1;
        Rear=-1;
    }
    void insertatlast()
    {
        if((Front==0 && Rear==4) || Rear==Front-1)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            System.out.println("Enter Data: ");
            Scanner sc2 = new Scanner(System.in);
            int data=sc2.nextInt();


            if(Front==-1)
            {
                Front=0;
            }
            if(Rear<4)
            {
                Rear=Rear+1;
            }
            else if(Rear==4 && Front!=0  )
            {
                Rear=0;
            }
            ar[Rear]=data;
            System.out.println("Data Inserted at Last..");
        }
    }
    void deleteatbegin()
    {
        if(Front==-1 || Rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            if(Front==Rear)
            {
                System.out.println("Deleted Element from Begin: "+ar[Front]);
                Front=-1;
                Rear=-1;
            }
            else if(Front<Rear)
            {
                System.out.println("Deleted Element from Begin: "+ar[Front]);
                Front=Front+1;
            }
            else if(Front==4)
            {
                System.out.println("Deleted Element from Begin: "+ar[Front]);
                Front=0;
            }
        }
    }

    void traverse()
    {
        if(Front==-1||Rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            if(Front<=Rear)
            {
                for(int i=Front;i<=Rear;i++)
                {
                    System.out.println(ar[i]+" ");
                }
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    System.out.println(" "+ar[i]);
                }
                for(int i=0;i<=Rear;i++)
                {
                    System.out.println(" "+ar[i]);
                }

            }
        }
    }

    public static void main(String[]args)
    {
        CircularQueueUsingArray obj=new CircularQueueUsingArray();
        while(true)
        {
            System.out.println("\nPress 1 to Insert at Last");
            System.out.println("Press 2 to Delete at Begin");
            System.out.println("Press 3 for Traverse");
            System.out.println("Press 4 for Exit");

            System.out.println("Enter your Choice: ");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    obj.insertatlast();
                    break;
                case 2:
                    obj.deleteatbegin();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }


    }
}
