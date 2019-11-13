package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class BookmarksActivity extends AppCompatActivity
{

    private RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);
        Toolbar toolbar=findViewById(R.id.toolbarbookmark);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Saved Items");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView2=findViewById(R.id.recyclerbookmarks);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView2.VERTICAL);

        List<questionmodel> items=new ArrayList<>();
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        items.add(new questionmodel("What is your age? ","a","b","c","d","21"));
        recyclerView2.setLayoutManager(layoutManager);
        bookmarks_adapter adapter=new bookmarks_adapter(items);
        recyclerView2.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
