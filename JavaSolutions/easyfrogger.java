import java.util.Scanner;

public class easyfrogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int squares = sc.nextInt();
        int ind = sc.nextInt(); // can be value ranging from 1 to squares
        int magic = sc.nextInt();
        int hops = 0;

        int[] arr = new int[squares];
        for (int i = 0; i < squares; i++) arr[i] = sc.nextInt();
        sc.close();

        while (ind >= 1 && ind <= squares && arr[ind - 1] != 0 && arr[ind - 1] != magic) {
            int temp = ind;
            if (arr[ind - 1] > 0) ind += arr[temp - 1];
            else ind -= Math.abs(arr[temp - 1]);
            arr[temp - 1] = 0;
            hops++;
        }
        
        if (ind < 1) {
            System.out.println("left");
            System.out.println(hops);
        } else if (ind > squares) {
            System.out.println("right");
            System.out.println(hops);
        } else if (arr[ind - 1] == 0) {
            System.out.println("cycle");
            System.out.println(hops);
        } else if (arr[ind - 1] == magic) {
            System.out.println("magic");
            System.out.println(hops);
        }
    }
}
