public class NumbersInSeconds_05 {
    /* Задача 5
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.
     */
    public static void main(String[] args) {
        int time = 2350; // число в секундах
        int timeHours = time / 360; // количество часов
        int timeMinutes = (time - timeHours * 360) / 60; // количество минут
        int timeSeconds = time - timeHours * 360 - timeMinutes * 60; // количество секунд
        System.out.println(timeHours + " ч " + timeMinutes + " мин " + timeSeconds + " с");
    }
}
