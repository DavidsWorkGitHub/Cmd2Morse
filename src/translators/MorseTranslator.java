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

            // if the char is an alphanumeric, enter this loop
            if (Character.toString(current).matches("[A-Z0-9]")) {

                for (int j = 0; j < arrayOfChars1.getArrayLength(); j++) {

                    if (translatedMorseCode.isEmpty() && current == arrayOfChars1.getCharacter(j)) {
                        translatedMorseCode = arrayOfChars1.getMorseCode(j);

                    } else if (current == arrayOfChars1.getCharacter(j)) {
                        translatedMorseCode = translatedMorseCode + " " + arrayOfChars1.getMorseCode(j);
                    }

                }
            }
            else if (translatedMorseCode.isEmpty()) {
                translatedMorseCode = "N/A ";
            }
            else {
                translatedMorseCode = translatedMorseCode + "N/A ";
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
     * @throws IndexOutOfBoundsException thrown if index specified is less than 0 or more than the length of chars
     */
    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {

        String charReturned = "";

        char current = getSourceText().charAt(index);

        for (int i = 0; i < arrayOfChars1.getArrayLength(); i++) {

            if (current == arrayOfChars1.toString().charAt(i)) {
                charReturned = arrayOfChars1.CharacterMorseCodeReturned(getSourceText().charAt(index));
                break;
            } else {
                charReturned = "untranslatable";
            }
        }
        return charReturned;
    }
}
