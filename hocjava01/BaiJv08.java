package hocjava01;

import java.util.Scanner;

public class BaiJv08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập đoạn thẳng thứ nhất : ");
		int a = sc.nextInt();
		System.out.println("nhập đoạn thẳng thứ hai : ");
		int b = sc.nextInt();
		System.out.println("nhập đoạn thẳng thứ ba : ");
		int c = sc.nextInt();
		if (a+b>c && b+c>a && a+c>b){
			System.out.println("đay là 3 cạnh của tam giác : ");
			int chuVi = a + b + c;
			double p = chuVi / 2.0;
			double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("diện tích của tam giác là " + dienTich);
			System.out.println("chu vi là " + chuVi);
		}else {
			System.out.println(" Đây không phải 3 cạnh của tam giác");
		}
	}
}

