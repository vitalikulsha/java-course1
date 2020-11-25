public class Brick_04 {
    /* Задача 4
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.
     */
    public static void main(String[] args) {
	/*
	Кирпич пролезет в прямоугольное отверстие только тогда,
	когда две стороны кирпича будут меньше или равны двум строронам отверстия
	 */
        int sideA = 10;
        int sideB = 20;
        int heightX = 18;
        int widthY = 25;
        int lengthZ = 10;
        if (sideA >= heightX && (sideB >= widthY || sideB >= lengthZ)) {
            System.out.println("Кирпич проходит в прямоугольное отверстие.");
        } else if (sideA >= widthY && (sideB >= heightX || sideB >= lengthZ)) {
            System.out.println("Кирпич проходит в прямоугольное отверстие.");
        } else if (sideA >= lengthZ && (sideB >= heightX || sideB >= widthY)) {
            System.out.println("Кирпич проходит в прямоугольное отверстие.");
        } else {
            System.out.println("Кирпич не проходит в прямоугольное отверстие.");
        }
    }
}
