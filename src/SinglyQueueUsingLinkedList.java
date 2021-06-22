import java.util.Scanner;

class Nodee
{
    int data;
    Node next;
}

public class SinglyQueueUsingLinkedList
{
    Node Front, Rear;
    SinglyQueueUsingLinkedList()
    {
        Front = null;
        Rear = null;
    }

    void insertatlast()
    {
        System.out.println("Enter Data: ");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();

        Node newnode = new Node();
        newnode.data = item;
        newnode.next = null;

        if(Front==null)
        {
            Front = newnode;
            Rear = newnode;
        }

        else
        {
            Node current = Rear;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
        System.out.println("Data Inserted...");
    }

    void deleteatbegin()
    {
        if(Front==null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Deleted: " + Front.data);
            Front = Front.next;
        }
    }

    void traverse()
    {
        if(Front==null||Rear==null)
        {
            System.out.println("Queue Empty");
        }

        else
        {
            System.out.println("---Singly Queue---");
            for(Node current=Front; current!=null; current=current.next)
            {
                System.out.println(" "+ current.data);
            }
        }
    }

    public static void main(String[] args)
    {
        SinglyQueueUsingLinkedList obj = new SinglyQueueUsingLinkedList();
        while(true)
        {
            System.out.println("\nPress 1 to Insert at Last");
            System.out.println("Press 2 to Delete at Begin");
            System.out.println("Press 3 for Traverse");
            System.out.println("Press 4 for Exit");

            System.out.println("Enter your Choice: ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

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
