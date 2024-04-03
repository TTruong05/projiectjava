package hocjava01;

import java.util.Scanner;

public class BaiJv16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số dòng: ");
        int n = sc.nextInt();

        System.out.println("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử dòng " + (i + 1) + " cột " + (j + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Các phần tử: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.println("Các phần tử chẵn: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                    sum += 1;
                }
            }
        }

        System.out.println();
        System.out.println("Có " + sum + " số chẵn!");
    }
}
