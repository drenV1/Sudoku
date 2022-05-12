
import java.util.Scanner;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Read2DArray {
    private static final int ROWS = 9;
    private static final int COLUMNS = 9;

    public static void main (String [] args) throws FileNotFoundException{
        Solution s = new Solution();
        
        if(s.isValidSudoku(readFile())){
            System.out.println("Success: Sudoku is valid");
        }else{
            System.out.println("Failed: Sudoku is invalid");
        }
    }

    private static int [][] readFile() throws FileNotFoundException{
        int [][] board = new int [ROWS][COLUMNS];
        Scanner sc = new Scanner(choseTextFile());
        while(sc.hasNextLine()){
            for(int i = 0; i < board.length; i++){
                String [] line = sc.nextLine().trim().split(",");
                for(int j = 0; j < line.length; j++){
                    board[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(board));
        return board;
    }
    private static File choseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select file to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File [] file = dialog.getFiles();
        return file[0];
    }
} 