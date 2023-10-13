

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (findoddeven( number)){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static boolean findoddeven(int number){
        if (number % 2 == 0)
            return  true;
        else
            return  false;
    }
}
