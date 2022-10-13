package org.fp.dam.practica3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.os.Bundle;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<String> l = Arrays.asList("Gustavo","Manolo","Josemanuel","Daniel", "Pepe");
        rv.setAdapter(new UserAdapter(l));
    }
}