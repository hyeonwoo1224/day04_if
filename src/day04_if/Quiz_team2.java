package day04_if;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kog;
		System.out.println("국어 점수 입력");
		kog = input.nextInt();
		
		if(kog >= 90) {
			System.out.println("당신의 국어점수는"+kog+"이며, 학점은 A학점 입니다");
		}
		else if(kog >= 80 && kog < 90) {
			System.out.println("당신의 국어점수는"+kog+"이며, 학점은 B학점 입니다");
		}
		else if(kog >= 70) {
			System.out.println("당신의 국어점수는"+kog+"이며, 학점은 C학점 입니다");
		}
		else {
			System.out.println("당신의 국어점수는"+kog+"이며, 학점은 D학점 입니다");
		}
		
		int age;
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		if(age >= 8) {
			System.out.println("학교를 다닙니다.");
		}
		else if(age < 8) {
			System.out.println("학교를 안다닙니다.");
		}
		int su1,su2;
		System.out.println("두 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		if(su1 > su2) {
			System.out.println("최댓값은" + su1 + "입니다");
		}
		if(su2 > su1) {
			System.out.println("최댓값은" + su2 + "입니다");
		}
		System.out.print("두 정수 입력 : ");
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
