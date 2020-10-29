package com.example.picasso_loadpic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Button btnLoadImage1,btnLoadImage2;
    private TextView txtUrlImage1,txtUrlImage2;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadImage1=findViewById(R.id.btn_image1);
        btnLoadImage2=findViewById(R.id.btn_image2);
        txtUrlImage1=findViewById(R.id.txt_UrlImage1);
        txtUrlImage2=findViewById(R.id.txt_UrlImage2);
        imageView=findViewById(R.id.img);

        btnLoadImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadImage(txtUrlImage1.getText().toString(),imageView);
            }
        });

        btnLoadImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadImage(txtUrlImage2.getText().toString(),imageView);
            }
        });
    }

    private void loadImage(String url, ImageView imageView) {
        Picasso.get().load(url).into(imageView);
    }


}