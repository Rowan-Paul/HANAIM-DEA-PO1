package oose.rowanpaulflynn;

public class ABCMain {

    public static void main(String[] args) {
        var abcPrinter = new ABCprinter();

        var abcRunner1 = new ABCRunner(abcPrinter);
        var abcRunner2 = new ABCRunner(abcPrinter);

        // a
        Thread t1 = new Thread(
                () -> abcRunner1.runABC()
        );

        Thread t2 = new Thread(
                () -> abcRunner2.runABC()
        );

        // b
        Thread t3 = new Thread(new ABCRunner(abcPrinter));
        Thread t4 = new Thread(new ABCRunner(abcPrinter));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
