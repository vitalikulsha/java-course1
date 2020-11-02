import static java.lang.Math.*;
public class ProductSquares200 {
/* Задача 4
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
    public static void main(String[] args) {
	double prod = 1;
        for (int i = 1; i <= 200; i++) {
            prod *= pow(i, 2);
            }
        System.out.println("Произведение квадратов первых двухсот чисел равно " + prod);
    }
}
