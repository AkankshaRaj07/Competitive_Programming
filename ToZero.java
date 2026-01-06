import java.util.Scanner;

public class ToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(toZero(n, k));
        }
    }

    static long toZero(long n, long k) {
        if (n % 2 == 0) {
            return (n + (k - 2)) / (k - 1); // ceil division
        } else {
            // one odd operation
            n -= k;
            if (n <= 0) return 1;
            return 1 + (n + (k - 2)) / (k - 1);
        }
    }
}
