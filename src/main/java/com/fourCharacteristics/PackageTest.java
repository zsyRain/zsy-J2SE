package com.fourCharacteristics;

public class PackageTest {
	public static void main(String[] args) {
		Package test = new Package();
		test.setName("zsy");
		test.setAge(26);
		test.setSex("F");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getSex());
	}
}
