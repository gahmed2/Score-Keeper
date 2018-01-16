package com.example.gehad.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A
     * Add Six to Team A score
     */
    public void addSixTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add Three to Team A score
     */
    public void addThreeTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add Two to Team A score
     */
    public void addTwoTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add one to Team A score
     */
    public void addOneTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     **/
    public void displayTeamA(int score) {
        TextView scoreView = findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B
     * Add Six to Team B score
     */
    public void addSixTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add Three to Team B score
     */
    public void addThreeTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add Two to Team B score
     */
    public void addTwoTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add one to Team B score
     */
    public void addOneTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     **/
    public void displayTeamB(int score) {
        TextView scoreView = findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset both scores
     */
    public void Reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
