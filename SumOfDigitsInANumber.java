import java.util.Scanner;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = getSum(num);
        System.out.println("Sum of digits: " + sum);
    }

    public static int getSum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + getSum(num / 10);
        }
    }
}

