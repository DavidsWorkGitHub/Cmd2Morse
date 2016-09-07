package translators;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 05/09/16.
 */
public class TranslatorFactoryTest {

    @Test
    public void testMorse() {

        TranslatorFactory tF = TranslatorFactory.getInstance();
        String inputTranslator = "MORSE";
        Translator a = tF.getTranslatorFactory((TranslatorFactory.TranslatorSelect.valueOf(inputTranslator)));
        assertThat(a, instanceOf(MorseTranslator.class));
    }

    @Test
    public void testUpperCase() {

        TranslatorFactory tF = TranslatorFactory.getInstance();
        String inputTranslator = "UPPERCASE";
        Translator a = tF.getTranslatorFactory((TranslatorFactory.TranslatorSelect.valueOf(inputTranslator)));
        assertThat(a, instanceOf(UpperCaseTranslator.class));
    }

    @Test
    public void testLowerCase() {

        TranslatorFactory tF = TranslatorFactory.getInstance();
        String inputTranslator = "LOWERCASE";
        Translator a = tF.getTranslatorFactory((TranslatorFactory.TranslatorSelect.valueOf(inputTranslator)));
        assertThat(a, instanceOf(LowerCaseTranslator.class));
    }

    @Test
    public void testNumber() {

        TranslatorFactory tF = TranslatorFactory.getInstance();
        String inputTranslator = "NUMBER";
        Translator a = tF.getTranslatorFactory((TranslatorFactory.TranslatorSelect.valueOf(inputTranslator)));
        assertThat(a, instanceOf(NumberTranslator.class));
    }

//    @Test
//    public void testNull() {
//
//        TranslatorFactory tF = TranslatorFactory.getInstance();
//        String inputTranslator = "";
//        Translator a = tF.getTranslatorFactory((TranslatorFactory.TranslatorSelect.valueOf(inputTranslator)));
//        assertThat(a.getClass(), is(null));
//    }
}
