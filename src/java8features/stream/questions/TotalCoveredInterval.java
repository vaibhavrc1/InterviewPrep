package java8features.stream.questions;

import java8features.stream.questions.helper.Interval;

import java.util.Arrays;
import java.util.List;

public class TotalCoveredInterval {
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(1, 3),
                new Interval(5, 8), new Interval(10, 12));
        int total = intervals.stream().mapToInt(interval-> interval.getEnd() - interval.getStart()).sum();
        System.out.println(total);
    }
}
