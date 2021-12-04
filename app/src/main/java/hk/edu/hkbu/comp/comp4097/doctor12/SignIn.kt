package hk.edu.hkbu.comp.comp4097.doctor12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageView2.setOnClickListener {
            finish()
        }

        binding.textView.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}