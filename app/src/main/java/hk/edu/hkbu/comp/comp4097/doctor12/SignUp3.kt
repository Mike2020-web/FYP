package hk.edu.hkbu.comp.comp4097.doctor12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ActivitySignUp3Binding

class SignUp3 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

    }
}