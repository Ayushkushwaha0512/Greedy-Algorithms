import java.util.*;

/*
 * Given the weigths and value of N items, put these items in a knapsack of capacity w to get the 
 * maximun total value in the knapsack.
 * value-> [60,100,120]
 * weigth->[10,20,30]
 * w=50
 */
public class FractionalKnapsack {
    public static void main(String args[]){
        int val[]={60,100,120};
        int weigth[]={10,20,30};
        int w=50;

        double ratio[][] = new double[val.length][2];

        //0th col->idx, 1st col->ratio;
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weigth[i];
        }

        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weigth[idx]){//include full item
                finalval +=val[idx];
                capacity -=weigth[idx];
            }
            else{
                //include fractional item
                finalval +=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(finalval);
    }
}
