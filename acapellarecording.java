import java.util.Arrays;
import java.util.Scanner;

class acapellarecording {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotes = sc.nextInt();
        int maxGap = sc.nextInt();
        int counter = 0;
        int[] list = new int[numNotes];

        for (int i = 0; i < numNotes; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int i = 0;
        while (i < numNotes) {
            int start = list[i];
            counter++;
            while (i < numNotes && (list[i] - start) <= maxGap) {
                i++;
            }
        }

        System.out.println(counter);
        sc.close();
    }
}