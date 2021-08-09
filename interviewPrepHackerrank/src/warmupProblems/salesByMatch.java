package interviewPrepHackerrank.src.warmupProblems;

import java.util.HashSet;
import java.util.List;

class salesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        /*
         * In order to see if theyre duplicates, we can use a hashset. since a hashset
         * cannot hold duplicates, we loop through it too see if they are any. If there
         * is a duplicate, increment the counter by 1, else keep going
         */

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            int element = ar.get(i);
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }

        return count;

    }

}

// public class Solution {
// public static void main(String[] args) throws IOException {
// BufferedReader bufferedReader = new BufferedReader(new
// InputStreamReader(System.in));
// BufferedWriter bufferedWriter = new BufferedWriter(new
// FileWriter(System.getenv("OUTPUT_PATH")));

// int n = Integer.parseInt(bufferedReader.readLine().trim());

// List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
// "").split(" "))
// .map(Integer::parseInt)
// .collect(toList());

// int result = Result.sockMerchant(n, ar);

// bufferedWriter.write(String.valueOf(result));
// bufferedWriter.newLine();

// bufferedReader.close();
// bufferedWriter.close();
// }
// }
