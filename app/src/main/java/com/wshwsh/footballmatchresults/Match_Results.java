package com.wshwsh.footballmatchresults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Match_Results extends AppCompatActivity {
    String teamANmae = "Liverpool";
    String teamBName = "Manchester United";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match__results);
    }

    public void addGoalTeamA(View view) {
        TextView teamAGoals = (TextView) findViewById(R.id.teamAGoals);
        teamAGoals.setText(String.valueOf(Integer.parseInt(teamAGoals.getText().toString()) + 1));
    }

    public void addFoulTeamA(View view) {
        TextView teamAFouls = (TextView) findViewById(R.id.teamAFouls);
        teamAFouls.setText(String.valueOf(Integer.parseInt(teamAFouls.getText().toString()) + 1));
    }

    public void increasePossessionTeamA(View view) {
        TextView teamAPossession = (TextView) findViewById(R.id.teamAPossession);
        TextView teamBPossession = (TextView) findViewById(R.id.teamBPossession);
        teamAPossession.setText(String.valueOf(Integer.parseInt(teamAPossession.getText().toString().split("%")[0]) + 1) + "%");
        teamBPossession.setText(String.valueOf(Integer.parseInt(teamBPossession.getText().toString().split("%")[0]) - 1) + "%");
    }

    public void addGoalTeamB(View view) {
        TextView teamBGoals = (TextView) findViewById(R.id.teamBGoals);
        teamBGoals.setText(String.valueOf(Integer.parseInt(teamBGoals.getText().toString()) + 1));
    }

    public void addFoulTeamB(View view) {
        TextView teamBFouls = (TextView) findViewById(R.id.teamBFouls);
        teamBFouls.setText(String.valueOf(Integer.parseInt(teamBFouls.getText().toString()) + 1));
    }

    public void increasePossessionTeamB(View view) {
        TextView teamAPossession = (TextView) findViewById(R.id.teamAPossession);
        TextView teamBPossession = (TextView) findViewById(R.id.teamBPossession);
        teamAPossession.setText(String.valueOf(Integer.parseInt(teamAPossession.getText().toString().split("%")[0]) - 1) + "%");
        teamBPossession.setText(String.valueOf(Integer.parseInt(teamBPossession.getText().toString().split("%")[0]) + 1) + "%");
    }

    public void resetStates(View view) {
        String[] ViewsIdsToBeResetReseted = {"teamAGoals", "teamAFouls", "teamBGoals", "teamBFouls"};
        for (int i = 0; i < ViewsIdsToBeResetReseted.length; i++) {
            TextView textView = (TextView) findViewById(getResources().getIdentifier(ViewsIdsToBeResetReseted[i], "id", getPackageName()));
            textView.setText("0");
        }
        TextView textView = (TextView) findViewById(R.id.teamAPossession);
        textView.setText("50%");
        textView = (TextView) findViewById(R.id.teamBPossession);
        textView.setText("50%");
    }
}
