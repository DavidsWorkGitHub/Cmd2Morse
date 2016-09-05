import translators.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {

    private HelloWorld(String arg1, String arg2) throws FileNotFoundException {

        int parsedIndex = Integer.parseInt(arg2);

        Translator a = new MorseTranslator();

        System.out.println("The text to be translated into Morse Code: " + arg1);
        System.out.println("Thadsfasdf: " + a.getSourceText());
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

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the characters to be translated: ");
        String inputText = s.nextLine();
        System.out.println("Please enter the index point which you would like to be translated: ");
        int inputIndex = Integer.parseInt(s.nextLine());
        System.out.println("Please enter the type of translator you wish to use: ");
        String inputTranslator = s.nextLine();

        Translator z = new TranslatorFactory().getTranslatorFactory(inputTranslator);
        System.out.println("\nThe text to be translated to lower case: " + inputText);
        System.out.println("The translated text to lower case: " + z.translate(inputText));
        System.out.println("The lower case for character " + inputIndex + ": " + z.getTranslatedCharacterAt(inputIndex) + "\n");

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