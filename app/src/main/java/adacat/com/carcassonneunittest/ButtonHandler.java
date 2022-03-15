package adacat.com.carcassonneunittest;

/**
 *
 * The ButtonHandler executes the unit test upon the user's click of the button.
 * @author DJ Backus, Alex Martinez-Lopez, Cheyanne Yim, Vincent Robinson, Sophie Arcangel
 * @version 3.14.22
 *
 */

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

        //Creating instances
        CarcassonneGameState firstInstance = new CarcassonneGameState(4);
        CarcassonneGameState firstCopy = new CarcassonneGameState(firstInstance);

        //Calls all actions
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
        this.textBox.append("Player 3 quit the game.\n");

        CarcassonneGameState secondInstance = new CarcassonneGameState(4);
        CarcassonneGameState secondCopy = new CarcassonneGameState(secondInstance);

        //Verify the copies are the same
        this.textBox.append("\n Is first copy equal to second copy?\n");
        this.textBox.append(" " + secondInstance.toString().equals(secondCopy.toString()));

        //Print all information to screen
        this.textBox.append("firstCopy: " + firstCopy.toString());
        this.textBox.append("secondCopy: " + secondCopy.toString());
    }
}
