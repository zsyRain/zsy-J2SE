package com.array;

/**
 * n阶幻方（连续摆数法--暹罗法，适用于奇数阶幻方）
 * @author zsy
 * 约定初始位置为第一行中间，放置1
 * 箱当前位置的右上方顺序放置下一个数，将幻方阵沿行、列方向看成环形
 * 若当前位置数为n，及一条对角线已满，则下一个数为本列下一行
 */

public class ArrayOddMagic {

	public static void main(String[] args) {		
		int n = 5;
		int square[][] = new int[n][n];
		int i = 0, j = n/2;
		for(int k = 1;k<=n*n;k++){
			square[i][j] = k;
			if(square[i][j]%n == 0){
				i = (i-1+n)%n;

			}
			else{
				i = (i-1+n)%n;
				j = (j+1)%n;
			}	
			
		}
		for (int q = 0;q<n;q++){
			for(int p = 0;p<n;p++){
				System.out.print(square[q][p] + "  ");
			}
			System.out.println();
		}

	}

}
