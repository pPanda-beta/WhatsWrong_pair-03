package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by palashd on 13/02/2017.
 */
public class FizzBuzzTest {
	
	@Test
	public  void displayShouldReturnNumberWhenNotAMultipleof3or5(){
		String expectedResult="4";
		String actualResult=new FizzBuzz().display(4);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public  void displayShouldReturnFizzWhenMultipleof3(){
		String expectedResult="Fizz";
		String actualResult=new FizzBuzz().display(3);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void displayShouldReturnBuzzWhenMultipleof5(){
		String expectedResult="Buzz";
		String actualResult = new FizzBuzz().display(25);
		assertEquals(expectedResult,actualResult);
	}
}
