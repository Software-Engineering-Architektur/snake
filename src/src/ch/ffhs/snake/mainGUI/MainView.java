package ch.ffhs.snake.mainGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author felix
 * @version 0.1
 * @date 20.03.2017
 */
public class MainView extends JFrame{

    private JButton buttonSinglePlayer = new JButton("Single Player");


    public MainView(String title) {
       super(title) ;

       setLayout(new GridBagLayout());

       GridBagConstraints gridBagConstraints = new GridBagConstraints();

       gridBagConstraints.fill = GridBagConstraints.NONE;

       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 0;
       gridBagConstraints.weightx = 1;
       gridBagConstraints.weighty = 1;
       add(buttonSinglePlayer, gridBagConstraints);

    }

    public void setViewSize(int width, int height){
        this.setSize(width, height);
    }

    public void addActionListenerButtonSinglePlayer(ActionListener actionListener){
        this.buttonSinglePlayer.addActionListener(actionListener);
    }
}
