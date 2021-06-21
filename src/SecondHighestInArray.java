public class SecondHighestInArray{
    public static int getSecondHighest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={78,23,54,72,69,42,45};
        System.out.println("Second Highest: "+getSecondHighest(a,6));
    }}
