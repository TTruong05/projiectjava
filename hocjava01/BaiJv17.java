package hocjava01;

import java.util.Scanner;

public class BaiJv17 {

    public static void main(String[] args) {
        String[][] sinhVien = new String[10][2]; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập họ tên sinh viên " + (i + 1) + ": ");
            sinhVien[i][0] = scanner.nextLine();

            System.out.print("Nhập điểm sinh viên " + (i + 1) + ": ");
            sinhVien[i][1] = scanner.nextLine();
        }


        System.out.println("Họ tên\t\tĐiểm");

        for (int i = 0; i < 10; i++) {
            System.out.println(sinhVien[i][0] + "\t\t" + sinhVien[i][1]);
        }
    }
}
