package test.java.com.rtlloyd.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import main.java.com.rtlloyd.app.Assignment7;

class Assignment7Test {

    @Test
    void main_printsHelloWorld() {
	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	System.setOut(new PrintStream(outContent));

	Assignment7.main(new String[] {}); // call the main method

	String expectedOutput = "Hello, World!" + System.lineSeparator();

	assertEquals(expectedOutput, outContent.toString());
    }
}
