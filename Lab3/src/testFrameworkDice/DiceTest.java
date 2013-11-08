package testFrameworkDice;

import static org.junit.Assert.*;

import org.junit.Test;

import frameworkDice.Dice;

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
		for (int i = 0; i < 1000; ++i)
		{
			Dice testDice = new Dice();
			int test = testDice.roll();
			assertTrue(test <= 6 && test >= 1);
		}

	}

	@Test
	public void test_getFace()
	{
		fail("Not yet implemented");
	}
}
