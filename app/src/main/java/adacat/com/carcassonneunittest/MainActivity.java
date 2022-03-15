package adacat.com.carcassonneunittest;

/**
 *
 * Sets up UI for Unit Test app
 * @author DJ Backus, Alex Martinez-Lopez, Cheyanne Yim, Vincent Robinson, Sophie Arcangel
 * @version 3.14.22
 */

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textBox = findViewById(R.id.testText);
        Button uiButton = findViewById(R.id.runButton);

        View.OnClickListener buttonHandler = new ButtonHandler(textBox);
        uiButton.setOnClickListener(buttonHandler);
    }

}