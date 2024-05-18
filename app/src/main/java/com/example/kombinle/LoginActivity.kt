import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kombinle.RegisterActivity
import com.example.kombinle.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.girisbtn.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword2.text.toString()

            // Kullanıcı adı ve şifreyi kontrol et, geçerli ise ana ekrana geçiş yap
            if (isValidCredentials(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Geçersiz giriş, kullanıcıya hata mesajı göster
                binding.editTextTextEmailAddress.error = "Geçersiz e-posta veya şifre"
            }
        }

        binding.kayitbtn.setOnClickListener {
            // Kayıt ekranına geçiş yap
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidCredentials(email: String, password: String): Boolean {
        // Burada geçerli bir doğrulama mantığı uygulayabilirsiniz
        // Örnek olarak sadece basit bir doğrulama yapalım
        return email == "example@example.com" && password == "123456"
    }
}
