package com.intiRecycle;

/**
 * @author zsy
 *	初始化操作：
 *	1，变量优先构造器初始化,，与位置无关。
 *	2，静态对象优先实例对象初始化。
 *	
 */

public class Intialization {
	
	public static void main(String[] args) {
		Intial i = new Intial();
	}
	
}

class Intial{
	Test test1 = new Test(1);
	static Test test2 = new Test(2);
	public Intial() {
		System.out.println("构造");
	}
	Test test3 = new Test(3);
	static Test test4 = new Test(4);
}

class Test{
	
	public Test(int mark) {
		System.out.println("构造器" + mark);
	}
}

