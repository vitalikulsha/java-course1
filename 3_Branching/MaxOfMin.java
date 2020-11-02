import static java.lang.Math.*;
public class MaxOfMin {
/* Задача 2
Найти max{min(a, b), min(c, d)}.
 */
    public static void main(String[] args) {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	System.out.println(max(min(a,b), min(c,d)));
    }
}
