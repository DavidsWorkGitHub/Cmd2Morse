package translators;

/**
 * Class to translate the a String of data into Morse Code
 * Author: Dane Griffiths
 * Date created: 31/08/16.
 */
public class MorseTranslator implements Translator {

    private CharacterMorseCode arrayOfChars1 = new CharacterMorseCode();
    /**
     * Translate a string of text into Morse Code
     * @param source the string to translate
     * @return the translated string
     */
    public String translate(String source) {


        String translatedMorseCode = "";

        for (int i = 0; i < source.length(); i++) {

            char current = source.toUpperCase().charAt(i);

            for (int j = 0; j < arrayOfChars1.getArrayLength(); j++) {

                if (translatedMorseCode.isEmpty() && current == arrayOfChars1.getCharacter(j)) {
                    translatedMorseCode = translatedMorseCode + arrayOfChars1.getMorseCode(j);

                } else if (current == arrayOfChars1.getCharacter(j)) {
                    translatedMorseCode = translatedMorseCode + " " + arrayOfChars1.getMorseCode(j);
                }
            }
        }
        return translatedMorseCode;
    }

    public String getSourceText(String args) {

        return args;
    }

    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {

        return arrayOfChars1.getMorseCode(index);
    }
}
