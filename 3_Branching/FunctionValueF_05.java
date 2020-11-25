import static java.lang.Math.*;

public class FunctionValueF_05 {
    /* Задача 5
    Вычислить значение функции
     */
    public static void main(String[] args) {
        int numX = -3;
        double result;
        if (numX <= 3) {
            result = pow(numX, 2) - 3 * numX + 9;
        } else {
            result = 1 / (pow(numX, 3) + 6);
        }
        System.out.println("При x = " + numX + ", значение функции F(x) = " + result);
    }
}
