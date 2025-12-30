import java.util.Scanner;
public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int minDigit = 9;
            for (int i = 0; i < n.length(); i++) {
                int digit = n.charAt(i) - '0';
                minDigit = Math.min(minDigit, digit);
            }

            System.out.println(minDigit);
        }
    }
}
