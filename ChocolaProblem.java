import java.util.*;

/*Chocola Problem
 * we are given a bar of chocolate of m*n square pieces. One ahould break the chocolate int sigle squares.
 * Each break of a part of the chocolate is charged a cost expressed by a positive integer. 
 * This cost does not depend on the size of the part that is being broken goes along. 
 * Let denote the costs of breaking along consecutive vertical lines with x1,x2,.....xm-1  and along horizontal lines with y1,y2,...yn-1.
 * Compute the minimal cost of breaking the whole into single squares.
 */
public class ChocolaProblem {
    public static void main(String args[]){
        int n=4,m=5;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());
        int cost=0;
        int h=0,v=0;
        int hp=0,vp=0;

        while(h<costhor.length && v<costver.length){
            if(costver[v]<=costhor[h]){
                cost +=(costhor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost+=costver[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            hp++;
            h++;
        }
        while(v<costver.length){
            cost+=(costver[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts=" + cost);
    }
    
}
