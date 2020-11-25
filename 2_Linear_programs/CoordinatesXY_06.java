public class CoordinatesXY_06 {
    /* Задача 6
    Для данной области составить линейную программу,
    которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
    и false — в противном случае.
     */
    public static void main(String[] args) {
        int coordX = -2;
        int coordY = 4;
        System.out.println("точка с коррдинатами x = " + coordX + " и y = " + coordY + " - " + coordinates(coordX, coordY));
    }

    public static boolean coordinates(int coordX, int coordY) {
        if (coordX >= -4 && coordX <= 4 && coordY >= -3 && coordY <= 0) {
            return true;
        } else if (coordX >= -2 && coordX <= 2 && coordY >= 0 && coordY <= 4) {
            return true;
        } else {
            return false;
        }
    }
}
