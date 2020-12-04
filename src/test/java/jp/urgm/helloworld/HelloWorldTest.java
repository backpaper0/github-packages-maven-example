package jp.urgm.helloworld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HelloWorldTest {

	private final HelloWorld sut = new HelloWorld();

	@ParameterizedTest
	@CsvSource(delimiter = '|', value = {
			"uragami | Hello, uragami!"
	})
	void sayHello(String name, String expected) throws Exception {
		String actual = sut.sayHello(name);
		assertEquals(expected, actual);
	}

	@Test
	void sayHello() throws Exception {
		String actual = sut.sayHello();
		assertEquals("Hello, world!", actual);
	}
}
