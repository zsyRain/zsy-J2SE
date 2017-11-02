package com.array;

/**
 * 定义数组的方式
 * @author zsy
 * 数组的初始化分为两种，静态初始化和动态初始化
 * 数组类型可为：int\double\float\boolean\char\类\接口等等
 * 数组必须先初始化，然后才能使用
 * 数组元素只要分配了内存空间，其就有初始值
 * 静态初始化：只指定数组元素的初始值，不指定数组长度
 * 动态初始化：只指定数组的长度，由系统为每个数组元素指定初始值
 * 
 * 初始化数组时元素的类型可以是定义数组时元素类型的子类
 */

public class ArrayDifine { 
	public static void main(String[] args){		
		int array1[],i;    //申明数组，和变量i
		array1 = new int[3];   //用new初始化数组
		for(i=0;i<array1.length;i++){	//用for循环对动态初始化后的数组赋值
			array1[i] = i;
			System.out.print(array1[i] + "  ");
		}
		System.out.println();
			
		//数组的定义和初始化同时完成，使用简化的静态初始化
		int[] array2 = {1,2,3};   
		System.out.println(array2);
		
		//数组的定义和初始化同时完成，静态初始化
		int array3[] = new int[]{2,4,6};
		System.out.println(array3);
		
		//数组定义和初始化同时完成，初始化数组时元素的类型是定义数组时元素类型的子类
		Object[] books = new String[4];
		System.out.println(books);
	}
}
