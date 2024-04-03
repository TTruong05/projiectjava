package hocjava01;

import java.util.Scanner;

public class BaiJv03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();
        double chuVi = tinhChuViHinhTron(banKinh);
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        scanner.close();
    }

    public static double tinhChuViHinhTron(double banKinh) {
        return 2 * Math.PI * banKinh;
    }
}