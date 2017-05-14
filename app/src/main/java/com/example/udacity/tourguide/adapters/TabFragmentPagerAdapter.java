package com.example.udacity.tourguide.adapters;

import com.example.udacity.tourguide.R;
import com.example.udacity.tourguide.entities.Tour;
import com.example.udacity.tourguide.fragments.TourFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import static com.example.udacity.tourguide.adapters.TourRecyclerAdapter.TYPE_1;
import static com.example.udacity.tourguide.adapters.TourRecyclerAdapter.TYPE_2;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    private final String[] title = new String[]{
            "Religious",
            "Family",
            "History",
            "Nature"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:

                ArrayList<Tour> religious = new ArrayList<>();
                religious.add(new Tour(R.string.religious_1_name, R.drawable.religious_1_image, R.string.religious_1_description, R.string.religious_1_latitude, R.string.religious_1_longitude));
                religious.add(new Tour(R.string.religious_2_name, R.drawable.religious_2_image, R.string.religious_2_description, R.string.religious_2_latitude, R.string.religious_2_longitude));
                religious.add(new Tour(R.string.religious_3_name, R.drawable.religious_3_image, R.string.religious_3_description, R.string.religious_3_latitude, R.string.religious_3_longitude));
                religious.add(new Tour(R.string.religious_4_name, R.drawable.religious_4_image, R.string.religious_4_description, R.string.religious_4_latitude, R.string.religious_4_longitude));
                religious.add(new Tour(R.string.religious_5_name, R.drawable.religious_5_image, R.string.religious_5_description, R.string.religious_5_latitude, R.string.religious_5_longitude));
                religious.add(new Tour(R.string.religious_6_name, R.drawable.religious_6_image, R.string.religious_6_description, R.string.religious_6_latitude, R.string.religious_6_longitude));
                religious.add(new Tour(R.string.religious_7_name, R.drawable.religious_7_image, R.string.religious_7_description, R.string.religious_7_latitude, R.string.religious_7_longitude));
                Bundle bundle1 = new Bundle();

                bundle1.putParcelableArrayList("tourList", religious);
                bundle1.putInt("tourCategory", TYPE_1);

                fragment = new TourFragment();
                fragment.setArguments(bundle1);
                break;
            case 1:
                ArrayList<Tour> families = new ArrayList<>();
                families.add(new Tour(R.string.family_1_name, R.drawable.family_1_image, R.string.family_1_description, R.string.family_1_latitude, R.string.family_1_longitude));
                families.add(new Tour(R.string.family_2_name, R.drawable.family_2_image, R.string.family_2_description, R.string.family_2_latitude, R.string.family_2_longitude));
                families.add(new Tour(R.string.family_3_name, R.drawable.family_3_image, R.string.family_3_description, R.string.family_3_latitude, R.string.family_3_longitude));
                families.add(new Tour(R.string.family_4_name, R.drawable.family_4_image, R.string.family_4_description, R.string.family_4_latitude, R.string.family_4_longitude));
                families.add(new Tour(R.string.family_5_name, R.drawable.family_5_image, R.string.family_5_description, R.string.family_5_latitude, R.string.family_5_longitude));
                families.add(new Tour(R.string.family_6_name, R.drawable.family_6_image, R.string.family_6_description, R.string.family_6_latitude, R.string.family_6_longitude));
                Bundle bundle2 = new Bundle();

                bundle2.putParcelableArrayList("tourList", families);
                bundle2.putInt("tourCategory", TYPE_1);
                fragment = new TourFragment();
                fragment.setArguments(bundle2);

                break;
            case 2:

                ArrayList<Tour> histories = new ArrayList<>();
                histories.add(new Tour(R.string.history_1_name, R.drawable.history_1_image, R.string.history_1_description, R.string.history_1_latitude, R.string.history_1_longitude));
                histories.add(new Tour(R.string.history_2_name, R.drawable.history_2_image, R.string.history_2_description, R.string.history_2_latitude, R.string.history_2_longitude));
                histories.add(new Tour(R.string.history_3_name, R.drawable.history_3_image, R.string.history_3_description, R.string.history_3_latitude, R.string.history_3_longitude));
                histories.add(new Tour(R.string.history_4_name, R.drawable.history_4_image, R.string.history_4_description, R.string.history_4_latitude, R.string.history_4_longitude));
                Bundle bundle3 = new Bundle();

                bundle3.putParcelableArrayList("tourList", histories);
                bundle3.putInt("tourCategory", TYPE_1);

                fragment = new TourFragment();
                fragment.setArguments(bundle3);


                break;
            case 3:

                ArrayList<Tour> natures = new ArrayList<>();
                natures.add(new Tour(R.string.nature_1_name, R.string.nature_1_category, R.drawable.nature_1_image, R.string.nature_1_description, R.string.nature_1_latitude, R.string.nature_1_longitude));
                natures.add(new Tour(R.string.nature_2_name, R.string.nature_2_category, R.drawable.nature_2_image, R.string.nature_2_description, R.string.nature_2_latitude, R.string.nature_2_longitude));
                natures.add(new Tour(R.string.nature_3_name, R.string.nature_3_category, R.drawable.nature_3_image, R.string.nature_3_description, R.string.nature_3_latitude, R.string.nature_3_longitude));
                natures.add(new Tour(R.string.nature_4_name, R.string.nature_4_category, R.drawable.nature_4_image, R.string.nature_4_description, R.string.nature_4_latitude, R.string.nature_4_longitude));
                natures.add(new Tour(R.string.nature_5_name, R.string.nature_5_category, R.drawable.nature_5_image, R.string.nature_5_description, R.string.nature_5_latitude, R.string.nature_5_longitude));
                natures.add(new Tour(R.string.nature_6_name, R.string.nature_6_category, R.drawable.nature_6_image, R.string.nature_6_description, R.string.nature_6_latitude, R.string.nature_6_longitude));
                Bundle bundle4 = new Bundle();

                bundle4.putParcelableArrayList("tourList", natures);
                bundle4.putInt("tourCategory", TYPE_2);
                fragment = new TourFragment();
                fragment.setArguments(bundle4);
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
