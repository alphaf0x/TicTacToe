package com.example.user.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //button OnClick method
    public void BuClick(View view) {
        Button buSelected= (Button) view;
        buSelected.setBackgroundColor(Color.RED);

        int CellID=0;
        //assign an individual ID to each button
        switch(buSelected.getId()){
            case R.id.bu1:
                CellID=1;
                break;

            case R.id.bu2:
                CellID=2;
                break;

            case R.id.bu3:
                CellID=3;
                break;

            case R.id.bu4:
                CellID=4;
                break;

            case R.id.bu5:
                CellID=5;
                break;

            case R.id.bu6:
                CellID=6;
                break;

            case R.id.bu7:
                CellID=7;
                break;

            case R.id.bu8:
                CellID=8;
                break;

            case R.id.bu9:
                CellID=9;
                break;
        }
        PlayGame(CellID,buSelected);
    }
    
    void PlayGame(int CellID,Button button){
        //debug log calls
        Log.d("Player:",String.valueOf(CellID));
        Log.d("Button Text:",button.getText().toString());
    }
}
