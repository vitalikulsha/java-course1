import static java.lang.Math.*;
public class FunctionValueF {
/* Задача 5
Вычислить значение функции
 */
    public static void main(String[] args) {
	int x = -3;
	double F;
	if(x<=3){
	    F = pow(x, 2) - 3 * x + 9;
    } else {
	    F = 1 / (pow(x, 3) + 6);
    }
        System.out.println("При x = " + x + ", значение функции F(x) = " + F);
    }
}
