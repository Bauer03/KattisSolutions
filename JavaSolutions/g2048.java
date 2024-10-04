import java.util.Scanner;
public class g2048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] board = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int nextMove = sc.nextInt();
        
        // move left
        if(nextMove == 0) {
            for(int i = 0; i < 4; i++) for(int j = 3; j > 0; j--) { // do NOT forget that this is a nested loop;
                if(board[i][j-1] != 0 && (board[i][j] == board[i][j-1])) { // if cell to left has num & they're equal, combine
                board[i][j-1] *= 2;
                    if(board[i][j + 1] !=0 && j<3){
                        board[i][j] = board[i][j+1];
                        board[i][j+1] = 0;
                    } else board[i][j] = 0;
                } else if (board[i][j-1] == 0) { // if the cell to the left is zero, move cur cell into that and clear cur cell.
                    board[i][j-1] = board[i][j];
                    board[i][j] = 0;
                }
            }
        } else if(nextMove == 1) { // move up
            // i don't think I need to iterate through any differently? should just be able to look at stuff
            // with regards to i and i-1 or i+1, depending on what exactly I'm looking for.
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 4; j++) {
                    if(board[i][j] == 0) board[i][j] = board[i+1][j];
                }
            }
        }

        // prints matrix
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j ++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
