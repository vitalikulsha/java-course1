public class CoordinatesXY {
/* Задача 6
Для данной области составить линейную программу,
которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае.
 */
    public static void main(String[] args) {
        int x = -2;
        int y = 4;
        System.out.println("точка с коррдинатами x = " + x + " и y = " + y + " - " + coordinates(x, y));
    }
    public static boolean coordinates (int x, int y){
        if(x >= -4 && x <= 4 && y >= -3 && y <= 0){
            return true;
        } else if (x >= -2 && x <= 2 && y >= 0 && y <= 4){
            return true;
        } else {
            return false;
        }

    }
}
