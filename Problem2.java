import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (a): ");
        int a = sc.nextInt();
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int term = 2 * i - 1;
            System.out.print(term);
            if (i < a) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
