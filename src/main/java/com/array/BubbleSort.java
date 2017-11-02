package com.array;

/**
 * 冒泡排序
 * @author zsy
 * 两两一比较，前者比后者大，则调换位置
 * 每次i中的j循环完一次，在未确定位置的数字中，最大的数就排在了这些数的最后面
 * 冒泡排序，类似于，一个一个将最大的数先往整个序列的后面排
 *
 */

public class BubbleSort {	
	public static void bubble(int[] a){
		for (int i = a.length-1;i>0;i--){
			int temp;			
			for(int j = 0;j<i;++j){
				if(a[j+1]<a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					for (int n = 0;n<a.length;n++){
						System.out.print(a[n] + " ");						
					}
				}
				System.out.print("   ");			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] array = {7,4,8,2,1};		
		bubble(array);
	}

}
