import static java.lang.Math.*;
public class FunctionValueA {
//Задача 3. Вычислить значение выражения по формуле.
    public static void main(String[] args) {
	double x = 0.5;//угол указан в радианах
	double y = 0.7;//угол указан в радианах
	double a = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println("a = " + a);
    }
}
