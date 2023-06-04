import java.util.*;

/* You are given n activities with their start and end times.Select the maximum number of activities 
 * that can be performrd by a single person, assuming that a person can only work on a single activity 
 * at a time. Activities are sorted according to end time.
 * 
 * Start-> [1,3,0,5,8,5]
 * end -> [2,4,6,7,9,9]
 */

public class ActivitySelection {

    public static void main(String args[]){
        int Start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //end time basis sorted.

        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct=1;
        ans.add(0);
        int LastEnd=end[0];

        //Select activities
        for(int i=1;i<end.length;i++){
            if(Start[i]>=LastEnd){
                maxAct++;
                ans.add(i);
                LastEnd=end[i];
            }
        }

        System.out.print(maxAct); //it tell number of activities.

        System.out.println();

        //it tell activity 
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
    }
    
}
