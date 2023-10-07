package com.sample.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var imagesPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagesPager = findViewById(R.id.images_view_pager)

        val images = mutableListOf(R.drawable.img_car, R.drawable.img_car_1, R.drawable.img_car_2, R.drawable.img_car_3)

        val adapter = ImagesAdapter(images)
        imagesPager.adapter = adapter


        imagesPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val currentIndex = 0
        imagesPager.currentItem = currentIndex

    }
}


