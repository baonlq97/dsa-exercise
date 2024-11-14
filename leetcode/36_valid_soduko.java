package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class ValidSoduko {
    public static void main(String[] args) {
        ValidSoduko test = new ValidSoduko();
        test.isValidSudoku(new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } });

    }

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();
        // HashMap<Integer, ArrayList<Character>> column = new HashMap();
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board[i].length; j++) {
        //         if (!row.containsKey(i)) {
        //             row.put(i, new ArrayList<>());
        //         }
        //         if (row.get(i).contains(board[i][j])) {
        //             return false;
        //         }
        //         if (board[i][j] != '.') {
        //             row.get(i).add(board[i][j]);
        //         }
        //     }
        // }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows.get(i) == null) {
                    rows.put(i, new HashSet<Character>());
                }
                if (cols.get(j) == null) {
                    cols.put(j, new HashSet<Character>());
                }
                if (!rows.get(i).add(board[i][j])) {
                    return false;
                }

                if (!cols.get(j).add(board[i][j])) {
                    return false;
                }
                
                var squaresKey = i/3 + "," + j/3;
                if (squares.get(squaresKey) == null) {
                    squares.put(squaresKey, new HashSet<Character>());
                }
                if (!squares.get(squaresKey).add(board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
