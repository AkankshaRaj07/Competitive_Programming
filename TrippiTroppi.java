import java.util.Scanner;
public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ancient = sc.nextLine();
            String [] names = ancient.split(" ");
            System.out.println(findCountry(names));
        }
    }
    public static String findCountry(String [] names){
        StringBuilder country = new StringBuilder();
        for(String s : names){
            country.append(s.charAt(0));
        }
        return country.toString();

    }
}
