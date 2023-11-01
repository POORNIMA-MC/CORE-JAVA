import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isArmstrong(num)){
            System.out.println(num +  " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");

        }
    }
    public static boolean isArmstrong(int num ){
        int sum = 0;
        int originalnum = num;
        int number_of_digits = String.valueOf(num).length();
        while (num>0){
            int digit = num %10;
            sum += Math.pow(digit,number_of_digits);
            num /= 10;
        }
        return sum == originalnum;
    }
}
