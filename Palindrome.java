import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int num = sc.nextInt();
        int temp = num, rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
