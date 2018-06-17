package com.gmail.farasabiyyu12.delectamentummanducans;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 * Created by farasabiyyuhandoko on 15/04/2018.
 *
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView foodName;
    public ImageView foodPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        foodName = itemView.findViewById(R.id.food_name);
        foodPhoto = itemView.findViewById(R.id.food_photo);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
