package com.paulo.conversortemperatura

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.paulo.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Elenentos
        binding.btnConverter.setOnClickListener{
            if(!binding.edtCelsius.text.toString().isEmpty()){
                val celsius = binding.edtCelsius.text.toString().toDouble()

                val farenait = String.format("%.2f", celsius * 1.8 + 32)

                binding.txtResult.text = "$farenait ºF"
            }else{

                Toast.makeText(this, "TEMPERATURA INVÁLIDA", Toast.LENGTH_LONG).show()
            }


        }

        binding.btnNovamente.setOnClickListener{
            binding.edtCelsius.text.clear()
            binding.txtResult.text = "RESULTADO"
        }

    }
}