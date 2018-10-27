package com.example.lucasbarros.moviesminicurso;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    public static Intent createIntent(Context context, String text) {
        Intent intent = new Intent(context, Home.class);
        intent.putExtra("putText", text);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
