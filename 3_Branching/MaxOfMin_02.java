import static java.lang.Math.*;

public class MaxOfMin_02 {
    /* Задача 2
    Найти max{min(a, b), min(c, d)}.
     */
    public static void main(String[] args) {
        int numA = 1;
        int numB = 2;
        int numC = 3;
        int numD = 4;
        System.out.println(max(min(numA, numB), min(numC, numD)));
    }
}