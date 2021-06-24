import java.util.Scanner;

public class BubbleSortUsingArray
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];

        //Input
        System.out.println("Enter Elements in Array: ");
        for(int i = 0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

        //Process
        for (int r=0; r<4; r++)
        {
            for (int c=0; c<4-r; c++)
            {
                if (ar[c] > ar[c+1])
                {
                    int temp = ar[c];
                    ar[c] = ar[c+1];
                    ar[c+1] = temp;
                }
            }
        }

        //Output
        System.out.println("----Bubble Sort----");
        for (int i = 0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args)
    {
        BubbleSortUsingArray obj = new BubbleSortUsingArray();
        obj.func();
    }
}
