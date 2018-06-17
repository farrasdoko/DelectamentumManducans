package com.gmail.farasabiyyu12.delectamentummanducans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemObject> rowListItem = getAllItemList();
        GridLayoutManager lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<>();
        allItems.add(new ItemObject("Ayam Geprek Sambal Matah", R.drawable.ayamgepreksambalmatah));
        allItems.add(new ItemObject("Ayam Suwir Sambal Matah", R.drawable.ayamwirsamatah));
        allItems.add(new ItemObject("Coto Makassar", R.drawable.cotomakassar));
        allItems.add(new ItemObject("Sambal Ikan Asin Peda Cabejo", R.drawable.sambalasinpeda));
        allItems.add(new ItemObject("Nugget Ayam Handmade", R.drawable.nuggaymhand));
        allItems.add(new ItemObject("Sambal Matah Kecombrang", R.drawable.samatbrang));
//        allItems.add(new ItemObject("Germany", R.drawable.seven));
//        allItems.add(new ItemObject("Sweden", R.drawable.eight));
//        allItems.add(new ItemObject("United States", R.drawable.one));
//        allItems.add(new ItemObject("Canada", R.drawable.two));
//        allItems.add(new ItemObject("United Kingdom", R.drawable.three));
//        allItems.add(new ItemObject("Germany", R.drawable.four));
//        allItems.add(new ItemObject("Sweden", R.drawable.five));
//        allItems.add(new ItemObject("United Kingdom", R.drawable.six));
//        allItems.add(new ItemObject("Germany", R.drawable.seven));
//        allItems.add(new ItemObject("Sweden", R.drawable.eight));

        return allItems;
    }
}
