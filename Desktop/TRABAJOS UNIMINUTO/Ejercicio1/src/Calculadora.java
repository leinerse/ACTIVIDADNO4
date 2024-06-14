
public class Calculadora {

    /*
    Crear una calculadora con 8 operaciones matemáticas, se debe presentar un menú con el
    nombre de las operaciones (pedir 2 números) y mostrar el resultado. Una vez mostrado el
    resultado se debe mostrar otra vez el menú. Hacer validaciones de datos.
     */
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero");
        }
        return a / b;
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Modulus by zero");
        }
        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Error: Square root of negative number");
        }
        return Math.sqrt(a);
    }

    public double absoluteValue(double a) {
        return Math.abs(a);
    }
}
