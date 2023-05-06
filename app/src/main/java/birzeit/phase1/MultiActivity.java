package birzeit.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MultiActivity extends AppCompatActivity {
    private EditText edt;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        button = (Button) findViewById(R.id.button);
        EditText editText = findViewById(R.id.edt1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCorrect();
            }
        });



    }
    public void checkCorrect(){
        EditText editText = findViewById(R.id.edt1);

        String text = editText.getText().toString();

        if (text.equals("6")) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }
}