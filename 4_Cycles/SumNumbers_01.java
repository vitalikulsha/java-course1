import java.io.*;

public class SumNumbers_01 {
    /* Задача 1
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое целое положительно число n = ");
        int num = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до n = " + num + " равна " + sum);
    }
}