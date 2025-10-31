import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int biggest = a;

        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }

        System.out.println("Biggest number is: " + biggest);
        sc.close();
    }
}
