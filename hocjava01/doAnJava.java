package hocjava01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doAnJava {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ToyStore store = new ToyStore();

    public static void main(String[] args) {
        int choice;

        do {
            choice = menu();
            switch (choice) {
                case 1:
                    themDoChoi();
                    break;
                case 2:
                    xoaDoChoi();
                    break;
                case 3:
                    hienThiDanhSachDoChoi();
                    break;
                case 4:
                    sapXepDoChoiTheoTen();
                    break;
                case 5:
                    sapXepDoChoiTheoGiaTangDan();
                    break;
                case 6:
                    sapXepDoChoiTheoGiaGiamDan();
                    break;
                case 7:
                    timKiemDoChoi();
                    break;
                case 8:
                    xuatDanhSachDoChoiRaFile();
                    break;
                case 9:
                    suaThongTinDoChoi();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static int menu() {
        System.out.println("\n-------------------- Quan ly cua hang do choi -----------------------");
        System.out.println("|   1. Them do choi                                                 |");
        System.out.println("|   2. Xoa do choi                                                  |");
        System.out.println("|   3. Hien thi danh sach do choi                                   |");
        System.out.println("|   4. Sap xep danh sach do choi theo ten                           |");
        System.out.println("|   5. Sap xep danh sach do choi theo gia tu thap den cao           |");
        System.out.println("|   6. Sap xep danh sach do choi theo gia tu cao den thap           |");
        System.out.println("|   7. Tim kiem do choi                                             |");
        System.out.println("|   8. Xuat danh sach do choi ra file                               |");
        System.out.println("|   9. Sua thong tin do choi                                        |");
        System.out.println("|   0. Thoat                                                        |");
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Chon chuc nang: ");
        return scanner.nextInt();
    }

    private static void themDoChoi() {
        System.out.print("Nhap so luong do choi can them: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap ten do choi: ");
            String ten = scanner.nextLine();
            System.out.print("Nhap gia do choi: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();
            store.themDoChoi(ten, gia);
        }
    }

    private static void xoaDoChoi() {
        System.out.print("Nhap ten do choi can xoa: ");
        scanner.nextLine();
        String ten = scanner.nextLine();
        store.xoaDoChoi(ten);
    }

    private static void hienThiDanhSachDoChoi() {
        store.hienThiDanhSachDoChoi();
    }

    private static void sapXepDoChoiTheoTen() {
        store.sapXepDoChoiTheoTen();
    }

    private static void sapXepDoChoiTheoGiaTangDan() {
        store.sapXepDoChoiTheoGiaTangDan();
    }

    private static void sapXepDoChoiTheoGiaGiamDan() {
        store.sapXepDoChoiTheoGiaGiamDan();
    }

    private static void timKiemDoChoi() {
        System.out.print("Nhap ten do choi can tim: ");
        scanner.nextLine();
        String ten = scanner.nextLine();
        store.timKiemDoChoi(ten);
    }

    private static void suaThongTinDoChoi() {
        System.out.print("Nhap ten do choi can sua thong tin: ");
        scanner.nextLine();
        String ten = scanner.nextLine();
        store.suaThongTinDoChoi(ten);
    }

    private static void xuatDanhSachDoChoiRaFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("danh_sach_do_choi.txt"))) {
            writer.write("Danh sach do choi trong cua hang:\n");
            store.xuatDanhSachDoChoi(writer);
            System.out.println("Xuat danh sach do choi ra file thanh cong.");
        } catch (IOException e) {
            System.out.println("Loi khi xuat danh sach do choi ra file: " + e.getMessage());
        }
    }
}

class Toy {
    private String ten;
    private double gia;

    public Toy(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String layTen() {
        return ten;
    }

    public double layGia() {
        return gia;
    }
}

class ToyStore {
    Toy[] toys;
    int size;
    private static final int MAX_SIZE = 100;
    private static final Scanner scanner = new Scanner(System.in);

    public ToyStore() {
        toys = new Toy[MAX_SIZE];
        size = 0;
    }

    public void themDoChoi(String ten, double gia) {
        if (size < MAX_SIZE) {
            toys[size++] = new Toy(ten, gia);
        } else {
            System.out.println("Danh sach day, khong the them do choi moi.");
        }
    }

    public void xoaDoChoi(String ten) {
        for (int i = 0; i < size; i++) {
            if (toys[i].layTen().equals(ten)) {
                for (int j = i; j < size - 1; j++) {
                    toys[j] = toys[j + 1];
                }
                size--;
                System.out.println("Da xoa do choi: " + ten);
                return;
            }
        }
        System.out.println("Khong tim thay do choi co ten la '" + ten + "'.");
    }

    public void hienThiDanhSachDoChoi() {
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n", "STT", "Ten do choi", "Gia");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-20d %-20s %-20.2f\n", i + 1, toys[i].layTen(), toys[i].layGia());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public void sapXepDoChoiTheoTen() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (toys[j].layTen().compareTo(toys[j + 1].layTen()) > 0) {
                    Toy temp = toys[j];
                    toys[j] = toys[j + 1];
                    toys[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep danh sach do choi theo ten.");
    }

    public void sapXepDoChoiTheoGiaTangDan() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (toys[j].layGia() > toys[j + 1].layGia()) {
                    Toy temp = toys[j];
                    toys[j] = toys[j + 1];
                    toys[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep danh sach do choi theo gia tu thap den cao.");
    }

    public void sapXepDoChoiTheoGiaGiamDan() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (toys[j].layGia() < toys[j + 1].layGia()) {
                    Toy temp = toys[j];
                    toys[j] = toys[j + 1];
                    toys[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep danh sach do choi theo gia tu cao den thap.");
    }

    public void timKiemDoChoi(String ten) {
        boolean timThay = false;
        for (int i = 0; i < size; i++) {
            if (toys[i].layTen().equalsIgnoreCase(ten)) {
                System.out.println("Da tim thay do choi: " + toys[i].layTen() + ", Gia: " + toys[i].layGia());
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay do choi co ten la '" + ten + "'.");
        }
    }

    public void suaThongTinDoChoi(String ten) {
        boolean timThay = false;
        for (int i = 0; i < size; i++) {
            if (toys[i].layTen().equalsIgnoreCase(ten)) {
                System.out.print("Nhap gia moi cho do choi '" + ten + "': ");
                double giaMoi = scanner.nextDouble();
                capNhatDoChoi(ten, giaMoi);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay do choi co ten la '" + ten + "'.");
        }
    }

    private void capNhatDoChoi(String ten, double giaMoi) {
        for (int i = 0; i < size; i++) {
            if (toys[i].layTen().equalsIgnoreCase(ten)) {
                toys[i] = new Toy(ten, giaMoi);
                System.out.println("Da cap nhat thong tin cho do choi: " + ten);
                return;
            }
        }
    }

    public void xuatDanhSachDoChoi(BufferedWriter writer) throws IOException {
        for (int i = 0; i < size; i++) {
            writer.write("Ten: " + toys[i].layTen() + ", Gia: " + toys[i].layGia() + "\n");
        }
    }
}
