public class FunctionXY {
/* Задача 2
Вычислить значения функции на отрезке [а,b] c шагом h.
 */
    public static void main(String[] args) {
	    int a = -2; // начало отрезка
        int b = 4; // конец отрезка
        int h = 2; // шаг между точками на отрезке
        int x, y;
System.out.println("Определение значения функции y на отрезке от a = " + a + " до b = " + b + " с шагом h = " + h);
        for(int i = a; i <= b; i=i+h){
            x = i;
            if(x <= 2){
                y = -x;
            } else {
                y = x;
            }
            System.out.println("Значение функции y = " + y + " при x = " + x);
        }
    }
}
