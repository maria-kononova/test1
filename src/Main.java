import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        System.out.println("Первая прямая:");
        Straight straight1 = createStraight();
        System.out.println("Уравнение прямой:   " + straight1.printStraight());
        System.out.println("_________________________________________");

        System.out.println("Вторая прямая:");
        Straight straight2 = createStraight();
        System.out.println("Уравнение прямой:   " + straight2.printStraight());
        System.out.println("_________________________________________");
    }
    Straight createStraight()
    {
        double x1, y1, x2, y2;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите координаты первой точки:\nх1 = ");
        x1 = scanner.nextDouble();
        System.out.println("y1 = ");
        y1 =  scanner.nextDouble();
        System.out.println("Введите координаты второй точки:\nх2 = ");
        x2 =  scanner.nextDouble();
        System.out.println("y2 = ");
        y2 =  scanner.nextDouble();
        return new Straight(x1, y1, x2, y2);
    }
}