package testFrameworkDice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest
{
	public int faceNumber;
	
	public DiceTest()
	{
		faceNumber = 6;
	}

	@Test
	public void test_roll()
	{
		for(int i = 0 ; i < 1000 ; ++i)
		{
			int test = 1+(int)Math.round(Math.random()*(faceNumber-1));
			System.out.println(test);
			assertTrue(test <= 6 && test >=1);
		}
			
	}
	@Test
	public void test_getFace()
	{
		
	}
}
