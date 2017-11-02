package com.array;

/**
 * Fibonaci
 * @author zsy
 * 用一维数组储存fibonacci序列
 */

public class ArrayFibonacci {

	public static void main(String[] args) {
		int n = 25;
		int fib[] = new int[n];
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2;i<n;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int j = 0;j<n;j++){
			System.out.print(fib[j] + "  ");
		}
 	}

}
