import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.kombinle.R
import com.example.kombinle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        // BottomNavigationView üzerinde seçim değişikliği dinleyiciyi ayarla
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_home -> {
                    // Ana sayfa (Home) seçildiğinde yapılacak işlemler
                    // Örneğin: setContentView(R.layout.activity_home)
                    true // İşlemin başarıyla gerçekleştiğini belirtmek için true döndür
                }
                R.id.action_add-> {
                    // Arama (Search) seçildiğinde yapılacak işlemler
                    // Örneğin: setContentView(R.layout.activity_search)
                    true
                }
                R.id.action_profile -> {
                    // Profil seçildiğinde yapılacak işlemler
                    // Örneğin: setContentView(R.layout.activity_profile)
                    true
                }
                else -> false // Tanımsız bir öğe seçildiğinde false döndür
            }
        }

    }
    }

