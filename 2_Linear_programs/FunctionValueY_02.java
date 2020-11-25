import static java.lang.Math.*;

public class FunctionValueY_02 {
    // Задача 2. Вычислить значение выражения по формуле.
    public static void main(String[] args) {
        double numA = 3;
        double numB = 4;
        double numC = 5;
        double result = (numB + sqrt(numB * numB + 4 * numA * numC)) / (2 * numA) - pow(numA, 3) * numC + pow(numB, -2);
        System.out.println("Результат выражения y = " + result);
    }
}
