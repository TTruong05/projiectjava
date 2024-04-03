package hocjava01;
import java.util.Scanner;

public class BaiJv02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();

        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);

        System.out.println("Diện tích: " + dienTich);
        System.out.println("Chu vi: " + chuVi);
    }   
}
