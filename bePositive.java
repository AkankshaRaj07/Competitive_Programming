import java.util.Scanner;
import java.util.ArrayList;
public class bePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(testCases);
        while(testCases>0){
            int len= sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(len);
            for(int i=0; i<len; i++){
                arr.add(sc.nextInt());
            }
            list.add(arr);
            testCases--;
        }
        for(ArrayList<Integer> arr: list){
            int count0=0;
            int count1=0;
            for(int i=0; i< arr.size(); i++){
                if(arr.get(i)==0) count0++;
                if(arr.get(i)==-1) count1++;
            }
            int ans= count0+((count1%2)*2);
            System.out.println(ans);
        }
    }
}
