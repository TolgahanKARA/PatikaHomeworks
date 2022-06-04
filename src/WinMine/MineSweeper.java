package WinMine;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    
    Scanner scn;
    Random rnd;
    int[][] map;
    String[][] locatorMine;
    int inputRow;
    int inputCol;
    int mines;
    int randomRow;
    int randomCol;
    int inputLocatorRow;
    int inputLocatorCol;
    boolean startGame = true;

    public MineSweeper(){



    }

    public void run() {

        preparation();

        mines = createMines(inputRow, inputCol);

        positionMine(mines);
        
        show(locatorMine);

        System.out.println("---------------");

        start();

    }

    private void start() {

        while (startGame){

            showM(map);

            System.out.print("Haritada mayının x kordinatını giriniz : ");
            inputLocatorRow = scn.nextInt();
            System.out.print("Haritada mayının y kordinatını giriniz : ");
            inputLocatorCol = scn.nextInt();

            if (locatorMine[inputLocatorRow][inputLocatorCol] == null){

                check(inputLocatorRow, inputLocatorCol);

            }else{

                System.out.println("-----------------");
                System.out.println("Oyunu kaybettiniz");
                show(locatorMine);
                startGame = false;

            }
            System.out.println("---------------");



        }

    }

    private void showM(int[][] map) {

        for (int i = 0 ; i < inputRow; i++){

            for (int k = 0; k < inputCol; k++){

                if (map[i][k] == 0){
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                }
                System.out.print(map[i][k] + " ");

            }
            System.out.println();

        }

    }

    private void check(int row, int col) {

        if (map[row][col] == 0){

            if ((row > 0) && (locatorMine[row-1][col] != null)){

                map[row][col]++;

            }
            if ((row > 0) && (col < (inputRow-1)) && (locatorMine[row-1][col+1] != null)){

                map[row][col]++;

            }
            if ((col < (inputCol-1)) && (locatorMine[row][col+1] != null)){

                map[row][col]++;

            }
            if ((row < (inputRow-1)) && (col < (inputCol-1)) && (locatorMine[row+1][col+1] != null)){

                map[row][col]++;

            }
            if ((row < (inputRow-1)) && (locatorMine[row+1][col] != null)){

                map[row][col]++;

            }
            if ((row < (inputRow-1)) && (col > 0) && (locatorMine[row+1][col-1] != null)){

                map[row][col]++;

            }
            if ((col > 0) && (locatorMine[row][col-1] != null)){

                map[row][col]++;

            }
            if ((col > 0) && (row > 0) && (locatorMine[row-1][col-1] != null)){

                map[row][col]++;

            }

        }



    }

    private void show(String[][] locatorMine) {

        for (int i = 0 ; i < inputRow; i++){

            for (int k = 0; k < inputCol; k++){

                if (locatorMine[i][k] == null){
                    System.out.print(" ");
                }else{

                    System.out.print("\t");

                }
                System.out.print(locatorMine[i][k] + " ");

            }
            System.out.println();

        }

    }


    private void positionMine(int mines) {
        
        rnd = new Random();

        while (mines > 0){

            randomRow = rnd.nextInt(inputRow);
            randomCol = rnd.nextInt(inputCol);
            
            if (locatorMine[randomRow][randomCol] != "*"){
                
                locatorMine[randomRow][randomCol] = "*";
                mines--;
                
            }

        }

    }

    private int createMines(int inputRow, int inputCol) {

        this.inputRow = inputRow;
        this.inputCol = inputCol;

        mines = ((this.inputRow * this.inputCol)/4);

        return mines;

    }

    private void preparation() {

        scn = new Scanner(System.in);

        System.out.println("Mayın Tarlasına hoşgeldiniz : ");

        System.out.print("Tarlanın genişliğini giriniz : ");
        inputRow = scn.nextInt();

        System.out.print("Tarlanın yüksekliğini giriniz : ");
        inputCol = scn.nextInt();

        map = new int[inputRow][inputCol];
        locatorMine = new String[inputRow][inputCol];

    }

}
