import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            long x = sc.nextLong();

            // Reverse only even steps
            long initial = x << k; // x * 2^k
            System.out.println(initial);
        }
    }
}
