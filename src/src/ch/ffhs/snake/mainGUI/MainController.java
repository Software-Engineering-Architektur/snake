package ch.ffhs.snake.mainGUI;

import ch.ffhs.snake.GameController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author felix
 * @version 0.1
 * @date 20.03.2017
 */
public class MainController {
    private MainView mainView;
    private MainModel mainModel;

    public MainController(MainView mainView, MainModel mainModel){
        this.mainView = mainView;
        this.mainModel = mainModel;

        this.mainView.setViewSize(100,100);
        this.mainView.setTitle("Snake");
        this.mainView.setVisible(true);
        this.mainView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Add Listener
        this.mainView.addActionListenerButtonSinglePlayer(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameController.main();
            }
        });
    }
}
