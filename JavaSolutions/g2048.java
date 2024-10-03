import java.util.Arrays;
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
        
        if(nextMove == 0) {
            for(int i = 0; i < 4; i++) {
                int moveTo = 0;
                int j = 0;
                if(board[i][j] == 0) moveTo = j;
                while(j < 4) {
                    if(board[i][j] == 0) continue;
                    else {
                        // maaaaaan 
                    }
                }
                // for(int j = 0; j < 3; j++) {
                //     board[i][j] = (board[i][j + 1] == board[i][j]) ? board[i][j] * 2 : ;
                // }
            }
        }
    }
}
