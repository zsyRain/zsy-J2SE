package com.array;

import java.util.ArrayList;

public class aaa {

	public static void main(String[] args) {

		
		ArrayList a = new ArrayList();
		a.add(new Integer(1));
		/*
		 * String str1 = "aaa"; String str2 = "aaa";
		 * System.out.println(str1.equals(str2));
		 */

		// 随机生成50个数，计算相同的数有多少个，并打印出来
		
		/*int[] count = new int[41];
		Random random = new Random();

		for (int i = 0; i < 50; i++) {
			int number = random.nextInt(41) + 10;
			System.out.print(number + "  ");
			count[number - 10]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (0 == count[i]) {
				continue;
			}
			System.out.println((10 + i) + "出现次数：" + count[i]);
		}

		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		System.out.println("出现的最大次数为：" + max + "次");
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) {
				System.out.println(i + 10);
			}
		}*/
		
		
		
}

class Person{
	int score;
	
	public Person(int score) {
		this.score= score;
	}
	public void Person(int score){
		
	}
	public String toString() {
		return String.valueOf(this.score);
	}
}
}
