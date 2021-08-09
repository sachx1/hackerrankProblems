package interviewPrepHackerrank.src.warmupProblems;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here

        long fullString = n / s.length();
        long remainder = n % s.length();

        long freq = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'a')
                freq++;
        }

        freq *= fullString;

        for (int i = 0; i < remainder; i++) {
            if (c[i] == 'a')
                freq++;
        }

        return freq;

    }

}
