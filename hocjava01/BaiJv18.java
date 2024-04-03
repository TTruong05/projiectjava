package hocjava01;
import java.util.Scanner;

public class BaiJv18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Hình chữ nhật");
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        hcn(chieuDai, chieuRong);
    }

    public static void hcn(double a, double b) {
        double dienTich = a * b;
        double chuVi = 2 * (a + b);

        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }
}