package com.example.fashionproject;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class FashionRecyclerAdapter extends RecyclerView.Adapter<FashionRecyclerAdapter.FashionRecyclerViewHolder> {
    ArrayList<String> myList;
    public  FashionRecyclerAdapter(ArrayList list){
       myList=list;
    }
    @NonNull
    @Override
    public FashionRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        FashionRecyclerViewHolder holder = new FashionRecyclerViewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FashionRecyclerViewHolder holder, int position) {

             holder.btnName.setText(myList.get(position));
        if(holder.btnName.getText()=="Women"){

            holder.btnName.setOnClickListener(new View.OnClickListener() {
                @Override
               public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),WomenActivity.class);
                   v.getContext().startActivity(intent);
                }
            });
        } if(holder.btnName.getText() == "Men"){
            holder.btnName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(),MenActivity.class);
                    v.getContext().startActivity(i);
                }
            });
        }

    }
    @Override
    public int getItemCount() {
        return myList.size();
    }

    class FashionRecyclerViewHolder extends RecyclerView.ViewHolder{
        Button btnName;
        public FashionRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            btnName = itemView.findViewById(R.id.btnName);
        }
    }
}
