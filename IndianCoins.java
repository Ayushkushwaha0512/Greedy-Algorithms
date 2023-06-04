import java.util.*;
/*
 * we are given an infinite supply of demominations [1,2,5,10,20,100,200,500,2000].
 * find minimum number of coins/notes to make change for a value V.
 * V=121
 * ans=3(100+20+1)
 */

public class IndianCoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int CountOfCoins=0;
        int amount=121;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    CountOfCoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        System.out.println("total minimum coins used=" + CountOfCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }    
}
