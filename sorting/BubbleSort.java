package io.bush.sorting;

public class BubbleSort {

	public static int[] bubbleSort(int array[]){
		
		for(int i = 0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				int k=j+1;
				
				if(array[j] > array[k]){
					int temp =array[j];
					array[j]=array[k];
					array[k]=temp;
				}
			}
		}
		
		return array;
	}
	
}
