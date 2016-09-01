import java.util.Random;
import translators.MorseTranslator;
import translators.Translator;

import java.io.FileNotFoundException;

public class HelloWorld {

    private HelloWorld(String arg) throws FileNotFoundException {

        Translator a = new MorseTranslator();

        Random rand = new Random();
        int value = rand.nextInt(arg.length());

        System.out.println("The text to be translated into Morse Code: " + a.getSourceText(arg));
        System.out.println("The text translated into Morse Code: " + a.translate(arg));
        System.out.println("The character at index " + value + " is " + value + ": " + a.getTranslatedCharacterAt(value));

    }

    public static void main(String[] args){

        try {
            new HelloWorld(args[0]);
        } catch (FileNotFoundException e) {
            // Prints stack trace if new instance of class unreachable.
            e.printStackTrace();
        }
    }
}