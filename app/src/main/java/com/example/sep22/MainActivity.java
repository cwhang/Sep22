package com.example.sep22;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sep22.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//
//        Button button1 = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView scoreview = findViewById(R.id.textView);
//                int ini_score = Integer.parseInt(scoreview.getText().toString());
//                ini_score++;
//                scoreview.setText(String.valueOf(ini_score));
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView scoreview = findViewById(R.id.textView);
//                int ini_score = Integer.parseInt(scoreview.getText().toString());
//                ini_score+=2;
//                scoreview.setText(String.valueOf(ini_score));
//            }
//        });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView scoreview = findViewById(R.id.textView);
//                int ini_score = Integer.parseInt(scoreview.getText().toString());
//                ini_score+=3;
//                scoreview.setText(String.valueOf(ini_score));
//            }
//        });


    }

    @Override
    public void onClick(View view) {
        Log.w("ttt", "YYYYYYY");
    }

    public void add_score_a(View view){
        int score = R.integer.score_teama;;
        if (view.getId() == R.id.button1a){
            score += 1;
        }else if (view.getId() == R.id.button2a){
            score += 2;
        }else if(view.getId() == R.id.button3a){
            score += 3;
        }
        TextView scoreview = findViewById(R.id.textViewa);
        Log.w("ttt", "XXXXX");
        scoreview.setText(String.valueOf(score));
    }

    public void add_score_b(View view){
        int score = R.integer.score_teamb;;
        if (view.getId() == R.id.button1b){
            score += 1;
        }else if (view.getId() == R.id.button2b){
            score += 2;
        }else if(view.getId() == R.id.button3b){
            score += 3;
        }
        TextView scoreview = findViewById(R.id.textViewb);
        scoreview.setText(String.valueOf(score));
    }
}