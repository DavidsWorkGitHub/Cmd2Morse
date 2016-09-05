package translators;

/**
 * Factory with enumerated type for correct translator to be selected.
 * Author: Dane Griffiths
 * Date created: 05/09/16.
 */
public class TranslatorFactory {

    public enum TranslatorSelect {MORSE,UPPERCASE,LOWERCASE,NUMBER}

    /**
     * Method to turn the users choice into the relevant translator.
     * @param option
     * @return
     */
    public Translator getTranslatorFactory(TranslatorSelect option) {

        switch (option) {

            case MORSE:
                return new MorseTranslator();


            case UPPERCASE:
                return new UpperCaseTranslator();


            case LOWERCASE:
                return new LowerCaseTranslator();

            case NUMBER:
                return new NumberTranslator();

            default:
                return null;

        }
    }
}
