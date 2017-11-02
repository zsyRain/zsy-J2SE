package com.array;

/**
 * 选择排序法
 * @author zsy
 * 一组数据，按从小到大排序
 * 从第一个数据开始，与这组数据中还没拍好位置的数据比较大小
 * 将此数据与剩下数据中最小的数据位置互换
 * 剩下未排序的数据按以上方法排序
 */

public class ArraySeletionSort {

	public static void selectionSort(int[] a){
		int k,temp;
		for(int i = 0;i<a.length;i++){
			k = i;
			for(int j = i+1;j<a.length;j++){
				if(a[j]<a[k]){
					k = j;					
				}				
			}
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			System.out.println("第" + (i+1) + "次操作");
			for(int n = 0;n<a.length;n++){
				System.out.print(a[n] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[] array = new int[]{2,5,1,8,4,0};
		selectionSort(array);
	}
}
