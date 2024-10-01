import java.util.Scanner;

public class a1paper {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] array = new int[kb.nextInt() - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }
        kb.close();
        double sum = 0.0;
        double area = 0.0;
        double factor;
        int spec = 0;
        int k = array.length-1;

        for (int j = 0; j <= k; j++) {
            spec = 0;
            double subArea = (0.25/(Math.pow(2,j)));
            double total = subArea*(array[j]);
            if (0.5 - area < total){
                while (area < 0.5 && spec < array[j]){
                    spec+= 2;
                    area += 2*subArea;
                }
            }
            else area += total;
            //System.out.println("Area: " + area);
            if (area >= 0.5) k = j;
        }

        if (area >= 0.5){
            for(int i = k; i > 0; i--){
                if (array[i] > 1) {
                    if (i == k && spec != 0){
                        factor = Math.floor(spec/2);
                    }
                    else if (array[i] >= Math.pow(2, i + 1)){
                        factor = Math.pow(2, i + 1)/2;
                    }
                    else factor = Math.floor(array[i]/2);
                    //double add = (i% 2 == 0) ? Math.pow(2,(-0.75 -(i/2)))*factor : Math.pow(2,(-1.25 -(i/2)))*factor;
                    double add = factor *(Math.pow(2, -0.75) / Math.sqrt(Math.pow(2, i)));
                    sum += add;
                    array[i - 1] += factor;
                    array[i] -= 2*factor;
                }
            }

            sum += Math.pow(2, -0.75);
            System.out.println(sum);
        }
        else System.out.println("impossible");
    }
}