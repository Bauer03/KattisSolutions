import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class classy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < cases; i++) {
            int numPeople = Integer.parseInt(sc.nextLine());
            PeopleThingy[] result = new PeopleThingy[numPeople];

            // reading in the data
            for(int k = 0; k < numPeople; k ++) { // this loop makes a new person and adds it to the array
                String[] line = sc.nextLine().split(": ");
                String name = line[0];

                String[] bufferLine = line[1].split(" ");
                String[] temp = bufferLine[0].split("-");
                
                String[] socialClass = new String[10];
                for(int l = 0; l < temp.length; l++) {
                    socialClass[l] = temp[l];
                }

                int len = temp.length;
                while(len < 10) socialClass[len++] = "middle";

                Collections.reverse(Arrays.asList(socialClass));

                PeopleThingy temp2 = new PeopleThingy(name, socialClass);
                temp2.calcSum();
                result[k] = temp2;
            }

            // sort the array
            Arrays.sort(result);

            // reversing
            Collections.reverse(Arrays.asList(result));

            // printing out the array
            for(PeopleThingy p : result) {
                System.out.println(p.name);
            }

            System.out.println("==============================");
        }
        sc.close();
    }
}

class PeopleThingy implements Comparable<PeopleThingy>{
    PeopleThingy(String name, String[] steve) {
        this.name = name;
        this.socialClass = steve;
    }

    public String name;
    public String[] socialClass;
    public double sum = 0;

    @Override
    public int compareTo(PeopleThingy other) {
        if(this.sum > other.sum) return 1;
        else if(this.sum < other.sum) return -1;
        else return this.name.compareTo(other.name);
    }

    public void calcSum() {
        this.sum = 0;
        for(int i = 0; i < 10; i++) {
            switch (socialClass[i]) {
                case "upper":
                    sum += (3 * Math.pow(10,i));
                    break;
                case "middle":
                    sum += (2 * Math.pow(10,i));
                    break;
                case "lower":
                    sum += (1 * Math.pow(10, i));
                    break;
                default:
                    System.out.println("AAAA big error");
                    break;
            }
        }
    }
}

// 1
// 5
// mom: upper-upper-lower-middle class
// dad: middle-middle-middle-lower-middle class
// queenelizabeth: upper-upper-upper class
// chair: lower-lower class
// unclebob: middle-middle-lower-middle class

// 1
// 6
// mom: upper-upper-lower-middle class
// dad: middle-middle-middle-lower-middle class
// queenelizabeth: upper-upper-upper class
// chair: lower-lower class
// unclebob: middle-middle-lower-middle class
// paul: upper class