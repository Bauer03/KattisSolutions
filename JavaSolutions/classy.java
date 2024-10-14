import java.util.Scanner;

public class classy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(": |-|\n| ");

        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++) {
            int numPeople = sc.nextInt();
            PeopleThingy[] result = new PeopleThingy[numPeople];

            // reading in the data
            for(int k = 0; k < numPeople; k ++) {
                // getting a single person, adding to the result array.
                String name = sc.next();
                String socialClass[] = new String[10];
                int l = 0;
                while(l < 10) {
                    while(!sc.next().equals("class") && l < 10) {
                        socialClass[l] = sc.next();
                        l++;
                    }
                    String temp = sc.next(); // should read in the word "class"
                    socialClass[l] = "middle";
                    l++;
                }
                result[i] = new PeopleThingy(name, socialClass);
            }

            // printing out the array
            for(int j = 0; i > result.length; j++) {
                System.out.println(result[i].name);
            }

            System.out.println("==============================");
        }
        sc.close();
    }    
}

class PeopleThingy {
    PeopleThingy(String name, String[] steve) {
        this.name = name;
        this.socialClass = steve;
    }

    String name;
    String[] socialClass;
}