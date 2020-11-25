public class ThreePoints_03 {
    /* Задача 3
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.
     */
    public static void main(String[] args) {
	/*
	условие, при котором 3 точки лежат на одной прямой:
	(y3-y1) / (y2-y1) = (x3-x1) / (x2-x1)
	 */
        //вводим координаты точек А(х1,y1), B(x2,y2), C(x3.y3)
        int coordX1 = 2;
        int coordY1 = 1;
        int coordX2 = 3;
        int coordY2 = 3;
        int coordX3 = 4;
        int coordY3 = 7;
        int result = (coordY3 - coordY1) / (coordY2 - coordY1) - (coordX3 - coordX1) / (coordX2 - coordX1);//проверяем условие
        if (result == 0) { //проверяем условие
            System.out.println("Все три точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
