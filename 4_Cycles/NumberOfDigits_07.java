public class NumberOfDigits_07 {
    /* Задача 7
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
    public static void main(String[] args) {
        int numA = 4546;
        int numB = 352523;
        char[] charArrayA = Integer.toString(numA).toCharArray(); //преобразуем число A в массив символов
        char[] charArrayB = Integer.toString(numB).toCharArray(); //преобразуем число B в массив символов
        int[] arrayA = new int[charArrayA.length]; //массив цифр числа А, количество цифр в числе А равно длине массива символов
        int[] arrayB = new int[charArrayB.length]; //массив цифр числа В, количество цифр в числе В равно длине массива символов
        System.out.print("Число " + numA + " состоит из цифр: ");
        for (int i = 0; i < charArrayA.length; i++) {
            arrayA[i] = Character.getNumericValue(charArrayA[i]);
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("\nЧисло " + numB + " состоит из цифр: ");
        for (int i = 0; i < charArrayB.length; i++) {
            arrayB[i] = Character.getNumericValue(charArrayB[i]);
            System.out.print(arrayB[i] + " ");
        }
    }
}