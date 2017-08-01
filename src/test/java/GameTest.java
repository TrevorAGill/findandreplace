import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class GameTest {
    @Test
    public void findString_shouldFindStringInSingleWordString_true() throws Exception {
        Game testGame = new Game();
        assertEquals(true, testGame.findString("red", "red"));
    }
    @Test
    public void findString_shouldFindStringInSentence_true() throws Exception {
        Game testGame = new Game();
        assertEquals(true, testGame.findString("red","I like the color red."));
    }
    @Test
    public void replaceString_shouldReplaceWithGivenString_true() throws Exception {
        Game testGame = new Game();
        assertEquals("I like the color blue.", testGame.replaceString("red","I like the color red.","blue"));
    }
    @Test
    public void replaceString_shouldReplaceWithGivenStringInNonFreeStanding_true() throws Exception {
        Game testGame = new Game();
        assertEquals("Alfblue likes the color blue.", testGame.replaceString("red","Alfred likes the color red.","blue"));
    }
}


//specs
//1. Can recognize a string
//2. Find specific string in a larger string
//3. Replace all instances of the string with a different string
//4. Replace all freestanding and non-freestanding instances of the string with a different string
