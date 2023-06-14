package com.example.project_prm.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_prm.Domain.FoodDomain;
import com.example.project_prm.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<FoodDomain> popularDomains;

    public PopularAdapter(ArrayList<FoodDomain> popularDomains) {
        this.popularDomains = popularDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(popularDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(popularDomains.get(position).getFee()));

        int drawableResourceId = holder.itemView.getContext().getResources()
                .getIdentifier(popularDomains.get(position).getImg(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return popularDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, fee;
        ImageView img;
        ImageView btn_add;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_title);
            img = itemView.findViewById(R.id.img);
            fee = itemView.findViewById(R.id.txt_fee);
            btn_add = itemView.findViewById(R.id.btn_add);
        }

    }
}
