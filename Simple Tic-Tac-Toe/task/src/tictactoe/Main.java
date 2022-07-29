
package tictactoe;

import java.util.Scanner;

public class Main {
    public static char player = 'X';
    public static int counter = 0;
    public static void main(String[] args) {
        String input = "_________";
        printTable(input);
    }
    public static void printTable(String input) {
        System.out.println("---------");
        System.out.println("|" + " " + ((input.charAt(0) != '_') ? input.charAt(0) : ' ') + " " + ((input.charAt(1) != '_') ? input.charAt(1) : ' ') + " " + ((input.charAt(2) != '_') ? input.charAt(2) : ' ') + " " + "|");
        System.out.println("|" + " " + ((input.charAt(3) != '_') ? input.charAt(3) : ' ') + " " + ((input.charAt(4) != '_') ? input.charAt(4) : ' ') + " " + ((input.charAt(5) != '_') ? input.charAt(5) : ' ') + " " + "|");
        System.out.println("|" + " " + ((input.charAt(6) != '_') ? input.charAt(6) : ' ') + " " + ((input.charAt(7) != '_') ? input.charAt(7) : ' ') + " " + ((input.charAt(8) != '_') ? input.charAt(8) : ' ') + " " + "|");
        System.out.println("---------");
        if(checkStatus(input))
            userInput(input);
    }
    public static void userInput(String input) {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;
        if (scanner.hasNextInt()) {
            row = scanner.nextInt();
            col = scanner.nextInt();

            while (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }

            if (row == 1 && col == 1) {
                logic(input, 0);
            } else if (row == 1 && col == 2) {
                logic(input, 1);
            } else if (row == 1 && col == 3) {
                logic(input, 2);
            } else if (row == 2 && col == 1) {
                logic(input, 3);
            } else if (row == 2 && col == 2) {
                logic(input, 4);
            } else if (row == 2 && col == 3) {
                logic(input, 5);
            } else if (row == 3 && col == 1) {
                logic(input, 6);
            } else if (row == 3 && col == 2) {
                logic(input, 7);
            } else if (row == 3 && col == 3) {
                logic(input, 8);
            }
        } else {
            System.out.println("You should enter numbers!");
            userInput(input);
        }
    }
    public static void logic(String input, int index) {
        if (input.charAt(index) == '_') {
            String returnInput = input.substring(0, index) + player + input.substring(index + 1);
            player = player == 'X'?'O':'X';
            printTable(returnInput);
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            userInput(input);
        }
    }
    public static boolean checkStatus(String input){
        boolean gameStatus = true;
        if (input.charAt(0) == 'X' && input.charAt(1) == 'X' && input.charAt(2) == 'X' ||
                input.charAt(3) == 'X' && input.charAt(4) == 'X' && input.charAt(5) == 'X' ||
                input.charAt(6) == 'X' && input.charAt(7) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(0) == 'X' && input.charAt(3) == 'X' && input.charAt(6) == 'X' ||
                input.charAt(1) == 'X' && input.charAt(4) == 'X' && input.charAt(7) == 'X' ||
                input.charAt(2) == 'X' && input.charAt(5) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(0) == 'X' && input.charAt(4) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(2) == 'X' && input.charAt(4) == 'X' && input.charAt(6) == 'X') {
            System.out.println("X wins");
            gameStatus = false;
        } else if (input.charAt(0) == 'O' && input.charAt(1) == 'O' && input.charAt(2) == 'O' ||
                input.charAt(3) == 'O' && input.charAt(4) == 'O' && input.charAt(5) == 'O' ||
                input.charAt(6) == 'O' && input.charAt(7) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O' ||
                input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O') {
            System.out.println("O wins");
            gameStatus = false;
        } else if (counter == 9) {
            System.out.println("Draw");
            gameStatus = false;
        }
        counter++;
        return gameStatus;
    }
}