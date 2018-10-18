package calculator;

public class StateAction extends State {

    void clear(Calculator context) {

        context.state = new StateX();
        context.state.clear(context);

    }

    void digit(Calculator context, char key) {

        context.state = new StateY();
        context.state.digit(context, key);

    }

    void arifm(Calculator context, char key) {

        context.o = key;

    }

    void equal(Calculator context) {

        context.y = context.x;
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
