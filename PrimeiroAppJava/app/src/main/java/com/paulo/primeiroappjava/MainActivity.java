package com.paulo.primeiroappjava;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.paulo.primeiroappjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       binding.btNome.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String teste = binding.edtNome.getText().toString();

               binding.txtNome.setText("Olá :"+teste);
           }
       });

    }
}