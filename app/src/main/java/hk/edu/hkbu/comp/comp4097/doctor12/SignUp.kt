package hk.edu.hkbu.comp.comp4097.doctor12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

       binding.imageView3.setOnClickListener {
           finish()
       }

        binding.line1.setOnClickListener{
            startActivity(Intent(this,SignUp2::class.java))
        }

        binding.line2.setOnClickListener{
            startActivity(Intent(this,SignUp3::class.java))
        }
    }
}