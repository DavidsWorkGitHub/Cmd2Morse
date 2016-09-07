package translators;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 02/09/16.
 */
public class MorseTranslatorTest {

    @Test
    public void translateValidChar() throws Exception {
        Translator a = new MorseTranslator();
        String text = "ABCDEFG";
        assertEquals(".- -... -.-. -.. . ..-. --.", a.translate(text));
    }

    @Test
    public void translateEmptyInvalidChar() throws Exception {
        Translator a = new MorseTranslator();
        String text = "£";
        assertEquals("N/A ", a.translate(text));
    }

    @Test
    public void translateNotEmptyInvalidChar() throws Exception {
        Translator a = new MorseTranslator();
        String text = "£££";
        assertEquals("N/A N/A N/A ", a.translate(text));
    }

    @Test
    public void getSourceText() throws Exception {
        Translator a = new MorseTranslator();
        String text = "ABCDEFG";
        a.translate(text);

        assertEquals(text, a.getSourceText());

    }

    @Test
    public void getTranslatedCharacterAt() throws Exception {


        Translator a = new MorseTranslator();

        String text = "ABCDEFG";
        a.translate(text);

        int index = 2;
        assertEquals("-.-.", a.getTranslatedCharacterAt(index));

    }

}