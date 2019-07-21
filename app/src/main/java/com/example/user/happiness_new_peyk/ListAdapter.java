package com.example.user.happiness_new_peyk;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

// FIXME: Care about warnings and always use autoFix (Alt+Enter or the yellow bubble)
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private Context context;
    private List<AllimagesItem> allimagesItemList;
    private List<AllimagesItem> allimagesItemList1 = new ArrayList<AllimagesItem>();
    private List<String> url;
    private List<String> name;

    public ListAdapter(Context context, List<AllimagesItem> allimagesItemList1) {
        this.context = context;
        Log.e("TESTTEST", allimagesItemList1.toString());
        this.allimagesItemList1 = allimagesItemList1;
        // this.url=url;
        // this.name=name;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public ImageView image;

        public MyViewHolder(CardView cardView) {
            super(cardView);
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
          //CardView cardView = holder.cardView;
        // AllimagesItem allimagesItem = allimagesItemList.get(position);
        //  holder.name.setText(name.get(position));
        Picasso.with(context).load(allimagesItemList1.get(position).getUrl()).into(holder.image);
        holder.name.setText(allimagesItemList1.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return allimagesItemList1.size();
    }
}
