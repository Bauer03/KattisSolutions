import java.util.Scanner;

public class a1paper {
    public static void main(String[] args) {
        // start with an array of the values you're given. [1,0,5]
        // iterate through the array until you find a value > 0.
        // if your value is >1, subtract two from it and then add one to the position in the array before it.
        // if your 'from' index is divisible by 
        Scanner sc = new Scanner(System.in);

        int smallest = sc.nextInt();

        int[] paperArr = new int[smallest - 1];
        for(int i = 0; i < smallest - 1; i++) {
            paperArr[i] = sc.nextInt();   
        }

        int i = 0;
        while(i < paperArr.length) {
            if(paperArr[i] != 0) {
                while(true) {
                    
                }
            }
        }
        
        sc.close();
    }
}
