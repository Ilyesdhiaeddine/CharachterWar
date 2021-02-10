package com.example.characterwar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    int goku = 100;
    int saitama = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void display_saitama(int saitama) {
        TextView saitamaView = (TextView) findViewById(R.id.saitama_health);
        saitamaView.setText(String.valueOf(saitama));
    }

    public void display_goku(int goku) {
        TextView gokuView = (TextView) findViewById(R.id.goku_health);
        gokuView.setText(String.valueOf(goku));
        int a = Integer.parseInt( gokuView.getText().toString());
        if (a==0){
            reset();
        }
    }

    public void damage7(View v){
        saitama= saitama - 7;
        display_saitama(saitama);
        if (saitama==0){
            reset();
        }
    }

    public void damage10(View v){
        saitama= saitama - 10;
        display_saitama(saitama);
        if (saitama==0){
            reset();
        }
    }

    public void damage20(View v){
        saitama= saitama - 20;
        display_saitama(saitama);
        if (saitama==0){
            reset();
        }
    }


    public void damage5(View v){
        goku = goku - 5;
        display_goku(goku);
        if (goku==0){
            reset();
        }
    }

    public void damage7n2(View v){
        goku = goku - 5;
        display_goku(goku);
        if (goku==0){
            reset();
        }
    }

    public void damage25(View v){
        goku = goku - 25;
        display_goku(goku);
        if (goku==0){
            reset();
        }
    }

    public void reset(){
        goku = 100;
        saitama = 100; 
        display_goku(goku);
        display_saitama(saitama);
    }

}

