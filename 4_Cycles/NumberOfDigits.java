public class NumberOfDigits {
/* Задача 7
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
    public static void main(String[] args) {
	int a = 4546;
	int b = 352523;
	char[] chA= Integer.toString(a).toCharArray(); //преобразуем число A в массив символов
    char[] chB= Integer.toString(b).toCharArray(); //преобразуем число B в массив символов
    int [] numbersA = new int[chA.length]; //массив цифр числа А, количество цифр в числе А равно длине массива символов
	int [] numbersB = new int[chB.length]; //массив цифр числа В, количество цифр в числе В равно длине массива символов
		System.out.print("Число " + a + " состоит из цифр: ");
    for (int i = 0; i < chA.length; i++) {
		numbersA[i] = Character.getNumericValue(chA[i]);
		System.out.print(numbersA[i] + " ");
    	}
		System.out.print("\nЧисло " + b + " состоит из цифр: ");
	for (int i = 0; i < chB.length; i++) {
		numbersB[i] = Character.getNumericValue(chB[i]);
		System.out.print(numbersB[i] + " ");
		}
    }
}
