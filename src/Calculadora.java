import java.io.FileNotFoundException;

public class Calculadora {
    public int divisao(int dividendo, int divisor) throws ArithmeticException, FileNotFoundException {
        // throw new FileNotFoundException("Divisor nulo.");
        try {
            if (divisor == 0)
                throw new ArithmeticException("Divisor nulo.");
        } catch (Exception e) {
            System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            throw e;
        }
        return dividendo / divisor;
    }
}
