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



}