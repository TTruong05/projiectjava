package hocjava01;

public class BaiJv11 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int ketQua = i * j;
                System.out.print(i + " x " + j + " = " + ketQua + "\t");
            }
            System.out.println();
        }
    }	
}
