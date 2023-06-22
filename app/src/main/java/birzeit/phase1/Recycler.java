package birzeit.phase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("kindergarten Math","2020",R.drawable.book1));
        items.add(new Item("my best kindergarten Math","2023",R.drawable.book2));
        items.add(new Item("Math Book for preschool","2021",R.drawable.book3));
        items.add(new Item("Math Concepts Learning fun workbook","2019",R.drawable.book4));
        items.add(new Item("Math practice book","2020",R.drawable.book5));
        items.add(new Item("Jumbo math success workbook","2018",R.drawable.book6));
        items.add(new Item("Preschool Math","2023",R.drawable.book7));
        items.add(new Item("Educational math pictures books","2021",R.drawable.book8));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}