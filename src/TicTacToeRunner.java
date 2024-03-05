import javax.swing.SwingUtilities;

public class TicTacToeRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameModel model = new GameModel();
            TicTacToeFrame view = new TicTacToeFrame(model, null); // Controller not yet instantiated
            GameController controller = new GameController(model, view);
            view.setController(controller); // Assuming you add a setController method in TicTacToeFrame
            view.setVisible(true);
        });
    }
}
