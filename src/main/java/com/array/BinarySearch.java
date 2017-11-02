package com.array;

public class BinarySearch {
	public static int binarySearch(int[] array,int number){
		
		int low = 0;
		int middle = 0;
		int high = array.length-1;
		
		while(low <= high){
			middle = (low + high)/2;
			for(int i =  0;i < array.length;i++){
				
				System.out.print(array[i] + "  ");
				if (middle == i){
					System.out.print("$$" + "  ");
				}
			}
			System.out.println();
			
			if(number == array[middle]){
				return middle;
			}
			if(number < array[middle]){
				high = middle - 1;	
			}
			if(number > array[middle]){
				low = middle + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] a = {2,5,7,8,66,777,4565,23556};
		binarySearch(a,6666666);
	}
}
