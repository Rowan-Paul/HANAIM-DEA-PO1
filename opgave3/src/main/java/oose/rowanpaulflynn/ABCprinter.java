package oose.rowanpaulflynn;

public class ABCprinter {

    private char character = 'a';

    public void printValue() {
        System.out.println(character);

        character = (char) (character + 1);
        if (character > 'z') character = 'a';
    }
}
