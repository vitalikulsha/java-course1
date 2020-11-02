public class NumbersOfChar {
/* Задача 5
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
    public static void main(String[] args) {
	        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("числу " + i + " соответсвует символ " + (char) i);
        }
    }
}
