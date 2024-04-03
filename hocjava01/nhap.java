import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Hình chữ nhật");
        System.out.print("Nhập chiều dài: ");
        double lengthRectangle = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double widthRectangle = scanner.nextDouble();

        System.out.println("Diện tích hình chữ nhật: " + calculateRectangleArea(lengthRectangle, widthRectangle));
        System.out.println("Chu vi hình chữ nhật: " + calculateRectanglePerimeter(lengthRectangle, widthRectangle));

        System.out.println("\n2. Hình tròn");
        System.out.print("Nhập bán kính: ");
        double radiusCircle = scanner.nextDouble();

        System.out.println("Diện tích hình tròn: " + calculateCircleArea(radiusCircle));
        System.out.println("Chu vi hình tròn: " + calculateCircleCircumference(radiusCircle));

        scanner.close();
    }

    // Phương thức tính diện tích hình chữ nhật
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Phương thức tính chu vi hình chữ nhật
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Phương thức tính diện tích hình tròn
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Phương thức tính chu vi hình tròn
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
