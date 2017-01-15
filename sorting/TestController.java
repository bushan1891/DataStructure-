package io.bush.sorting;

public class TestController {
	public static void main(String[] args) {
		
		int[] array = {1,40,2,65,3,-1,42,33};
		
		int[] sortedArray = BubbleSort.bubbleSort(array);
		
		for(int i : sortedArray){
			System.out.println("sorted array" +i);
		}
		
	}
}
