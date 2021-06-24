import java.util.Scanner;

public class SelectionSortUsingArray
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];

        //Input
        System.out.println("Enter Element in Array: ");
        for (int i = 0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        //Process
        for (int r=0; r<4; r++)
        {
            for (int c=r; c<=4; c++)
            {
                if (ar[r]>ar[c])
                {
                    int temp = ar[r];
                    ar[r] = ar[c];
                    ar[c] = temp;
                }
            }
        }

        //Output
        System.out.println("----Selection Sort----");
        for (int i = 0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args)
    {
        SelectionSortUsingArray obj = new SelectionSortUsingArray();
        obj.func();
    }
}

