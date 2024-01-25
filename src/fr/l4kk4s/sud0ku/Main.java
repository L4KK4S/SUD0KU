package fr.l4kk4s.sud0ku;

public class Main {

    public static void main(String[] args) {

          int[][] grid1 = {
                {5, 4, -10, 10, 2, 10, 8, 10, 6},
                {10, 1, 9, 10, 10, 7, 10, 10, 3},
                {10, 10, 10, 3, 10, 10, 2, 1, 10},
                {9, 10, 10, 4, 10, 5, 10, 2, 10},
                {10, 10, 1, 10, 10, 10, 6, 10, 4},
                {6, 10, 4, 10, 3, 2, 10, 8, 10},
                {10, 6, 10, 10, 10, 10, 1, 9, 10},
                {4, 10, 2, 10, 10, 9, 10, 10, 5},
                {10, 9, 10, 10, 7, 10, 4, 10, 2}
        };

        Game theGame = new Game();
        theGame.initialisation();

        theGame.setGrid(grid1);
        theGame.displayGrid();


    }

}
