package com.example.hw_3_77.model

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw_3_77.databinding.ItemMusicBinding

class MusicAdapter(
    val list: ArrayList<MusicModel>,
    val onClick: (position : Int) -> Unit
): Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = list.size

    inner class ViewHolder (private var binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(){
            val item = list[adapterPosition]
            binding.run {
                tvNumber.text = item.number
                tvTitleMus.text = item.title
                tvArtist.text = item.artist
                tvTime.text = item.time
            }
            itemView.setOnClickListener{
                Log.e("denn", "bind: Click")
                onClick(adapterPosition)
            }
        }


    }

}


