import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class TicTacToeFrame extends JFrame {
    private final GameModel model;
    private final GameController controller;

    public TicTacToeFrame(GameModel model, GameController controller) {
        this.model = model;
        this.controller = controller;
        setTitle("Tic Tac Toe");
        setLayout(new GridLayout(4, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Initialize board with buttons and action listeners from the controller
        pack();
    }

    // View methods to update the UI based on model changes
}
