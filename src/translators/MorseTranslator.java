package translators;

/**
 * Class to translate the a String of data into Morse Code
 * Author: Dane Griffiths
 * Date created: 31/08/16.
 */
public class MorseTranslator implements Translator {

    private String sourceText;
    private CharacterMorseCode arrayOfChars1 = new CharacterMorseCode();

    /**
     * Translate a string of text into Morse Code
     * @param source the string to translate
     * @return the translated string
     */
    public String translate(String source) {

        this.sourceText = source;
        String translatedMorseCode = "";

        // loop through the source string
        for (int i = 0; i < source.length(); i++) {

            char current = source.toUpperCase().charAt(i);

            // loop through the entire array of characters to find the source character
            for (int j = 0; j < arrayOfChars1.getArrayLength(); j++) {

                if (translatedMorseCode.isEmpty() && current == arrayOfChars1.getCharacter(j)) {
                    translatedMorseCode = arrayOfChars1.getMorseCode(j);

                } else if (current == arrayOfChars1.getCharacter(j)) {
                    translatedMorseCode = translatedMorseCode + " " + arrayOfChars1.getMorseCode(j);
                }
            }
        }
        return translatedMorseCode;
    }

    /**
     * Get the original untranslated string
     * @return the original String
     */
    public String getSourceText() {

        return sourceText;
    }

    /**
     * Get a character at an index in the translated string
     * @param index the index of the character to retrieve
     * @return the translated character
     * @throws IndexOutOfBoundsException
     */
    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {

        return arrayOfChars1.CharacterMorseCodeReturned(getSourceText().charAt(index));
    }
}
