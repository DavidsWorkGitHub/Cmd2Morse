package translators;

/**
 * A class of characters and their corresponding morse code.
 * Author: Dane Griffiths
 * Date created: 30/08/16.
 */
public class CharacterMorseCode {

    private char character[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7',
                                '8', '9'};
    private String morseCode[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                                "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
                                "---..", "----."};
    /**
     * Get teh morse code of a particular character
     * @param alpha the character to lookup
     * @return string of morse code, translated from the character
     */
    String CharacterMorseCodeReturned(char alpha) {

        if (Character.isLowerCase(alpha)) {
            alpha = Character.toUpperCase(alpha);
        }

        for (int i = 0; i < character.length-1; i++) {

            if (alpha == character[i])
                return morseCode[i];
        }
        return "";
    }

    /**
     * Get the length of the array
     * @return an integer to indicate length of array
     */
    int getArrayLength() {
        return character.length;
    }

    /**
     * Get a character from the array
     * @param i the index in the array
     * @return the character at the index point
     */
    char getCharacter(int i) {
        return character[i];
    }

    /**
     * Get a string of morse code from the array
     * @param i the index in the array
     * @return the string of morse code at the index point
     */
    String getMorseCode(int i) {
        return morseCode[i];
    }
}