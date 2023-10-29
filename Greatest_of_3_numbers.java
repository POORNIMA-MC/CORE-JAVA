public class Greatest_of_3_numbers {
    public static void main(String[] args) {
        // METHOD 1 - if else
        int num1 = 10, num2 = 20, num3 = 30;
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the greatest by method 1");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the greatest by method 1");
        else if (num3 >= num1 && num3 >= num2)
            System.out.println(num3 + " is the greatest by method 1");

        //------------------------------------------------------------

        //METHOD 2 - ternary operator
        int temp, res;
        temp = num1 > num2 ? num1 : num2;
        res = temp > num3 ? temp : num3;
        System.out.println(res + " is the greatest by method 2");


    }
}
