package fr.l4kk4s.sud0ku;

public class Main {

    public static void main(String[] args) {

          int[][] grid1 = {
                {5, 4, -1, -1, 2, -1, 8, -1, 6},
                {-1, 1, 9, -1, -1, 7, -1, -1, 3},
                {-1, -1, -1, 3, -1, -1, 2, 1, -1},
                {9, -1, -1, 4, -1, 5, -1, 2, -1},
                {-1, -1, 1, -1, -1, -1, 6, -1, 4},
                {6, -1, 4, -1, 3, 2, -1, 8, -1},
                {-1, 6, -1, -1, -1, -1, 1, 9, -1},
                {4, -1, 2, -1, -1, 9, -1, -1, 5},
                {-1, 9, -1, -1, 7, -1, 4, -1, 2}
        };

        Game theGame = new Game();
        theGame.initialisation();

        theGame.setGrid(grid1);
        theGame.displayGrid();



    }

}
