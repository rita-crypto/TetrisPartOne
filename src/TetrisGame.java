/*
 * This is the class that provides the data structures and logic for our game
 * In this program, it will have a 2D array for the game board
 * and methods to validate a move and make a move.
 */

/*
 * Game logic with data structure and simple methods
 * @author prajwaldhungana, ritakhadka
 * @version 1.000
 * April 12, 2021
 */

import java.util.Random;

public class TetrisGame
{
    private int[][] background;
    private int state;
    private Random randomGen;

    public TetrisGame(int row, int col)
    {
        background = new int[row][col];
    }

    public int fetchPosition(int row, int col)
    {
        return background[row][col];
    }

    public int fetchRows()
    {
        return background.length;
    }

    public int fetchCols()
    {
        return background[0].length;
    }

    public void initBoard(int rows, int cols)
    {

    }

    public void spawnBrick()
    {

    }

    public void makeMove()
    {

    }

    public void validateMove()
    {

    }
}
