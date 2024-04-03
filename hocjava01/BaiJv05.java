package hocjava01;

import java.util.Scanner;

public class BaiJv05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập họ tên :  ");
		String hoTen = scanner.nextLine();		 
		System.out.print("nhập năm sinh :  ");
		int namSinh = scanner.nextInt();
		System.out.print("họ tên: " + hoTen );
		System.out.print("\ntuổi : " + (2024-namSinh) );
	}
}
