package me.simu;
import java.util.Random;

public class Main {

    private static String grid[][] = new String[10][10];
    private static int x = 4;
    private static int y = 4;

    public static void main(String[] args) {

        Random randHandler = new Random();
        fillGrid();
        grid[x][y] = "0";

        for (int cycle = 0; cycle < 11; cycle++) {
            int direction = randHandler.nextInt(4);

            if (direction == 0) {
                x++;
            } else if (direction == 1) {
                y++;
            } else if (direction == 2) {
                x--;
            } else if (direction == 3) {
                y--;
            }
            //will do corner testing later
            fillGrid();
            grid[x][y] = "0";
            printGrid();
        }



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
                System.out.println(grid[x][y]);
            }
            System.out.println();
        }

    }
}
