
public class Sum_of_N_numbers
{
    public static void main (String[]args)
    {
        // without interval method 1
        int res1 = 0;
        int num = 10 ;
        for (int i = 0; i <= num; i++){
            res1 = res1 + i;
        }
        System.out.println ("The sum of first n numbers using method 1 is " + res1);

        // -----------------------------------------------------------------------------------------

        // without interval method 2 -- n*(n+1)/2
        int res2 = 0;
        int n = 10 ;
        res2 = n*(n+1)/2 ;
        System.out.println ("The sum of first n numbers using method 2 is " + res2);

        // -----------------------------------------------------------------------------------------


        // for interval method 1
        int sum = 0;
        int a = 5;
        int b = 10;

        for (int i = a; i <= b; i++)
            sum = sum + i;
        System.out.println ("The sum of numbers in an interval using method 1 is " + sum);

        // -----------------------------------------------------------------------------------------

        // for interval method 2
        sum = b*(b+1)/2 - a*(a+1)/2 + a;
        System.out.println ("The sum of numbers in an interval using method 2 is " + sum);

    }
}