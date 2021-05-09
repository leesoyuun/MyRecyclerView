package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.woman,"소윤",22,"알쏭이 친척"),
            Profiles(R.drawable.woman,"정은",22,"알쏭이 엄마"),
            Profiles(R.drawable.woman,"수현",22,"알쏭이 언니"),
            Profiles(R.drawable.woman,"재은",22,"하늘이 언니"),
            Profiles(R.drawable.woman,"민진",22,"하늘이 엄마")

        )


        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}