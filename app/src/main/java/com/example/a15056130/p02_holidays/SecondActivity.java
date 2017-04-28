package com.example.a15056130.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        if (type.equalsIgnoreCase("Secular")){
            holidays.add(new Holiday("New Year's Day", "1 Jan 2017",R.drawable.newyear ));
            holidays.add(new Holiday("Labour Day", "1 May 2017",R.drawable.labourday ));
            holidays.add(new Holiday("National Day", "9 August 2017", R.drawable.nationalday));
        } else {
            holidays.add(new Holiday("Chinese New Year", "28 - 29 January 2017", R.drawable.cny));
            holidays.add(new Holiday("Good Friday", "14 April 2017", R.drawable.goodfriday));
            holidays.add(new Holiday("Vesak Day", "10 May 2017", R.drawable.vesakday));
            holidays.add(new Holiday("Hari Raya Puasa","25 June 2017", R.drawable.harirayapuasa));
            holidays.add(new Holiday("Hari Raya Haji", "1 September 2017", R.drawable.harirayahaji));
            holidays.add(new Holiday("Deepavali", "18 October 2017", R.drawable.deepavali));
            holidays.add(new Holiday("Christmas Day", "25 December 2017", R.drawable.christmas));
        }



        aa = new HolidayAdapter(this, R.layout.row,holidays);
        lvHol.setAdapter(aa);

        lvHol.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHols = holidays.get(position);

                Toast.makeText(SecondActivity.this, selectedHols.getHols()
                                + " Date: " + selectedHols.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
