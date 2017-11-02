package com.array;

/**
 * 
 * @author zsy
 * 将数组转换成数组表示
 * 将转换的数组进行加乘
 */
public class ArrayToMatrix {

	public static void showMutrix(int[][] a,int[][] b){
		System.out.println("array A");
		for(int i = 0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("array B");
		for(int i = 0;i<b.length;i++){
			for(int j = 0;j<b[i].length;j++){
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void addMutrix(int[][] a,int[][] b,int[][] e){
		System.out.println("A+B");
		for(int i  = 0;i<e.length;i++){
			for(int j = 0;j<a[i].length;j++){
				e[i][j] = a[i][j] + b[i][j];
				System.out.print(e[i][j] + "   ");
			}
			System.out.println();			
		}
	}
	
	public static void multiply(int[][] a,int[][] b,int[][] e){
		System.out.println("A*B");
		for(int i = 0;i<e.length;i++){
			
			for(int j = 0;j<e[i].length;j++){
				e[i][j] = 0;
				for(int k =0;k<a[i].length;k++){
					e[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(e[i][j] + "  ");
			}
			System.out.println();
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[][] aa = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] bb = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
		int[][] ee = new int[3][3];
		
		showMutrix(aa,bb);
		addMutrix(aa,bb,ee);
		multiply(aa,bb,ee);
		

	}

}
