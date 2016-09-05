package translators;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 02/09/16.
 */
public class UpperCaseTranslatorTest {

    @Test
    public void translate() throws Exception {

        Translator a = new UpperCaseTranslator();
        String text = "abCdEfG";

        assertEquals("A B C D E F G", a.translate(text));
    }

    @Test
    public void getSourceText() throws Exception {

        Translator a = new UpperCaseTranslator();
        String text = "abCdEfG";
        a.translate(text);

        assertEquals(text, a.getSourceText());
    }

    @Test
    public void getTranslatedCharacterAt() throws Exception {

        Translator a = new UpperCaseTranslator();

        String text = "abCdEfG";
        a.translate(text);

        int index = 2;
        assertEquals("C", a.getTranslatedCharacterAt(index));
    }
}