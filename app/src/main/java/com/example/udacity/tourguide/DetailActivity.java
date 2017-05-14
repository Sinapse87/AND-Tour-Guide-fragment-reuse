package com.example.udacity.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.udacity.tourguide.entities.Tour;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_LOCATION = "tour";
    private Tour tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tour = getIntent().getParcelableExtra(KEY_LOCATION);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(tour.getName());
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.toolbar_layout).setBackgroundResource(tour.getImage());

        ((TextView) findViewById(R.id.text_location_description)).setText(tour.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                finish();
                return true;
            case R.id.menu_maps:
                Uri gmmIntentUri = Uri.parse("https://google.navigation:q="+getString(tour.getLatitude())+","+getString(tour.getLongitude()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                getBaseContext().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                //mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
