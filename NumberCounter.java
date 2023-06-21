import java.util.ArrayList;
import java.util.List;

public class NumberCounter {
    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{6, 10});
        intervals.add(new int[]{11, 15});

        int count = countNumbersBetweenIntervals(intervals);
        System.out.println("Total count of numbers between intervals: " + count);
    }

    public static int countNumbersBetweenIntervals(List<int[]> intervals) {
        int count = 0;

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            count += end - start - 1;
        }

        return count;
    }
}