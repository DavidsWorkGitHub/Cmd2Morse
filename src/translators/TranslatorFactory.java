package translators;

/**
 * Factory with enumerated type for correct translator to be selected.
 * Author: Dane Griffiths
 * Updated By David Powell on 07/09/16
 * Date created: 05/09/16.
 */
public class TranslatorFactory {
    private static TranslatorFactory instance = null;


    protected static TranslatorFactory getInstance() {
        instance = new TranslatorFactory();

        if (instance == null) {
            instance = new TranslatorFactory ();
        }
        return instance;
    }

    /**
     * Method to turn the users choice into the relevant translator.
     *
     * @param option
     * @return
     */

    public Translator getTranslatorFactory(TranslatorSelect option) {

        switch (option) {

            case MORSE:
                return new MorseTranslator ();


            case UPPERCASE:
                return new UpperCaseTranslator ();


            case LOWERCASE:
                return new LowerCaseTranslator ();

            case NUMBER:
                return new NumberTranslator ();

            default:
                return null;

        }
    }


    public enum TranslatorSelect {MORSE, UPPERCASE, LOWERCASE, NUMBER}
}
