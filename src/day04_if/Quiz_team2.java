package day04_if;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kog;
		System.out.println("���� ���� �Է�");
		kog = input.nextInt();
		
		if(kog >= 90) {
			System.out.println("����� ����������"+kog+"�̸�, ������ A���� �Դϴ�");
		}
		else if(kog >= 80 && kog < 90) {
			System.out.println("����� ����������"+kog+"�̸�, ������ B���� �Դϴ�");
		}
		else if(kog >= 70) {
			System.out.println("����� ����������"+kog+"�̸�, ������ C���� �Դϴ�");
		}
		else {
			System.out.println("����� ����������"+kog+"�̸�, ������ D���� �Դϴ�");
		}
		
		int age;
		System.out.print("���� �Է� : ");
		age = input.nextInt();
		
		if(age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else if(age < 8) {
			System.out.println("�б��� �ȴٴմϴ�.");
		}
		int su1,su2;
		System.out.println("�� �� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		if(su1 > su2) {
			System.out.println("�ִ���" + su1 + "�Դϴ�");
		}
		if(su2 > su1) {
			System.out.println("�ִ���" + su2 + "�Դϴ�");
		}
		System.out.print("�� ���� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		if (su1 > su2) {
			System.out.println(su1+">"+su2);
		}
		else if(su1 < su2) {
			System.out.println(su1+"<"+su2);
		}
		else if(su1 == su2) {
			System.out.println(su1 + "=" + su2);
		}
	}
}
