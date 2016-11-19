package View;

import Controller.GameController;
import Model.Field;
import Model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dred on 17.09.2016.
 */
public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jPanel.setLayout(new GridLayout(3, 3));
        setTitle("XO Game");

        jPanel.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton jButton = new JButton();

                buttons[i][j] = jButton;
                final int finalJ = j;
                final int finalI = i;
                jPanel.add(jButton);


                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();

                        System.out.printf("Button: %s, x: %d, y: %d\n", buttonText, finalJ, finalI);
                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X : Field.Type.O);

                    }
                });
            }
        }
        add(jPanel);
        setVisible(true);
    }

}
