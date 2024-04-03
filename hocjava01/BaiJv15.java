package hocjava01;

import java.util.Scanner;

public class BaiJv15 {

    public static void main(String[] args) {
        int[][] maTran; 
        maTran = new int[5][4]; 
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("MaTran dong" + i + " cot " + j + ":");
                maTran[i][j] = sn.nextInt();
            }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(maTran[i][j] + "   ");
            }
            System.out.println("");
        }

    }

}
