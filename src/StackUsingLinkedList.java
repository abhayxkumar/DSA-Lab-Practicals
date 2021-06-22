import java.util.*;
class Node
{
    int data;
    Node next;
}
public class StackUsingLinkedList
{
    Node top;
    StackUsingLinkedList()
    {
        top=null;
    }

    void push()
    {
        System.out.println("Enter Data: ");
        Scanner sc2=new Scanner(System.in);
        int newitem=sc2.nextInt();

        Node newnode=new Node();
        newnode.data=newitem;
        newnode.next=top;


        top=newnode;
        System.out.println("Data Inserted...");


    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Element Deleted: "+top.data);
            top=top.next;
        }
    }

    void peek()
    {
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            Node current;
            for(current = top; current.next!=null; current=current.next){
            }
            System.out.println(current.data);
        }
    }

    void traverse()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            Node current;
            for(current=top;current!=null;current=current.next)
            {
                System.out.println(current.data);
            }
        }
    }

    public static void main(String agrs[])
    {
        StackUsingLinkedList obj = new StackUsingLinkedList();

        while(true)
        {
            System.out.println("Press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Peek");
            System.out.println("Press 4 for Traverse");
            System.out.println("Press 5 for Exit\n");

            System.out.println("Enter your Choice: ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.traverse();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }


}

