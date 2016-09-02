package translators;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 02/09/16.
 */
public class LowerCaseTranslator implements Translator{

    private String sourceText;

    /**
     * Translate the source string into a target translation.
     * @param source the string to translate
     * @return a translated string
     */
    @Override
    public String translate(String source) {

        this.sourceText = source;
        String translatedMorseCode = "";

        // loop through the source string
        for (int i = 0; i < source.length(); i++) {

            if (translatedMorseCode.isEmpty()) {
                translatedMorseCode = source.substring(i, i+1).toLowerCase();

            } else {
                translatedMorseCode = translatedMorseCode + source.substring(i, i+1).toLowerCase();
            }
        }
        return translatedMorseCode;
    }

    /**
     * Get the original untranslated string
     * @return the original String
     */
    @Override
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Get a character at an index in the translated string
     * @param index the index of the character to retrieve
     * @return the translated character
     * @throws IndexOutOfBoundsException if the index is greater than the length
     * of the string or less than 0
     */
    @Override
    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {

        // loop through the source text  string
        for (int i = 0; i < sourceText.length(); i++) {

            if (index == i) {

                return String.valueOf(sourceText.toLowerCase().charAt(i));
            }
        }
        return "";
    }
}
