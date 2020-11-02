import static java.lang.Math.*;
public class SumSquares100 {
/* Задача 3
Найти сумму квадратов первых ста чисел.
 */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=pow(i, 2);
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + sum);
    }
}
