/*
 * This is the class that displays the game state and allows
 * the user to enter moves to the game,
 * THe critical components are paintComponent and process move
 */

/*
 * Game logic with data structure and simple methods.
 * @author prajwaldhungana
 * @version 1.000
 * April 9, 2021
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TetrisDisplay extends JPanel
{
    private TetrisGame game;
    private int start_x = 20;
    private int start_y = 20;
    private int cell_size = 25;

    public TetrisDisplay(TetrisGame gam)
    {
        game = gam;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int gameCol;
        int gameRow = start_y;

        for (int row = 0; row < game.fetchRows(); row++)
        {
            gameCol = start_x;

            for (int col = 0; col < game.fetchCols(); col++)
            {
                g.setColor(Color.black);
                g.fillRect(gameCol,gameRow,cell_size,cell_size);

                g.setColor(Color.white);
                g.drawRect(gameCol,gameRow,cell_size,cell_size);

                gameCol += cell_size;
            }
            gameRow += cell_size;
        }

    }

    public void processMove()
    {

    }
}
