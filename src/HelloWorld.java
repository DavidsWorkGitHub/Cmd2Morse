public class HelloWorld{

    public static void main(String[] args) {

        String[] text = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                        "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

        CharacterMorseCode[] arrayOfChars = new CharacterMorseCode[text.length];

        for (int i = 0; i < text.length; i++) {

            arrayOfChars[i] = new CharacterMorseCode(text[i], morse[i]);

        }

        System.out.println("You entered " + args[0] + ".\n");
        System.out.println("**********\nTranslated\n**********");
        translateCharsToMorse(args[0], arrayOfChars);

        //System.out.println(array[(translateCharsToMorse(args[0], array))].character + " = " +
        //                      array[(translateCharsToMorse(args[0], array))].morseCode);
    }

    /**
     * Method to translate the text input in terminal into morse code.
     * @param args A string containing the text entered in terminal.
     * @param arrayOfTranslations An array containing the characters, and their retrospective morse code.
     */
    private static void translateCharsToMorse(String args, CharacterMorseCode[] arrayOfTranslations) {

        // Loop through each iteration of the terminal text.
        for (int i = 0; i < args.length(); i++) {

            String current = String.valueOf(args.charAt(i));

            // Loop through the array of characters to find the translated morse code.
            for (CharacterMorseCode arrayOfTranslation : arrayOfTranslations) {

                if (current.equalsIgnoreCase(arrayOfTranslation.character)) {

                    System.out.println(arrayOfTranslation.character + " = " + arrayOfTranslation.morseCode);

                }
            }
        }
    }
}