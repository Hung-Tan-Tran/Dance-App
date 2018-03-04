package com.example.haniel.dance;

import android.content.Context;
import android.content.*;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sergioperez on 3/3/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context myContext;
    private List<Video> myData;


    public RecyclerViewAdapter(Context myContext, List<Video> myData) {
        this.myContext = myContext;
        this.myData = myData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater myLayoutInflater = LayoutInflater.from(myContext);
        view = myLayoutInflater.inflate(R.layout.cardview_item_videothubnail, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_video_title.setText(myData.get(position).getTitle());
        holder.img_video_thumbnail.setImageResource(myData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(myContext, Video_Info_Activity.class);

                intent.putExtra("Title", myData.get(position).getTitle());
                intent.putExtra("Description", myData.get(position).getDescription());
                intent.putExtra("VideoURL", myData.get(position).getVideoURL());

                myContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_video_title;
        ImageView img_video_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_video_title = (TextView) itemView.findViewById(R.id.video_title_id);
            img_video_thumbnail = (ImageView) itemView.findViewById(R.id.video_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
