package me.simu;
import java.util.Random;

public class Main {

    private static String grid[][] = new String[10][10];
    private static int x = 4;
    private static int y = 4;

    public static void main(String[] args) {


        fillGrid();
        grid[x][y] = "0";

        directionalMove();

        //testing with set amount of moves


    }

    public static void fillGrid() {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = "-";
            }
        }
    }

    public static void printGrid() {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }

    }

    public static void directionalMove() {
        for (int cycle = 0; cycle < 11; cycle++) {
            Random randHandler = new Random();
            int direction = randHandler.nextInt(4);

            if (direction == 0) {
                if (x < 9) {
                    x++;
                }
                else {
                    directionalMove();
                    //haha recursion xd
                }
            } else if (direction == 1) {
                if (y < 9) {
                    y++;
                }
                else {
                    directionalMove();
                    //haha recursion xd
                }
            } else if (direction == 2) {
                if (0 < x) {
                    x--;
                }
                else {
                    directionalMove();
                    //haha recursion xd
                }
            } else if (direction == 3) {
                if (0 < y) {
                    y--;
                }
                else {
                    directionalMove();
                    //haha recursion xd
                }
            }

            fillGrid();
            grid[x][y] = "0";
            printGrid();
            System.out.println("\n");
        }
    }
}
