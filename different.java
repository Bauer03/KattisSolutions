import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long f = sc.nextLong();
            if (sc.hasNextLong()) {
                long s = sc.nextLong();
                long temp = s - f;
                System.out.println(Math.abs(temp));
            }
        }
        sc.close();
    }
}