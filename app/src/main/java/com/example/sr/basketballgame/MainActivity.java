package com.example.sr.basketballgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void plus3(View view){
        scoreA += 3;
        displayForTeamA(scoreA);

    }
    public void plus2(View view){
        scoreA += 2;
        displayForTeamA(scoreA);

    }
    public void plus1(View view){
        scoreA += 1;
        displayForTeamA(scoreA);

    }
    public void plus3B(View view){
        scoreB += 3;
        displayForTeamB(scoreB);

    }
    public void plus2B(View view){
        scoreB += 2;
        displayForTeamB(scoreB);

    }
    public void plus1B(View view){
        scoreB += 1;
        displayForTeamB(scoreB);

    }
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
