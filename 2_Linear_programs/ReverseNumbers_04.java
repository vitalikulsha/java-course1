public class ReverseNumbers_04 {
    /* Задача 4
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */
    public static void main(String[] args) {
        double numR = 123.456;
        double integerPart = (int) numR; // integerPart = 123
        double fractionalPart = (int) ((numR - integerPart) * 1000); // fractionalPart = 456
        double result = fractionalPart + (integerPart / 1000); // result = 456.123
        System.out.println("Исходное число - " + numR + "\nНовое число - " + result);
    }
}
