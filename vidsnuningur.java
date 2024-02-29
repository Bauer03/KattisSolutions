import java.util.*;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        for(int i = c.length-1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
