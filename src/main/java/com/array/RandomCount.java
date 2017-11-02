package com.array;
/**
 * 随机生成50个数，计算相同的数有多少个，并打印出来
 * @author zsy
 * 用Math.random方式生成50个随机数
 * count方法中
 * 1，先将数组排序，为了方便从小到大的输出，排序用的是快速排序
 * 2，计算相同数个数，并打印出来
 */
public class RandomCount {

	public static void count(int[] a) {
		//排序
		for(int m = 0;m < a.length;m++) {
			int z = m,temp;
			for(int n = m;n<a.length;n++) {
				if(a[n] < a[z]) {
					z = n;
				}					
			}
			temp = a[m];
			a[m] = a[z];
			a[z] = temp;
		}
		//输出排序后数组
		for (int i = 0;i < a.length;i++) {				
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		//计算相同的数有多少个，并打印出来
		for(int j = 0;j <a.length;j++) {
			int count = 1;
			for(int k = j+1;k<a.length;k++) {	
				if(a[j] == a[k]) {
					count++;
					j++;  //相同的数，推到下一个数
				}				
			}
			System.out.print(a[j] +"有"+ count +"个" + "   ");			
		}
	}
	
	public static void main(String[] args) {
		//定义一有50个数的数组，并用Math.random()生成其随机数
		int[] a = new int[50];
		for (int i = 0;i < 50;i++) {			
			a[i] =(int)(Math.random()*40) + 10;		
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		count(a);
	}

}
