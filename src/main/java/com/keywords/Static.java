package com.keywords;

/**
 * @author zsy
 *	static定义的方法和变量称为静态方法、静态变量。
 *	静态变量和方法，只在编译的时候分配一次内存，直到程序结束。实例变量，创建一次实例就分配一次内存空间。
 *	静态方法中不能访问非静态变量，静态方法和变量，可通过--类名.静态方法（变量）来访问。
 *	1，static修饰成员变量，使得变量共享
 *	2，static修饰成员方法，将其变成类方法，可通过类型.静态方法名访问
 *	3，静态块，将类成员放在一起进行初始化，编译时即分配内存，先于构造方法执行
 *	4，静态导包，导入的包前面加static，若方法名没冲突时，访问包中方法时可直接用方法名
 */

public class Static {
	
	private static String name;
	//private int age;
	
	public Static() {
		System.out.println("构造方法");
	}
	
	public static void way1(String name) {
		Static.name = name;
		System.out.println("静态方法1");
	}
	
	static {
		System.out.println("代码块1");
		System.out.println("代码块2");
	}
	
	public static void main(String[] args) {
		Static test = new Static();
		way1("zsy");
		System.out.println(name);
	}
	
	 
	
	

}
