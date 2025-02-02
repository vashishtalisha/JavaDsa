package Greedy;
import java.util.*;

public class AssignCookies {
    /*Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
And even though you have 2 cookies, since their size is both 1, you could only make the child
whose greed factor is 1 content.
You need to output 1*/

    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(cookies(s,g));
    }
    static int cookies(int[] s,int[] g){
        Arrays.sort(g);
        Arrays.sort(s);

        //i jagea greed ke saath, j jaega size ke sath
        // end mein jitno ki greed puri hui vo answer
        int i=0,j=0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                i++;

            }
            j++;
        }
        return i;
    }
}
