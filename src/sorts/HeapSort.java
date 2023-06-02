package sorts;

import java.util.Comparator;

public final class HeapSort {
	public static <T> void doHeapSort(Comparable<T>[] shapes, Comparator<T> compareType) {
		int arrLength = shapes.length;
		
		for (int i = (arrLength / 2 - 1); i >= 0; i--) {
			buildHeapComp(shapes, compareType, arrLength, i);
		}
		
		for (int i = arrLength - 1; i > 0; i--) {
			Comparable<T> tempEle = shapes[0];
			shapes[0] = shapes[i];
			shapes[i] = tempEle;
			
			buildHeapComp(shapes, compareType, i, 0);
		}
	}
	
	public static <T> void doHeapSort(Comparable<T>[] shapes) {
		int arrLength = shapes.length;
		for (int i = (arrLength / 2 - 1); i >= 0; i--) {
			buildHeap(shapes, arrLength, i);
		}
	}

	private static <T> void buildHeap(Comparable<T>[] shapes, int arrLength, int i) {
		int largestNum = i;
		int leftEle = 2 * i + 1;
		int rightEle = 2 * i + 2;
		
		if (leftEle < arrLength && shapes[leftEle].compareTo((T)shapes[largestNum]) > 0) {
			largestNum = leftEle;
		}
		
		if (rightEle < arrLength && shapes[rightEle].compareTo((T)shapes[largestNum]) > 0) {
			largestNum = rightEle;
		}
		
		if (largestNum != i) {
			Comparable<T> swapEle = shapes[i];
			shapes[i] = shapes[largestNum];
			shapes[largestNum] = swapEle;
		}
		
		buildHeap(shapes, arrLength, largestNum);
		
	}

	private static <T> void buildHeapComp(Comparable<T>[] shapes, Comparator<T> compareType, int arrLength, int i) {
		int largestNum = i;
		int leftEle = 2 * i + 1;
		int rightEle = 2 * i + 2;
		
		if (leftEle < arrLength && compareType.compare((T)shapes[leftEle], (T)shapes[largestNum]) > 0) {
			largestNum = leftEle;
		}
		
		if (rightEle < arrLength && compareType.compare((T)shapes[rightEle], (T)shapes[largestNum]) > 0) {
			largestNum = rightEle;
		}
		
		if (largestNum != i) {
			Comparable<T> swapEle = shapes[i];
			shapes[i] = shapes[largestNum];
			shapes[largestNum] = swapEle;
		}
		
		buildHeapComp(shapes, compareType, arrLength, largestNum);
	}
}
