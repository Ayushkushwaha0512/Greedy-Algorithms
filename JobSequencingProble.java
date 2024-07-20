import java.util.*;
/*Given an array of jobs where has a deadline and profit if the job is finished before the deadline .
 * It is also given that every jobs takes a single unit of time, so the minimum possible deadline for any job is 1. 
 * Maximize the total profit if only job can be scheduled at a time.
 */

/*APPROACH
 * 1-> Jobs sort(based on profits)
 * 2-> time=0
 *     for(int i=0;i<jobs;i++){
 *          if(job(deadline)<time){
 *              add jobs in result
 *              time++
 *          }     ;;;
 *      }
 */
public class JobSequencingProble {
    static class job{
        int deadline;
        int profit;
        int id;
        public job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{40,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs=" +seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
