package translators;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 05/09/16.
 */
public class TranslatorFactoryTest {

    @Test
    public void testMorse() {

        String inputTranslator = "MORSE";
        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
        assertThat(a, instanceOf(MorseTranslator.class));
    }

    @Test
    public void testUpperCase() {

        String inputTranslator = "UPPERCASE";
        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
        assertThat(a, instanceOf(UpperCaseTranslator.class));
    }

    @Test
    public void testLowerCase() {

        String inputTranslator = "LOWERCASE";
        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
        assertThat(a, instanceOf(LowerCaseTranslator.class));
    }

    @Test
    public void testNumber() {

        String inputTranslator = "NUMBER";
        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
        assertThat(a, instanceOf(NumberTranslator.class));
    }

//    @Test
//    public void testNull() {
//
//        String inputTranslator = "";
//        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
//        assertThat(a.getClass(), is(null));
//    }
}
