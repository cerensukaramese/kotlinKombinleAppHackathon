package com.example.kombinle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val loginButton = findViewById<Button>(R.id.girisbtn)
        val registerButton = findViewById<Button>(R.id.kayitbtn)

        loginButton.setOnClickListener {
            signIn()
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun signIn() {
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
        val password = findViewById<EditText>(R.id.editTextTextPassword2).text.toString()

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    Toast.makeText(this, "Giriş başarılı!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Giriş başarısız!", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
