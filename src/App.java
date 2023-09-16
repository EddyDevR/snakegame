import javax.swing.JFrame;

import com.formdev.flatlaf.FlatDarculaLaf;

public class App {
    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardHeight, boardWidth);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
