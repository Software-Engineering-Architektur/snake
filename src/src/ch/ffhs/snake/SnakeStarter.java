package ch.ffhs.snake;

import ch.ffhs.snake.mainGUI.MainController;
import ch.ffhs.snake.mainGUI.MainModel;
import ch.ffhs.snake.mainGUI.MainView;

import javax.swing.*;

/**
 * @author felix
 * @version 0.1
 * @date 20.03.2017
 */
public class SnakeStarter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainView mainView = new MainView("Snake");
                MainModel mainModel = new MainModel();
                MainController mainController = new MainController(mainView, mainModel);
            }
        });
    }
}
