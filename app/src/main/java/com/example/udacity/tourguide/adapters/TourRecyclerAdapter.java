package com.example.udacity.tourguide.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.udacity.tourguide.DetailActivity;
import com.example.udacity.tourguide.R;
import com.example.udacity.tourguide.entities.Tour;

import java.util.List;

public class TourRecyclerAdapter extends RecyclerView.Adapter<TourRecyclerAdapter.ViewHolder> {
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    private final List<Tour> tours;
    private final Context context;
    private final int type;

    public TourRecyclerAdapter(Context context, List<Tour> tours, int type) {
        this.tours = tours;
        this.context = context;
        this.type = type;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        switch (type){
            case TYPE_2:
                v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_type_2, parent, false);
                break;
            default:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_list_type_1, parent, false);
                break;
        }
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Tour tour = tours.get(position);

        holder.locationImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), tour.getImage(), null));
        holder.locationNameTextView.setText(context.getString(tour.getName()));
        if (type == TYPE_2){
            holder.locationCategoryTextView.setText(context.getString(tour.getCategory()));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.KEY_LOCATION, tour);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tours.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView locationImageView;
        private final TextView locationNameTextView, locationCategoryTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            locationImageView = (ImageView) itemView.findViewById(R.id.image_location);
            locationNameTextView = (TextView) itemView.findViewById(R.id.text_location_name);
            locationCategoryTextView = (TextView) itemView.findViewById(R.id.text_location_category);
        }
    }
}
