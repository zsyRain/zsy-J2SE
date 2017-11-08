package com.keywords;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author zsy
 * final:final修饰的主要有三种，final数据，final方法，final类
 * 用final修饰主要是从设计和效率两方面考虑
 * final变量：
 * 	1，final修饰变量，必须要赋值，否则会报错
 * 	2，final和static共同修饰一个变量时，名字不许大写，单词与单词之间用下划线（_）连接
 * 	3，final定义但没赋值的空final变量，必须在构造器中给这个变量赋值
 * 	4，final参数，待定！
 * final方法：
 * 	1，final修饰的方法不能被继承
 * 	2，final修饰的方法不能被重写
 * 	3，final和private修饰的方法，在子类中即使出现相同名字的方法，也不会报错，因为private修饰的属于组织内部的，不算对外接口
 * final类：
 * 	1，不能被继承的终类
 * 
 */
public class Final {
	
	public static void main(String[] args) {
		FinalExtend test = new FinalExtend();
	}
}

class FinalDate{
	private final int d = 2;	
	private final String ds;	
	private static final String dss = "aaa";
	
	public FinalDate() {
		ds = "zsy";		
		System.out.println(d);
		System.out.println(ds);
		System.out.println(dss);
	}
	
	public final void final1() {
		System.out.println("final方法");
	}
	private final void final2() {
		System.out.println("final和static方法");
	}
}

class FinalExtend extends FinalDate{
//	public void final1() {}  报错，不能重写
	public void final2() {
		System.out.println("你好");
	}
}