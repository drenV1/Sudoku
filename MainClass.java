// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class MainClass {
//     public static void main (String [] args) throws IOException{
//         Solution s = new Solution();
//         char [] array = new char[253];
//         char [][] board = new char[9][9];
//         String str = "";
        
//         try {
//             FileReader file = new FileReader("C:/Users/TECHCOM/Desktop/Sudoku/Test Cases/basicGrid.csv");
//             BufferedReader input = new BufferedReader(file);
//             input.read(array);
//             input.close();
//             str = new String(array);
//             StringBuilder sb = new StringBuilder(str);

//             for(int i = 0; i< sb.length(); i++){
//                 if(sb.charAt(i) == ','){
//                     sb.deleteCharAt(i);
//                 }
//             }
//             System.out.println(board.length);
//             int n = 0;
//             for(int i = 0; i < board.length; i++){
//                 for(int j = 0; j < board.length; j++){
//                     board [i][j] = sb.charAt(n);
//                     n++;
//                 }
//             }
//             for(int i = 0; i < board.length; i++){
//                 for(int j = 0; j < board.length; j++){
//                     System.out.print(board[i][j]);
//                 }
//             }
//             //s.isValidSudoku(board);
//         } catch (FileNotFoundException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
// }
