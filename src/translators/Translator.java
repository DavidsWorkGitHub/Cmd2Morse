package translators;

/**
 * Method to .......
 * Author: Dane Griffiths
 * Date created: 31/08/16.
 */
public interface Translator {

    /**
     * Translate the source string into a target translation.
     * @param source the string to translate
     * @return a translated string
     */
    public String translate( String source );

    /**
     * Get the original untranslated string
     * @return the original String
     */
    public String getSourceText( String args );

    /**
     * Get a character at an index in the translated string
     * @param index the index of the character to retrieve
     * @return the translated character
     * @throws IndexOutOfBoundsException if the index is greater than the length
     * of the string or less than 0
     */
    public String getTranslatedCharacterAt( int index ) throws IndexOutOfBoundsException;

}
