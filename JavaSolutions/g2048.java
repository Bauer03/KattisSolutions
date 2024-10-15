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
            for(int i = 0; i < 4; i++) for(int j = 3; j > 0; j--) { // nested loop;
                if(board[i][j-1] != 0 && (board[i][j] == board[i][j-1])) { // if cell to left has num & cell to left is equal to cur cell
                    board[i][j-1] *= 2; // double cell to the left
                    if(board[i][j + 1] !=0 && j<3){ // if cell to the right is not zero
                        board[i][j] = board[i][j+1];
                        board[i][j+1] = 0;
                        if(j < 2 && board[i][j+2] != 0 && board[i][j+1] == 0) {
                            board[i][j+2] = board[i][j+1] = board[i][j+2];
                            board[i][j+2] = 0;
                        }
                    } else board[i][j] = 0;
                } else if (board[i][j-1] == 0) { // if the cell to the left is zero, move cur cell into that and clear cur cell.
                    if(board[i][j] == 0 && board[i][j+1] != 0) {
                        board[i][j] = board[i][j+1];
                        board[i][j+1] = 0;
                    } else {
                        board[i][j-1] = board[i][j];
                        board[i][j] = 0;
                    }
                }
            }
        } else if(nextMove == 1) { // move up
            for(int j = 0; j < 4; j++) for(int i = 3; i > 0; i--) {
                // iterating through from left column to right column (although this does not really matter).
                // inner loop: iterating through from bottom to top (this matters)
                // that someone said no something. 43 that's the journalist in tony. everybody back off tony.
            }
        }

        // prints matrix
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j ++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// works
// 2 0 0 2
// 4 16 8 2
// 2 64 32 4
// 1024 1024 64 0
// 0

// works, puts 2 to the right of 8
// 8 0 0 2
// 4 16 8 2
// 2 64 32 4
// 1024 1024 64 0
// 0

// works
// 8 0 0 2
// 4 16 8 2
// 2 64 32 4
// 1024 1024 64 2
// 0

// works
// 8 0 0 2
// 4 16 8 2
// 2 64 32 4
// 64 1024 1024 2
// 0