package interviewPrepHackerrank.src.warmupProblems;

import java.util.List;

public class JumpingOnClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < c.size() - 1; i++) {
            if (c.get(i) == 0)
                i++;
            count++;
        }

        return count;

    }

}
