package com.example.apptoast

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apptoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOla.setOnClickListener{
            val nome = binding.edtNome.text.toString().trim();
            val sobrenome = binding.edtSobrenome.text.toString().trim();
            if(nome.isEmpty() || sobrenome.isEmpty()){
                binding.txtREsultado.text = "Nome não inserido"
                Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_LONG).show()
            }else{
                binding.txtREsultado.text = "Olá ${nome.uppercase()} ${sobrenome.uppercase()}";
                Toast.makeText(applicationContext, "Olá ${nome.uppercase()} ${sobrenome.uppercase()}", Toast.LENGTH_LONG).show()

            }
        }

    }
}