/*
 * This is the class that houses the Game display and instantiates
 * the actual game
 * It provides admin capability such as game set up
 * The critical methods are the constructor.
 */

/*
 * Game logic with data structure and simple methods
 * @author prajwaldhungana , ritakhadka
 * @version 1.000
 * April 12, 2021
 */

import javax.swing.*;

public class TetrisWindow extends JFrame
{
    private int win_width = 530;
    private int win_height = 880;

    private TetrisDisplay display;
    private TetrisGame game;

    int rows = 20;
    int cols = 12;

    public TetrisWindow()
    {
        this.setTitle("Tetris Game \t\t@PrajwalDhungana  @RitaKhadka");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        game = new TetrisGame(rows,cols);
        display = new TetrisDisplay(game);
        this.add(display);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new TetrisWindow();
    }
}
