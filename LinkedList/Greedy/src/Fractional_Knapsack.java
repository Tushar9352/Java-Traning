import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity=W;
        int finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= wt[idx]) {
                finalvalue += val[idx];
                capacity -= wt[idx];
            } else {
                finalvalue += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value = "+finalvalue);
    }
}