package birzeit.phase1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    private Button btn;
    private EditText edt1;
    private EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListView();
            }
        });



    }

    public void openListView(){
        Intent intent = new Intent(this, listview.class);
        startActivity(intent);

    }


public void login(View view) {
    Intent in = new Intent(this, listview.class);
    startActivity(in);
}
}