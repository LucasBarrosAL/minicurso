package com.example.lucasbarros.moviesminicurso;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.lucasbarros.moviesminicurso.databinding.ActivityMain2Binding;


public class Main2Activity extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
//        setContentView(R.layout.activity_main2);

//        EditText editText = (EditText) findViewById(R.id.email);
        binding.setAct(this);
        binding.setLabel("IFSC");
//        binding.login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    public void loginClick() {
        String email = binding.email.getText().toString();
        String password = binding.password.getText().toString();

        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("prefEmail", email);
        editor.putString("prefPassword", password);
        editor.commit();

//        Intent intent = new Intent(this, Home.class);
//        intent.putExtra("text", "IFSC Curso");
        Intent intent = Home.createIntent(this,"IFSC Curso" );
        startActivity(intent);

    }
}
