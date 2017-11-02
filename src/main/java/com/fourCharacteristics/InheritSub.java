package com.fourCharacteristics;


/**
 * @author zsy
 * 子类继承父类，若父类有无参构造器，则子类无需再构造器中调用父类构造器，
 * 	否则，需要在子类构造器中电泳父类构造器，用super（）调用，括号中填写父类构造器参数，
 *  super（）调用父类构造器时，放在子类构造器的第一行。
 * super关键字：可通过super关键字进行对父类成员的访问。
 * 子类可重写父类的方法，称为重载，即重写父类的这个方法，父类的此方法失效。
 * 子类在继承父类的方法后，可自行扩展不同的方法，以增加自身的功能，比如此例中的fly()方法。
 * 
 * 注：若用final关键字声明类，则此类不能被继承，即最终类，
 *  若final修饰父类中的方法，则此方法可被继承，但不能被重写。
 */

public class InheritSub extends InheritAnimal{
	
	public InheritSub(String name) {
		super();  //父类用无参构造器，可省
		this.name = name;
		System.out.println("hao");
		
	}
	
	public void eat() {
		System.out.println("子类吃食物");
		super.eat();
	}
	
	public void fly(){
		System.out.println("子类可以飞 ");
	}
	/*public void s(String s) {
		s = "sss";
	}
	public void i(int i) {
		i = 10;
	}
	public void p(InheritAnimal animal) {
		animal.name = "zsy";
	}*/
	
	public static void main(String[] args) {
		String a = "w";
		
		/*int i = 1;
		InheritAnimal p =new InheritAnimal();
		p.setName("name");
		InheritSub test = new InheritSub("nianf");
		test.s(a);
		test.i(i);
		test.p(p);
		System.out.println(a);
		System.out.println(i);
		System.out.println(p.name);*/
		
		InheritSub test = new InheritSub("InheritSub");
		test.eat();
	}
	
}
