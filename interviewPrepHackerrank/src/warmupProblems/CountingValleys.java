package interviewPrepHackerrank.src.warmupProblems;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER steps 2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int v = 0; // valleys
        int lvl = 0; // level

        for (char c : path.toCharArray()) { // converts the string into a char array
            if (c == 'U') // these if statements check to see if the letter is a U or D, and either adds
                          // or subtracts from lvl
                lvl++;
            if (c == 'D')
                lvl--;

            if (lvl == 0 && c == 'U') { // checks to see if the hiker has walked across a valley, if so increment the
                                        // valley variable
                ++v;
            }
        }
        return v;
    }

}
