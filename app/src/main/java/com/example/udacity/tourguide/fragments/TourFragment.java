package com.example.udacity.tourguide.fragments;

import com.example.udacity.tourguide.R;
import com.example.udacity.tourguide.adapters.TourRecyclerAdapter;
import com.example.udacity.tourguide.entities.Tour;
import com.example.udacity.tourguide.view.SpacesItemDecoration;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourFragment extends Fragment {
    private List<Tour> tourList;
    private int tourCategory;

    public TourFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        // Required empty public constructor
        if (bundle != null) {
            Object object = bundle.get("tourList");
            if (object instanceof ArrayList) {
                tourList = (ArrayList<Tour>) object;
            }
            tourCategory = bundle.getInt("tourCategory");
        }

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tour_fragment, container, false);

        RecyclerView itemRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.default_space);
        itemRecyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        itemRecyclerView.setLayoutManager(layoutManager);

        TourRecyclerAdapter adapter = new TourRecyclerAdapter(getActivity(), tourList,tourCategory);
        itemRecyclerView.setAdapter(adapter);

        return view;
    }

}
