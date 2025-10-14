import java.util.Scanner;
import java.util.Arrays;

public class aprizenoonecanwin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itemCount = sc.nextInt();
        int maxPrice = sc.nextInt();
        int[] arr = new int[itemCount];
        for(int i = 0; i < itemCount; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++){
            if((arr[i] + arr[i + 1]) > maxPrice) break;
            else count++;
        }
        System.out.println(count);

        sc.close();
    }
}
