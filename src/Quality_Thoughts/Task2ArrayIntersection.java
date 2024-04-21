package Quality_Thoughts;

import java.util.Arrays;

public class Task2ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] intersection = findIntersection(array1, array2);
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
    private static int[] findIntersection(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        int[] temp = new int[Math.min(array1.length, array2.length)];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                
                temp[k++] = array1[i];
                i++;
                j++;
            }
        }
        int[] intersection = new int[k];
        System.arraycopy(temp, 0, intersection, 0, k);
        return intersection;
    }
}
