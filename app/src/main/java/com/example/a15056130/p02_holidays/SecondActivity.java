package com.example.a15056130.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lvHol ;
    TextView tvType;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvHol = (ListView) this.findViewById(R.id.lvHol);
        tvType = (TextView) findViewById(R.id.tvType);

        Intent i = getIntent();
        String type = i.getStringExtra("Type");
        tvType.setText(type);

        holidays = new ArrayList<Holiday>();
            holidays.add(new Holiday("New Year's Day", "1 Jan 2017",R.drawable.newyear ));
            holidays.add(new Holiday("Labour Day", "1 May 2017",R.drawable.labourday ));
            holidays.add(new Holiday("Chinese New Year", "28 January 2017 - 29 January 2017", R.drawable.cny));

        aa = new HolidayAdapter(this, R.layout.row,holidays);
        lvHol.setAdapter(aa);
    }
}
