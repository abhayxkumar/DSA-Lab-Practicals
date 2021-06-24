import java.util.Scanner;

public class InsertionSortUsingArray
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];

        //Input
        System.out.println("Enter Elements in Array: ");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

        //Process
        for(int r=1; r<5; r++) //Pass
        {
            for(int c=0; c<r; c++) //Comparison
            {
                if(ar[c]>ar[r]) //Swap
                {
                    int temp = ar[c];
                    ar[c] = ar[r];
                    ar[r] = temp;
                }
            }
        }

        //Output
        System.out.println("----Insertion Sort----");
        for(int i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args)
    {
        InsertionSortUsingArray obj = new InsertionSortUsingArray();
        obj.func();
    }
}
