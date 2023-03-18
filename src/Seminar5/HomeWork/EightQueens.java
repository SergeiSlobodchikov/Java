package Seminar5.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {
    public static void eightQueens() {
        int boardSize = 8;
        boolean[][] board = new boolean[boardSize][boardSize];
        List<boolean[][]> solutions = new ArrayList<>();
        int[] counter = new int[1]; // массив для счетчика решений
        placeQueens(board, 0, solutions, counter);
        System.out.println("Всего найдено решений: " + counter[0]);
        for (boolean[][] solution : solutions) {
            printBoard(solution);
        }
    }

    private static void placeQueens(boolean[][] board, int row, List<boolean[][]> solutions, int[] counter) {
        if (row == board.length) {
            solutions.add(cloneBoard(board));
            counter[0]++; // увеличиваем счетчик решений
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                placeQueens(board, row + 1, solutions, counter);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Проверяем вертикали и горизонтали
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] || board[i][col]) {
                return false;
            }
        }
        // Проверяем диагонали
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    private static boolean[][] cloneBoard(boolean[][] board) {
        boolean[][] clone = new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, clone[i], 0, board.length);
        }
        return clone;
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.printf("%2s", cell ? " Q " : " . ");
            }
            System.out.println();
        }
        System.out.println();
    }
}