package hocjava01;
import java.util.Scanner;

public class BaiJv21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mangSoNguyen = new int[0];

        while (true) {
            System.out.println("1. Nhap mang");
            System.out.println("2. In mang chua sap xep");
            System.out.println("3. In mang da sap xep");
            System.out.println("4. Tim so lon nhat");
            System.out.println("5. Tim so nho nhat");
            System.out.println("6. In danh sach so nguyen to");
            System.out.println("0. Thoat");

            int nhap = scanner.nextInt();
            
            switch (nhap) {
                case 1:
                    mangSoNguyen = nhapMang(scanner);
                    break;
                case 2:
                    inMang("Mang chua sap xep", mangSoNguyen);
                    break;
                case 3:
                    int[] mangSapXep = sapXepMang(mangSoNguyen);
                    inMang("Mang da sap xep", mangSapXep);
                    break;
                case 4:
                    timSoLonNhat(mangSoNguyen);
                    break;
                case 5:
                    timSoNhoNhat(mangSoNguyen);
                    break;
                case 6:
                    inDanhSachNguyenTo(mangSoNguyen);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong hop le. Hay chon lai.");
            }
        }
    }

    private static int[] nhapMang(Scanner scanner) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] mangSoNguyen = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mangSoNguyen[i] = scanner.nextInt();
        }
        return mangSoNguyen;
    }

    private static void inMang(String message, int[] mangSoNguyen) {
        if (mangSoNguyen.length > 0) {
            System.out.println(message + ":");
            for (int num : mangSoNguyen) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Chua nhap mang. Hay chon chuc nang 1 de nhap mang.");
        }
    }

    private static int[] sapXepMang(int[] mangSoNguyen) {
        int[] mangSapXep = mangSoNguyen.clone();
        java.util.Arrays.sort(mangSapXep);
        return mangSapXep;
    }

    private static void timSoLonNhat(int[] mangSoNguyen) {
        if (mangSoNguyen.length > 0) {
            int max = mangSoNguyen[0];
            for (int num : mangSoNguyen) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("So lon nhat trong mang: " + max);
        } else {
            System.out.println("Chua nhap mang. Hay chon chuc nang 1 de nhap mang.");
        }
    }

    private static void timSoNhoNhat(int[] mangSoNguyen) {
        if (mangSoNguyen.length > 0) {
            int min = mangSoNguyen[0];
            for (int num : mangSoNguyen) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("So nho nhat trong mang: " + min);
        } else {
            System.out.println("Chua nhap mang. Hay chon chuc nang 1 de nhap mang.");
        }
    }

    private static boolean laSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void inDanhSachNguyenTo(int[] mangSoNguyen) {
        if (mangSoNguyen.length > 0) {
            System.out.println("Cac so nguyen to trong mang:");
            for (int num : mangSoNguyen) {
                if (laSoNguyenTo(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Chua nhap mang. Hay chon chuc nang 1 de nhap mang.");
        }
    }
}
