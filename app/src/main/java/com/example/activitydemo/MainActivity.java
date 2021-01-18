package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String TAG = "Main Activity";
//    TextView textView;
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_listview);
        Log.i(TAG, "--on create--");

//        textView = (TextView) findViewById(R.id.textView);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1); // wipe out String type
        adapter.add("Amazon");
        adapter.add("FlipCart");
        adapter.add("Ebay");
        adapter.add("AliExpress");

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "--on start--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "--on restart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "--on resume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "--on pause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "--on stop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "--on destroy--");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = adapter.getItem(position);
        Toast.makeText(this, "You selected: "+item, Toast.LENGTH_LONG).show();
    }

    // on click handler

//    public void clickHandler(View view) {
//        Date date = new Date();
//        textView.setText("Today is: "+ date.toString());
//        Toast.makeText(this, "You Clicked Button", Toast.LENGTH_LONG).show();
//    }
}