package day04_if;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day=0;
		while(true) {
		System.out.println("��¥�� �Է� : ");
		day = input.nextInt();
		day = day%7;
		switch (day) {
		case 1 :
			System.out.println("��");
			break;
		case 2 :
			System.out.println("ȭ");
			break;
		case 3 :
			System.out.println("��");
			break;
		case 4 :
			System.out.println("��");
			break;
		case 5 :
			System.out.println("��");
			break;
		case 6 :
			System.out.println("��");
			break;
		case 0 :
			System.out.println("��");
			break;
		default :
			System.out.println("�߸��Է�");
			}
		}
	}
}