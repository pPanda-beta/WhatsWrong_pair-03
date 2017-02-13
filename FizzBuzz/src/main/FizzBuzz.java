package main;

/**
 * Created by palashd on 13/02/2017.
 */
public class FizzBuzz {
	
	public String display(int i) {
		if(i%3==0)
			return "Fizz";
		if(i%5 == 0)
			return "Buzz";
		return ""+i;
	}
}
