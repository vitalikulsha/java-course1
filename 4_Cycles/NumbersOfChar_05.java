public class NumbersOfChar_05 {
    /* Задача 5
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
     */
    public static void main(String[] args) {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("Числу " + i + " соответсвует символ " + (char) i);
        }
    }
}
