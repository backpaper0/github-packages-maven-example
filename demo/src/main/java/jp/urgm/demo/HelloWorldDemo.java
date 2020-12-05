package jp.urgm.demo;

import jp.urgm.helloworld.HelloWorld;

public class HelloWorldDemo {

	public static void main(String[] args) {
		var helloWorld = new HelloWorld();
		var greeting = helloWorld.sayHello();
		System.out.println(greeting);
	}
}
