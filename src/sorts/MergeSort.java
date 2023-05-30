package sorts;

import javax.management.openmbean.CompositeType;
import java.util.Comparator;

public final class MergeSort {
    public static <T> void doMergeSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        int left = 0;
        int right = shapes.length - 1;

        splitCT(shapes, compareType, left, right);
    }

    private static <T> void splitCT(Comparable<T>[] shapes, Comparator<T> compareType, int left, int right) {
        if(left < right) {
            int middle = left + (right - left) / 2;

            splitCT(shapes, compareType, left, middle);
            splitCT(shapes, compareType, middle+1, right);

            mergeCT(shapes, compareType, left, middle, right);
        }
    }

    private static <T> void mergeCT(Comparable<T>[] shapes, Comparator<T> compareType, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        Comparable<T>[] leftArray = new Comparable[leftSize];
        Comparable<T>[] rightArray = new Comparable[rightSize];

        for(int i = 0; i < leftSize; i++) {
            leftArray[i] = shapes[left + i];
        }
        for(int i = 0; i < rightSize; i++) {
            rightArray[i] = shapes[middle + 1 + i];
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int startingPoint = left;

        while (leftPointer < leftSize && rightPointer < rightSize) {
            if(compareType.compare((T) leftArray[leftPointer], (T) rightArray[rightPointer]) <= 0) {
                shapes[startingPoint] = leftArray[leftPointer];
                leftPointer++;
            } else {
                shapes[startingPoint] = rightArray[rightPointer];
                rightPointer++;
            }
            startingPoint++;
        }

        while(leftPointer < leftSize) {
            shapes[startingPoint] = leftArray[leftPointer];
            leftPointer++;
            startingPoint++;
        }

        while(rightPointer < rightSize) {
            shapes[startingPoint] = rightArray[rightPointer];
            rightPointer++;
            startingPoint++;
        }
    }
}
