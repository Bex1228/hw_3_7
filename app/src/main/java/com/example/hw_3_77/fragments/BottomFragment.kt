package com.example.hw_3_77.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_77.model.MusicAdapter
import com.example.hw_3_77.model.MusicModel
import com.example.hw_3_77.R
import com.example.hw_3_77.databinding.FragmentBottomBinding


class BottomFragment : Fragment() {

    private lateinit var binding: FragmentBottomBinding
    private var musicList = arrayListOf(
        MusicModel("1","Blank Space","Taylor Swift","3:22"),
        MusicModel("2","Watch Me","Silento","5:36"),
        MusicModel("3","Earned It","The Weekend","4:51"),
        MusicModel("4","The Hills","The Weekend","3:41"),
        MusicModel("5","Writing’s On The Wall","Sam Smith","5:33"),
        MusicModel("6","SAD!","XXXTENTACION","2:46"),
        MusicModel("7","HOT","INNA","3:42"),
        MusicModel("8","Бродяга","Эльбрус Джанмирзоев","4:03"),
        MusicModel("9","Любовь и Сон","Авет Маркарян","3:45"),
        MusicModel("10","О ней ","Фарик Назарбаев","3:30")

    )
    private var bundle = Bundle()
    private var detailFragment:DetailFragment = DetailFragment()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }

    @SuppressLint("CommitTransaction")
    fun onClick(position: Int){
        bundle.putSerializable("key", musicList[position])
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.detail_container,detailFragment).addToBackStack(null).commit()
    }



    }
