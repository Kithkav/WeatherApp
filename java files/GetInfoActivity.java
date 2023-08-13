package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GetInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);


        Bundle bundle = this.getIntent().getExtras();
        String[] info = bundle.getStringArray("info");

        String m = info[6];

        TextView date = findViewById(R.id.date);
        TextView town = findViewById(R.id.town);
        ImageView icon = findViewById(R.id.icon);
        TextView humidity = findViewById(R.id.humidity);

        date.setText(info[0]);
        town.setText(info[1]);
        Picasso.with(GetInfoActivity.this).load("https://openweathermap.org/img/w/"+info[2]+".png").into(icon);

        humidity.setText("Humidity: "+info[5]+"%");

    }
}