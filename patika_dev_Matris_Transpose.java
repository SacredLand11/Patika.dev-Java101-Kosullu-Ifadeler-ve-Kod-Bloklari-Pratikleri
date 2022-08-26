import java.util.Scanner;

public class patika_dev_Matris_Transpose {
    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Matris olusturmak icin satir sayisini giriniz = ");
        int row = s.nextInt();
        System.out.print("Matris olusturmak icin sutun sayisini giriniz = ");
        int column = s.nextInt();
        int [][] matrix = new int[row][column];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                System.out.print((i+1)+". satirdaki "+(j+1)+". sutunundaki sayiyi giriniz = ");
                matrix[i][j] = s.nextInt();
            }
        }
        s.close();
        int [][] transpose = new int[column][row];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(matrix);
        display(transpose);
    }
}
