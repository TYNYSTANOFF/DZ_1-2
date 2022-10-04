package com.example.baselesson.ui.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baselesson.databinding.ItemImageBinding
import com.example.baselesson.extension.load

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    private var list = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(image: ArrayList<String>){
        this.list = image
        notifyDataSetChanged()
    }

    inner class SecondViewHolder(private var binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(image : String){
            binding.ivFirst.load(image)
        }

    }
}