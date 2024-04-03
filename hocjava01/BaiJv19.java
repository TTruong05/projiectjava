package hocjava01;
import java.util.Scanner;

public class BaiJv19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tính chu vi hình tròn");
            System.out.println("2. Tính diện tích và chu vi hình chữ nhật");
            System.out.println("0. Thoát");

            int nhap = sc.nextInt();
            
            if (nhap == 0) {
                break;
            }

            switch (nhap) {
                case 1:
                    System.out.print("Nhập vào bán kính hình tròn r = ");
                    int r = sc.nextInt();
                    hinhTron(r);
                    break;

                case 2:
                    System.out.print("Nhập vào chiều dài hình chữ nhật a = ");
                    int a = sc.nextInt();
                    System.out.print("Nhập vào chiều rộng hình chữ nhật b = ");
                    int b = sc.nextInt();
                    hinhChuNhat(a, b);
                    break;

                default:
                    System.out.println("Nhập sai, vui lòng nhập lại");
            }
        }
    }

    public static void hinhTron(int x) {
        System.out.println("Chu vi của hình tròn là " + (double) (2 * x * Math.PI));
        System.out.println("Diện tích của hình tròn là " + (x * x * Math.PI));
    }

    public static void hinhChuNhat(int x, int y) {
        System.out.println("Chu vi hình chữ nhật là " + (x + y) * 2);
        System.out.println("Diện tích hình chữ nhật là " + (x * y));
    }
}
