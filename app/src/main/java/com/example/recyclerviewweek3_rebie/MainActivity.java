package com.example.recyclerviewweek3_rebie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> nameOfDrinkList = new ArrayList<>();
    ArrayList<String> priceList = new ArrayList<>();
    ArrayList<Integer>imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nameOfDrinkList.add("Avocado juice");
        nameOfDrinkList.add("strawberry smoothie");
        nameOfDrinkList.add("Orange juice");
        nameOfDrinkList.add("Coffee");
        nameOfDrinkList.add("Soda");
        nameOfDrinkList.add("Mixed juice");
        nameOfDrinkList.add("Green Tea");
        nameOfDrinkList.add("Tea");

        priceList.add("$5.99");
        priceList.add("$7.99");
        priceList.add("$4");
        priceList.add("$4.99");
        priceList.add("$1.99");
        priceList.add("$5");
        priceList.add("4");
        priceList.add("3.89");

        imageList.add(R.drawable.avocado);
        imageList.add(R.drawable.strawberry_smoothy);
        imageList.add(R.drawable.orang);
        imageList.add(R.drawable.coffee);
        imageList.add(R.drawable.soda);
        imageList.add(R.drawable.mixed);
        imageList.add(R.drawable.tea);
        imageList.add(R.drawable.meant);

        recyclerView.setAdapter(new MyAdapter(nameOfDrinkList,priceList,imageList));
    }
}