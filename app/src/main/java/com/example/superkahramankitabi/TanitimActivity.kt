package com.example.superkahramankitabi

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.superkahramankitabi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityTanitimBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra(  "superKahramanIsmi")
        binding.textView.text = secilenKahramanIsmi

        val secilenKahramanGorseli = intent.getIntExtra("superKahramanGorseli", 0)
        val bitmap = BitmapFactory.decodeResource (applicationContext.resources, secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)


            /*val secilenKahraman = SingletonClass.SecilenKahraman
            val secilenGorsel = secilenKahraman.gorsel
            imageView.setImageBitmap(secilenGorsel)*/
    }
}
