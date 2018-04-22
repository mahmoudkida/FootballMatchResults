package com.wshwsh.footballmatchresults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Match_Results extends AppCompatActivity {

    String teamANmae= "Liverpool";
    String teamBName="Manchester United";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match__results);
    }



    public void addGoalTeamA(View view) {
        TextView teamAGoals = (TextView) findViewById(R.id.teamAGoals);
        teamAGoals.setText(Integer.parseInt(teamAGoals.getText().toString())+1);

    }
    public void addFoulTeamA(View view) {
        TextView teamAFouls = (TextView) findViewById(R.id.teamAFouls);
        teamAFouls.setText(Integer.parseInt(teamAFouls.getText().toString())+1);
    }
    public void increasePossessionTeamA(View view) {

    }

    public void addGoalTeamB(View view) {
        TextView teamBGoals = (TextView) findViewById(R.id.teamBGoals);
        teamBGoals.setText(Integer.parseInt(teamBGoals.getText().toString())+1);
    }

    public void addFoulTeamB(View view) {
        TextView teamBFouls = (TextView) findViewById(R.id.teamBFouls);
        teamBFouls.setText(Integer.parseInt(teamBFouls.getText().toString())+1);
    }

    public void increasePossessionTeamB(View view) {

    }

    public void resetStates(View view) {
        TextView textView = (TextView) findViewById(R.id.teamAGoals);
        textView.setText(0);
        textView = (TextView) findViewById(R.id.teamAFouls);
        textView.setText(0);
        textView = (TextView) findViewById(R.id.teamBGoals);
        textView.setText(0);
        textView = (TextView) findViewById(R.id.teamBFouls);
        textView.setText(0);
    }
}
