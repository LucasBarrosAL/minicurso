package com.example.lucasbarros.moviesminicurso;

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
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void loginClick(View view) {

    }

    public void loginClick() {
        String email = binding.email.getText().toString();
        String password = binding.password.getText().toString();
        
    }
}
