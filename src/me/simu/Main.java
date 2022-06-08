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
            for (int val = 0; val < grid.length; val++) {
                for (int value = 0; value < grid[val].length; value++) {
                    if (grid[val][value].equals("0")) {
                        Random randHandler = new Random();
                        int direction = randHandler.nextInt(4);
                        grid[val][value] = "-";

                        if (direction == 0) {
                            if (val < 9) {
                                val++;
                            }
                            else {
                                directionalMove();
                                //haha recursion xd
                            }
                        } else if (direction == 1) {
                            if (value < 9) {
                                value++;
                            }
                            else {
                                directionalMove();
                                //haha recursion xd
                            }
                        } else if (direction == 2) {
                            if (0 < val) {
                                val--;
                            }
                            else {
                                directionalMove();
                                //haha recursion xd
                            }
                        } else if (direction == 3) {
                            if (0 < value) {
                                value--;
                            }
                            else {
                                directionalMove();
                                //haha recursion xd
                            }
                        }


                        grid[val][value] = "0";
                        printGrid();
                        System.out.println("\n");
                    }

                }
            }


        }
    }
}
