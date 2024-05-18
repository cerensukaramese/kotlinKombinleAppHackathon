package com.example.kombinle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kombinle.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kayitbutton3.setOnClickListener {
            // Kayıt işlemlerini burada gerçekleştirin
            val email = binding.kayiteditTextTextEmailAddress.text.toString()
            val password = binding.kayiteditTextTextPassword2.text.toString()

            // Örnek olarak, sadece bir Toast mesajı gösterelim
            Toast.makeText(this, "Kayıt işlemi başarılı: Email=$email, Şifre=$password", Toast.LENGTH_SHORT).show()
        }
    }
}
