package com.example.superkahramankitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superkahramankitabi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //veri hazırlığı
        val superkahramanisimleri = ArrayList<String>()
        superkahramanisimleri.add("Batman")
        superkahramanisimleri.add("Superman")
        superkahramanisimleri.add("İronman")
        superkahramanisimleri.add("Aquaman")
        superkahramanisimleri.add("Spiderman")

        /*// verimsiz tanımalama
        // bitmap fotoğraf ve resimleri nesneleştirmeye yarar
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap= BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)


        val superkahramangorselleri = ArrayList<Bitmap>()
        superkahramangorselleri.add(batmanBitmap)
        superkahramangorselleri.add(supermanBitmap)
        superkahramangorselleri.add(ironmanBitmap)
        superkahramangorselleri.add(aquamanBitmap)
        superkahramangorselleri.add(spidermanBitmap)*/

        //Verimli Tanımlamalar
        //bu verimli tanımlamada adapter içinde bitmapla uğraşmıyoruz, singleton falan hiç girmiyoruz
        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman
        //görüldüğü gibi array listemiz bitmap değil int, android studio fotoğrafları bu şekilde alınca integer olarak görüyo
        //integer sayı atıyo gibi ve bu sayıyla kolayca işlem yapabiliyoruz
        var superkahramanDrawableListesi = ArrayList<Int>()
        superkahramanDrawableListesi.add(batmanDrawableId)
        superkahramanDrawableListesi.add(supermanDrawableId)
        superkahramanDrawableListesi.add(ironmanDrawableId)
        superkahramanDrawableListesi.add(aquamanDrawableId)
        superkahramanDrawableListesi.add(spidermanDrawableId)

        //Adapter
        val layoutManager = LinearLayoutManager(this)
        //layoutManager : layoutManager
        binding.recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superkahramanisimleri, superkahramanDrawableListesi)
        binding.recyclerView.adapter = adapter


    }
}