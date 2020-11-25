public class FunctionXY_02 {
    /* Задача 2
    Вычислить значения функции на отрезке [а,b] c шагом h.
     */
    public static void main(String[] args) {
        int beginА = -2; // начало отрезка
        int endB = 4; // конец отрезка
        int stepH = 2; // шаг между точками на отрезке
        System.out.println("Определение значения функции y на отрезке от a = " + beginА + " до b = " + endB + " с шагом h = " + stepH);
        for (int i = beginА; i <= endB; i = i + stepH) {
            int numX = i;
            int result;
            if (numX <= 2) {
                result = -numX;
            } else {
                result = numX;
            }
            System.out.println("Значение функции y = " + result + " при x = " + numX);
        }
    }
}
