package calculator;

public class StateAnswer extends State {

    void clear(Calculator context) {

        context.state = new StateX();
        context.state.clear(context);

    }

    void digit(Calculator context, char key) {

        context.state = new StateX();
        context.state.digit(context, key);

    }

    void arifm(Calculator context, char key) {

        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    void equal(Calculator context) {

        int answer =0;
        switch (context.o){
            case '+': answer = context.x + context.y; break;
            case '-': answer = context.x - context.y; break;
            case '*': answer = context.x * context.y; break;
            case '/': answer = context.x / context.y; break;
        }
        context.x = answer;

    }
}
