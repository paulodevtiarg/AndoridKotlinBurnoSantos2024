package com.paulo.primeiraapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.paulo.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Variavel binding que vai pertir a ligação dos eleentos da view xml com a classe activity
  private lateinit var binding: ActivityMainBinding


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //instanticação da variavel biding passando todo o conteudo para ser inflado
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setcontent agora pega o root do binding
        setContentView(binding.root)

        //elemetos
        binding.btnOla.setOnClickListener{
            val nome : String = binding.edtNome.text.toString();
         //   binding.textView.setText("Ola: "+nome);
            binding.textView.setText("Olá ${nome.uppercase()}");

        }
    }
}