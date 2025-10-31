import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String after removing vowels: " + result);
        sc.close();
    }
}
