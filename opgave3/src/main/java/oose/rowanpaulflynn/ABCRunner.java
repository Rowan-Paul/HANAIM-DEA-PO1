package oose.rowanpaulflynn;

public class ABCRunner implements Runnable {

    private final ABCprinter ABCprinter;

    public ABCRunner(final ABCprinter ABCprinter) {
        this.ABCprinter = ABCprinter;
    }

    public void runABC() {
        while (true) {
            ABCprinter.printValue();
        }
    }

    @Override
    public void run() {
        runABC();
    }
}
