import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FourThought {
    public static int comp2(int left, int right, String op){
        if(op == "+") return left+right;
        else if(op == "-") return left-right;
        else if(op == "*") return left*right;
        else return left/right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Number,String> m = new HashMap<>();

        String[] ops = {"+","-","*","/"};
        for(int a = 0; a < 4; a++){
            String aop = ops[a];
            for(int b = 0; b < 4; b++){
                String bop = ops[b];
                for(int c = 0; c < 4; c++){
                    String cop = ops[c];

                    String res = "4 "+aop+" 4 "+bop+" 4 "+cop+" 4";
                    int result = 4;

                    ArrayList<String> parts = new ArrayList<>();
                    parts.add("4");
                    parts.add(aop);
                    parts.add("4");
                    parts.add(bop);
                    parts.add("4");
                    parts.add(cop);
                    parts.add("4");
                    for(int k = 0; k < 3; k++){
                        int largest = 1;
                        int curW = 0;
                        for(int j = 1; j <= 5; j += 2){
                            if(j >= parts.size()) break;
                            String o = parts.get(j);
                            int weight = (o == "+" || o == "-") ? 0 : 1;
                            if(weight > curW){
                                largest = j;
                                curW = weight;
                            }
                        }

                        result = comp2(Integer.valueOf(parts.get(largest-1)),Integer.valueOf(parts.get(largest+1)),parts.get(largest));
                        parts.set(largest-1,String.valueOf(result));
                        parts.remove(largest);
                        parts.remove(largest);
                    }

                    m.put(result,res);
                }
            }
        }

        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            if(!m.containsKey(v)) noSol();
            else System.out.println(m.get(v)+" = "+v);
        }
    }
    public static void noSol(){
        System.out.println("no solution");
    }
}