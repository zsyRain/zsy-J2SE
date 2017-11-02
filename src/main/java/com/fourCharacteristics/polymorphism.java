package com.fourCharacteristics;


/**
 * @author zsy
 *
 */
public class polymorphism {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Cycle[] all ={
			new Unicycle(),
			new Bicycle(),
			new Tricycle()			
		};
		for (Cycle a : all ) {
			a.ride();
			a.toString();
			/*a.wight();*/  //此写法是错误的，基类的私有属性和方法不能被调用
			a.color();
		
		}
	}
}

class Cycle{
	public Cycle() {
		System.out.println(this);
	}
	public void ride() {
		System.out.println("轮子车");
	}
	public void wheels() {
		System.out.println("轮子数量");
	}
	private void weight() {
		System.out.println("重量");
	}
	static  void color(){
		System.out.println("颜色自定义");
	}
}

class Unicycle extends Cycle{
	public void ride() {
		System.out.println("单轮转圈");
	}
	public void weight() {
		System.out.println("单轮一斤");
	}    //父类有此方法的私有，子类中写同样的方法名，不算重写父类方法
	/*public void color(){
		
	}*/   //父类的静态方法不可以被调用 
}

class Bicycle extends Cycle{
	public void ride() {
		System.out.println("两轮子");		
		wheels();
	}
}

class Tricycle extends Cycle{
	public void ride() {
		System.out.println("三轮子");		
		wheels();
	}
}