import java.util.Scanner;
public class BlackSilex_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int testCases =sc.nextInt();
        int[][] arr = new int[testCases][2];

        for (int i = 0; i < testCases; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int [] i: arr){
            System.out.println(i[0]*i[1]+1);
        }

    }
}
