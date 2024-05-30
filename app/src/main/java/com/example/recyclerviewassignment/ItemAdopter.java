package com.example.recyclerviewassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdopter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Item> items;

    public ItemAdopter(List<Item> items) {

        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        if (viewType == 0) {
            itemView  = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_view, parent, false);
            return new AdsViewHolder(itemView);

        } else {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_product_view, parent, false);

            return new ItemViewHolder(itemView);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Item item = items.get(position);
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).iv.setImageResource(item.getImageResourceId());
            ((ItemViewHolder) holder).tvname.setText(item.getName());
            ((ItemViewHolder) holder).tvlike.setText(item.getLikes());
            ((ItemViewHolder) holder).tvmb.setText(item.getMb());

        } else if (holder instanceof AdsViewHolder) {

                ((AdsViewHolder) holder).ivad.setImageResource(item.getImageResourceId());
            ((AdsViewHolder)holder).tv1.setText(item.getName());
            ((AdsViewHolder)holder).tv2.setText(item.getLikes());
            ((AdsViewHolder)holder).tv3.setText(item.getMb());





        }
    }
    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
class AdsViewHolder extends RecyclerView.ViewHolder{
        ImageView ivad;
        TextView tv1,tv2,tv3;

    public AdsViewHolder(@NonNull View itemView) {
        super(itemView);
        ivad= itemView.findViewById(R.id.img);
        tv1 = itemView.findViewById(R.id.tvname);
        tv2 = itemView.findViewById(R.id.tvlikes);
        tv3 = itemView.findViewById(R.id.tvmb);

    }
}
    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tvname, tvlike, tvmb;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.img);
            tvname = itemView.findViewById(R.id.tvname);
            tvlike = itemView.findViewById(R.id.tvlikes);
            tvmb = itemView.findViewById(R.id.tvmb);


        }
    }
}
