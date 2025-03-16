package java8features.stream.questions;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element

        int kth = Arrays.stream(array).sorted().skip(k-1).findFirst().orElseThrow();
        System.out.println(kth);
    }
}
