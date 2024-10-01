import java.util.Scanner;

public class rationalsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\n|/");
        int numtests = sc.nextInt();
        for(int i = 0; i < numtests; i++) {
            int id = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p == 1 && q == 1){
                System.out.println(id+" 1/2");
            }
            else if(p < q){ // left
                int newP = q;
                int newQ = q-p;
                System.out.println(id+" "+newP+"/"+newQ);
            }
            else { // right
                int tmp = p;
                int newP = q;
                int newQ = q + (q * (tmp / q)) - (tmp % q);
                System.out.println(id+" "+newP+"/"+newQ);
            }
        }
        sc.close();
    }
}
