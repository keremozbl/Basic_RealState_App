 package com.kerem.proje_deneme_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

 public class SecondActivity extends AppCompatActivity {

    ImageView mainImage;
    TextView baslik,aciklama;
    Button geriDön;

    String data1, data2;
    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImage=findViewById(R.id.mainImage_img);
        baslik=findViewById(R.id.ilanBaslik2_txt);
        aciklama=findViewById(R.id.ilanAciklama_txt);

        getData();
        setData();
        Buton();
    }
    private void getData(){

            if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&
            getIntent().hasExtra("data2")){

                data1 = getIntent().getStringExtra("data1");
                data2 = getIntent().getStringExtra("data2");
                myImage = getIntent().getIntExtra("myImage",1);

            } else {
                Toast.makeText(this,"Data Bulunamadı",Toast.LENGTH_SHORT).show();
            }
        }

        private void setData(){

                baslik.setText(data1);
                aciklama.setText(data2);
                mainImage.setImageResource(myImage);
             }

                    private void Buton(){

                     geriDön=findViewById(R.id.geriDön_btn);
                     geriDön.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent (SecondActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
        });
    }
 }














