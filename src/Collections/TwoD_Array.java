package Collections;

public class TwoD_Array {

    public static void main(String[] args) {
        String[][] x = new String[8][8];
        int len = x.length;

        // fill with blanks so non-diagonal cells aren't null
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                x[i][j] = " ";
            }
        }

        // set both diagonals
        for (int i = 0; i < len; i++) {
            x[i][i] = "X";
            x[i][len - i - 1] = "X";
        }

        // print
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(); // next row
        }
    }
}
