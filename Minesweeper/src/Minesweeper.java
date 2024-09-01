import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minesweeper {
    private static int COLUMNS;
    private static int ROWS;
    private static char[][] board;
    private static final BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = "";
        int n = 0;
        int m = 0;
        while((reader.readLine()) != null){
            if(line.matches(".*\\d.*")){
                String[] colsAndRows = line.split(" ");
                ROWS = Integer.parseInt(colsAndRows[0]);
                COLUMNS = Integer.parseInt(colsAndRows[1]);
                board = new char[ROWS][COLUMNS];
                n = 0;
                m = 0;
            }
            else{
                for(int i = 0; i < line.length(); ++i){
                    board[n][i] = line.charAt(i);
                }
                n++;
            }
        }
    }

}
