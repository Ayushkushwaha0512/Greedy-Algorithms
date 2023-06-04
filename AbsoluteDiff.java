import java.util.*;

/*
 * PROBLEM-> MINIMUM ABSOLUTE DIFFERENCE PAIRS
 * Given two arrays A and B of equal length n.pair each element of array A to an element in array B
 * ,such that sum S of absolute difference of all the pairs in minimum.
 * a-> [1,2,3]
 * b->[2,1,3]
 * ans=0
 */

public class AbsoluteDiff {
    public static void main(String args[]){
        int A[]={1,2,3};
        int B[]={2,1,3};

        Arrays.sort(A);//A=[1,2,3]
        Arrays.sort(B);//B=[1,2,3]

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff +=Math.abs(A[i]-B[i]);//mindiff = ((1-1)+(2-2)+(3-3))=0
        }

        System.out.println("min absolute diff of pairs=" + minDiff);
    }
}
