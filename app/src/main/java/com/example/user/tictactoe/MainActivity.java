package com.example.user.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //button OnClick method
    public void BuClick(View view) {
        Button buSelected= (Button) view;

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

    int AcitvePlayer=1; //1- first player, 2- second player
    ArrayList<Integer> Player1= new ArrayList<Integer>(); //holds player 1 data
    ArrayList<Integer> Player2= new ArrayList<Integer>(); //holds player 2 data
    void PlayGame(int CellID,Button buSelected){
        //debug log calls
        Log.d("Player:",String.valueOf(CellID));
        //end debug

        if(AcitvePlayer==1){
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.RED);
            Player1.add(CellID);
            AcitvePlayer=2;
        }else{
            buSelected.setText("O");
            buSelected.setBackgroundColor(Color.BLUE);
            Player2.add(CellID);
            AcitvePlayer=1;
        }
        buSelected.setEnabled(false);
        CheckWinner();
    }

    void CheckWinner(){
        int winner=0;

        //the size of the board is pre-determined 3x3
        //this algorithm can be improved
        //col1
        if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
            winner=1;
        }else if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
            winner=2;
        }

        //col2
        if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
            winner=1;
        }else if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
            winner=2;
        }

        //col3
        if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
            winner=1;
        }else if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
            winner=2;
        }

        //row1
        if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
            winner=1;
        }else if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
            winner=2;
        }

        //row2
        if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
            winner=1;
        }else if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
            winner=2;
        }

        //row3
        if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
            winner=1;
        }else if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
            winner=2;
        }

        //diag1
        if(Player1.contains(1) && Player1.contains(5) && Player1.contains(9)){
            winner=1;
        }else if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9)){
            winner=2;
        }

        //diag2
        if(Player1.contains(3) && Player1.contains(5) && Player1.contains(7)){
            winner=1;
        }else if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7)){
            winner=2;
        }

        if(winner!=0){
            if(winner==1){
                Toast.makeText(this, "Player 1 won!", Toast.LENGTH_LONG).show();
            }
            if(winner==2){
                Toast.makeText(this, "Player 2 won!", Toast.LENGTH_LONG).show();
            }
        }
    }
}
