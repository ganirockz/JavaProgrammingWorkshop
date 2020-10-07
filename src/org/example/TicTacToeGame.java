package org.example;
import java.util.*;
public class TicTacToeGame {
	static char[] BOARD;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char player,computer;
		System.out.println("Welcome to TicTacToe game");
		createBoard();
		System.out.println("Enter who has to place the input:1)player\n2)computer");
		int option = Integer.parseInt(sc.nextLine());
		char input = playerInput();
		if(option == 1) {
			player = input;
			if(input == 'X') {
				computer = 'O';
			}
			else {
				computer = 'X';
			}
		}
		else {
			computer = input;
			if(input == 'X') {
				player = 'O';
			}
			else {
				computer = 'X';
			}
		}
	}
	public static void createBoard() {
		BOARD= new char[10];
		for(int i=1;i<10;i++) {
			BOARD[i] = ' ';
		}
	}
	public static char playerInput() {
		System.out.println("Choose a letter 'X' or 'O' as input:");
		char input = sc.next().charAt(0);
		return input;
	}
}
