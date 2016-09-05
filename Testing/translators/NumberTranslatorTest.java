package translators;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



/**
 * Created by david on 05/09/16.
 */
public class NumberTranslatorTest {
    @Test
    public void translate() throws Exception {

        Translator d = new NumberTranslator();
        String text = "abc1234567890";

        assertEquals("abc One  Two  Three  Four  Five  Six  Seven  Eight  Nine  Zero ", d.translate(text));
    }

    @Test
    public void getSourceText() throws Exception {


        Translator d = new NumberTranslator();
        String text = "abc1234567890";

        d.translate(text);

        assertEquals(text, d.getSourceText());
    }

    @Test
    public void getTranslatedCharacterAt() throws Exception {

        Translator d = new NumberTranslator();
        String text = "abc1234567890";
        d.translate(text);

        int index = 3;
        assertEquals("1" , d.getTranslatedCharacterAt(index));
    }

}

