package com.example.hw_3_77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_77.fragments.BottomFragment
import com.example.hw_3_77.fragments.TopFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.top_container,TopFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.bottom_container,BottomFragment()).commit()
    }
}