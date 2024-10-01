import java.util.Scanner;

public class rationalsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numtests = sc.nextInt();

        sc.useDelimiter(" |\n|/");
        int i = 0;
        while(i < numtests) {
            int counterid = sc.nextInt();
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(counterid + " " + getlen(first,second));
            i++;
        }
        sc.close();
    }

    public static String getlen(int f, int s) {
        if (f > s) return "" + s + "/" + (s-f);
        else if (s == 1) return "1/" + (f+1);
        int counter = 0;

        while(f < s) {
            f = (s - f);
            counter++;
        }
        int temp = f;
        f = s;
        s = temp;
        while(counter > 0) {
            s = (f + s);
            counter --;
        }
        return "" + f + "/" + s;
    }
}
