package com.keywords;

/**
 * @author zsy
 *	this关键字，一般非静态方法中。
 *	this通常情况下一般表示“这个对象”或“当前对象”，它本身代表的是当前对象的引用。
 *	
 *	第一：this.成员变量，当局部变量和成员变量同名时，方法中用this.变量名表示成员变量。
 *	第二：this.方法名，表示在本类中，一个方法中调用另一个方法。
 *	第三：this（构造方法参数），表示在本类中，一个构造函数中调用另一个构造函数
 *	第四：return this；返回当前对象。
 *	第五：this代表参数     //例子待定？？？？
 */ 

public class This {

	private String name;
	private int age; 
	public This() {
		this(4);
		System.out.println("无参构造器");
	} 
	
	public This(int i) {
		this(3,"ss");
		System.out.println("带一个参数的构造器");
	}
	
	public This(int i,String s) {		
		System.out.println("带两个参数的构造器");
	}
	
	public void way1(String name) {
		this.name = name;
	}
	
	public This way2(int age) {
		System.out.println("使用this代替一个参数");
		return this;
	}
	
	public void way3(String name,int age) {		
		System.out.println(name + "+" + age );		
	}
	
	public static void main(String[] args) {
		This is = new This();  //this中构造器用法
		is.way1("zsy");
		System.out.println(is.name);
		System.out.println(is.way2(12));
		
		
	}
}

