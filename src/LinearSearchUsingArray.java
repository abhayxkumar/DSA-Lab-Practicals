import java.util.Scanner;
class LinearSearchUsingArray
{
    public static void main(String args[])
    {
        int counter, num, item, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Elements:");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Enter " + num + " Elements");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the Search Element:");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++)
        {
            if (array[counter] == item)
            {
                System.out.println(item+" is present at location "+(counter+1));
                break;
            }
        }
        if (counter == num)
            System.out.println(item + " doesn't exist in array.");
    }
}