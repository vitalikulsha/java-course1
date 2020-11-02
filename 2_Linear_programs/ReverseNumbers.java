public class ReverseNumbers {
/* Задача 4
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
    public static void main(String[] args) {
	double R = 123.456;
	double a = (int) R; // a = 123
    double b = (int)((R - a) * 1000); // b = 456
    double c = b + (a/1000); // c = 456.123
    System.out.println(c);
    }
}
