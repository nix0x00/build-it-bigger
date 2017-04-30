package com.udacity.gradle.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        //action bar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        jokeText = (TextView) findViewById(R.id.joke_text);
        //String joke = getIntent().getStringExtra("joke");
        displayJoke(getIntent().getStringExtra("joke"));
    }

    private void displayJoke(String joke) {
        //show joke
        jokeText.setText(joke);
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }
}
