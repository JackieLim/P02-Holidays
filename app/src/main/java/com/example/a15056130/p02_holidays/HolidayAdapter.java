package com.example.a15056130.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15056130 on 4/27/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private Context context;
    private ArrayList<Holiday> holidays;
    private TextView tvHol;
    private TextView tvDate;
    private ImageView ivHol;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHol = (TextView) rowView.findViewById(R.id.tvHol);
        ivHol = (ImageView) rowView.findViewById(R.id.ivHol);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        Holiday currentMod = holidays.get(position);
        tvHol.setText(currentMod.getHols());
        tvDate.setText(currentMod.getDate());
        ivHol.setImageResource(currentMod.getImg());


        return rowView;
    }

}
