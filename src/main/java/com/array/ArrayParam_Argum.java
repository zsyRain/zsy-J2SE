package com.array;

public class ArrayParam_Argum {

	public static void Parameters(int[] a,int c)
	{		
		c = c *2;
		System.out.println("c=" + c);		
	}
	
	public static void Arguments(int[] a,int b){
		for(int i = 0;i<a.length;i++){
			a[i] = a[i] + 1;
		}		
	}	
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7};
		System.out.println("输出元数据：");
		for(int j = 0;j<array.length;j++){
			System.out.print(array[j] + " ");
		}
		System.out.println();
		Parameters(array,2);
		System.out.println("输出c改变后的数组：");
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Arguments(array,2);
		System.out.println("输出作为实参改变后的数据：");
		for(int j = 0;j<array.length;j++){
			System.out.print(array[j] + " ");
		}
	}

}
