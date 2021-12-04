package hk.edu.hkbu.comp.comp4097.doctor12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ActivitySignUp2Binding

class SignUp2 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageView4.setOnClickListener {
            finish()
        }

        val list= arrayListOf<String>("M","F")
        val adapter3= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list)
        binding.spinner2.setAdapter(adapter3)

        val data = arrayOf("00:00", "01:00", "02:00", "03:00","04:00","05:00","06:00","07:00","08:00",
        "09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00",
        "21:00","22:00","23:00","24:00")
        binding.numberPicker.setMinValue(0)
        binding.numberPicker.setMaxValue(data.size - 1)
        binding.numberPicker.setDisplayedValues(data)
        Log.d("numberPicker",binding.numberPicker.value.toString())

        binding.numberPicker2.setMinValue(0)
        binding.numberPicker2.setMaxValue(data.size - 1)
        binding.numberPicker2.setDisplayedValues(data)

    }

}