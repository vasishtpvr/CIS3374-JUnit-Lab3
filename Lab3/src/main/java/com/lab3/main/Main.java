package com.lab3.main;

import java.util.Scanner;

import com.lab3.admiterator.Admiterator;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Welcome to the Tennis Analyser Program!");
		
		while(true) {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the speed (-1 to quit): ");
			int speed = scanner.nextInt();
			if(speed == -1) {
				break;
			}
			System.out.print("Please enter the accuracy (-1 to quit): ");
			int accuracy = scanner.nextInt();
			if(accuracy == -1) {
				break;
			}
			boolean check = Admiterator.admit(speed, accuracy);
			if(check) {
				System.out.println("Admit this person!");
			}
			else {
				System.out.println("Send them away!");
			}
		}

	}

}
