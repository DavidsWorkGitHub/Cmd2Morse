package translators;

/**
 * Factory with enumerated type for correct translator to be selected.
 * Author: Dane Griffiths
 * Date created: 05/09/16.
 */
public class TranslatorFactory {

    private static TranslatorFactory theFactory;

    static {
        theFactory = new TranslatorFactory();
    }

    private TranslatorFactory() {

    }

    public static TranslatorFactory getInstance() {

        if (theFactory == null)
            theFactory = new TranslatorFactory();

        return theFactory;
    }

    public enum TranslatorSelect {MORSE,UPPERCASE,LOWERCASE,NUMBER}

    /**
     * Method to turn the users choice into the relevant translator.
     * @param option an entry to specify which translator to use
     * @return a new specific translator, based on the entry of the user
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

    /**
     * Method to get all of the enums the customers can use
     * @return a string containing all of the enums available
     */
    public String getEnumsContent() {

        String stringOfEnums = "";
        for (TranslatorSelect info : TranslatorSelect.values()) {

            if (stringOfEnums.isEmpty()){
                stringOfEnums = stringOfEnums + info;
            } else {
                stringOfEnums = stringOfEnums + " - " + info;
            }
        }
        return stringOfEnums;
    }
}
