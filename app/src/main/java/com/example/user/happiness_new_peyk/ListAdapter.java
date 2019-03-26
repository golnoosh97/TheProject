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
    private List<Query> queryList;
    private List<AllimagesItem> allimagesItemList;
    //private List<Pojo>pojoList;
    private List<String> url;
    private List<String>name;

    public ListAdapter(Context context, List<String> url,List<String>name) {
        this.context = context;
        this.url = url;
        this.name=name;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        public TextView name;
        public ImageView image;

        public MyViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
            name = cardView.findViewById(R.id.item_position);
            image = cardView.findViewById(R.id.img);
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
        AllimagesItem allimagesItem = allimagesItemList.get(position);
        //Pojo pojo =pojoList.get(position);
        holder.name.setText(name.get(position));
        // holder.image.setImageResource(PojoList.get(position).getImg());
        Picasso.with(context)
                .load(allimagesItem.getUrl())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return allimagesItemList.size();
    }
}
