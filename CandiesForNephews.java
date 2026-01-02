import java.util.Scanner;
public class CandiesForNephews {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        StringBuilder ans= new StringBuilder();
        while(t-->0){
            int n= sc.nextInt();
            ans.append(n%3==0?0:3-(n%3)).append('\n');
        }
        System.out.println(ans.toString());
    }
}
