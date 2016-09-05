package translators;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 02/09/16.
 */
public class LowerCaseTranslatorTest {

    @Test
    public void translate() throws Exception {

        Translator a = new LowerCaseTranslator();
        String text = "ABcDefG";

        assertEquals("a b c d e f g", a.translate(text));
    }

    @Test
    public void getSourceText() throws Exception {

        Translator a = new LowerCaseTranslator();
        String text = "ABcDefG";
        a.translate(text);

        assertEquals(text, a.getSourceText());
    }

    @Test
    public void getTranslatedCharacterAt() throws Exception {

        Translator a = new LowerCaseTranslator();
        String text = "ABcDefG";
        a.translate(text);

        int index = 2;
        assertEquals("c", a.getTranslatedCharacterAt(index));
    }
}