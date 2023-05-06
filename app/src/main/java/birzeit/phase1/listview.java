package birzeit.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);



        ListView listView = findViewById(R.id.listView);

        List<String> list = new ArrayList<>();
        list.add("Addition");
        list.add("Substraction");
        list.add("Multiplication");
        list.add("Division");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){

                    startActivity(new Intent(listview.this,AdditionActivity.class));
                }else if (i==1){
                    startActivity(new Intent(listview.this,SubstractionActivity.class));
                }else if (i==2){
                    startActivity(new Intent(listview.this,MultiActivity.class));
                }else{
                    startActivity(new Intent(listview.this,DivisionActivity.class));
                }
            }
        });

    }
}