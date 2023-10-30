public class palindrom {
    public static void main(String[] args) {
        int num = 122 ;
        int reverse = 0;
        int temp;
        int rem;
        temp =num;
        while(temp!=0){
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if (num == reverse)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is not Palindrome");
    }
}
