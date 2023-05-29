import java.io.FileNotFoundException;

public class App {
    private static Calculadora calc;

    public static void main(String[] args) {
        calc = new Calculadora();
        try {
            int result = calc.divisao(8, 0);
            System.out.println("Resultado da divisão: " + result);
        } catch (ArithmeticException | FileNotFoundException e1) {
        }
    }
}
