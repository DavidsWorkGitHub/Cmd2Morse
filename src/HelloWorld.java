import translators.*;
import java.io.FileNotFoundException;
import java.util.EnumSet;
import java.util.Scanner;

public class HelloWorld {

    private HelloWorld() throws FileNotFoundException {

        Scanner terminalInput = new Scanner(System.in);

        System.out.println("\nPlease enter the characters to be translated: ");
        String inputText = terminalInput.nextLine();

        System.out.println("Please enter the index point which you would like to be translated: ");
        int inputIndex = Integer.parseInt(terminalInput.nextLine());

        System.out.println("Please enter one of the following translators to translate your characters: ");
        for (TranslatorFactory.TranslatorSelect info : EnumSet.allOf(TranslatorFactory.TranslatorSelect.class)) {
            System.out.print(info + " - ");
        }
        String inputTranslator = terminalInput.nextLine();

        Translator a = new TranslatorFactory().getTranslatorFactory(TranslatorFactory.TranslatorSelect.valueOf(inputTranslator));
        System.out.printf("\nYour entry %s, translated by %s is %s\n\n", inputText, inputTranslator,a.translate(inputText));
        System.out.printf("The %s translation for character %s is %s",inputTranslator, inputIndex, a.getTranslatedCharacterAt(inputIndex) + "\n");

    }

    public static void main(String[] args){

        try {
            new HelloWorld();
        } catch (FileNotFoundException e) {
            // Prints stack trace if new instance of class unreachable.
            e.printStackTrace();
        }
    }
}