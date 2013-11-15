package testframeworkdice;

import static org.junit.Assert.*;

import org.junit.Test;

import frameworkdice.DiceItem;

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
			DiceItem testDice = new DiceItem();
			int test = testDice.roll();
			assertTrue(test <= 6 && test >= 1);
		}

	}
	
	@Test
	public void test_compareTo()
	{
		for(int i = 0 ; i < 100 ; ++i)
		{
			DiceItem testDice = new DiceItem();
			DiceItem otherDice = new DiceItem();
			while(otherDice.getResult() != 6)
			{
				otherDice.roll();
			}
			while(testDice.getResult() != 1)
			{
				testDice.roll();
			}
			assertTrue(testDice.compareTo(otherDice) == -1);
			assertTrue(otherDice.compareTo(testDice) == 1);
			while(otherDice.getResult() != 1)
			{
				otherDice.roll();
			}
			assertTrue(testDice.compareTo(otherDice) == 0);
			assertTrue(otherDice.compareTo(testDice) == 0);
		}
	}
}
