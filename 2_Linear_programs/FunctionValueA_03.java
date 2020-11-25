import static java.lang.Math.*;

public class FunctionValueA_03 {
    //Задача 3. Вычислить значение выражения по формуле.
    public static void main(String[] args) {
        double angleX = 0.5;//угол указан в радианах
        double angleY = 0.7;//угол указан в радианах
        double result = (sin(angleX) + cos(angleY)) / (cos(angleX) - sin(angleY)) * tan(angleX * angleY);
        System.out.println("Результат выражения a = " + result);
    }
}