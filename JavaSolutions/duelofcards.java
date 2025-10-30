import java.util.Scanner;

class duelofcards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];    

        for(int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        

        sc.close();
    }
}