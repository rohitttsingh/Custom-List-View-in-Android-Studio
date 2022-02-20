package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String[] main_title ={"YPR BKN EXP-06587 ","YPR BKN EXP-06587 ", "YPR ADI FEST SPL-06502", "BARMER AC EXP-04805","TN OKHA EXP-0956","SBC JU FEST SPL-06508","JP SUVIDHA EXP-06521","PUNE NZM AC SPL-02493","NZM RAJDHANI SPL-029352","YPR BKN EXP-06587 "};
Integer[] imgid = {R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.download,R.drawable.pubg,R.drawable.poster};
String[] main_subtitle= {"rohit","singh","don","miya bhai","jjj","uffhush","sfbusbfu","fnn","uhuyhu","fuhu"};
MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.list);
        MyListAdapter adapter = new MyListAdapter(this, main_title,imgid,main_subtitle);
        listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String value =adapter.getItem(position);
            Toast.makeText(MainActivity.this,"you clicked "+ value ,Toast.LENGTH_LONG).show();
        }
    });

    }
}