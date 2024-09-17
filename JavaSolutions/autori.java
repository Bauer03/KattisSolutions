import java.util.Scanner;

class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 1;
        String output = "";
        output += s.charAt(0);
        while(i < s.length()) {
            if(s.charAt(i) == '-') {
                i++;
                output += s.charAt(i);
            }
            i++;
        }

        System.out.println(output);

        sc.close();
    }
}