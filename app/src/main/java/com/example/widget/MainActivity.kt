  package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.widget.databinding.ActivityMainBinding
import com.example.widget.databinding.ActivityWidgetBinding

  private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUsername.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        //Explicit Intent
        binding.btnIntentWidget.setOnClickListener {
            val intent = Intent(this, Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {

            val intent = Intent(this, ExplicitIntent::class.java)
            startActivity(intent)
        }
    }
}