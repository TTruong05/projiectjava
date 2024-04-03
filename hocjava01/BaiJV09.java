package hocjava01;

import java.util.Scanner;

public class BaiJV09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Rau quả chấm mắm rôus");
        System.out.println("2. shuop cua");
        System.out.println("3. cá trê nướng ");
        System.out.println("4. Mực hấp ");
        System.out.println("5. lẩu gà ");
        System.out.println("Nhập lựa chọn của bạn (1-5):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn rau quả chấm mắm ruốc.");
                break;
            case 2:
                System.out.println("Bạn đã chọn shuop cua.");
                break;
            case 3:
                System.out.println("Bạn đã chọn cá trê nướng.");
                break;
            case 4:
                System.out.println("Bạn đã chọn mực hấp.");
                break;
            case 5:
                System.out.println("bạn đã chọn lẩu gà.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 5.");
                break;
        }
    }
}
