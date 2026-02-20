package Collections;

public class Palindrom_number {
    public static void main(String[] args) {
        int x = 111;
        int sum = 0;
        int temp = x;  // Store original
        int r = 0;

        // Use temp in loop, not x
        while(temp > 0) {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        
        // Compare sum with original x
        if (sum == x) {
            System.out.println(x + " is palindrome");
        } else {
            System.out.println(x + " is not palindrome");
        }
    }
}