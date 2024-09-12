/*
 * You have a single 3D printer, and would like to use it to produce  statues. 
 * However, printing the statues one by one on the 3D printer takes a long time, 
 * so it may be more time-efficient to first use the 3D printer to print a new printer. 
 * That new printer may then in turn be used to print statues or even more printers. 
 * Print jobs take a full day, and every day you can choose for each printer in your 
 * possession to have it print a statue, or to have it 3D print a new printer 
 * (which becomes available for use the next day).

What is the minimum possible number of days needed to print at least  statues?

The input contains a single integer  (), the number of statues you need to print.

Output a single integer, the minimum number of days needed to print at least  statues.
*/

import java.util.Scanner;

class Printer3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) System.out.println(1);
        else if(num == 2) System.out.println(2);
        else if(num > 2){
            int day = 2;
            int pCt = 2;
            while(pCt < num) {
                pCt *= 2;
                day++;
            }
            System.out.println(day);
        }
        sc.close();
    }
}