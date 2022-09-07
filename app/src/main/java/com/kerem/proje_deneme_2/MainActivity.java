package com.kerem.proje_deneme_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Context context;

    String s1[],s2[];
    int images[] = {R.drawable.konut_1,R.drawable.konut_2,R.drawable.konut_3,R.drawable.konut_4,R.drawable.konut_5,
            R.drawable.konut_7,R.drawable.konut_8,R.drawable.konut_9,R.drawable.konut_10,R.drawable.konut_11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Ev_Basliklari);
        s2 = getResources().getStringArray(R.array.Ev_Aciklamalari);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}


