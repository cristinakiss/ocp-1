package eu.cristinakiss.cert.ocp1.ch5;

import java.util.Arrays;

public class ArraysStudy {

    public static void main(String[] args) {
        int [] n = {2, 4, 6 ,8};
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.binarySearch(n, 2));
        System.out.println(Arrays.binarySearch(n, 4));
        System.out.println(Arrays.binarySearch(n, 5));
        System.out.println(Arrays.binarySearch(n, 1));
        System.out.println(Arrays.binarySearch(n, 9));

        System.out.println("========");
//        System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); // -1
//        System.out.println(Arrays.compare(new int[] {5}, new int[] {3})); // 1
//        System.out.println(Arrays.compare(new int[] {5, 1}, new int[] {3, 3})); // 1
//        System.out.println(Arrays.compare(new int[] {5, 1}, new int[] {5, 3})); // -1
//        System.out.println(Arrays.compare(new int[] {1}, new int[] {2, 3})); // -1
        System.out.println(Arrays.compare(new int[] {1, 2, 3}, new int[] {2, 3})); // -1
    }
}
