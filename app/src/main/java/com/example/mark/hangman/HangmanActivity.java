package com.example.mark.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class HangmanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.HANGMAN_SECRET_MESSAGE);
        String messageUpperCase = message.toUpperCase();
        char[] messageAsCharArray = messageUpperCase.toCharArray();
        int wordLength = messageAsCharArray.length;
        ArrayList solutionField = new ArrayList<String>(wordLength);
        for (char letter:messageAsCharArray) {
            if (letter == ' ') {
                solutionField.add(" / ");
            } else {
                solutionField.add("_");
            }
        }
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(solutionField.toString());

        ViewGroup layout = (ViewGroup) findViewById(R.id.solution_field_hangman);
        layout.addView(textView);
    }
}
