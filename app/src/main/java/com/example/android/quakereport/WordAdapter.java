package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tijojose27 on 10/15/2017.
 */

public class WordAdapter extends ArrayAdapter<Earthquake> {

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Earthquake> myearthquakes) {
        super(context, 0, myearthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Earthquake currEarthquake = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.word_list, parent, false);
        }

        TextView tvMag = (TextView) convertView.findViewById(R.id.magnitud_tv);
        tvMag.setText(currEarthquake.getMagnitudeAsString());

        

        TextView tvCity = (TextView) convertView.findViewById(R.id.city_tv);
        tvCity.setText(currEarthquake.getCity());

        Date dateObj = new Date(currEarthquake.geteDate());
        SimpleDateFormat mdydf = new SimpleDateFormat("MMM DD, yyyy");
        SimpleDateFormat tdf = new SimpleDateFormat("h:mm a");

        String thisMonYear = mdydf.format(dateObj);
        String thisTime = tdf.format(dateObj);

        TextView tvDate = (TextView) convertView.findViewById(R.id.date_tv);
        tvDate.setText(thisMonYear);

        TextView tvTime = (TextView) convertView.findViewById(R.id.time_tv);
        tvTime.setText(thisTime);



        return convertView;
    }
}
