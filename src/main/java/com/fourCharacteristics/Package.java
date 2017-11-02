package com.fourCharacteristics;


/**
 * @author zsy
 * 封装可理解为包装
 * 封装：一种将抽象性函式接口的实现细则部分包装、隐藏起来的方法
 * 封装可防止该类的代码和数据被外部类定义的代码随机方位
 * 访问封装类，必须通过严格的接口控制
 * 封装重点在于能让我们自己修改自己实现的代码，不用去修改那些实现我们代码的代码
 * 封装让代码更容易理解和维护，加强了代码的安全性
 * 
 * 封装的优点：
 * 	1，良好的封装能减少偶尔
 * 	2，类内部的结构可以自由修改
 * 	3，可以对成员变量更精确的控制
 * 	4，隐藏信息，实现细节
 * 
 * 其中set中的关键字this，是为了解决实例变量和局部变量之间发生的同名的冲突
 */
public class Package {
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 100) {
			System.out.println("期颐之年");
		}else if(age < 100 && age >= 90) {
			System.out.println("耄耋之年");
		}else if(age < 90 && age >= 70) {
			System.out.println("古稀之年");
		}else if(age < 70 && age >= 60) {
			System.out.println("花甲之年");
		}else if(age < 60 && age >= 50) {
			System.out.println("知命之年");
		}else if(age < 50 && age >= 40) {
			System.out.println("不惑之年");
		}else if(age < 40 && age >= 30) {
			System.out.println("而立之年");
		}else if(age < 30 && age >= 20) {
			System.out.println("加冠之年");
		}else if(age < 20 && age >= 15) {
			System.out.println("及笄之年");
		}else if(age < 15 && age >= 13) {
			System.out.println("豆蔻之年");
		}else if(age < 13 && age >= 3) {
			System.out.println("垂髫之年");
		}else if(age < 3 && age >= 2) {
			System.out.println("孩提之年");
		}else{
			System.out.println("襁褓之年");
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

