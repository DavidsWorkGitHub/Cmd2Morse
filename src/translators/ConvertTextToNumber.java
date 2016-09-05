package translators;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 05/09/16.
 */
public class ConvertTextToNumber {

    public String convertTextToNumber(String source) {

        String translatedNumber = "";

        for (int i = 0; i < source.length(); i++) {
            char x = source.charAt(i);

            switch (x) {

                case '1':
                    translatedNumber = translatedNumber + " One ";
                    break;
                case '2':
                    translatedNumber = translatedNumber + " Two ";
                    break;
                case '3':
                    translatedNumber = translatedNumber + " Three ";
                    break;
                case '4':
                    translatedNumber = translatedNumber + " Four ";
                    break;
                case '5':
                    translatedNumber = translatedNumber + " Five ";
                    break;
                case '6':
                    translatedNumber = translatedNumber + " Six ";
                    break;
                case '7':
                    translatedNumber = translatedNumber + " Seven ";
                    break;
                case '8':
                    translatedNumber = translatedNumber + " Eight ";
                    break;
                case '9':
                    translatedNumber = translatedNumber + " Nine ";
                    break;
                case '0':
                    translatedNumber = translatedNumber + " Zero ";
                    break;
                default:
                    translatedNumber = translatedNumber + source;
                    break;
            }
        }
        return translatedNumber;
    }
}
