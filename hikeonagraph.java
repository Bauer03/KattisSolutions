import java.util.*;

public class hikeonagraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimensions = sc.nextInt();
        String[][] matrix = new String[dimensions][dimensions];
        int piece1 = sc.nextInt();
        int piece2 = sc.nextInt();
        int piece3 = sc.nextInt();
        for(int i = 0; i < dimensions; i++) {
            for(int j = 0; j < dimensions; j++) {
                matrix[i][j] = sc.next();
            }
        }

        // boolean isdone = false;
        Queue<String> moves = new LinkedList<String>();
        moves = getMoves(moves);

        // prints out the final matrix
        // for(int i = 0; i < dimensions; i++) {
        //     for(int j = 0; j < dimensions; j++) {
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        sc.close();
    }

    public static Queue<String> getMoves(Queue<String> moves) {

        return moves;
    }
}
