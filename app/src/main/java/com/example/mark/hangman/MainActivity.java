package com.example.mark.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String HANGMAN_SECRET_MESSAGE = "com.example.mark.hangman.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {
        // Start the game!
        Intent intent = new Intent(this, HangmanActivity.class);
        EditText editText = (EditText) findViewById(R.id.secret_word);
        String secretWord = editText.getText().toString();
        intent.putExtra(HANGMAN_SECRET_MESSAGE, secretWord);
        startActivity(intent);

    }
}
