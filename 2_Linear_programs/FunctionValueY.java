import static java.lang.Math.*;
public class FunctionValueY {
// Задача 2. Вычислить значение выражения по формуле.
    public static void main(String[] args) {
	double a = 3;
	double b = 4;
	double c = 5;
	double y = (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
        System.out.println("y = " + y);
    }
}
