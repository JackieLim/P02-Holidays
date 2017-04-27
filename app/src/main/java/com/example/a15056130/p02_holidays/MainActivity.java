package com.example.a15056130.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvType;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvType = (ListView)this.findViewById(R.id.lvType);

        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Religious");

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al);
        lvType.setAdapter(aa);

        lvType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String type = al.get(position).toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("",type);
                startActivity(i);
            }
        });
    }
}