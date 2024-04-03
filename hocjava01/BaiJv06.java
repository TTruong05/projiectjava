package hocjava01;
import java.util.Scanner;

public class BaiJv06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int soThuNhat = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int soThuHai = scanner.nextInt()s;

        System.out.print("Nhập số thứ ba: ");
        int soThuBa = scanner.nextInt();

        int soLonNhat = timSoLonNhat(soThuNhat, soThuHai, soThuBa);

        System.out.println("Số lớn nhất là: " + soLonNhat);

    }

    public static int timSoLonNhat(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}