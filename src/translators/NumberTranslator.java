package translators;

/**
 * Author: david powell
 * Updated by Dane Griffiths
 * Created on 02/09/16.
 */
public class NumberTranslator implements Translator {

    private String sourceText;

    /**
     * Translate the source string into a target translation.
     *
     * @param source the string to translate
     * @return a translated string
     */
    @Override
    public String translate(String source) {
        this.sourceText = source;
        ConvertTextToNumber x = new ConvertTextToNumber();

        return x.convertTextToNumber(source);
    }

    /**
     * Get the original untranslated string
     *
     * @return the original String
     */
    @Override
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Get a character at an index in the translated string
     *
     * @param index the index of the character to retrieve
     * @return the translated character
     * @throws IndexOutOfBoundsException if the index is greater than the length
     *                                   of the string or less than 0
     */

    @Override
    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {

        String characterToConvert = "" + getSourceText().charAt(index);
        return new NumberTranslator().translate(characterToConvert);
    }
}



