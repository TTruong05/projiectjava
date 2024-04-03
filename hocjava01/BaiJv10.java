package hocjava01;
import java.util.Scanner;

public class BaiJv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Tính diện tích và chu vi tam giác, biết độ dài 3 cạnh");
        System.out.println("2. Tính diện tích và chu vi hình tròn, biết bán kính");
        System.out.println("3. Tính diện tích và chu vi hình chữ nhật, biết độ dài 2 cạnh");
        System.out.println("0. thoát ");
        System.out.print("Chọn chức năng (0-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tính diện tích và chu vi tam giác, biết độ dài 3 cạnh.");
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập đoạn thẳng thứ nhất : ");
                int a = sc.nextInt();
                System.out.println("Nhập đoạn thẳng thứ hai : ");
                int b = sc.nextInt();
                System.out.println("Nhập đoạn thẳng thứ ba : ");
                int c = sc.nextInt();
                if (a + b > c && b + c > a && a + c > b) {
                    System.out.println("Đây là 3 cạnh của tam giác.");
                    int chuVi = a + b + c;
                    double p = chuVi / 2;
                    double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Diện tích của tam giác là " + dienTich);
                    System.out.println("Chu vi là " + chuVi);
                } else {
                    System.out.println("Đây không phải là 3 cạnh của tam giác.");
                }
                break;

            case 2:
                System.out.println("Tính diện tích và chu vi hình tròn, biết bán kính.");
                System.out.print("Nhập bán kính hình tròn: ");
                double banKinh = scanner.nextDouble();
                double dienTichHinhTron = Math.PI * banKinh * banKinh;
                double chuViHinhTron = 2 * Math.PI * banKinh;
                System.out.println("Diện tích hình tròn là " + dienTichHinhTron);
                System.out.println("Chu vi hình tròn là " + chuViHinhTron);
                break;

            case 3:
                System.out.println("Tính diện tích và chu vi hình chữ nhật, biết độ dài 2 cạnh.");
                System.out.print("Nhập chiều dài hình chữ nhật: ");
                double chieuDai = scanner.nextDouble();
                System.out.print("Nhập chiều rộng hình chữ nhật: ");
                double chieuRong = scanner.nextDouble();
                double dienTichHinhChuNhat = chieuDai * chieuRong;
                double chuViHinhChuNhat = 2 * (chieuDai + chieuRong);
                System.out.println("Diện tích hình chữ nhật là " + dienTichHinhChuNhat);
                System.out.println("Chu vi hình chữ nhật là " + chuViHinhChuNhat);
                break;

            case 0:
                System.out.println("Tạm biệt!");
                break;

            default:
                System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
        }
    }
}
