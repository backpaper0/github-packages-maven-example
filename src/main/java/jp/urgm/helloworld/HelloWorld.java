package jp.urgm.helloworld;

public class HelloWorld {

	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}

	public String sayHello() {
		return sayHello("world");
	}
}
