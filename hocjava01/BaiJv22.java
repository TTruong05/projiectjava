import java.util.Scanner;

public class BaiJv22 {
    static final int MAX = 100;

    public static void main(String[] args) {
        int[] mang = new int[MAX];
        int n = 0;
        do {
            int chon = menu();
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    n = nhapMang(mang);
                    break;
                case 2:
                    xuatMang(mang, n);
                    break;
                case 3:
                    sapXepTangDan(mang, n);
                    break;
                case 4:
                    timSoLonNhat(mang, n);
                    break;
                case 5:
                    timSoNhoNhat(mang, n);
                    break;
                case 6:
                    inDanhSach(mang, n);
                    break;
            }
        } while (true);
    }

    static int nhapMang(int[] mang) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sn.nextInt();

        if (n > MAX) {
            System.out.println("So phan tu vuot qua gioi han cho phep (" + MAX + ").");
            return 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            mang[i] = sn.nextInt();
        }

        return n;
    }

    static void xuatMang(int[] mang, int n) {
        if (n > 0) {
            System.out.println("Mang:");
            for (int i = 0; i < n; i++) {
                System.out.print(mang[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Mang khong co phan tu. Hay nhap mang truoc khi xuat.");
        }
    }

    static void sapXepTangDan(int[] mang, int n) {
        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (mang[i] > mang[j]) {
                        int temp = mang[i];
                        mang[i] = mang[j];
                        mang[j] = temp;
                    }
                }
            }

            System.out.println("Mang da duoc sap xep tang dan:");
            xuatMang(mang, n);
        } else {
            System.out.println("Mang khong co phan tu. Hay nhap mang truoc khi sap xep.");
        }
    }

    static void timSoLonNhat(int[] mang, int n) {
        if (n > 0) {
            int max = mang[0];
            for (int i = 1; i < n; i++) {
                if (mang[i] > max) {
                    max = mang[i];
                }
            }
            System.out.println("So lon nhat trong mang: " + max);
        } else {
            System.out.println("Mang khong co phan tu. Hay nhap mang truoc khi tim so lon nhat.");
        }
    }

    static void timSoNhoNhat(int[] mang, int n) {
        if (n > 0) {
            int min = mang[0];
            for (int i = 1; i < n; i++) {
                if (mang[i] < min) {
                    min = mang[i];
                }
            }
            System.out.println("So nho nhat trong mang: " + min);
        } else {
            System.out.println("Mang khong co phan tu. Hay nhap mang truoc khi tim so nho nhat.");
        }
    }

    static void inDanhSach(int[] mang, int n) {
        if (n > 0) {
            System.out.println("Danh sach cac so trong mang:");
            for (int i = 0; i < n; i++) {
                System.out.print(mang[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Mang khong co phan tu. Hay nhap mang truoc khi in danh sach.");
        }
    }

    static int menu() {
        int chon = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("========== MENU ==========");
        System.out.println("1. Nhap mang so nguyen");
        System.out.println("2. Xuat mang");
        System.out.println("3. Sap xep mang tang dan");
        System.out.println("4. Tim so lon nhat");
        System.out.println("5. Tim so nho nhat");
        System.out.println("6. In danh sach cac so");
        System.out.println("0. Thoat");
        System.out.println("--------------------------");

        System.out.print("Moi ban chon: ");
        chon = sn.nextInt();

        return chon;
    }
}
