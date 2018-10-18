package calculator;

public class StateY extends State {

    boolean typing = false;

    void clear(Calculator context) {

        context.state = new StateX();
        context.state.clear(context);
    }

    void digit(Calculator context, char key) {

        if (!typing){
            context.y = 0;
            typing = true;
        }
        context.y = context.y * 10 + Character.getNumericValue(key);
    }

    void arifm(Calculator context, char key) {

        equal(context);
        context.state.arifm(context, key);
    }

    void equal(Calculator context) {

        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
