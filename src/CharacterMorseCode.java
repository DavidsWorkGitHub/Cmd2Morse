/**
 * Class of characters and their corresponding morse code.
 * Author: Dane Griffiths
 * Date created: 30/08/16.
 */
class CharacterMorseCode {
    String character;
    String morseCode;

    CharacterMorseCode(String character, String morseCode) {

        this.character = character;
        this.morseCode = morseCode;
    }

    private String getCharacter() {
        return character;
    }

    private String getMorseCode() {
        return morseCode;
    }
}