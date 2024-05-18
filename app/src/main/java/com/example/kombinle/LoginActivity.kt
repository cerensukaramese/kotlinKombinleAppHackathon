import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kombinle.databinding.ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
        private lateinit var binding: ActivityLoginBinding // ViewBinding sınıfını oluşturun
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityLoginBinding.inflate(layoutInflater) // ViewBinding'i şişirin
            setContentView(binding.root)
            binding.girisbtn.setOnClickListener{

            }
        }
}