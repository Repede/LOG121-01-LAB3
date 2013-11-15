package testframeworkdice;

import static org.junit.Assert.*;

import org.junit.Test;

import frameworkdice.Player;

public class PlayerTest
{
	
	@Test
	public void test_addScore()
	{
		Player testPlayer = new Player("Test");
		assertTrue(testPlayer.getScore() == 0);
		int test = 0;
		for(int i = 0 ; i < 1000 ; ++i)
		{
			testPlayer.addScore(i);
			test+=i;
			assertTrue(testPlayer.getScore() == test);
		}
	}

	@Test
	public void test_compareTo()
	{
		for(int i = 0 ; i < 1000 ; ++i)
		{
			Player testPlayer = new Player("test1");
			Player otherPlayers = new Player("test2");
			testPlayer.addScore(10+i);
			otherPlayers.addScore(5+i);
			assertTrue(testPlayer.compareTo(otherPlayers) == 1);
			assertTrue(otherPlayers.compareTo(testPlayer) == -1);
			otherPlayers.addScore(5);
			assertTrue(otherPlayers.compareTo(testPlayer) == 0);
		}
	}

}
