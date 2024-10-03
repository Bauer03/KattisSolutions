import java.util.Scanner;

public class problems99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if(n < 99) System.out.println(99);
        else if(n == 10000) System.out.println(9999);
        else if (n >= 999 && n % 99 < 50) System.out.println(100 * ((n/100) +1) -1);
        else if ((n % 99) >= 50) System.out.println(100 * (n/100) + 99);
        else System.out.println((100 * (n/100)) -1);
    }
}