import calculator.Calculator;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to calculator");

        Calculator calc = new Calculator();

        while (true) {
            char key = (char) System.in.read();
            if (key >=' ') {
                calc.press(key);
                System.out.println(calc);
            }

        }

    }
}
