import java.util.Scanner;

public class millifaersla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((m < d && m < f) ? "Monnei" : (f < m && f < d) ? "Fjee" : "Dolladollabilljoll");
    }
}
