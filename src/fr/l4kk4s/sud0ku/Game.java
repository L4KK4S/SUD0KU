package fr.l4kk4s.sud0ku;

public class Game {

    public Cell[][] cells = new Cell[9][9];

    public void initialisation() {

        for (int row = 0; row < 9; row++) {

            for (int column = 0; column < 9; column++) {

                cells[row][column] = new Cell();
                cells[row][column].row = row+1;
                cells[row][column].column = column+1;
                cells[row][column].square = ((row) / 3) * 3 + ((column) / 3);

            }

        }

    }

    public void setGrid(int[][] grid) {

        for (int row = 0; row < 9; row++) {

            for (int column = 0; column < 9; column++) {

                cells[row][column].setValue(grid[row][column]);

            }

        }

    }

    public void displayGrid() {

        System.out.println("\u001B[35m+---+---+---+---+---+---+---+---+---+");

        for (int row = 0; row < 9; row++) {

            System.out.print("| ");

            for (int column = 0; column < 9; column++) {

                if (cells[row][column].value == -1) {
                    System.out.print("\u001B[0m ");
                } else {
                    System.out.print("\u001B[0m" + cells[row][column].value);
                }



                if (column == 0 || column == 1 || column == 3 || column == 4 || column == 6 || column == 7){
                    System.out.print("\u001B[34m | ");
                } else {
                    System.out.print("\u001B[35m | ");
                }

            }

            if (row == 2 || row == 5 || row == 8) {
                System.out.println("\n\u001B[35m+---+---+---+---+---+---+---+---+---+");
            } else {
                System.out.println("\n+\u001B[34m---+---+---\u001B[35m+\u001B[34m---+---+---\u001B[35m+\u001B[34m---+---+---\u001B[35m+");
            }
        }


    }



}
