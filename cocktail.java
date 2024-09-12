import java.util.Scanner;
// import java.util.Arrays;

public class cocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPotions = sc.nextInt();
        int timePerPotion = sc.nextInt();
        int drinkingTime = numPotions * timePerPotion; // you spend this much time drinking the potions, so they all need to last this long or more.

        int[] potDurs = new int[numPotions];

        sc.close();
    
        int sum = 0;
        for(int i = 0; i < potDurs.length; i++) {
            sum += potDurs[i];
        }

        if(sum > drinkingTime) System.out.println("NO"); 
        else System.out.println("YES");
    }
}