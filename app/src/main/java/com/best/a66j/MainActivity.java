package com.best.a66j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.best.a66j.Adapter.Adapter;
import com.best.a66j.Module.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
        ArrayList<User> list = get();
        refresh(list);
    }

    public void open() {
        recyclerView = findViewById(R.id.recyclerViewM);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }

    public void refresh(ArrayList<User> list) {
        Adapter adapter = new Adapter(context, list);
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<User> get() {
        ArrayList<User> list = new ArrayList<User>();
        for (int i = 1; i <=15; i++) {
            list.add(new User("item list "+i));
        }
        return list;
    }
}