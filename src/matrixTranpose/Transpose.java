package matrixTranpose;

public class Transpose {

    public void show(int [][] arr) {

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }

    }

    public void transpose(int[][] matrix, int[][] transpose) {

        for (int i = 0; i < transpose.length; i++){

            for (int j = 0; j < transpose[i].length; j++){

                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();

        }

    }
}
