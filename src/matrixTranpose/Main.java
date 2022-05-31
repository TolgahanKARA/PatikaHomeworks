package matrixTranpose;

import java.util.Scanner;

public class Main {

    static Scanner scn;
    static int rowM, colM, value;
    static int [][] matrix;
    static int [][] transpose;
    static Transpose transposeM;

    public static void main(String[] args) {

        scn = new Scanner(System.in);

        System.out.print("Matrisin kaç satır olacağını giriniz: ");
        rowM = scn.nextInt();

        System.out.print("Matrisin kaç sütun olacağını giriniz: ");
        colM = scn.nextInt();

        matrix = new int[rowM][colM];
        transpose = new int[colM][rowM];

        for (int i = 0; i < rowM; i++){

            for (int j = 0; j < colM; j++){

                System.out.print("Matrisin " + (i+1) + ". satır " + (j+1) + ". sütununu giriniz:");
                value = scn.nextInt();
                matrix[i][j]= value;

            }

        }
        transposeM = new Transpose();
        transposeM.show(matrix);

        transposeM.transpose(matrix, transpose);


    }

}
