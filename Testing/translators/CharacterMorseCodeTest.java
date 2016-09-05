package translators;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 01/09/16.
 */
public class CharacterMorseCodeTest {

    @Test
    public void characterMorseCodeReturnedTestCase() throws Exception {
        CharacterMorseCode testArray = new CharacterMorseCode();
        char lowerCase = 'a';

        assertEquals(".-", testArray.CharacterMorseCodeReturned(lowerCase));
    }

    @Test
    public void characterMorseCodeReturnedTestCharNotInArray() throws Exception {
        CharacterMorseCode testArray = new CharacterMorseCode();
        char lowerCase = '&';

        assertEquals("", testArray.CharacterMorseCodeReturned(lowerCase));
    }

    @Test
    public void getArrayLength() throws Exception {

        CharacterMorseCode testArray = new CharacterMorseCode();
        assertEquals(36, testArray.getArrayLength());
    }

    @Test
    public void getCharacter() throws Exception {

        CharacterMorseCode testArray = new CharacterMorseCode();
        assertEquals('F', testArray.getCharacter(5));

    }

    @Test
    public void getMorseCode() throws Exception {

        CharacterMorseCode testArray = new CharacterMorseCode();
        assertEquals("..-.", testArray.getMorseCode(5));
    }

}