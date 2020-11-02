import java.io.*;

public class SumNumbers {
/* Задача 1
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое целое положительно число n = ");
        int n = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до n = " + n + " равна " + sum);
    }
}
