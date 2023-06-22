package birzeit.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {
    private Button button1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button1 = (Button) findViewById(R.id.but1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListView();
            }
        });

    }
//    public void signup(View view) {
//
//        Intent in = new Intent(this, birzeit.phase1.SignUp.class);
//        startActivity(in);
//    }

    public void login(View view) {
        Intent in = new Intent(this, listview.class);
        startActivity(in);
    }

    public void openListView(){
        Intent intent = new Intent(this, Recycler.class);
        startActivity(intent);

    }
}

