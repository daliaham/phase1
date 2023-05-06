package birzeit.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class DivisionActivity extends AppCompatActivity {
    private Button button;
    private RadioButton radioButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCorrection();
            }
        });

    }

    public void checkCorrection(){
        RadioButton radioButton1 = findViewById(R.id.radioTrue);
        RadioButton radioButton2 = findViewById(R.id.radioFalse);
        if (radioButton1.isChecked()) {
            Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
        } else if (radioButton2.isChecked()) {
            Toast.makeText(this,"False", Toast.LENGTH_SHORT).show();
        }

    }
}