package hocjava01;
import java.util.Scanner;
import java.util.Random;

public class BaiJv04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int soMayMan = random.nextInt(10) + 1;

        System.out.print("Mua vé số (nhập số từ 1 đến 10): ");
        int soDuDoan = scanner.nextInt();

        System.out.println("Số may mắn là: " + soMayMan);

        if (soDuDoan == soMayMan) {
            System.out.println("Chúc mừng! Bạn đã trúng số.");
        } else {
            System.out.println("Chúc may mắn lần sau! Số đúng là: " + soMayMan);
        }
    }
}