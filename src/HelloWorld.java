import translators.CharacterMorseCode;
import translators.MorseTranslator;
import translators.Translator;
import java.io.FileNotFoundException;

public class HelloWorld {

    private HelloWorld(String arg1, String arg2) throws FileNotFoundException {

        Translator a = new MorseTranslator();

        int parsedIndex = Integer.parseInt(arg2);

        System.out.println("The text to be translated into Morse Code: " + arg1);
        System.out.println("The text translated into Morse Code: " + a.translate(arg1));
        System.out.println("The morse code for character " + arg2 + ": " + a.getTranslatedCharacterAt(parsedIndex));

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