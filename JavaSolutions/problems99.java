import java.util.Scanner;

public class problems99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int base = (int)Math.floor(n/100)*100;
        int low = base-1;
        int high = base+99;
        if(high-n <= n-low || low < 0) System.out.println(high);
        else System.out.println(low);
    }
}