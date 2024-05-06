package com.example.custom_adapter_practice;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class news_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_news_view);



        TextView tv1= findViewById(R.id.headline);
        TextView tv2= findViewById(R.id.news_description);
        ImageView img = findViewById(R.id.news_image);


        tv1.setText(getIntent().getExtras().getString("headline"));
       tv2.setText(getIntent().getExtras().getString("description"));
        img.setImageResource(getIntent().getExtras().getInt("image"));
    }
}