import java.util.*;
/*
 * Yor are given n pairs of numbers.In every pairs,the first number is always smaller than the second
 * number. A pair (c,d) can came after pair(a,b) if b<c,find the longest chain which can be formed from
 * a given set of pairs.
 * pairs={{5,24},{39,60},{5,28},{27,40},{50,90}}
 * 
 * ans=3
 */

public class LengthChainPairs {

    public static void main(String args[]){
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        //sort pairs based on 2nd numbers
        Arrays.sort(pairs,Comparator.comparing(o->o[1]));

        int chainlen=1;
        int chainEnd = pairs[0][1]; //last selected pair end/chain end.

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainlen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println(chainlen);
    }
}
