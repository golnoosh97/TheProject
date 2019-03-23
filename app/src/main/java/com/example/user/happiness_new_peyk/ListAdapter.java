package com.example.user.happiness_new_peyk;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private Context context;
    private List<Pojo> PojoList;
    private List<Pojo.Query>queryList;
    private List<String> url;



    public ListAdapter(Context context,List<String>url) {
        this.context=context;
        this.url=url;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        public TextView Item_position;
        public ImageView image;

        public MyViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
           // Item_position = (TextView) cardView.findViewById(R.id.item_position);
            image = (ImageView) cardView.findViewById(R.id.img);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.pojo, parent, false);
        return new MyViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        Pojo pojo = PojoList.get(position);
       // holder.Item_position.setText(pojo.getItem_position());
        // holder.image.setImageResource(PojoList.get(position).getImg());
        Picasso.with(context)
                .load(pojo.get);
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return PojoList.size();
    }
}
