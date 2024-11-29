package com.paulo.conversorrealdolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.paulo.conversorrealdolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Ouvinte do botao
        binding.btnConverter.setOnClickListener{
            //pega o valor em texto do elemento e converte em double e adiciona a variavel euros
            var notaReal= binding.edtReal.text.toString().toDouble();

            var dolar = String.format("%.2f",notaReal * 5.81).toDouble()

            binding.txtDolar.setText("O valor convertido em Dolar é: "+dolar.toString())
        }
    }
}