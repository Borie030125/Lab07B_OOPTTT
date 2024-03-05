import javax.swing.JButton;

public class TicTacToeButton extends JButton {
    private final int row;
    private final int col;

    public TicTacToeButton(int row, int col) {
        this.row = row;
        this.col = col;
        // Configure the button...
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
