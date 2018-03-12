package com.test;

class Base {
	 public static void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
	
}

public class test {
	public static void main(String args[]) {
		Base obj1 = new Derived();
//		obj1.display();
		obj1.print();
	}
	public void check() {
		Base bb = new Base();
		bb.print();
		bb.display();
		
	}
}