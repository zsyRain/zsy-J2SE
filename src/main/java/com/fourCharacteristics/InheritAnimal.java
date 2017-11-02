package com.fourCharacteristics;

import com.sun.org.apache.bcel.internal.generic.INEG;

/**
 * @author zsy
 * 继承：子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，
 * 	或子类从父类继承方法，使得子类具有父类相同的行为
 * 继承的关系是，一般--特殊，父类更通用，子类更具体
 * 当创建一个类时，如果没有指定集成其他类，它默认继承Object类
 * 若Dog继承Animal
 * 	则Animal为父类，也称为超类、基类
 *  Dog为子类，也称为次类、扩展类、派生类
 * 继承的语法：public class Dog extends Animal{}
 * Java继承的限制：单继承，类实现接口implement，可类似多继承
 * 继承的优点：
 * 	提高了代码的重用性
 *  让类与类之间产生了关系，为多台创造了条件
 * 继承的特性：
 *  子类拥有父类非private的属性、方法
 *  子类可以拥有自己的属性和方法，既可以在继承父类功能的基础上，可扩展自己的功能
 *  子类可以用自己的方式是实现父类的方法
 *  Java单继承，可多重继承，比如A继承B，B继承C。。。
 *  提高了类之间的耦合性（继承的缺点）
 */

public class InheritAnimal {
	public String name;
	public int age;
	public InheritAnimal() {
		System.out.println("nihaoa!");
	}
	public InheritAnimal(String myName, int myAge) {
		name = myName;
		age = myAge;
	}
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
		this.age = age;
	}
	public void eat() {
		System.out.println(name + "正在吃食物");
	}
	public void sleep() {
		System.out.println(name + "正在睡觉");
	}
}
