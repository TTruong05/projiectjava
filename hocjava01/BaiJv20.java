import java.util.Scanner;

public class BaiJv20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;

        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Nhập mảng");
            System.out.println("2. In mảng chưa sắp xếp");
            System.out.println("3. In mảng đã sắp xếp");
            System.out.println("4. Tìm số lớn nhất");
            System.out.println("5. Tìm số nhỏ nhất");
            System.out.println("6. In danh sách số nguyên tố");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    arr = nhapMang(scanner);
                    break;
                case 2:
                    if (arr != null) {
                        inMang("Mảng chưa sắp xếp:", arr);
                    } else {
                        System.out.println("Mảng chưa được nhập.");
                    }
                    break;
                case 3:
                    if (arr != null) {
                        sapXepMang(arr);
                        inMang("Mảng đã sắp xếp:", arr);
                    } else {
                        System.out.println("Mảng chưa được nhập.");
                    }
                    break;
                case 4:
                    if (arr != null) {
                        int max = timSo(arr, true);
                        System.out.println("Số lớn nhất trong mảng: " + max);
                    } else {
                        System.out.println("Mảng chưa được nhập.");
                    }
                    break;
                case 5:
                    if (arr != null) {
                        int min = timSo(arr, false);
                        System.out.println("Số nhỏ nhất trong mảng: " + min);
                    } else {
                        System.out.println("Mảng chưa được nhập.");
                    }
                    break;
                case 6:
                    if (arr != null) {
                        inSoNguyenTo(arr);
                    } else {
                        System.out.println("Mảng chưa được nhập.");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}
