package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void test(){
		assertTrue(FizzBuzz.getNum(3).equals("Fizz"));
	}

}
