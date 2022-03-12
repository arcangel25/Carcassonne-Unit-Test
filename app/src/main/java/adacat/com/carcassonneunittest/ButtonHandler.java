package adacat.com.carcassonneunittest;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonHandler implements View.OnClickListener{
    private TextView textBox;

    public ButtonHandler(EditText t) {
        textBox = t;
    }

    @Override
    public void onClick(View view) {
        this.textBox.clearComposingText();

        CarcassonneGameState firstInstance = new CarcassonneGameState(4);
        CarcassonneGameState firstCopy = new CarcassonneGameState(firstInstance);

        firstInstance.placeTile(1, 2, 1);
        this.textBox.append("Player 1 placed the tile at (2, 1)\n");

        firstInstance.rotateTile(1);
        this.textBox.append("Player 1 rotated the current tile\n");

        firstInstance.confirmTile(1);
        this.textBox.append("Player 1 confirmed the current tile placement\n");

        firstInstance.placeMeeple(1, 50, 50);
        this.textBox.append("Player 1 placed a meeple\n");

        firstInstance.confirmMeeple(1);
        this.textBox.append("Player 1 confirmed meeple placement\n");

        firstInstance.placeTile(2, 2, 2);
        this.textBox.append("Player 2 placed the tile at (2, 2)\n");

        firstInstance.confirmTile(2);
        this.textBox.append("Player 2 confirmed the current tile\n");

        firstInstance.resetTurn(2);
        this.textBox.append("Player 2 reset turn\n");

        firstInstance.confirmTile(2);
        this.textBox.append("Player 2 confirmed the current tile\n");

        firstInstance.confirmMeeple(2);
        this.textBox.append("Player 2 confirmed meeple placement\n");

        firstInstance.quitGame(3);
        this.textBox.append("Player 3 quit the game.");

        CarcassonneGameState secondInstance = new CarcassonneGameState(4);
        CarcassonneGameState secondCopy = new CarcassonneGameState(secondInstance);

        this.textBox.append("firstCopy: " + firstCopy.toString());
        this.textBox.append("secondCopy: " + secondCopy.toString());
    }
}
