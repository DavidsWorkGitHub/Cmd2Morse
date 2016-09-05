package translators;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
<<<<<<< Updated upstream
import static org.junit.Assert.*;
=======
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
    @Test
    public void getSourceText() throws Exception {


        Translator d = new NumberTranslator();
        String text = "abc1234567890";
=======

    @Test
    public void getSourceText() throws Exception {

        Translator d = new NumberTranslator();
        String text = "abc One  Two  Three  Four  Five  Six  Seven  Eight  Nine  Zero ";
>>>>>>> Stashed changes
        d.translate(text);

        assertEquals(text, d.getSourceText());
    }
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    @Test
    public void getTranslatedCharacterAt() throws Exception {

        Translator d = new NumberTranslator();
        String text = "abc1234567890";
        d.translate(text);

<<<<<<< Updated upstream
        int index = 3;
        assertEquals("1" , d.getTranslatedCharacterAt(index));
    }

}
=======
        int index = 2;
        assertEquals("c", d.getTranslatedCharacterAt(index));
    }
}
>>>>>>> Stashed changes
