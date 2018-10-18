package calculator;

public class StateX extends State {

    boolean typing = false;

    void clear(Calculator context) {
        context.x =0;
        context.y =0;
        context.o ='+';

    }

    void digit(Calculator context, char key) {

        if (!typing){
            context.x = 0;
            typing = true;
        }
        context.x = context.x * 10 + Character.getNumericValue(key);

    }

    void arifm(Calculator context, char key) {

        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    void equal(Calculator context) {

        context.state = new StateAnswer();
        context.state.equal(context);

    }
}
