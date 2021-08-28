package com.learn.patterns.design.creational.singleton.impl3;

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.setData(33);
		System.out.println("First reference : " + instance);
		System.out.println("Data Value : " + instance.getData());
		instance = null;
		instance = Singleton.getInstance();
		System.out.println("Secondr reference : " + instance);
		System.out.println("Data Value : " + instance.getData());
	}
}
