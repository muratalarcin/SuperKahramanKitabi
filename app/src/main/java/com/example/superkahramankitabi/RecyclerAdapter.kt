package com.example.superkahramankitabi

import android.content.Intent
import android.os.Build.VERSION_CODES.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter(val kahramanListesi: ArrayList<String>, val kahramanGorselleri: ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {

    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {
      // val adisoyadi_tv: TextView = view.findViewById(R.id.card_adisoyadi_tv)
        val rcTextView : TextView = itemView.findViewById(R.id.rcTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {

        // Inflater , LayautInflater, MenuInflater onu alıp burda göstericez inflate edicez
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)

    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        // holder.rcTextView.text = kahramanListesi.get(position)

        holder.rcTextView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent (holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))
            /*
            val singleton = SingletonClass. SecilenKahraman
            singleton.gorsel = kahramanGorselleri.get(position)
            */
            holder.itemView.context.startActivity (intent)
        }



    }
}