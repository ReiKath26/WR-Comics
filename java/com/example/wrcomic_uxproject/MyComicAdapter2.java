package com.example.wrcomic_uxproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wrcomic_uxproject.ui.slideshow.SlideshowFragment;

public class MyComicAdapter2 extends RecyclerView.Adapter<MyComicAdapter2.ViewHolder>{

    Comics[] Comics_data;
    Context context;

    public MyComicAdapter2(Comics[] Comic_data, SlideshowFragment fragment){
        this.Comics_data = Comic_data;
        this.context = fragment.getContext();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.comic_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Comics MyComicList = Comics_data[position];
        holder.comicTitle.setText(MyComicList.getComicName());
        holder.comicDesc.setText(MyComicList.getComicDesc());
        holder.comicImage.setImageResource(MyComicList.getComicImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.wrcomic_uxproject.Comic_Detail.class);
                context.startActivity(intent);
                intent.putExtra("Comic Title", MyComicList.getComicName());
                intent.putExtra("Comic Desc", MyComicList.getComicDesc());
                intent.putExtra("Comic Image", MyComicList.getComicImage());
            }
        });

    }

    @Override
    public int getItemCount() {
        return Comics_data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView comicImage;
        TextView comicTitle;
        TextView comicDesc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            comicImage = itemView.findViewById(R.id.img_view2);
            comicTitle = itemView.findViewById(R.id.text_title2);
            comicDesc = itemView.findViewById(R.id.text_desc2);

        }
    }
}
