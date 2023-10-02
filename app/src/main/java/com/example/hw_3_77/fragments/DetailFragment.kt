package com.example.hw_3_77.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_77.R
import com.example.hw_3_77.databinding.FragmentDetailBinding
import com.example.hw_3_77.model.MusicModel

class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataFromMain = arguments?.getSerializable("key") as MusicModel
        binding.run {
            tvNameArtist.text = dataFromMain.artist
            tvNameSong.text = dataFromMain.title
            tvDurationSong.text = dataFromMain.time
        }
    }


}