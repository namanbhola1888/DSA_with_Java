import java.util.HashSet;

public class valid_sudoku {

    public boolean isValidSudoku(char[][] board) {

        @SuppressWarnings("unchecked")
        HashSet<Character>[] rows = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] cols = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] box = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char val = board[i][j];

                if(val == '.') continue;
                int boxindex = (i / 3) * 3 + (j / 3);

                if(rows[i].contains(val) || cols[j].contains(val) || box[boxindex].contains(val)){
                    return false;
                }

                rows[i].add(val);
                cols[j].add(val);
                box[boxindex].add(val);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        valid_sudoku obj = new valid_sudoku();
        boolean c = obj.isValidSudoku(board);
        System.out.println(c);

    }
}
