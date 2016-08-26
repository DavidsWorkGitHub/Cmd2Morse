public class HelloWorld{
    public static void main(String[] args) {

        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
                "|",".---","..---","...--","....-",".....","-....","--...","---..","----.","-----"};

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";

        for (int i = 0; i < args.length; i++) {

            System.out.print(args[i]);
        }
        for (String s: args) {
            System.out.print(" " +s);
        }




    }


}