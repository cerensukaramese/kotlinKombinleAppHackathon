package com.example.kombinle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kombinle.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.kayitbutton3.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val email = binding.kayiteditTextTextEmailAddress.text.toString()
        val password = binding.kayiteditTextTextPassword2.text.toString()


        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "E-posta veya şifre boş olamaz", Toast.LENGTH_SHORT).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(this, "Kayıt başarılı!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                } else {

                    Toast.makeText(this, "Kayıt başarısız!", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
