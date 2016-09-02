import translators.*;

import java.io.FileNotFoundException;

public class HelloWorld {

    private HelloWorld(String arg1, String arg2) throws FileNotFoundException {

        int parsedIndex = Integer.parseInt(arg2);

        Translator a = new MorseTranslator();
        System.out.println("The text to be translated into Morse Code: " + arg1);
        System.out.println("The translated text to Morse Code: " + a.translate(arg1));
        System.out.println("The morse code for character " + arg2 + ": " + a.getTranslatedCharacterAt(parsedIndex) + "\n");

        Translator b = new UpperCaseTranslator();
        System.out.println("The text to be translated to upper case: " + arg1);
        System.out.println("The translated text to upper case: " + b.translate(arg1));
        System.out.println("The upper case for character " + arg2 + ": " + b.getTranslatedCharacterAt(parsedIndex) + "\n");

        Translator c = new LowerCaseTranslator();
        System.out.println("The text to be translated to lower case: " + arg1);
        System.out.println("The translated text to lower case: " + c.translate(arg1));
        System.out.println("The lower case for character " + arg2 + ": " + c.getTranslatedCharacterAt(parsedIndex) + "\n");

    }

    public static void main(String[] args){

        try {
            new HelloWorld(args[0], args[1]);
        } catch (FileNotFoundException e) {
            // Prints stack trace if new instance of class unreachable.
            e.printStackTrace();
        }
    }
}