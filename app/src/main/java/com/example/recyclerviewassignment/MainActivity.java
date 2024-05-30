package com.example.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemAdopter itemAdopter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        recyclerView.setAdapter(new ItemAdopter(generateData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

    }
    public List<Item> generateData(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Images","445","50 GB", R.drawable.image2));
        items.add(new Item("Persons","450","40GB",R.drawable.person_icon));
        items.add(new Item("Android","445","50 GB", R.drawable.android));
        items.add(new Item("Audio","450","40GB",R.drawable.apiicon));
        items.add(new Item("Images","445","50 GB", R.drawable.audio));
        items.add(new Item("Camera","450","40GB",R.drawable.camera));
        items.add(new Item("Clock","445","50 GB", R.drawable.clock));
        items.add(new Item("Downloads","450","40GB",R.drawable.download1));
        items.add(new Item("Heart","445","50 GB", R.drawable.favourite1));
        items.add(new Item("Filled Heart","450","40GB",R.drawable.filledheart));
        items.add(new Item("Favourite","445","50 GB", R.drawable.heart));
        items.add(new Item("Location","450","40GB",R.drawable.location));
        items.add(new Item("Messages","445","50 GB", R.drawable.message));
        items.add(new Item("Persons","450","40GB",R.drawable.apiicon));


        return items;
    }
}