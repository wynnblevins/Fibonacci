package com.dominionconsulting;

import java.util.Scanner;

import com.dominionconsulting.service.FibonnaciService;

public class App {
	private static FibonnaciService fibonnaciService = new FibonnaciService();
	
	public static void main(String[] args) {
		prompt();
		int n = getInput();
		System.out.println(fibonnaciService.runToN(n));
	}

	private static void prompt() {
		System.out.println("What should n be?");
		System.out.print("> ");
	}
	
	private static int getInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return Integer.valueOf(input);
	}
}
