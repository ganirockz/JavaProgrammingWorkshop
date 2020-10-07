package org.example;

import java.util.*;

public class TicTacToeGame {
	static char[] BOARD;
	static Scanner sc = new Scanner(System.in);
	static int INDEX;
	static char PLAYER = ' ';
	static char COMPUTER = ' ';
	static boolean HEAD,TAIL;
	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe game");
		createBoard();
		int toss = (int)(Math.random()*10)%2;
		if(toss == 0) {
			HEAD = true;
			TAIL = false;
		}
		else {
			HEAD = false;
			TAIL = true;
		}
		while (true) {
			System.out.println("Do you want to play?(y/n)");
			char play = sc.next().charAt(0);
			if(play == 'y') {
			char input = playerInput();
			if (HEAD) {
				PLAYER = input;
				if(PLAYER == 'X') {
					COMPUTER = 'O';
				}
				else {
					COMPUTER = 'X';
				}
			} else {
				COMPUTER = input;
				if(COMPUTER == 'X') {
					PLAYER = 'O';
				}
				else {
					PLAYER = 'X';
				}
			}
			System.out.println("player mark: " + PLAYER);
			System.out.println("computer mark: " + COMPUTER);
			showBoard();
			selectIndex();
			showBoard();}
			else {
				System.out.println("Thanks for playing");
				break;
			}
		}
	}

	public static void selectIndex() {
		while (true) {
			System.out.println("Enter the index from 1 to 9 where you want to place your move");
			INDEX = sc.nextInt();
			if (isFreeSpace(BOARD, INDEX)) {
				System.out.println("Its valid move");
				BOARD[INDEX] = PLAYER;
				break;
			} else {
				System.out.println("Already occupied! please select another index");
			}
		}
	}

	public static boolean isFreeSpace(char[] board, int index) {
		return board[index] == ' ';
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
		System.out.println(BOARD[1] + " | " + BOARD[2] + " | " + BOARD[3]);
		System.out.println("----------");
		System.out.println(BOARD[4] + " | " + BOARD[5] + " | " + BOARD[6]);
		System.out.println("----------");
		System.out.println(BOARD[7] + " | " + BOARD[8] + " | " + BOARD[9]);
	}
}
