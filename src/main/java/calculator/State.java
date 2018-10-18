package calculator;

public abstract class State {

    abstract void clear(Calculator context);
    abstract void digit (Calculator context, char key);
    abstract void arifm (Calculator context, char key);
    abstract void equal(Calculator context);
}
