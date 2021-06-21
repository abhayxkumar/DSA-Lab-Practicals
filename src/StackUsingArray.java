import java.util.Scanner;
public class StackUsingArray
{
    int[] ar;
    int top;
    StackUsingArray()
    {
        ar = new int[5];
        top = -1;
    }

    void push()
    {
        if(top==4)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            System.out.println("Enter Data:");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            ar[++top] = data;
            System.out.println("Data Inserted...");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty!");
        }
        else
        {
            System.out.println("Deleted Element: " + ar[top]);
            top = top - 1;
        }
    }

    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
            {
            System.out.println(ar[top]);
        }
    }

    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty!");
        }
        else
        {
            for(int i=top; i>=0; i--)
            {
                System.out.println(ar[i]);
            }
        }
    }

    public static void main(String[] agrs)
    {
        StackUsingArray obj = new StackUsingArray();

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
