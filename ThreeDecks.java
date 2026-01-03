import java.util.Scanner;
public class ThreeDecks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            System.out.println(isEqual(a,b,c)? "YES": "NO");
        }
    }
    public static boolean isEqual(int a, int b, int c){
        int sum=a+b+c;
        if (sum % 3 == 0 && b <= sum / 3) {
            return true;
        } else {
            return false;
        }
    }
}
