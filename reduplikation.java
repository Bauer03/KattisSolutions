import java.util.Scanner;

public class reduplikation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.print(s);
        }
    }
}
