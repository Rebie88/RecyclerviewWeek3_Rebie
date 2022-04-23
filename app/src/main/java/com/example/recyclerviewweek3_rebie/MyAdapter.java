package com.example.recyclerviewweek3_rebie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<String> nameOfDrinkList;
    ArrayList<String> priceList;
    ArrayList<Integer>imageList;

    public MyAdapter(ArrayList<String> nameOfDrinkList, ArrayList<String> priceList, ArrayList<Integer> imageList) {
        this.nameOfDrinkList = nameOfDrinkList;
        this.priceList = priceList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlelayout_design, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(nameOfDrinkList.get(position));
        holder.textView2.setText(priceList.get(position));
        holder.img.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameOfDrinkList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView textView1, textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.imageView);
            textView1 = (TextView) itemView.findViewById(R.id.textView);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
