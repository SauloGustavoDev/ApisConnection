package com.example.freelanceeactivity.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.freelanceeactivity.R;
import com.example.freelanceeactivity.databinding.ActivityMainBinding;
import com.example.freelanceeactivity.ui.fragment.FilmesFragment;
import com.example.freelanceeactivity.ui.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameConteudo, new HomeFragment()).commit();


    }
    }
