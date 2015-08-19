package game;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Created by Aaron on 8/19/2015.
 */
public class GameTest {
    Game game;

    @Before
    public void SetUp(){
        game = new Game();
    }

    @Test
    public void StringReverserTest(){
        String input = "Test";
        String result = Game.stringReverser(input);
        assertEquals("tseT", result);
    }

    @Test
    public void PrimeFinderTest(){
        int w = 2;
        int x = 4;
        int y = 5;
        int z = 14;

        Boolean resultW = Game.primeFinder(w);
        Boolean resultX = Game.primeFinder(x);
        Boolean resultY = Game.primeFinder(y);
        Boolean resultZ = Game.primeFinder(z);
        assertEquals(true, resultW);
        assertEquals(false, resultX);
        assertEquals(true, resultY);
        assertEquals(false, resultZ);
    }
}