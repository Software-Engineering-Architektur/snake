package ch.ffhs.snake.gameGUI;

/**
 * @author felix
 * @version 0.1
 * @date 20.03.2017
 */
import ch.ffhs.snake.gameBoard.Board;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class GameController extends JFrame {

    GameController() {

        add(new Board());
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void run() {

        // Creates a new thread so our GUI can process itself
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frameGameController = new GameController();
                frameGameController.setVisible(true);
            }
        });
    }
}
