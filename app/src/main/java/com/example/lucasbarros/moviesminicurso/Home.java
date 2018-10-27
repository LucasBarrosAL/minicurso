package com.example.lucasbarros.moviesminicurso;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lucasbarros.moviesminicurso.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    public static Intent createIntent(Context context, String text) {
        Intent intent = new Intent(context, Home.class);
        intent.putExtra("putText", text);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        SharedPreferences sp = this.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE);
        String email = sp.getString(Constants.PREF_EMAIL, null);

        if(email == null || email.isEmpty()){
            startActivity(LoginActivity.createIntent(this));
        }

//        String text = getIntent().getStringExtra("putText");
    }
}
