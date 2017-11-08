package com.enumerate;

import com.intiRecycle.*;

/**
 * @author zsy
 *	enum枚举类:
 *	1,会自动创建toString方法，输出内容
 *	2,默认有ordinal方法和static value（），前者报出当前值所在的位置（按顺序），后者或者当前内容。
 *	3，enum搭配switch使用，有限个数据内，使用很方便。
 */

public class enums {
	private number degree;
	
	public enums(number degree) {
		this.degree = degree;
	}
	
	public void switchnum() {
		switch(degree) {
		case first:System.out.println(degree + " " + "层");
					break;
		case second:System.out.println(degree + " " + "层");
					break;
		case third:System.out.println(degree + " " + "层");
					break;
		case fourth:System.out.println(degree + " " + "层");
					break;
		default:System.out.println("空");
		}
	}
	
	public enum number{
		first,second,third,fourth
	}
		
	public static void main(String[] args) {
		number test1 = number.first;		
		System.out.println(test1);
		
		for(number i : number.values()) {
			System.out.println(i + " " + i.ordinal());
		}
		
		enums test2 = new enums(number.second);
		test2.switchnum();
	}	
	

}

