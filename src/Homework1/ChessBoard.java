package Homework1;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JFrame {

    public ChessBoard() {
        setTitle("Шахматная доска");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new GridLayout(8, 8));


        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(50, 50));


                if ((row + col) % 2 == 0) {
                    cell.setBackground(Color.WHITE);
                } else {
                    cell.setBackground(Color.BLACK);
                }

                panel.add(cell);
            }
        }


        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessBoard());
    }
}