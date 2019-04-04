package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListdetails extends RecyclerView.Adapter<AdapterListdetails.HolderItem>{
    List<Details> mListItem;
    Context context;
    public AdapterListdetails(List<Details> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_breeds,parent,false);
        HolderItem holder=new HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final HolderItem holder, final int position) {
        final Details mlist=mListItem.get(position);
        holder.title.setText("TIME:"+mlist.getTitle());
        holder.description.setText(mlist.getDescription());
        holder.thubnail.setImageResource(mlist.getImg());
    }

    @Override
    public int getItemCount() {
        return mListItem.size();
    }

    public class HolderItem extends RecyclerView.ViewHolder{
        ImageView thubnail;
        TextView title,description;
        CardView cardView;

        public HolderItem(View v) {
            super(v);
            title=(TextView) v.findViewById(R.id.tv_title);
            description=(TextView) v.findViewById(R.id.tv_description);
            thubnail =(ImageView) v.findViewById(R.id.img_cover);
            cardView=(CardView)v.findViewById(R.id.cardview);
        }
    }
}
