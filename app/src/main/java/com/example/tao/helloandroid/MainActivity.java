package com.example.tao.helloandroid;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;

import static com.example.tao.helloandroid.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView noteView = (TextView) findViewById(R.id.phoneId);
        noteView.setText("+40768922335");
        Linkify.addLinks(noteView, Linkify.ALL);
    }


}
