package com.elifayhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //uygulama açıldığı anda değişiklik olsun istersek
        super.onCreate(savedInstanceState);              //buranın içine yazarız.
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.metallica2);


    }
}
