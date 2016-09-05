package translators;

/**
 * Created by david on 02/09/16.
 */
public class NumberTranslator implements Translator {

    private String sourceText;

    /**
     * Translate the source string into a target translation.
     *
     * @param source the string to translate
     * @return a translated string
     */
    @Override
    public String translate(String source) {
        this.sourceText = source;
        String translatedNumber = "";
        for (int i = 0; i < source.length(); i++) {

            char current = source.charAt(i);


            switch (current) {
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
                    translatedNumber = translatedNumber + current;
                    break;

            }

        }

        return translatedNumber;
    }

    /**
     * Get the original untranslated string
     *
     * @return the original String
     */
    @Override
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Get a character at an index in the translated string
     *
     * @param index the index of the character to retrieve
     * @return the translated character
     * @throws IndexOutOfBoundsException if the index is greater than the length
     *                                   of the string or less than 0
     */

    @Override
    public String getTranslatedCharacterAt(int index) throws IndexOutOfBoundsException {


            String returnedString = "";
            // loop through the source text  string
            for (int i = 0; i < sourceText.length(); i++) {

                if (index == i) {

                    returnedString = String.valueOf(sourceText.charAt(i));
                }
            }
            return returnedString;
        }


    }


