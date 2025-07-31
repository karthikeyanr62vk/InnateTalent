import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read input

        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
           
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
