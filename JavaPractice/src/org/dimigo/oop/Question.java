package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] question = { "1. 가장 좋아하는 가수는? ", "2. 가장 좋아하는 배우는? ", "3. 가장 좋아하는 과목은? " };
		String[] dab = { "레드벨벳", "전지현", "체육" };

		System.out.println(question[0]);
		String answer1 = scanner.nextLine();
		if(answer1.equals(dab[0])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}

		System.out.println(question[1]);
		String answer2 = scanner.nextLine();
		if(answer2.equals(dab[1])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}

		System.out.println(question[2]);
		String answer3 = scanner.nextLine();
		if(answer3.equals(dab[2])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		
		sb1.append(question[0]).append(dab[0]).append("입니다.\n");
		sb1.append(question[1]).append(dab[1]).append("입니다.\n");
		sb1.append(question[2]).append(dab[2]).append("입니다.\n");
		
		System.out.println("<<결과 출력>>");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
	}
}
