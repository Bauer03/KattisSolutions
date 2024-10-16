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

            for(int k = 0; k < numPeople; k ++) {
                String[] line = sc.nextLine().split(": ");
                String name = line[0];

                String[] bufferLine = line[1].split(" ");
                String[] temp = bufferLine[0].split("-");
                
                Collections.reverse(Arrays.asList(temp));

                String[] socialClass = new String[10];
                for(int l = 0; l < temp.length; l++) socialClass[l] = temp[l];

                int len = temp.length;
                while(len < 10) socialClass[len++] = "middle";

                PeopleThingy temp2 = new PeopleThingy(name, socialClass);
                temp2.calcSum();
                result[k] = temp2;
            }

            Arrays.sort(result);
            Collections.reverse(Arrays.asList(result));

            for(PeopleThingy p : result) {
                System.out.println(p.name);
            }

            System.out.println("==============================");
        }
        sc.close();
    }
}

class PeopleThingy implements Comparable<PeopleThingy>{
    PeopleThingy(String bob, String[] steve) {
        this.name = bob;
        this.socialClass = steve;
    }

    public String name;
    public String[] socialClass;
    public double sum = 0;

    @Override
    public int compareTo(PeopleThingy other) {
        if(this.sum > other.sum) return 1;
        else if(this.sum < other.sum) return -1;
        else return other.name.compareTo(this.name);
    }

    public void calcSum() {
        this.sum = 0;
        for(int i = 0; i < 10; i++) {
            switch (socialClass[i]) {
                case "upper":
                    this.sum += (3 * Math.pow(10,9-i));
                    break;
                case "middle":
                    this.sum += (2 * Math.pow(10,9-i));
                    break;
                case "lower":
                    this.sum += (1 * Math.pow(10, 9-i));
                    break;
                default:
                    System.out.println("AAAA big error");
                    break;
            }
        }
    }
}