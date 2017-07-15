package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sufya on 13-07-2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake_Data> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake_Data> data)
    {
        super(context,0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lv=convertView;
        if(lv == null)
        {
           lv= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_dataview,parent,false);
        }

        Earthquake_Data currentSelect = getItem(position);

        TextView mag1 = (TextView) lv.findViewById(R.id.mag1);
        mag1.setText(currentSelect.getMagnitude());

        TextView place = (TextView) lv.findViewById(R.id.lcn);
        place.setText(currentSelect.getLocation());

        TextView tym = (TextView) lv.findViewById(R.id.tym);
        tym.setText(currentSelect.getTime());

        return lv;
    }
}
