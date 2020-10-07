package org.example;

import java.util.*;

public class TicTacToeGame {
	static char[] BOARD;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char player = ' ';
		char computer = ' ';
		System.out.println("Welcome to TicTacToe game");
		createBoard();
		char input = playerInput();
		player = input;
		if (input == 'X') {
			computer = 'O';
		} else {
			computer = 'X';
		}
		System.out.println("player mark: " + player);
		System.out.println("computer mark: " + computer);
		showBoard();
	}

	public static void createBoard() {
		BOARD = new char[10];
		for (int i = 1; i < 10; i++) {
			BOARD[i] = ' ';
		}
	}

	public static char playerInput() {
		System.out.println("Choose a letter 'X' or 'O' as input:");
		char input = sc.next().charAt(0);
		return input;
	}
	public static void showBoard() {
		for(int i=1;i<10;i++) {
			System.out.println("The move at positon "+i+" is:"+BOARD[i]);
		}
	}
}
