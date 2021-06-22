import java.util.Scanner;
public class SinglyQueueUsingArray
{
    int ar[];
    int Front, Rear;

    SinglyQueueUsingArray()
    {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }

    void insertatlast()
    {
        if(Rear == 4)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            System.out.println("Enter Data: ");
            Scanner sc2=new Scanner(System.in);
            int data=sc2.nextInt();

            if(Front==-1)
            {
                Front=0;
            }
            Rear=Rear+1;
            ar[Rear]=data;
            System.out.println("Data Inserted at Last...");
        }
    }

    void deleteatbegin()
    {
        if(Front==-1||Rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            if(Front==Rear)
            {
                System.out.println("Deleted Element at Begin: "+ar[Front]);
                Front=-1;
                Rear=-1;
            }
            else
            {
                System.out.println("Deleted Element at Begin: "+ar[Front]);
                Front=Front+1;

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
            System.out.println("---Singly Queue---");
            for(int i=Front;i<=Rear;i++)
            {
                System.out.println(" "+ar[i]);
            }
        }
    }

    public static void main(String[]args)
    {
        SinglyQueueUsingArray obj=new SinglyQueueUsingArray();
        while(true)
        {
            System.out.println("\nPress 1 to Insert at Last");
            System.out.println("Press 2 for Delete at Begin");
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


